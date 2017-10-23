/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kieckegard
 */

@Entity
@XmlRootElement
public class Route implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Enumerated(EnumType.STRING)
    private RouteType type;
    
    @AttributeOverrides({
        @AttributeOverride(name = "country",column=@Column(name="origin_country")),
        @AttributeOverride(name = "state",column=@Column(name="origin_state")),
        @AttributeOverride(name = "city",column=@Column(name="origin_city")),
        @AttributeOverride(name = "cep",column=@Column(name="origin_cep"))
    })
    @Embedded
    private Address origin;
    
    @AttributeOverrides({
        @AttributeOverride(name = "country",column=@Column(name="destiny_country")),
        @AttributeOverride(name = "state",column=@Column(name="destiny_state")),
        @AttributeOverride(name = "city",column=@Column(name="destiny_city")),
        @AttributeOverride(name = "cep",column=@Column(name="destiny_cep"))
    })
    @Embedded
    private Address destiny;
    @Embedded
    private Horary horary;
    
    @Column(name = "estimated_duration")
    private Long estimatedDuration;
    private Long distance;

    public Route(RouteType routeType, Address origin, Address destiny, LocalDateTime estimatedDeparture, 
            Long estimatedDuration, Long distance) {
        
        this.type = routeType;
        this.origin = origin;
        this.destiny = destiny;
        this.horary = new Horary(estimatedDeparture, estimatedDuration);
    }

    public Route() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RouteType getType() {
        return type;
    }

    public void setType(RouteType type) {
        this.type = type;
    }

    public Long getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(Long estimatedDuration) {
        this.horary.setEstimatedArrive(estimatedDuration);
        this.estimatedDuration = estimatedDuration;
    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public Address getOrigin() {
        return origin;
    }

    public void setOrigin(Address origin) {
        this.origin = origin;
    }

    public Address getDestiny() {
        return destiny;
    }

    public void setDestiny(Address destiny) {
        this.destiny = destiny;
    }

    public Horary getHorary() {
        return horary;
    }

    public void setHorary(Horary horary) {
        this.horary = horary;
    }
    
    public boolean hasHoraryConflicts(Route route) {
        return this.horary.hasConflicts(route.getHorary());
    }

    @Override
    public String toString() {
        return "Route{" + "id=" + id + ", origin=" + origin + ", destiny=" + destiny + ", horary=" + horary + '}';
    }
}
