/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.ws;

import br.edu.ifpb.pos.soap.viajei.transport.model.Route;
import br.edu.ifpb.pos.soap.viajei.transport.model.Transport;
import br.edu.ifpb.pos.soap.viajei.transport.infra.repo.TransportRepository;
import br.edu.ifpb.pos.soap.viajei.transport.model.TransportType;
import br.edu.ifpb.pos.soap.viajei.transport.services.RouteService;
import java.util.List;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author kieckegard
 */

@WebService
public class Transports {
    
    @Inject
    private TransportRepository transports;
    @Inject
    private RouteService routes;
    
    public void addTransport(@WebParam(name = "transport") Transport transport) {
        this.transports.add(transport);
    }
    
    public void addRoute(
            @WebParam(name = "transportId") Long transportId, 
            @WebParam(name = "route") Route route) {
        Transport found = this.transports.findById(transportId);
        this.routes.add(found, route);
    }
    
    public Transport[] listAllTransports() {
        return this.transports.listAll().toArray(new Transport[0]);
    }
    
    public Transport[] searchTransportsBy(
            @WebParam(name = "transportType") TransportType type, 
            @WebParam(name = "cepFrom") String cepFrom) {
        
        List<Transport> searchResult = this
                .transports.searchBy(type, cepFrom);
        return searchResult.toArray(new Transport[0]);
    }
    
    public Transport findTransportById(@WebParam(name = "transportId") Long transportId) {
        return this.transports.findById(transportId);
    }
}
