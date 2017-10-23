/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.client.ws;

import br.edu.ifpb.pos.soap.viajei.client.domain.Client;
import br.edu.ifpb.pos.soap.viajei.client.infra.Clients;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
/**
 *
 * @author kieckegard
 */

@WebService(name = "ClientService")
public class ClientService {
    
    @EJB
    private Clients clients;
    
    @WebMethod
    public void add(@WebParam(name = "client") Client client) {
        this.clients.add(client);
    }
    
    @WebMethod
    public void update(@WebParam(name = "updatedClient") Client client) {
        this.clients.update(client);
    }
    
    @WebMethod
    public void remove(@WebParam(name = "clientId") Long clientId) {
        Client found = this.clients.findById(clientId);
        this.clients.remove(found);
    }
    
    @WebMethod
    public Client findById(@WebParam(name = "clientId") Long clientId) {
        return this.clients.findById(clientId);
    }
    
    @WebMethod
    public Client findByCpf(
            @WebParam(name = "clientCpf") String clientCpf) {
        
        return this.clients.findByCpf(clientCpf);
    }
    
    @WebMethod
    public Client[] listAll() {
        return this.clients.listAll().toArray(new Client[0]);
    }
}
