/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.rest.endpoints;

import br.edu.ifpb.pos.soap.viajei.transport.infra.repo.TransportRepository;
import br.edu.ifpb.pos.soap.viajei.transport.infra.repo.jpa.impl.EntityNotFoundException;
import br.edu.ifpb.pos.soap.viajei.transport.model.Transport;
import br.edu.ifpb.pos.soap.viajei.transport.model.TransportType;
import br.edu.ifpb.pos.soap.viajei.transport.services.RouteService;
import java.net.URI;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author kieckegard
 */

@Path("transport")
@ApplicationScoped
public class TransportEndPoint {
    
    @Inject
    private TransportRepository transports;
    @Inject
    private RouteService routeService;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Transport transport, @Context UriInfo uriInfo) {
        this.transports.add(transport);
        
        URI uri = uriInfo.getBaseUriBuilder()
                .path(this.getClass())
                .path(String.valueOf(transport.getId()))
                .build();
        
        return Response.created(uri).build();
    }
    
    @Path("{transportId}/route")
    public Object transportRouteEndPoint(
            @DefaultValue("-1") 
            @PathParam("transportId") 
                    Long transportId) {
        
        try {
            Transport found = this.transports.findById(transportId);
            return new TransportRouteEndPoint(found, routeService);
        } catch (EntityNotFoundException ex) {
            return Response.status(Response.Status.NOT_FOUND)
                    .build();
        }
    }
    
    /**
     * Search for transport by type and route whose starting point is "cepFrom"
     * @param type
     * @param cepFrom
     * @return 
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response searchTransport(
            @DefaultValue("BUS") @QueryParam("type") TransportType type,
            @DefaultValue("58900000") @QueryParam("from") String cepFrom) {

        List<Transport> searchResult = this.transports
                .searchBy(type, cepFrom);
        
        GenericEntity<List<Transport>> entity =
                new GenericEntity<List<Transport>>(searchResult){};
        
        return Response.ok(entity).build();
    }
    
    
}
