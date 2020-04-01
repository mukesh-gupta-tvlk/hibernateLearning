
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightBookingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightBookingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FlightOnly"/>
 *     &lt;enumeration value="FlightVisa"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="FareGuarantee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightBookingType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils")
@XmlEnum
public enum FlightBookingType {

    @XmlEnumValue("FlightOnly")
    FLIGHT_ONLY("FlightOnly"),
    @XmlEnumValue("FlightVisa")
    FLIGHT_VISA("FlightVisa"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("FareGuarantee")
    FARE_GUARANTEE("FareGuarantee");
    private final String value;

    FlightBookingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightBookingType fromValue(String v) {
        for (FlightBookingType c: FlightBookingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
