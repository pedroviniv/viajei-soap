/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.hotel.ws;

import br.edu.ifpb.pos.soap.viajei.hotel.domain.Room;
import br.edu.ifpb.pos.soap.viajei.hotel.infra.RoomRepository;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author kieckegard
 */

@WebService
public class Rooms {
    
    @Inject
    private RoomRepository roomRepository;
    
    public void addRoom(@WebParam(name = "newRoom") Room newRoom) {
        this.roomRepository.add(newRoom);
    }
    
    public void updateRoom(@WebParam(name = "updatedRoom") Room updatedRoom) {
        this.roomRepository.update(updatedRoom);
    }
    
    public void removeRoom(@WebParam(name = "roomId") Long roomId) {
        Room roomFound = this.roomRepository.findById(roomId);
        this.roomRepository.remove(roomFound);
    }
    
    public Room findRoomById(@WebParam(name = "roomId") Long roomId) {
        return this.roomRepository.findById(roomId);
    }
    
    public Room[] listAllRooms() {
        return this.roomRepository.listAll().toArray(new Room[0]);
    }
    
    
}
