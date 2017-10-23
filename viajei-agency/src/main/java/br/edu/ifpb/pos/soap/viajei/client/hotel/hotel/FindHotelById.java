
package br.edu.ifpb.pos.soap.viajei.client.hotel.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de findHotelById complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="findHotelById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findHotelById", propOrder = {
    "hotelId"
})
public class FindHotelById {

    protected Long hotelId;

    /**
     * Obtém o valor da propriedade hotelId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHotelId() {
        return hotelId;
    }

    /**
     * Define o valor da propriedade hotelId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHotelId(Long value) {
        this.hotelId = value;
    }

}
