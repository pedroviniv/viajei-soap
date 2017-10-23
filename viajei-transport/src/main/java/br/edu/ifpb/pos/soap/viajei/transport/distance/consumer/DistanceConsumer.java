/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.distance.consumer;

import br.edu.ifpb.pos.soap.viajei.transport.distance.model.Distance;
import br.edu.ifpb.pos.soap.viajei.transport.model.Address;

/**
 *
 * @author kieckegard
 */
public interface DistanceConsumer {
    
    Distance getDistance(Address origin, Address destination);
}
