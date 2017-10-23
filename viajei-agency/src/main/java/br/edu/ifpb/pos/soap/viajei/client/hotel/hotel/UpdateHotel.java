
package br.edu.ifpb.pos.soap.viajei.client.hotel.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de updateHotel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="updateHotel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updatedHotel" type="{http://ws.hotel.viajei.soap.pos.ifpb.edu.br/}hotel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateHotel", propOrder = {
    "updatedHotel"
})
public class UpdateHotel {

    protected Hotel updatedHotel;

    /**
     * Obtém o valor da propriedade updatedHotel.
     * 
     * @return
     *     possible object is
     *     {@link Hotel }
     *     
     */
    public Hotel getUpdatedHotel() {
        return updatedHotel;
    }

    /**
     * Define o valor da propriedade updatedHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *     
     */
    public void setUpdatedHotel(Hotel value) {
        this.updatedHotel = value;
    }

}
