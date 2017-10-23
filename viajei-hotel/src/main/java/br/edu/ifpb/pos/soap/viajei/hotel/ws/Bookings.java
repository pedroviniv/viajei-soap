/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.hotel.ws;

import br.edu.ifpb.pos.soap.viajei.hotel.domain.Booking;
import br.edu.ifpb.pos.soap.viajei.hotel.domain.Client;
import br.edu.ifpb.pos.soap.viajei.hotel.domain.Hotel;
import br.edu.ifpb.pos.soap.viajei.hotel.domain.Room;
import br.edu.ifpb.pos.soap.viajei.hotel.infra.BookingRepository;
import br.edu.ifpb.pos.soap.viajei.hotel.infra.HotelRepository;
import br.edu.ifpb.pos.soap.viajei.hotel.infra.RoomRepository;
import java.time.LocalDateTime;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author kieckegard
 */

@WebService
public class Bookings {
    
    @Inject
    private BookingRepository bookingsRepository;
    @Inject
    private HotelRepository hotelRepository;
    @Inject
    private RoomRepository roomRepository;
    
    /**
     * Books an hotel room to the specified client
     * @param hotelId hotel identification
     * @param roomId room identification
     * @param client client
     * @param startDate
     * @param daysQty quantity of days
     * @return 
     */
    public Long book(
            @WebParam(name = "hotelId") Long hotelId, 
            @WebParam(name = "roomId") Long roomId, 
            @WebParam(name = "client") Client client,
            @WebParam(name = "startDate") 
                @XmlJavaTypeAdapter(LocalDateTimeAdapter.class) 
                    LocalDateTime startDate,
            @WebParam(name = "daysQty") Integer daysQty) {
        
        Hotel foundHotel = this.hotelRepository.findById(hotelId);
        Room foundRoom = this.roomRepository.findById(roomId);
        
        Booking booking = Booking.book(client, foundHotel, foundRoom, 
                startDate, daysQty);
        
        this.bookingsRepository.add(booking);
        
        return booking.getId();
    }
    
    /**
     * Removes an existent booking
     * @param bookingId booking identification which you want to remove
     */
    public void removeBooking(@WebParam(name = "bookingId") Long bookingId) {
        
        Booking bookingFound = this.bookingsRepository.findById(bookingId);
        bookingsRepository.remove(bookingFound);
    }

    /**
     * finds an retrieves a booking by its identification
     * @param bookingId booking identification
     * @return 
     */
    public Booking findBookingById(@WebParam(name = "bookingId") Long bookingId) {
        return this.bookingsRepository.findById(bookingId);
    }
    
    /**
     * Lists all existent bookings
     * @return 
     */
    public Booking[] listAllBookings() {
        
        return this.bookingsRepository.listAll().toArray(new Booking[0]);
    }
}
