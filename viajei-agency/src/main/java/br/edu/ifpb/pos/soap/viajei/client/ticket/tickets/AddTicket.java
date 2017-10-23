
package br.edu.ifpb.pos.soap.viajei.client.ticket.tickets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de addTicket complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="addTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newTicket" type="{http://ws.ticket.viajei.soap.pos.ifpb.edu.br/}ticket" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addTicket", propOrder = {
    "newTicket"
})
public class AddTicket {

    protected Ticket newTicket;

    /**
     * Obtém o valor da propriedade newTicket.
     * 
     * @return
     *     possible object is
     *     {@link Ticket }
     *     
     */
    public Ticket getNewTicket() {
        return newTicket;
    }

    /**
     * Define o valor da propriedade newTicket.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticket }
     *     
     */
    public void setNewTicket(Ticket value) {
        this.newTicket = value;
    }

}
