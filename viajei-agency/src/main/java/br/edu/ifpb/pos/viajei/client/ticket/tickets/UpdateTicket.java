
package br.edu.ifpb.pos.viajei.client.ticket.tickets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de updateTicket complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="updateTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updatedTicket" type="{http://ws.ticket.viajei.soap.pos.ifpb.edu.br/}ticket" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateTicket", propOrder = {
    "updatedTicket"
})
public class UpdateTicket {

    protected Ticket updatedTicket;

    /**
     * Obtém o valor da propriedade updatedTicket.
     * 
     * @return
     *     possible object is
     *     {@link Ticket }
     *     
     */
    public Ticket getUpdatedTicket() {
        return updatedTicket;
    }

    /**
     * Define o valor da propriedade updatedTicket.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticket }
     *     
     */
    public void setUpdatedTicket(Ticket value) {
        this.updatedTicket = value;
    }

}
