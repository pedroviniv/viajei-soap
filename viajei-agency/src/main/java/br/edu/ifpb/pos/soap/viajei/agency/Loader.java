/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency;

import br.edu.ifpb.pos.soap.viajei.client.producers.SOAPClientsProducer;
import br.edu.ifpb.pos.viajei.client.ticket.tickets.Tickets;

/**
 *
 * @author kieckegard
 */
public class Loader {
    
    private static SOAPClientsProducer producer = new SOAPClientsProducer();
    
    public static void main(String[] args) {
        
        Tickets tickets = producer.getTickets();
        
    }
}
