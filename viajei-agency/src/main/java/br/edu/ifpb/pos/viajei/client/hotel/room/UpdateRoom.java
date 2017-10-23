
package br.edu.ifpb.pos.viajei.client.hotel.room;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de updateRoom complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="updateRoom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updatedRoom" type="{http://ws.hotel.viajei.soap.pos.ifpb.edu.br/}room" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRoom", propOrder = {
    "updatedRoom"
})
public class UpdateRoom {

    protected Room updatedRoom;

    /**
     * Obtém o valor da propriedade updatedRoom.
     * 
     * @return
     *     possible object is
     *     {@link Room }
     *     
     */
    public Room getUpdatedRoom() {
        return updatedRoom;
    }

    /**
     * Define o valor da propriedade updatedRoom.
     * 
     * @param value
     *     allowed object is
     *     {@link Room }
     *     
     */
    public void setUpdatedRoom(Room value) {
        this.updatedRoom = value;
    }

}
