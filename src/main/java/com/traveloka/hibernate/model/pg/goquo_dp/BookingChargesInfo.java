package com.traveloka.hibernate.model.pg.goquo_dp;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingChargesInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BookingChargesInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdultSurcharge" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PaxTypeCharge" minOccurs="0"/>
 *         &lt;element name="ChildSurcharge" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PaxTypeCharge" minOccurs="0"/>
 *         &lt;element name="InfantSurcharge" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PaxTypeCharge" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingChargesInfo", propOrder = {
    "adultSurcharge",
    "childSurcharge",
    "infantSurcharge"
})
public class BookingChargesInfo {

  @XmlElement(name = "AdultSurcharge", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected PaxTypeCharge adultSurcharge;
  @XmlElement(name = "ChildSurcharge", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected PaxTypeCharge childSurcharge;
  @XmlElement(name = "InfantSurcharge", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected PaxTypeCharge infantSurcharge;

}
