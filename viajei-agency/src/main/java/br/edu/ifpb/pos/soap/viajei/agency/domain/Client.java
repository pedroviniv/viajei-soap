/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author kieckegard
 */
@Embeddable
public class Client implements Serializable {
    
    @Column(name = "client_cpf")
    private String cpf;
    
    public Client(String cpf) {
        this.cpf = cpf;
    }
    
    public Client() {
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Client{" + "cpf=" + cpf + '}';
    }
}
