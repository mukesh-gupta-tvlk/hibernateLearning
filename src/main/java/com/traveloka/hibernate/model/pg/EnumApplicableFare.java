package com.traveloka.hibernate.model.pg;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumApplicableFare.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumApplicableFare">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="NormalFare"/>
 *     &lt;enumeration value="SpecialFare"/>
 *     &lt;enumeration value="CorporateFare"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "EnumApplicableFare", namespace = "http://schemas.datacontract.org/2004/07/")
@XmlEnum
public enum EnumApplicableFare {

  @XmlEnumValue("None")
  NONE("None"),
  @XmlEnumValue("NormalFare")
  NORMAL_FARE("NormalFare"),
  @XmlEnumValue("SpecialFare")
  SPECIAL_FARE("SpecialFare"),
  @XmlEnumValue("CorporateFare")
  CORPORATE_FARE("CorporateFare");
  private final String value;

  EnumApplicableFare(String v) {
    value = v;
  }

  public static EnumApplicableFare fromValue(String v) {
    for (EnumApplicableFare c : EnumApplicableFare.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

  public String value() {
    return value;
  }

}
