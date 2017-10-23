/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kieckegard
 */

@Entity
@XmlRootElement
public class Transport implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TransportType type;
    private String description;
    
    private Integer seats;
    
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "transport_id")
    private List<Route> routes;

    public Transport(TransportType type, String description, Integer seats) {
        this.type = type;
        this.description = description;
        this.seats = seats;
        this.routes = new ArrayList<>();
    }

    public Transport() {
        this.routes = new ArrayList<>();
    }
    
    public void addRoute(Route route) {
        
        List<Route> conflicted = this.routes.stream()
                .filter(r -> r.hasHoraryConflicts(route))
                .collect(Collectors.toList());
        
        if(!conflicted.isEmpty()) {
        
            StringBuilder builder = new StringBuilder();
            builder.append("The route you're traying to add has horary conflicts")
                    .append(" with the following routes:");
            conflicted.forEach(r -> builder.append(" ").append(r.getId()));
            
            throw new HoraryConflictException(builder.toString());
        }
        
        this.routes.add(route);
    }
    
    public boolean removeRoute(Long routeId) {
        return this.routes.removeIf(r -> r.getId().equals(routeId));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TransportType getType() {
        return type;
    }

    public void setType(TransportType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    @Override
    public String toString() {
        return "Transport{" + "id=" + id + ", type=" + type + ", description=" + description + ", seats=" + seats + ", routes=" + routes + '}';
    }
}
