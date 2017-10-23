
package br.edu.ifpb.pos.viajei.client.transports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de horary complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="horary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estimatedDeparture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimatedArrive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "horary", propOrder = {
    "estimatedDeparture",
    "estimatedArrive"
})
public class Horary {

    protected String estimatedDeparture;
    protected String estimatedArrive;

    /**
     * Obtém o valor da propriedade estimatedDeparture.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedDeparture() {
        return estimatedDeparture;
    }

    /**
     * Define o valor da propriedade estimatedDeparture.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedDeparture(String value) {
        this.estimatedDeparture = value;
    }

    /**
     * Obtém o valor da propriedade estimatedArrive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedArrive() {
        return estimatedArrive;
    }

    /**
     * Define o valor da propriedade estimatedArrive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedArrive(String value) {
        this.estimatedArrive = value;
    }

}
