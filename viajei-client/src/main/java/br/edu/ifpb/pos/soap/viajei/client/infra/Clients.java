/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.client.infra;

import br.edu.ifpb.pos.soap.viajei.client.domain.Client;
import java.util.List;

/**
 *
 * @author kieckegard
 */
public interface Clients {
    
    void add(Client newClient);
    void update(Client updatedClient);
    Client findById(Long clientId);
    Client findByCpf(String cpf);
    void remove(Client client);
    List<Client> listAll();
    
}
