/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.infra;

import br.edu.ifpb.pos.soap.viajei.agency.domain.PacketOrder;
import java.util.List;
import java.util.Optional;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author kieckegard
 */

@Stateless
@Local(PacketOrderRepository.class)
public class PacketOrderRepositoryJPAImpl implements PacketOrderRepository {
    
    @PersistenceContext
    private EntityManager manager;

    @Override
    public void persist(PacketOrder packetOrder) {
        this.manager.persist(packetOrder);
    }

    @Override
    public void remove(Long packetId) {
        PacketOrder found = findById(packetId);
        this.manager.remove(found);
    }

    @Override
    public List<PacketOrder> listAll() {
        return this.manager.createQuery("FROM PacketOrder p", PacketOrder.class)
                .getResultList();
    }

    @Override
    public PacketOrder findById(Long packetId) {
        Optional<PacketOrder> searchResult = Optional
                .ofNullable(this.manager.find(PacketOrder.class, packetId));
        
        if(!searchResult.isPresent())
            throw new EntityNotFoundException("There's no packet order"
                    + " with the id " + packetId);
        
        return searchResult.get();
    }
    
}
