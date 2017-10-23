/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author kieckegard
 */

@Embeddable
public class HotelBooking implements Serializable {
    
    @Column(name = "hotel_booking_id")
    private Long bookingId;

    public HotelBooking(Long bookingId) {
        this.bookingId = bookingId;
    }

    public HotelBooking() {
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    @Override
    public String toString() {
        return "HotelBooking{" + "bookingId=" + bookingId + '}';
    }
    
}
