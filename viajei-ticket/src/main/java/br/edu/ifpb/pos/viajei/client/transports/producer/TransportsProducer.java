/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.viajei.client.transports.producer;

import br.edu.ifpb.pos.viajei.client.transports.Transports;
import br.edu.ifpb.pos.viajei.client.transports.TransportsService;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

/**
 *
 * @author kieckegard
 */

@ApplicationScoped
public class TransportsProducer {
    
    
    @RequestScoped
    @Produces
    public Transports getTransports() {
        return new TransportsService().getTransportsPort();
    }
}
