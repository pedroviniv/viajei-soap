/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.infra.http.client;

import br.edu.ifpb.pos.soap.viajei.transport.infra.http.client.SSLClientFactory;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.ws.rs.client.Client;
import org.immutables.value.Value.Default;

/**
 *
 * @author kieckegard
 */

@ApplicationScoped
public class ClientProducer {
    
    @Produces
    @Dependent
    @Default
    private Client getClient() {
        return new SSLClientFactory().create();
    }
}
