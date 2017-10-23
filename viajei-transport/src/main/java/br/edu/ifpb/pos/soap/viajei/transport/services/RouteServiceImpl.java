/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.services;

import br.edu.ifpb.pos.soap.viajei.transport.infra.repo.TransportRepository;
import br.edu.ifpb.pos.soap.viajei.transport.model.Route;
import br.edu.ifpb.pos.soap.viajei.transport.model.Transport;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author kieckegard
 */

@RequestScoped
public class RouteServiceImpl implements RouteService {
    
    @Inject
    private TransportRepository transports;

    @Override
    public void add(Transport transport, Route route) {
        
        transport.addRoute(route);
        transports.update(transport);
    }
    
}
