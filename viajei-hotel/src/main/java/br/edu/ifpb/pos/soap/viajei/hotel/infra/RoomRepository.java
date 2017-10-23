/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.hotel.infra;

import br.edu.ifpb.pos.soap.viajei.hotel.domain.Room;
import java.util.List;

/**
 *
 * @author kieckegard
 */
public interface RoomRepository {
    
    void add(Room room);
    void update(Room room);
    void remove(Room room);
    Room findById(Long roomId);
    List<Room> listAll();
}
