
package br.edu.ifpb.pos.soap.viajei.client.transports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de addRoute complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="addRoute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transportId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="route" type="{http://ws.transport.viajei.soap.pos.ifpb.edu.br/}route" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addRoute", propOrder = {
    "transportId",
    "route"
})
public class AddRoute {

    protected Long transportId;
    protected Route route;

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

    /**
     * Obtém o valor da propriedade route.
     * 
     * @return
     *     possible object is
     *     {@link Route }
     *     
     */
    public Route getRoute() {
        return route;
    }

    /**
     * Define o valor da propriedade route.
     * 
     * @param value
     *     allowed object is
     *     {@link Route }
     *     
     */
    public void setRoute(Route value) {
        this.route = value;
    }

}
