/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.validator;

/**
 *
 * @author kieckegard
 */
public class BookingDoesNotExists extends IllegalArgumentException {

    public BookingDoesNotExists(String msg, Throwable ex) {
        super(msg, ex);
    }
    
}
