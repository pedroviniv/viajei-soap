
package br.edu.ifpb.pos.viajei.client.ticket.transports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de removeTransport complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="removeTransport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transportId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeTransport", propOrder = {
    "transportId"
})
public class RemoveTransport {

    protected Long transportId;

    /**
     * Obtém o valor da propriedade transportId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransportId() {
        return transportId;
    }

    /**
     * Define o valor da propriedade transportId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransportId(Long value) {
        this.transportId = value;
    }

}
