/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.infra.repo.jpa.impl;

import br.edu.ifpb.pos.soap.viajei.transport.model.Transport;
import br.edu.ifpb.pos.soap.viajei.transport.infra.repo.TransportRepository;
import br.edu.ifpb.pos.soap.viajei.transport.model.TransportType;
import java.util.List;
import java.util.Optional;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author kieckegard
 */

@RequestScoped
@Transactional
public class TransportRepositoryJPAImpl implements TransportRepository {
    
    @PersistenceContext(unitName = "viajei-transport-pu")
    private EntityManager manager;

    @Override
    public void add(Transport transport) {
        this.manager.persist(transport);
    }

    @Override
    public void update(Transport transport) {
        this.manager.merge(transport);
    }

    @Override
    public void remove(Long transportId) {
        Transport transport = findById(transportId);
        this.manager.remove(transport);
    }

    @Override
    public Transport findById(Long transportId) {
        
        try {
            Transport result = this.manager
                    .createQuery("SELECT DISTINCT t "
                            + "FROM Transport t LEFT JOIN FETCH t.routes"
                            + " WHERE t.id = :id", Transport.class)
                    .setParameter("id", transportId)
                    .getSingleResult();

            return result;
        } catch (NoResultException ex) {
            throw new EntityNotFoundException("Could not found transport "
                    + transportId, ex);
        }
    }

    @Override
    public List<Transport> listAll() {
        return this.manager.createQuery("FROM Transport t", Transport.class)
                .getResultList();
    }
    
    @Override
    public List<Transport> searchBy(TransportType type, String cepFrom) {
        
        String sql = "SELECT DISTINCT t FROM Transport t LEFT JOIN t.routes r"
                + " WHERE t.type = :type AND r.origin.cep = :cepFrom";
        
        return this.manager
                .createQuery(sql, Transport.class)
                .setParameter("type", type)
                .setParameter("cepFrom", cepFrom)
                .getResultList();
    }
    
}
