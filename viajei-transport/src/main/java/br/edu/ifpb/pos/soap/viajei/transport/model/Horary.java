/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.model;

import br.edu.ifpb.pos.soap.viajei.transport.rest.adapters.LocalDateTimeAdapter;
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
public class Horary implements Serializable {
    
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    @Column(name = "estimated_departure")
    private LocalDateTime estimatedDeparture;
    
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    @Column(name = "estimated_arrive")
    private LocalDateTime estimatedArrive;

    public Horary(LocalDateTime estimatedDeparture, 
            LocalDateTime estimatedArrive) {
        this.estimatedDeparture = estimatedDeparture;
        this.estimatedArrive = estimatedArrive;
    }
    
    public Horary(LocalDateTime estimatedDeparture, Long secondsDuration) {
        this.estimatedDeparture = estimatedDeparture;
        this.estimatedArrive = estimatedDeparture
                .plusSeconds(secondsDuration);
    }

    public Horary() {
    }

    public LocalDateTime getEstimatedDeparture() {
        return estimatedDeparture;
    }

    public void setEstimatedDeparture(LocalDateTime estimatedDeparture) {
        this.estimatedDeparture = estimatedDeparture;
    }

    public LocalDateTime getEstimatedArrive() {
        return estimatedArrive;
    }

    public void setEstimatedArrive(LocalDateTime estimatedArrive) {
        this.estimatedArrive = estimatedArrive;
    }
    
    public void setEstimatedArrive(Long duration) {
        this.estimatedArrive = this.estimatedDeparture
                .plusSeconds(duration);
    }
    
    //a.saida.isBefore(b.chegada) || a.chegada.isAfter(b.saida) 
    public boolean hasConflicts(Horary horary) {
        return !(horary.estimatedDeparture
                .isAfter(this.estimatedArrive)
                || 
                horary.estimatedArrive
                    .isBefore(this.estimatedDeparture));
    }

    @Override
    public String toString() {
        return "Horary{" + "estimatedDeparture=" + estimatedDeparture + ", estimatedArrive=" + estimatedArrive + '}';
    }
}
