/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kieckegard
 */

@Entity
@Table(name = "packet")
public class Packet implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Embedded
    private Hotel hotel;
    @Embedded
    private Room room;
    @Embedded
    private Transport transport;
    @Embedded 
    private Route route;
    
    @Column(precision = 11, scale = 2)
    private BigDecimal cost;

    public Packet(Hotel hotel, Room room, Transport transport, Route route, BigDecimal cost) {
        this.hotel = hotel;
        this.room = room;
        this.transport = transport;
        this.route = route;
        this.cost = cost;
    }
    
    public Packet() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Package{" + "id=" + id + ", hotel=" + hotel + ", room=" + room + ", transport=" + transport + ", route=" + route + ", cost=" + cost + '}';
    }
}
