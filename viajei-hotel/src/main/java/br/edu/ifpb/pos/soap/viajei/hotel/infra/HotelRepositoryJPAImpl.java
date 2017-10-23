/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.hotel.infra;

import br.edu.ifpb.pos.soap.viajei.hotel.domain.Hotel;
import java.util.List;
import java.util.Optional;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author kieckegard
 */

@RequestScoped
@Transactional
public class HotelRepositoryJPAImpl implements HotelRepository {
    
    @PersistenceContext(unitName = "viajei-hotel-pu")
    private EntityManager manager;

    @Override
    public void add(Hotel newHotel) {
        this.manager.persist(newHotel);
    }

    @Override
    public void remove(Hotel hotel) {
        this.manager.merge(hotel);
        this.manager.remove(hotel);
    }

    @Override
    public void update(Hotel updatedHotel) {
        this.manager.merge(updatedHotel);
    }

    @Override
    public Hotel findById(Long hotelId) {
        Optional<Hotel> searchResult = Optional
                .ofNullable(this.manager.find(Hotel.class, hotelId));
        if(!searchResult.isPresent())
            throw new EntityNotFoundException("There's no hotel"
                    + " with the id " + hotelId);
        return searchResult.get();
    }

    @Override
    public List<Hotel> listAll() {
        return this.manager.createQuery("FROM Hotel h")
                .getResultList();
    }
    
}
