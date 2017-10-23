
package br.edu.ifpb.pos.soap.viajei.client.transports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de route complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="route">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destiny" type="{http://ws.transport.viajei.soap.pos.ifpb.edu.br/}address" minOccurs="0"/>
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="estimatedDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="horary" type="{http://ws.transport.viajei.soap.pos.ifpb.edu.br/}horary" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="origin" type="{http://ws.transport.viajei.soap.pos.ifpb.edu.br/}address" minOccurs="0"/>
 *         &lt;element name="type" type="{http://ws.transport.viajei.soap.pos.ifpb.edu.br/}routeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "route", propOrder = {
    "destiny",
    "distance",
    "estimatedDuration",
    "horary",
    "id",
    "origin",
    "type"
})
public class Route {

    protected Address destiny;
    protected Long distance;
    protected Long estimatedDuration;
    protected Horary horary;
    protected Long id;
    protected Address origin;
    protected RouteType type;

    /**
     * Obtém o valor da propriedade destiny.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDestiny() {
        return destiny;
    }

    /**
     * Define o valor da propriedade destiny.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDestiny(Address value) {
        this.destiny = value;
    }

    /**
     * Obtém o valor da propriedade distance.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistance() {
        return distance;
    }

    /**
     * Define o valor da propriedade distance.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistance(Long value) {
        this.distance = value;
    }

    /**
     * Obtém o valor da propriedade estimatedDuration.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedDuration() {
        return estimatedDuration;
    }

    /**
     * Define o valor da propriedade estimatedDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedDuration(Long value) {
        this.estimatedDuration = value;
    }

    /**
     * Obtém o valor da propriedade horary.
     * 
     * @return
     *     possible object is
     *     {@link Horary }
     *     
     */
    public Horary getHorary() {
        return horary;
    }

    /**
     * Define o valor da propriedade horary.
     * 
     * @param value
     *     allowed object is
     *     {@link Horary }
     *     
     */
    public void setHorary(Horary value) {
        this.horary = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade origin.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getOrigin() {
        return origin;
    }

    /**
     * Define o valor da propriedade origin.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setOrigin(Address value) {
        this.origin = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link RouteType }
     *     
     */
    public RouteType getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteType }
     *     
     */
    public void setType(RouteType value) {
        this.type = value;
    }

}
