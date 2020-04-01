
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MilesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MilesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="FullMiles"/>
 *     &lt;enumeration value="CashPlusMiles"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MilesType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils")
@XmlEnum
public enum MilesType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("FullMiles")
    FULL_MILES("FullMiles"),
    @XmlEnumValue("CashPlusMiles")
    CASH_PLUS_MILES("CashPlusMiles");
    private final String value;

    MilesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MilesType fromValue(String v) {
        for (MilesType c: MilesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
