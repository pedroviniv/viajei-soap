/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author kieckegard
 */

@Embeddable
public class TransportTicket implements Serializable {
    
    @Column(name = "transport_ticket_id")
    private Long ticketId;

    public TransportTicket(Long ticketId) {
        this.ticketId = ticketId;
    }

    public TransportTicket() {
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    @Override
    public String toString() {
        return "TransportTicket{" + "ticketId=" + ticketId + '}';
    }
}
