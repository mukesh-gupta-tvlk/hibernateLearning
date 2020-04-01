package com.traveloka.hibernate.model.pg.goquo_dp_bal;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Travellers complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Travellers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndividualPremium" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Travellers", propOrder = {
    "individualPremium",
    "totalPax",
    "type"
})
public class Travellers {

  @XmlElement(name = "IndividualPremium")
  protected Double individualPremium;
  @XmlElement(name = "TotalPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String totalPax;
  @XmlElement(name = "Type", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String type;

}
