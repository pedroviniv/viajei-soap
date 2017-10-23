
package br.edu.ifpb.pos.soap.viajei.client.hotel.bookings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de findBookingById complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="findBookingById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findBookingById", propOrder = {
    "bookingId"
})
public class FindBookingById {

    protected Long bookingId;

    /**
     * Obtém o valor da propriedade bookingId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBookingId() {
        return bookingId;
    }

    /**
     * Define o valor da propriedade bookingId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBookingId(Long value) {
        this.bookingId = value;
    }

}
