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
public class Hotel implements Serializable {
    
    @Column(name = "hotel_id")
    private Long id;

    public Hotel(Long id) {
        this.id = id;
    }

    public Hotel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Hotel{" + "id=" + id + '}';
    }
}
