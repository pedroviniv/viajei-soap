
package br.edu.ifpb.pos.soap.viajei.client.transports;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de routeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="routeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MANUALLY_SPECIFIED"/>
 *     &lt;enumeration value="GOOGLE_ESTIMATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "routeType")
@XmlEnum
public enum RouteType {

    MANUALLY_SPECIFIED,
    GOOGLE_ESTIMATED;

    public String value() {
        return name();
    }

    public static RouteType fromValue(String v) {
        return valueOf(v);
    }

}
