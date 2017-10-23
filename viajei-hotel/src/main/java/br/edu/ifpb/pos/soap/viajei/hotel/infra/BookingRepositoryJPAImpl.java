/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.hotel.infra;

import br.edu.ifpb.pos.soap.viajei.hotel.domain.Booking;
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
public class BookingRepositoryJPAImpl implements BookingRepository {
    
    @PersistenceContext(unitName = "viajei-hotel-pu")
    private EntityManager manager;

    @Override
    public void add(Booking booking) {
        this.manager.persist(booking);
    }

    @Override
    public void remove(Booking booking) {
        Booking mergedBooking = this.manager.merge(booking);
        this.manager.remove(mergedBooking);
    }

    @Override
    public void update(Booking updatedBooking) {
        this.manager.merge(updatedBooking);
    }

    @Override
    public Booking findById(Long bookingId) {
        Optional<Booking> searchResult = Optional
                .ofNullable(this.manager.find(Booking.class, bookingId));
        if(!searchResult.isPresent())
            throw new EntityNotFoundException("There's no hotel booking"
                    + " with the id " + bookingId);
        return searchResult.get();
    }

    @Override
    public List<Booking> listAll() {
        
        return this.manager.createQuery("FROM Booking b", Booking.class)
                .getResultList();
    }
    
}
