
package br.edu.ifpb.pos.viajei.client.transports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de searchTransportsBy complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="searchTransportsBy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transportType" type="{http://ws.transport.viajei.soap.pos.ifpb.edu.br/}transportType" minOccurs="0"/>
 *         &lt;element name="cepFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchTransportsBy", propOrder = {
    "transportType",
    "cepFrom"
})
public class SearchTransportsBy {

    protected TransportType transportType;
    protected String cepFrom;

    /**
     * Obtém o valor da propriedade transportType.
     * 
     * @return
     *     possible object is
     *     {@link TransportType }
     *     
     */
    public TransportType getTransportType() {
        return transportType;
    }

    /**
     * Define o valor da propriedade transportType.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportType }
     *     
     */
    public void setTransportType(TransportType value) {
        this.transportType = value;
    }

    /**
     * Obtém o valor da propriedade cepFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepFrom() {
        return cepFrom;
    }

    /**
     * Define o valor da propriedade cepFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepFrom(String value) {
        this.cepFrom = value;
    }

}
