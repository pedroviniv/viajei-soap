/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.distance.consumer;

import br.edu.ifpb.pos.soap.viajei.transport.mapper.Mapper;
import br.edu.ifpb.pos.soap.viajei.transport.distance.model.Distance;
import br.edu.ifpb.pos.soap.viajei.transport.model.Address;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 *
 * @author kieckegard
 */

@RequestScoped
public class DistanceConsumerGoogleImpl implements DistanceConsumer {
    
    @Inject
    private Client client;
    @Inject
    private Mapper mapper;
    
    private final String uri = "https://maps.googleapis.com/maps/api/distancematrix/json";
    private final String key = "AIzaSyDrvpmnDCioJA4TwZHDr2CvlR_ObCiY4xY";
    
    @Override
    public Distance getDistance(Address origin, Address destination) {
        
        WebTarget target = client.target(uri);
        Response getResponse = target.queryParam("units", "metric")
                .queryParam("origins", toString(origin))
                .queryParam("destinations", toString(destination))
                .queryParam("key", key)
                .request()
                .get();
        
        String json = getResponse.readEntity(String.class);
        Distance distance = mapper.toObject(json, Distance.class);
        
        return distance;
    }
    
    private String toString(Address address) {
        
        return new StringBuilder().append(address.getCity()).append(", ")
                .append(address.getState()).append(", ")
                .append(address.getCep()).append(", ")
                .append(address.getCountry())
                .toString();
    }
    
}
