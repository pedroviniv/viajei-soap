/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.ticket.infra;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

/**
 *
 * @author kieckegard
 */

@Qualifier
@Target({ElementType.METHOD,
    ElementType.PARAMETER, 
    ElementType.FIELD, 
    ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TicketRepository {
    
}
