/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.hotel.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kieckegard
 */

@Entity
@XmlRootElement
public class Booking implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private Client client;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "room_id")
    private Room room;
    
    @Column(name = "start_at")
    private LocalDateTime startDateTime;
    
    @Column(name = "finish_at")
    private LocalDateTime finishDateTime;
    
    private Integer days;

    public Booking(Client client, Hotel hotel, Room room, 
            LocalDateTime startDate, LocalDateTime finishDateTime,
            Integer days) {
        
        this.client = client;
        this.hotel = hotel;
        this.room = room;
        this.startDateTime = startDate;
        this.finishDateTime = finishDateTime;
        this.days = days;
    }
    
    public static Booking book(Client client, Hotel hotel, Room room, 
            LocalDateTime startDate, Integer days) {
        
        return new Booking(client, hotel, room, startDate, 
                startDate.plusDays(days), days);
    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getFinishDateTime() {
        return finishDateTime;
    }

    public void setFinishDateTime(LocalDateTime finishDateTime) {
        this.finishDateTime = finishDateTime;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
    
    public BigDecimal getPrice() {
        return this.room.getDaily()
                .multiply(BigDecimal.valueOf(days));
    }

    @Override
    public String toString() {
        return "Reserva{" + "client=" + client + ", hotel=" + hotel + ", room=" + room + '}';
    }
}
