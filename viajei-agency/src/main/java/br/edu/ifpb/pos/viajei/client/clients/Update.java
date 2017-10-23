
package br.edu.ifpb.pos.viajei.client.clients;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de update complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="update">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updatedClient" type="{http://ws.client.viajei.soap.pos.ifpb.edu.br/}client" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update", propOrder = {
    "updatedClient"
})
public class Update {

    protected Client updatedClient;

    /**
     * Obtém o valor da propriedade updatedClient.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getUpdatedClient() {
        return updatedClient;
    }

    /**
     * Define o valor da propriedade updatedClient.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setUpdatedClient(Client value) {
        this.updatedClient = value;
    }

}
