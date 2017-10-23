/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.ws;

import br.edu.ifpb.pos.soap.viajei.agency.adapters.RouteAdapter;
import br.edu.ifpb.pos.soap.viajei.agency.domain.Client;
import br.edu.ifpb.pos.soap.viajei.agency.domain.HotelBooking;
import br.edu.ifpb.pos.soap.viajei.agency.domain.Packet;
import br.edu.ifpb.pos.soap.viajei.agency.domain.PacketOrder;
import br.edu.ifpb.pos.soap.viajei.agency.domain.TransportTicket;
import br.edu.ifpb.pos.soap.viajei.agency.infra.PacketOrderRepository;
import br.edu.ifpb.pos.soap.viajei.agency.infra.PacketRepository;
import br.edu.ifpb.pos.soap.viajei.client.hotel.bookings.Bookings;
import br.edu.ifpb.pos.soap.viajei.client.hotel.room.Rooms;
import br.edu.ifpb.pos.soap.viajei.client.ticket.tickets.Ticket;
import br.edu.ifpb.pos.soap.viajei.client.ticket.tickets.Tickets;
import br.edu.ifpb.pos.soap.viajei.client.ticket.tickets.Transport;
import br.edu.ifpb.pos.soap.viajei.client.transports.routes.Route;
import br.edu.ifpb.pos.soap.viajei.client.transports.routes.Routes;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author kieckegard
 */

@WebService
public class PacketOrders {
    
    @EJB private PacketOrderRepository packetOrderRepository;
    @EJB private PacketRepository packetRepository;
    
    @Inject private Tickets tickets;
    @Inject private Bookings bookings;
    @Inject private Routes routes;
    @Inject private Rooms rooms;
    
    public void removePacketOrder(@WebParam(name = "packetOrderId") Long packetOrderId) {
        
        PacketOrder packetOrderFound = this.packetOrderRepository
                .findById(packetOrderId);
        
        HotelBooking booking = packetOrderFound.getHotelBooking();
        TransportTicket ticket = packetOrderFound.getTransportTicket();
        
        this.bookings.removeBooking(booking.getBookingId());
        this.tickets.removeTicket(ticket.getTicketId());
        
        this.packetOrderRepository.remove(packetOrderId);
    }
    
    public void addPacketOrder(
            @WebParam(name = "packetOrderReq")
            PacketOrderRequest packetOrderReq) {
        
        Ticket ticket = new Ticket();
        
        Packet packet = this.packetRepository
                .findById(packetOrderReq.getPacketId());
        
        Transport transport = new Transport();
        transport.setId(packet.getTransport().getId());
        
        ticket.setTransport(transport);
        
        Route route = routes.findRouteById(packet.getRoute().getId());
        
        RouteAdapter routeAdapter = new RouteAdapter(route);
        
        ticket.setRoute(routeAdapter);
        ticket.setSeatNumber(packetOrderReq.getSeatNumber());
        
        //ticket client obj
        br.edu.ifpb.pos.soap.viajei.client.ticket.tickets.Client ticketClient = 
                new br.edu.ifpb.pos.soap.viajei.client.ticket.tickets.Client();
        ticketClient.setCpf(packetOrderReq.getClientCpf());
        
        ticket.setClient(ticketClient);
        
        //booking client obj
        br.edu.ifpb.pos.soap.viajei.client.hotel.bookings.Client bookingClient =
                new br.edu.ifpb.pos.soap.viajei.client.hotel.bookings.Client();
        
        bookingClient.setCpf(packetOrderReq.getClientCpf());
        
        Long bookingId = this.bookings.book(packet.getHotel().getId(), 
                packet.getRoom().getId(), bookingClient, 
                packetOrderReq.getStartDate(), packetOrderReq.getDaysQty());
        
        Long ticketId = this.tickets.addTicket(ticket);
        
        PacketOrder packetOrder = new PacketOrder();
        
        packetOrder.setTransportTicket(new TransportTicket(ticketId));
        packetOrder.setHotelBooking(new HotelBooking(bookingId));
        packetOrder.setPacket(packet);
        packetOrder.setClient(new Client(packetOrderReq.getClientCpf()));
        
        packetOrderRepository.persist(packetOrder);
    }
    
    public PacketOrder[] listAllPacketOrders() {
        return this.packetOrderRepository
                .listAll().toArray(new PacketOrder[]{});
    }
 
    public PacketOrder findPacketOrderById(
            @WebParam(name = "packetOrderId") 
                    Long packetOrderId) {
        
        return this.packetOrderRepository.findById(packetOrderId);
    }
}
