/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.hotel.ws;

import br.edu.ifpb.pos.soap.viajei.hotel.domain.Hotel;
import br.edu.ifpb.pos.soap.viajei.hotel.domain.Room;
import br.edu.ifpb.pos.soap.viajei.hotel.infra.HotelRepository;
import br.edu.ifpb.pos.soap.viajei.hotel.infra.RoomRepository;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author kieckegard
 */

@WebService
public class Hotels {
    
    @Inject
    private HotelRepository hotelRepository;
    @Inject
    private RoomRepository roomRepository;
    
    public void addHotel(@WebParam(name = "newHotel") Hotel newHotel) {
        
        this.hotelRepository.add(newHotel);
    }
    
    public void removeHotel(@WebParam(name = "hotelId") Long hotelId) {
        
        Hotel found = this.hotelRepository.findById(hotelId);
        this.hotelRepository.remove(found);
    }
    
    public void updateHotel(@WebParam(name = "updatedHotel") Hotel updatedHotel) {
        this.hotelRepository.update(updatedHotel);
    }
    
    public Hotel findHotelById(@WebParam(name = "hotelId") Long hotelId) {
        return this.hotelRepository.findById(hotelId);
    }
    
    public Hotel[] listAllHotels() {
        
        return this.hotelRepository
                .listAll()
                .toArray(new Hotel[0]);
    }
    
    public void bindRoom(Long hotelId, Long roomId) {
        Hotel hotelFound = this.hotelRepository.findById(hotelId);
        Room roomFound = this.roomRepository.findById(roomId);
        hotelFound.addRoom(roomFound);
        this.hotelRepository.update(hotelFound);
    }
}
