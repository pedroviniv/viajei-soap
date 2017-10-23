
package br.edu.ifpb.pos.viajei.client.ticket.tickets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de removeTicket complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="removeTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ticketId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeTicket", propOrder = {
    "ticketId"
})
public class RemoveTicket {

    protected Long ticketId;

    /**
     * Obtém o valor da propriedade ticketId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTicketId() {
        return ticketId;
    }

    /**
     * Define o valor da propriedade ticketId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTicketId(Long value) {
        this.ticketId = value;
    }

}
