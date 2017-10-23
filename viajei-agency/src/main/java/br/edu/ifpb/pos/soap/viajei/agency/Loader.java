/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency;

import br.edu.ifpb.pos.soap.viajei.client.clients.Client;
import br.edu.ifpb.pos.soap.viajei.client.clients.ClientService;
import br.edu.ifpb.pos.soap.viajei.client.clients.ClientServiceService;
import br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.Address;
import br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.Hotel;
import br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.Hotels;
import br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.HotelsService;
import br.edu.ifpb.pos.soap.viajei.client.hotel.room.Room;
import br.edu.ifpb.pos.soap.viajei.client.hotel.room.Rooms;
import br.edu.ifpb.pos.soap.viajei.client.hotel.room.RoomsService;
import br.edu.ifpb.pos.soap.viajei.client.transports.Horary;
import br.edu.ifpb.pos.soap.viajei.client.transports.Route;
import br.edu.ifpb.pos.soap.viajei.client.transports.RouteType;
import br.edu.ifpb.pos.soap.viajei.client.transports.Transport;
import br.edu.ifpb.pos.soap.viajei.client.transports.TransportType;
import br.edu.ifpb.pos.soap.viajei.client.transports.Transports;
import br.edu.ifpb.pos.soap.viajei.client.transports.TransportsService;
import java.math.BigDecimal;
import java.util.List;


/**
 *
 * @author kieckegard
 */
public class Loader {
    
    public static void main(String[] args) {
        
        /*TransportsService service = new TransportsService();
        Transports transports = service.getTransportsPort();
        
        Transport transport = new Transport();
        
        transport.setDescription("Guanabara v1.0");
        transport.setSeats(34);
        transport.setType(TransportType.BUS);
        
        transports.addTransport(transport);
        
        Route route = new Route();
        route.setType(RouteType.GOOGLE_ESTIMATED);
        
        Address from = new Address();
        from.setCity("Cajazeiras");
        from.setCep("58900000");
        from.setState("PB");
        from.setCountry("Brazil");
        
        Address to = new Address();
        to.setCep("57800000");
        to.setCity("João Pessoa");
        to.setState("PB");
        to.setCountry("Brazil");
        
        route.setOrigin(from);
        route.setDestiny(to);
        
        Horary horary = new Horary();
        horary.setEstimatedDeparture("23/10/2017 15:00");
        
        route.setHorary(horary);
        
        transports.addRoute(1L, route);
        
        transports.listAllTransports()
                .forEach(t -> System.out.println("t: " +t.getId()));*/
        
        /*HotelsService service = new HotelsService();
        Hotels hotels = service.getHotelsPort();
        
        RoomsService roomsService = new RoomsService();
        Rooms rooms = roomsService.getRoomsPort();
        
        Hotel hotel = new Hotel();
        hotel.setName("Hotel Regente");
        
        Address address = new Address();
        address.setCountry("Brasil");
        address.setCity("João Pessoa");
        address.setNeighborhood("Algum bairro ai");
        address.setNumber(1029);
        address.setStreet("Alguma rua ai");
        address.setUf("PB");
        
        hotel.setAddress(address);
        
        hotels.addHotel(hotel);
        
        Room room = new Room();
        room.setDaily(BigDecimal.valueOf(500d));
        room.setOccupied(false);
        room.setDescription("Quarto luxuoso");
        
        rooms.addRoom(room);
        
        hotels.bindRoom(1L, 1L);*/
        
        
        
        ClientServiceService service = new ClientServiceService();
        ClientService clientService = service.getClientServicePort();
        Client client = new Client();
        client.setCpf("108.826.494-85");
        client.setName("Pedro Arthur F. de Vasconcelos");
        client.setSalary(BigDecimal.valueOf(5000d));
        clientService.add(client);
        List<Client> clients = clientService.listAll();
        clients.forEach(c -> System.out.println("id: " + c.getId() + ", cpf: " + c.getCpf()));
         
        /*TransportsService service = new TransportsService();
        Transports transports = service.getTransportsPort();
        Route route = new Route();
        route.setType(RouteType.GOOGLE_ESTIMATED);
        Address from = new Address();
        from.setCity("Cajazeiras");
        from.setCep("58900000");
        from.setState("PB");
        from.setCountry("Brazil");
        Address to = new Address();
        to.setCep("57800000");
        to.setCity("João Pessoa");
        to.setState("PB");
        to.setCountry("Brazil");
        route.setOrigin(from);
        route.setDestiny(to);
        Horary horary = new Horary();
        horary.setEstimatedDeparture("23/10/2017 15:00");
        route.setHorary(horary);
        //transports.addRoute(1L, route);
        List<Transport> transportList = transports.listAllTransports();
        transportList.forEach((t) -> {
        System.out.println("{");
        System.out.println("\tt_id: " + t.getId());
        System.out.println("\trotas: ");
        t.getRoutes().forEach(r -> System.out.println(r.toString()));
        System.out.println("}");
        });*/
        /*TicketsService service = new TicketsService();
        Tickets tickets = service.getTicketsPort();
        Ticket ticket = new Ticket();
        ticket.setPrice(BigDecimal.valueOf(100d));
        ticket.setSeatNumber(25);
        Client client = new Client();
        client.setCpf("108.826.494-85");
        ticket.setClient(client);
        Transport transport = new Transport();
        transport.setId(1L);
        ticket.setTransport(transport);
        Route route = new Route();
        route.setId(1L);
        //"23/10/2017 15:00"
        route.setDeparture("23/10/2017 15:00");
        route.setEstimatedArrival("24/10/2017 03:00");
        route.setFromAddress("asdasd");
        route.setToAddress("asdasdasdads");
        ticket.setRoute(route);
        tickets.addTicket(ticket);
        tickets.listAllTickets().forEach(t -> System.out.println(t));
         */
    }
}
