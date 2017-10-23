/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.infra;

import br.edu.ifpb.pos.soap.viajei.agency.domain.PacketOrder;
import java.util.List;

/**
 *
 * @author kieckegard
 */
public interface PacketOrderRepository {
    
    void persist(PacketOrder packetOrder);
    void remove(Long packetId);
    List<PacketOrder> listAll();
    PacketOrder findById(Long packetId);
}
