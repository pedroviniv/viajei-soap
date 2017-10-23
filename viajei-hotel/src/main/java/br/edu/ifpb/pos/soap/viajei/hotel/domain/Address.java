/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.hotel.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author kieckegard
 */

@Embeddable
public class Address implements Serializable {
    
    private String country;
    private String uf;
    private String city;
    private String neighborhood;
    private String street;
    private Integer number;

    public Address(String country, String uf, String city, String neighborhood, String street, Integer number) {
        this.country = country;
        this.uf = uf;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
        this.number = number;
    }

    public Address() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" + "country=" + country + ", uf=" + uf + ", city=" + city + ", neighborhood=" + neighborhood + ", street=" + street + ", number=" + number + '}';
    }
}
