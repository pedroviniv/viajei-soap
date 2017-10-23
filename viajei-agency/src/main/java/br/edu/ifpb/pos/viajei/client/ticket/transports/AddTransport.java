
package br.edu.ifpb.pos.viajei.client.ticket.transports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de addTransport complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="addTransport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newTransport" type="{http://ws.ticket.viajei.soap.pos.ifpb.edu.br/}transport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addTransport", propOrder = {
    "newTransport"
})
public class AddTransport {

    protected Transport newTransport;

    /**
     * Obtém o valor da propriedade newTransport.
     * 
     * @return
     *     possible object is
     *     {@link Transport }
     *     
     */
    public Transport getNewTransport() {
        return newTransport;
    }

    /**
     * Define o valor da propriedade newTransport.
     * 
     * @param value
     *     allowed object is
     *     {@link Transport }
     *     
     */
    public void setNewTransport(Transport value) {
        this.newTransport = value;
    }

}
