
package br.edu.ifpb.pos.soap.viajei.client.clients;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de findByCpf complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="findByCpf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientCpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findByCpf", propOrder = {
    "clientCpf"
})
public class FindByCpf {

    protected String clientCpf;

    /**
     * Obtém o valor da propriedade clientCpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCpf() {
        return clientCpf;
    }

    /**
     * Define o valor da propriedade clientCpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCpf(String value) {
        this.clientCpf = value;
    }

}
