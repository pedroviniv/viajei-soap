/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.rest.endpoints;

import br.edu.ifpb.pos.soap.viajei.transport.model.Route;
import br.edu.ifpb.pos.soap.viajei.transport.model.Transport;
import br.edu.ifpb.pos.soap.viajei.transport.services.RouteService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author kieckegard
 */
public class TransportRouteEndPoint {
    
    private final Transport transport;
    private final RouteService routeService;
    
    public TransportRouteEndPoint(Transport transport, RouteService routeService) {
        
        this.transport = transport;
        this.routeService = routeService;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response TransportRouteEndPoint(Route route) {
        
        this.routeService.add(transport, route);
        return Response.ok().build();
    }
    
}
