
package br.edu.ifpb.pos.viajei.client.transports.routes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de findRouteById complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="findRouteById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findRouteById", propOrder = {
    "routeId"
})
public class FindRouteById {

    protected Long routeId;

    /**
     * Obtém o valor da propriedade routeId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRouteId() {
        return routeId;
    }

    /**
     * Define o valor da propriedade routeId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRouteId(Long value) {
        this.routeId = value;
    }

}
