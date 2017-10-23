
package br.edu.ifpb.pos.soap.viajei.client.hotel.room;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de addRoom complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="addRoom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newRoom" type="{http://ws.hotel.viajei.soap.pos.ifpb.edu.br/}room" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addRoom", propOrder = {
    "newRoom"
})
public class AddRoom {

    protected Room newRoom;

    /**
     * Obtém o valor da propriedade newRoom.
     * 
     * @return
     *     possible object is
     *     {@link Room }
     *     
     */
    public Room getNewRoom() {
        return newRoom;
    }

    /**
     * Define o valor da propriedade newRoom.
     * 
     * @param value
     *     allowed object is
     *     {@link Room }
     *     
     */
    public void setNewRoom(Room value) {
        this.newRoom = value;
    }

}
