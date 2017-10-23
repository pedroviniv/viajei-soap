/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.services;

import br.edu.ifpb.pos.soap.viajei.transport.model.Route;
import br.edu.ifpb.pos.soap.viajei.transport.model.Transport;

/**
 *
 * @author kieckegard
 */
public interface RouteService {
    
    void add(Transport transport, Route route);
}
