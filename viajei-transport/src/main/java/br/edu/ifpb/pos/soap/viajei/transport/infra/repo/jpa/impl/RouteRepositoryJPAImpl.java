/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.infra.repo.jpa.impl;

import br.edu.ifpb.pos.soap.viajei.transport.infra.repo.RouteRepository;
import br.edu.ifpb.pos.soap.viajei.transport.model.Route;
import java.util.Optional;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author kieckegard
 */

@RequestScoped
@Transactional
public class RouteRepositoryJPAImpl implements RouteRepository {
    
    @PersistenceContext(unitName = "viajei-transport-pu")
    private EntityManager em;

    @Override
    public Route findById(Long routeId) {
        Optional<Route> searchResult = Optional
                .ofNullable(this.em.find(Route.class, routeId));
        
        if(!searchResult.isPresent())
            throw new EntityNotFoundException("There's no route with the id "
                    + routeId);
        
        return searchResult.get();
    }
    
    
}
