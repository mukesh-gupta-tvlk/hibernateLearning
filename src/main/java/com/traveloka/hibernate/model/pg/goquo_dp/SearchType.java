
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AirlineFlight"/>
 *     &lt;enumeration value="AirlineMultileg"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchType")
@XmlEnum
public enum SearchType {

    @XmlEnumValue("AirlineFlight")
    AIRLINE_FLIGHT("AirlineFlight"),
    @XmlEnumValue("AirlineMultileg")
    AIRLINE_MULTILEG("AirlineMultileg");
    private final String value;

    SearchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchType fromValue(String v) {
        for (SearchType c: SearchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
