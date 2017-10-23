/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.infra;

import java.util.List;
import br.edu.ifpb.pos.soap.viajei.agency.domain.Packet;

/**
 *
 * @author kieckegard
 */
public interface PacketRepository {
    
    void add(Packet newPackage);
    void remove(Packet targetPackage);
    void update(Packet updatedPackage);
    Packet findById(Long packageId);
    List<Packet> listAll();
    
}
