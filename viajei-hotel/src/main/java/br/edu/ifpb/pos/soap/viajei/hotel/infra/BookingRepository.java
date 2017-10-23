/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.hotel.infra;

import br.edu.ifpb.pos.soap.viajei.hotel.domain.Booking;
import java.util.List;

/**
 *
 * @author kieckegard
 */
public interface BookingRepository {
    
    void add(Booking booking);
    void remove(Booking booking);
    void update(Booking updatedBooking);
    Booking findById(Long bookingId);
    List<Booking> listAll();
}
