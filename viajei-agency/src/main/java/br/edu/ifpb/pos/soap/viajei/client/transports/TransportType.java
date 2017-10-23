
package br.edu.ifpb.pos.soap.viajei.client.transports;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de transportType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="transportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUS"/>
 *     &lt;enumeration value="AIR_PLANE"/>
 *     &lt;enumeration value="SHIP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transportType")
@XmlEnum
public enum TransportType {

    BUS,
    AIR_PLANE,
    SHIP;

    public String value() {
        return name();
    }

    public static TransportType fromValue(String v) {
        return valueOf(v);
    }

}
