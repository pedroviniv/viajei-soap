
package br.edu.ifpb.pos.viajei.client.ticket.transports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de updateTransport complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="updateTransport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updatedTransport" type="{http://ws.ticket.viajei.soap.pos.ifpb.edu.br/}transport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateTransport", propOrder = {
    "updatedTransport"
})
public class UpdateTransport {

    protected Transport updatedTransport;

    /**
     * Obtém o valor da propriedade updatedTransport.
     * 
     * @return
     *     possible object is
     *     {@link Transport }
     *     
     */
    public Transport getUpdatedTransport() {
        return updatedTransport;
    }

    /**
     * Define o valor da propriedade updatedTransport.
     * 
     * @param value
     *     allowed object is
     *     {@link Transport }
     *     
     */
    public void setUpdatedTransport(Transport value) {
        this.updatedTransport = value;
    }

}
