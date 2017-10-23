/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.validator;

import br.edu.ifpb.pos.soap.viajei.agency.domain.Packet;
import br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.Hotel;
import br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.Hotels;
import br.edu.ifpb.pos.soap.viajei.client.hotel.room.Room;
import br.edu.ifpb.pos.soap.viajei.client.hotel.room.Rooms;
import br.edu.ifpb.pos.soap.viajei.client.transports.Transport;
import br.edu.ifpb.pos.soap.viajei.client.transports.Transports;
import br.edu.ifpb.pos.soap.viajei.client.transports.routes.Route;
import br.edu.ifpb.pos.soap.viajei.client.transports.routes.Routes;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author kieckegard
 */

@Stateless
public class PacketValidator {
    
    @Inject private Hotels hotels;
    @Inject private Transports transports;
    @Inject private Routes routes;
    @Inject private Rooms rooms;

    public void validate(Packet packet) {
        
        Hotel hotel = hotels.findHotelById(packet.getHotel().getId());
        
        Room room = this.rooms.findRoomById(packet.getRoom().getId());
        
        Transport transport = transports.findTransportById(packet.getTransport().getId());
        
        Route route = routes.findRouteById(packet.getRoute().getId());
        
    }
    
}
