/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.infra.repo;

import br.edu.ifpb.pos.soap.viajei.transport.model.Transport;
import br.edu.ifpb.pos.soap.viajei.transport.model.TransportType;
import java.util.List;

/**
 *
 * @author kieckegard
 */
public interface TransportRepository {
    
    void add(Transport transport);
    void update(Transport transport);
    void remove(Long transportId);
    Transport findById(Long transportId);
    List<Transport> listAll();
    List<Transport> searchBy(TransportType type, String cepFrom);
}
