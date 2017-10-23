/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.adapters;

import br.edu.ifpb.pos.soap.viajei.client.ticket.tickets.Route;
import br.edu.ifpb.pos.soap.viajei.client.transports.routes.Address;


/**
 *
 * @author kieckegard
 */
public class RouteAdapter extends Route {
    
    private br.edu.ifpb.pos.soap.viajei.client.transports.routes.Route route;
    private String fromAddress;
    private String toAddress;
    
    public RouteAdapter(br.edu.ifpb.pos.soap.viajei.client.transports.routes.Route route) {
        this.route = route;
        this.toAddress = addressToString(route.getDestiny());
        this.fromAddress = addressToString(route.getOrigin());
    }
    
    private String addressToString(Address address) {
        StringBuilder builder = new StringBuilder();
        builder.append(address.getCity()).append(", ")
                .append(address.getState()).append(", ")
                .append(address.getCep()).append(", ")
                .append(address.getCountry());
        return builder.toString();
    }

    @Override
    public Long getId() {
        return route.getId();
    }

    @Override
    public String getDeparture() {
        return route.getHorary().getEstimatedDeparture();
    }

    @Override
    public String getEstimatedArrival() {
        return route.getHorary().getEstimatedArrive();
    }

    @Override
    public String getFromAddress() {
        return this.fromAddress;
    }

    @Override
    public String getToAddress() {
        return this.toAddress;
    }

    @Override
    public String toString() {
        return "Route{" + "route=" + route + ", fromAddress=" + fromAddress + ", toAddress=" + toAddress + '}';
    }
}
