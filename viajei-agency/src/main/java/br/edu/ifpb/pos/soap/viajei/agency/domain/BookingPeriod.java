/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.domain;

import br.edu.ifpb.pos.viajei.client.hotel.bookings.LocalDateTime;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author kieckegard
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BookingPeriod implements Serializable {
    
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime startDate;
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime endDate;

    public BookingPeriod(LocalDateTime startDate, LocalDateTime endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public BookingPeriod() {
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "BookingPeriod{" + "startDate=" + startDate + ", endDate=" + endDate + '}';
    }
}
