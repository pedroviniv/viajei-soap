/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.mapper;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import org.immutables.value.Value.Default;

/**
 *
 * @author kieckegard
 */

@ApplicationScoped
public class MapperProducer {
    
    @Produces
    @Dependent
    @Default
    public Mapper getMapper() {
        return new Mapper();
    }
}
