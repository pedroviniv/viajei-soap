/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.infra.repo;

import br.edu.ifpb.pos.soap.viajei.transport.model.Route;

/**
 *
 * @author kieckegard
 */
public interface RouteRepository {
    
    Route findById(Long routeId);
}
