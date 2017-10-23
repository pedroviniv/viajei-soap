/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.services;

import br.edu.ifpb.pos.soap.viajei.transport.distance.consumer.DistanceConsumer;
import br.edu.ifpb.pos.soap.viajei.transport.distance.model.Distance;
import br.edu.ifpb.pos.soap.viajei.transport.distance.model.Element;
import br.edu.ifpb.pos.soap.viajei.transport.distance.model.ElementEntry;
import br.edu.ifpb.pos.soap.viajei.transport.model.Route;
import br.edu.ifpb.pos.soap.viajei.transport.model.RouteType;
import br.edu.ifpb.pos.soap.viajei.transport.model.Transport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

/**
 *
 * @author kieckegard
 */
@Decorator
public class RouteServiceDistance implements RouteService {
    
    @Inject
    @Delegate
    private RouteService routeService;
    @Inject
    private DistanceConsumer distanceConsumer;
    
    private static final Logger LOGGER = Logger
            .getLogger("RouteServiceDistance");

    @Override
    public void add(Transport transport, Route route) {
        
        if(route.getType().equals(RouteType.GOOGLE_ESTIMATED)) {
            //
            LOGGER.log(Level.INFO, "The route to be added is GOOGLE_ESTIMATED");
            //
            Distance distance = this.distanceConsumer.getDistance(route.getOrigin(), 
                    route.getDestiny());
            
            Element element = distance.rows()[0].elements()[0];
            ElementEntry realDistance = element.distance();
            ElementEntry duration = element.duration();
            
            System.out.println("Horary: " + route.getHorary());
            
            route.setEstimatedDuration(duration.value());
            route.setDistance(realDistance.value());
        } 
        
        this.routeService.add(transport, route);
    }
    
}
