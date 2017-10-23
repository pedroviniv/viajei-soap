/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kieckegard
 */

@Embeddable
@XmlRootElement
public class Address implements Serializable {
    
    private String country;
    private String state;
    private String city;
    private String cep;

    public Address(String country, String state, String city, String cep) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.cep = cep;
    }

    public Address() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Address{" + "country=" + country + ", state=" + state + ", city=" + city + ", cep=" + cep + '}';
    }
}
