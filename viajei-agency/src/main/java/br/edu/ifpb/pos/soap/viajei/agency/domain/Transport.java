/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kieckegard
 */

@XmlRootElement
@Embeddable
public class Transport implements Serializable {
    
    @Column(name = "transport_id")
    private Long id;

    public Transport(Long id) {
        this.id = id;
    }
    
    public Transport() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Transport{" + "id=" + id + '}';
    }
}
