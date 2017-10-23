/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.ws;

import br.edu.ifpb.pos.soap.viajei.transport.infra.repo.RouteRepository;
import br.edu.ifpb.pos.soap.viajei.transport.model.Route;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author kieckegard
 */

@WebService
public class Routes {
    
    @Inject private RouteRepository routeRepository;
    
    public Route findRouteById(@WebParam(name = "routeId") Long routeId) {
        return this.routeRepository.findById(routeId);
    }
}
