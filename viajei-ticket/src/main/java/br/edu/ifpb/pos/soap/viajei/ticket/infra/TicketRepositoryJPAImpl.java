/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.ticket.infra;

import br.edu.ifpb.pos.soap.viajei.ticket.domain.Ticket;
import java.util.List;
import java.util.Optional;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author kieckegard
 */

@TicketRepository
@RequestScoped
@Transactional
public class TicketRepositoryJPAImpl implements Repository<Ticket, Long> {
    
    @PersistenceContext(unitName = "viajei-ticket-pu")
    private EntityManager manager;

    @Override
    public void add(Ticket newEntity) {
        this.manager.persist(newEntity);
    }

    @Override
    public void update(Ticket updatedEntity) {
        this.manager.merge(updatedEntity);
    }

    @Override
    public void remove(Ticket entity) {
        Ticket merged = this.manager.merge(entity);
        this.manager.remove(merged);
    }

    @Override
    public Ticket findById(Long id) {
        Optional<Ticket> searchResult = Optional
                .ofNullable(this.manager.find(Ticket.class, id));
        if(!searchResult.isPresent())
            throw new EntityNotFoundException("There's no transport ticket with the id " + id);
        
        return searchResult.get();
    }

    @Override
    public List<Ticket> listAll() {
        return this.manager
                .createQuery("FROM Ticket t", Ticket.class)
                .getResultList();
    }
    
}
