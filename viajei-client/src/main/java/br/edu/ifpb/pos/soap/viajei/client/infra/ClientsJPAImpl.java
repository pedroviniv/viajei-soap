/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.client.infra;

import br.edu.ifpb.pos.soap.viajei.client.domain.Client;
import java.util.List;
import java.util.Optional;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author kieckegard
 */

@Stateless
@Local(Clients.class)
public class ClientsJPAImpl implements Clients {
    
    @PersistenceContext(unitName = "")
    private EntityManager manager;

    @Override
    public void add(Client newClient) {
        try {
            this.manager.persist(newClient);
        } catch(EntityExistsException ex) {
            throw new EntityAlreadyExistsException("An entity with the id "
                    + newClient.getId() + " already exists", ex);
        }
    }

    @Override
    public void update(Client updatedClient) {
        this.manager.merge(updatedClient);
    }

    @Override
    public void remove(Client client) {
        Client merged = this.manager.merge(client);
        this.manager.remove(merged);
    }
    
    @Override
    public Client findById(Long clientId) {
        Optional<Client> clientResult = Optional
                .ofNullable(this.manager.find(Client.class, clientId));
        if(!clientResult.isPresent())
            throw new EntityNotFoundException("There's no client"
                    + " with the id " + clientId);
        return clientResult.get();
    }

    @Override
    public List<Client> listAll() {
        return this.manager.createQuery("FROM Client c", Client.class)
                .getResultList();
    }

    @Override
    public Client findByCpf(String cpf) {
        TypedQuery<Client> query = this.manager
                .createQuery("SELECT c FROM Client c WHERE c.cpf = :cpf", Client.class)
                .setParameter("cpf", cpf);
        
        try {
        Client client = query.getSingleResult();
        return client;
        } catch (NoResultException ex) {
            throw new EntityNotFoundException("There's no client"
                    + " with the cpf " + cpf, ex);
        }
    }
    
}
