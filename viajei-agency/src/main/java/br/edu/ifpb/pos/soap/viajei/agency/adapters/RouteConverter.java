/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.adapters;

import br.edu.ifpb.pos.soap.viajei.client.ticket.tickets.Route;
import br.edu.ifpb.pos.soap.viajei.client.transports.routes.Address;
import javax.enterprise.context.ApplicationScoped;


/**
 *
 * @author kieckegard
 */

@ApplicationScoped
public class RouteConverter {
    //routeConverter
    public Route convert(br.edu.ifpb.pos.soap.viajei.client.transports.routes.Route route) {
        Route ticketRoute = new Route();
        ticketRoute.setToAddress(addressToString(route.getDestiny()));
        ticketRoute.setFromAddress(addressToString(route.getOrigin()));
        ticketRoute.setId(route.getId());
        ticketRoute.setDeparture(route.getHorary().getEstimatedDeparture());
        ticketRoute.setEstimatedArrival(route.getHorary().getEstimatedArrive());
        return ticketRoute;
    }
    
    private String addressToString(Address address) {
        StringBuilder builder = new StringBuilder();
        builder.append(address.getCity()).append(", ")
                .append(address.getState()).append(", ")
                .append(address.getCep()).append(", ")
                .append(address.getCountry());
        return builder.toString();
    }

}
