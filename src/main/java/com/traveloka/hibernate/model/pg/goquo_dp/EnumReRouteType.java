
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumReRouteType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumReRouteType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="OBDepartureCity"/>
 *     &lt;enumeration value="OBArrivalCity"/>
 *     &lt;enumeration value="IBDepartureCity"/>
 *     &lt;enumeration value="IBArrivalCity"/>
 *     &lt;enumeration value="BOTHOBDepartureIBArrival"/>
 *     &lt;enumeration value="BOTHIBDepartureOBArrival"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumReRouteType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils")
@XmlEnum
public enum EnumReRouteType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("OBDepartureCity")
    OB_DEPARTURE_CITY("OBDepartureCity"),
    @XmlEnumValue("OBArrivalCity")
    OB_ARRIVAL_CITY("OBArrivalCity"),
    @XmlEnumValue("IBDepartureCity")
    IB_DEPARTURE_CITY("IBDepartureCity"),
    @XmlEnumValue("IBArrivalCity")
    IB_ARRIVAL_CITY("IBArrivalCity"),
    @XmlEnumValue("BOTHOBDepartureIBArrival")
    BOTHOB_DEPARTURE_IB_ARRIVAL("BOTHOBDepartureIBArrival"),
    @XmlEnumValue("BOTHIBDepartureOBArrival")
    BOTHIB_DEPARTURE_OB_ARRIVAL("BOTHIBDepartureOBArrival");
    private final String value;

    EnumReRouteType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumReRouteType fromValue(String v) {
        for (EnumReRouteType c: EnumReRouteType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
