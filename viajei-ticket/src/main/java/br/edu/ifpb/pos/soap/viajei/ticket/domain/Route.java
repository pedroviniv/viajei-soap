/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.ticket.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author kieckegard
 */

@Embeddable
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Route implements Serializable {
    
    @Column(name = "route_id")
    private Long id;
    
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime departure;
    
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    @Column(name = "estimated_arrival")
    private LocalDateTime estimatedArrival;
    
    @Column(name = "from_address")
    private String fromAddress;
    @Column(name = "to_address")
    private String toAddress;

    public Route(Long id, LocalDateTime departure, LocalDateTime estimatedArrival, String fromAddress, String toAddress) {
        this.id = id;
        this.departure = departure;
        this.estimatedArrival = estimatedArrival;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
    }

    public Route() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDateTime departure) {
        this.departure = departure;
    }

    public LocalDateTime getEstimatedArrival() {
        return estimatedArrival;
    }

    public void setEstimatedArrival(LocalDateTime estimatedArrival) {
        this.estimatedArrival = estimatedArrival;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    @Override
    public String toString() {
        return "Route{" + "id=" + id + ", departure=" + departure + ", estimatedArrival=" + estimatedArrival + ", fromAddress=" + fromAddress + ", toAddress=" + toAddress + '}';
    }
}
