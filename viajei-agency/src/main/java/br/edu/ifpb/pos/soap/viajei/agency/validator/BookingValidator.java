/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.validator;

import br.edu.ifpb.pos.soap.viajei.agency.domain.HotelBooking;
import br.edu.ifpb.pos.soap.viajei.client.hotel.bookings.Bookings;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author kieckegard
 */


@Stateless
public class BookingValidator {
    
    @Inject
    private Bookings bookings;
    
    public void verifyBooking(HotelBooking hotelBooking) {
        Long bookingId = hotelBooking.getBookingId();
        try {
            this.bookings.findBookingById(bookingId);
        } catch (RuntimeException ex) {
            throw new BookingDoesNotExists("There's no hotel"
                    + " booking with the id " + bookingId, ex);
        }
        
    }
}
