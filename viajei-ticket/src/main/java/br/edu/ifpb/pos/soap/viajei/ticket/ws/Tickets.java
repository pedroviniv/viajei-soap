/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.ticket.ws;

import br.edu.ifpb.pos.soap.viajei.ticket.domain.Ticket;
import br.edu.ifpb.pos.soap.viajei.ticket.infra.Repository;
import br.edu.ifpb.pos.soap.viajei.ticket.infra.TicketRepository;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author kieckegard
 */

@WebService
public class Tickets {
    
    @TicketRepository
    @Inject
    private Repository<Ticket, Long> ticketRepository;
    
    public Long addTicket(@WebParam(name = "newTicket") Ticket newTicket) {
        this.ticketRepository.add(newTicket);
        return newTicket.getId();
    }
    
    public void updateTicket(@WebParam(name = "updatedTicket") 
            Ticket updatedTicket) {
        
        this.ticketRepository.update(updatedTicket);
    }
    
    public void removeTicket(@WebParam(name = "ticketId") Long ticketId) {
        Ticket found = this.ticketRepository.findById(ticketId);
        this.ticketRepository.remove(found);
    }
    
    public Ticket findTicketById(@WebParam(name = "ticketId") Long ticketId) {
        return this.ticketRepository.findById(ticketId);
    }
    
    public Ticket[] listAllTickets() {
        return this.ticketRepository.listAll().toArray(new Ticket[0]);
    }
}
