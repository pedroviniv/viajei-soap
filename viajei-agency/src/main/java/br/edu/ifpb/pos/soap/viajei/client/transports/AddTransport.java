
package br.edu.ifpb.pos.soap.viajei.client.transports;

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
 *         &lt;element name="transport" type="{http://ws.transport.viajei.soap.pos.ifpb.edu.br/}transport" minOccurs="0"/>
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
    "transport"
})
public class AddTransport {

    protected Transport transport;

    /**
     * Obtém o valor da propriedade transport.
     * 
     * @return
     *     possible object is
     *     {@link Transport }
     *     
     */
    public Transport getTransport() {
        return transport;
    }

    /**
     * Define o valor da propriedade transport.
     * 
     * @param value
     *     allowed object is
     *     {@link Transport }
     *     
     */
    public void setTransport(Transport value) {
        this.transport = value;
    }

}
