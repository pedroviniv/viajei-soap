
package br.edu.ifpb.pos.soap.viajei.client.hotel.bookings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de booking complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="booking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="client" type="{http://ws.hotel.viajei.soap.pos.ifpb.edu.br/}client" minOccurs="0"/>
 *         &lt;element name="days" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="finishDateTime" type="{http://ws.hotel.viajei.soap.pos.ifpb.edu.br/}localDateTime" minOccurs="0"/>
 *         &lt;element name="hotel" type="{http://ws.hotel.viajei.soap.pos.ifpb.edu.br/}hotel" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="room" type="{http://ws.hotel.viajei.soap.pos.ifpb.edu.br/}room" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{http://ws.hotel.viajei.soap.pos.ifpb.edu.br/}localDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "booking", propOrder = {
    "client",
    "days",
    "finishDateTime",
    "hotel",
    "id",
    "room",
    "startDateTime"
})
public class Booking {

    protected Client client;
    protected Integer days;
    protected LocalDateTime finishDateTime;
    protected Hotel hotel;
    protected Long id;
    protected Room room;
    protected LocalDateTime startDateTime;

    /**
     * Obtém o valor da propriedade client.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Define o valor da propriedade client.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Obtém o valor da propriedade days.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDays() {
        return days;
    }

    /**
     * Define o valor da propriedade days.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDays(Integer value) {
        this.days = value;
    }

    /**
     * Obtém o valor da propriedade finishDateTime.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getFinishDateTime() {
        return finishDateTime;
    }

    /**
     * Define o valor da propriedade finishDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setFinishDateTime(LocalDateTime value) {
        this.finishDateTime = value;
    }

    /**
     * Obtém o valor da propriedade hotel.
     * 
     * @return
     *     possible object is
     *     {@link Hotel }
     *     
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * Define o valor da propriedade hotel.
     * 
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *     
     */
    public void setHotel(Hotel value) {
        this.hotel = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade room.
     * 
     * @return
     *     possible object is
     *     {@link Room }
     *     
     */
    public Room getRoom() {
        return room;
    }

    /**
     * Define o valor da propriedade room.
     * 
     * @param value
     *     allowed object is
     *     {@link Room }
     *     
     */
    public void setRoom(Room value) {
        this.room = value;
    }

    /**
     * Obtém o valor da propriedade startDateTime.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    /**
     * Define o valor da propriedade startDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setStartDateTime(LocalDateTime value) {
        this.startDateTime = value;
    }

}
