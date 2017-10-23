/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.infra.http.client;

import javax.ws.rs.client.Client;

/**
 *
 * @author kieckegard
 */
public interface ClientFactory {
    
    Client create();
}
