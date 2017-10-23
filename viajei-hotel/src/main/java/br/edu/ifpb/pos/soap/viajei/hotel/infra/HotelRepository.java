/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.hotel.infra;

import br.edu.ifpb.pos.soap.viajei.hotel.domain.Hotel;
import java.util.List;

/**
 *
 * @author kieckegard
 */
public interface HotelRepository {
    
    void add(Hotel hotel);
    void remove(Hotel hotel);
    void update(Hotel hotel);
    Hotel findById(Long hotelId);
    List<Hotel> listAll();
}
