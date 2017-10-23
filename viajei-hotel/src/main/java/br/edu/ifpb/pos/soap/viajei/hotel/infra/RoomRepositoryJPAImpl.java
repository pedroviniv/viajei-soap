/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.hotel.infra;

import br.edu.ifpb.pos.soap.viajei.hotel.domain.Room;
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
public class RoomRepositoryJPAImpl implements RoomRepository {
    
    @PersistenceContext(unitName = "viajei-hotel-pu")
    private EntityManager manager;

    @Override
    public void add(Room room) {
        this.manager.persist(room);
    }

    @Override
    public void update(Room room) {
        this.manager.merge(room);
    }

    @Override
    public void remove(Room room) {
        Room found = this.manager.merge(room);
        this.manager.remove(found);
    }

    @Override
    public Room findById(Long roomId) {
        Optional<Room> searchResult = Optional
                .ofNullable(this.manager.find(Room.class, roomId));
        if(!searchResult.isPresent())
            throw new EntityNotFoundException("There's no room"
                    + " with the id " + roomId);
        
        return searchResult.get();
    }

    @Override
    public List<Room> listAll() {
        return this.manager.createQuery("FROM Room r", Room.class)
                .getResultList();
    }
    
    
}
