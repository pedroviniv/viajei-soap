/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.infra;

import java.util.List;
import java.util.Optional;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import br.edu.ifpb.pos.soap.viajei.agency.domain.Packet;

/**
 *
 * @author kieckegard
 */

@Stateless
@Local(PacketRepository.class)
public class PacketRepositoryJPAImpl implements PacketRepository {
    
    @PersistenceContext(unitName = "viajei-agency-pu")
    private EntityManager manager;

    @Override
    public void add(Packet newPackage) {
        this.manager.persist(newPackage);
    }

    @Override
    public void remove(Packet targetPackage) {
        Packet merged = this.manager.merge(targetPackage);
        this.manager.remove(merged);
    }

    @Override
    public void update(Packet updatedPackage) {
        this.manager.merge(updatedPackage);
    }

    @Override
    public Packet findById(Long packageId) {
        Optional<Packet> searchResult = Optional
                .ofNullable(this.manager.find(Packet.class, packageId));
        if(!searchResult.isPresent())
            throw new EntityNotFoundException("There's no package"
                    + " with the id " + packageId);
        
        return searchResult.get();
    }

    @Override
    public List<Packet> listAll() {
        return this.manager
                .createQuery("FROM Package p", Packet.class)
                .getResultList();
    }
    
}
