/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.agency.ws;

import br.edu.ifpb.pos.soap.viajei.agency.adapters.LocalDateTimeAdapter;
import br.edu.ifpb.pos.soap.viajei.client.hotel.bookings.LocalDateTime;
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
public class PacketOrderRequest implements Serializable {
    
    private String clientCpf;
    private Long packetId;
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime startDate;
    private Integer daysQty;
    private Integer seatNumber;

    public PacketOrderRequest(String clientCpf, Long packetId, LocalDateTime startDate, Integer daysQty, Integer seatNumber) {
        this.clientCpf = clientCpf;
        this.packetId = packetId;
        this.startDate = startDate;
        this.daysQty = daysQty;
        this.seatNumber = seatNumber;
    }

    public String getClientCpf() {
        return clientCpf;
    }

    public void setClientCpf(String clientCpf) {
        this.clientCpf = clientCpf;
    }

    public Long getPacketId() {
        return packetId;
    }

    public void setPacketId(Long packetId) {
        this.packetId = packetId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public Integer getDaysQty() {
        return daysQty;
    }

    public void setDaysQty(Integer daysQty) {
        this.daysQty = daysQty;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "PacketOrderRequest{" + "clientCpf=" + clientCpf + ", packetId=" + packetId + ", startDate=" + startDate + ", daysQty=" + daysQty + ", seatNumber=" + seatNumber + '}';
    }
}
