/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.client.producers;

import br.edu.ifpb.pos.viajei.client.clients.ClientService;
import br.edu.ifpb.pos.viajei.client.clients.ClientServiceService;
import br.edu.ifpb.pos.viajei.client.hotel.bookings.Bookings;
import br.edu.ifpb.pos.viajei.client.hotel.bookings.BookingsService;
import br.edu.ifpb.pos.viajei.client.hotel.hotel.Hotels;
import br.edu.ifpb.pos.viajei.client.hotel.hotel.HotelsService;
import br.edu.ifpb.pos.viajei.client.hotel.room.Rooms;
import br.edu.ifpb.pos.viajei.client.hotel.room.RoomsService;
import br.edu.ifpb.pos.viajei.client.ticket.tickets.Tickets;
import br.edu.ifpb.pos.viajei.client.ticket.tickets.TicketsService;
import br.edu.ifpb.pos.viajei.client.transports.Transports;
import br.edu.ifpb.pos.viajei.client.transports.TransportsService;
import br.edu.ifpb.pos.viajei.client.transports.routes.Routes;
import br.edu.ifpb.pos.viajei.client.transports.routes.RoutesService;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

/**
 *
 * @author kieckegard
 */

@ApplicationScoped
public class SOAPClientsProducer {
    
    @Produces
    @Default
    @RequestScoped
    public Hotels getHotels() {
        return new HotelsService().getHotelsPort();
    }
    
    @Produces
    @Default
    @RequestScoped
    public Rooms getRooms() {
        return new RoomsService().getRoomsPort();
    }
    
    @Produces
    @Default
    @RequestScoped
    public Bookings getBookings() {
        return new BookingsService().getBookingsPort();
    }
    
    @Produces
    @Default
    @RequestScoped
    public ClientService getClientsService() {
        return new ClientServiceService().getClientServicePort();
    }
    
    @Produces
    @Default
    @RequestScoped
    public Tickets getTickets() {
        return new TicketsService().getTicketsPort();
    }
    
    @Produces
    @Default
    @RequestScoped
    public Transports getTransports() {
        return new TransportsService().getTransportsPort();
    }
    
    @Produces
    @Default
    @RequestScoped
    public Routes getRoutes() {
        return new RoutesService().getRoutesPort();
    }
    
    
}
