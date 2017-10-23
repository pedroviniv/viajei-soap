/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.ws;

import javax.ejb.EJB;
import javax.jws.WebParam;
import javax.jws.WebService;
import br.edu.ifpb.pos.soap.viajei.agency.domain.Packet;
import br.edu.ifpb.pos.soap.viajei.agency.validator.PacketValidator;
import br.edu.ifpb.pos.soap.viajei.agency.infra.PacketRepository;

/**
 *
 * @author kieckegard
 */

@WebService
public class Packets {
    
    @EJB private PacketRepository packetRepository;
    @EJB private PacketValidator validator;
        
    public void addPacket(@WebParam(name = "newPackage") Packet newPacket) {
        validator.validate(newPacket);
        packetRepository.add(newPacket);
    }
    
    public void removePacket(@WebParam(name = "packetId") Long packetId) {
        Packet targetPacket = this.packetRepository.findById(packetId);
        this.packetRepository.remove(targetPacket);
    }
    
    public void updatePacket(@WebParam(name = "updatedPacket") Packet updatedPacket) {
        validator.validate(updatedPacket);
        this.packetRepository.update(updatedPacket);
    }
    
    public Packet[] listAllPackets() {
        return this.packetRepository.listAll().toArray(new Packet[]{});
    }
    
    public Packet findPacketById(@WebParam(name = "packetId") Long packetId) {
        return this.packetRepository.findById(packetId);
    }
}
