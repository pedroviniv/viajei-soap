/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.validator;

import br.edu.ifpb.pos.soap.viajei.agency.domain.Client;
import br.edu.ifpb.pos.viajei.client.clients.ClientService;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author kieckegard
 */

@Stateless
public class ClientValidator {
    
    @Inject
    private ClientService clientService;
    
    public void validate(Client client) {
        
        String cpf = client.getCpf();
        try {
            this.clientService.findById(2L);
        } catch (RuntimeException ex) {
            throw new IllegalArgumentException("There's no client"
                    + " which the cpf is " + cpf, ex);
        }
    }
}
