/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.domain;

import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author kieckegard
 */

@Entity
@Table(name = "packet_order")
public class PacketOrder implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "packet_id")
    private Packet packet;
    @Embedded
    private HotelBooking hotelBooking;
    @Embedded
    private TransportTicket transportTicket;
    @Embedded
    private Client client;

    public PacketOrder(Packet packet, HotelBooking hotelBooking, TransportTicket transportTicket, Client client) {
        this.packet = packet;
        this.hotelBooking = hotelBooking;
        this.transportTicket = transportTicket;
        this.client = client;
    }

    public PacketOrder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Packet getPacket() {
        return packet;
    }

    public void setPacket(Packet packet) {
        this.packet = packet;
    }

    public HotelBooking getHotelBooking() {
        return hotelBooking;
    }

    public void setHotelBooking(HotelBooking hotelBooking) {
        this.hotelBooking = hotelBooking;
    }

    public TransportTicket getTransportTicket() {
        return transportTicket;
    }

    public void setTransportTicket(TransportTicket transportTicket) {
        this.transportTicket = transportTicket;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "PackageOrder{" + "id=" + id + ", packet=" + packet + ", hotelBooking=" + hotelBooking + ", transportTicket=" + transportTicket + ", client=" + client + '}';
    }
}
