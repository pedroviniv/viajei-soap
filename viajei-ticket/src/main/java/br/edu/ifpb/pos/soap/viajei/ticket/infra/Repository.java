/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.ticket.infra;

import java.util.List;

/**
 *
 * @author kieckegard
 */
public interface Repository<E, I> {
    
    void add(E newEntity);
    void update(E updatedEntity);
    void remove(E entity);
    E findById(I id);
    List<E> listAll();
}
