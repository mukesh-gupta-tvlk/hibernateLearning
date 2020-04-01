package com.traveloka.hibernate.model.pg.goquo_dp;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareGroupFlight complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FareGroupFlight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DispFareGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispMLFareGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FGFlight" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}Flights" minOccurs="0"/>
 *         &lt;element name="FGIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FareGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareGroupFlight", propOrder = {
    "dispFareGroup",
    "dispMLFareGroup",
    "fgFlight",
    "fgIndex",
    "fareGroup",
    "fareGroupCode",
    "parentGroupName"
})
public class FareGroupFlight {

  @XmlElement(name = "DispFareGroup", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispFareGroup;
  @XmlElement(name = "DispMLFareGroup", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispMLFareGroup;
  @XmlElement(name = "FGFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected Flights fgFlight;
  @XmlElement(name = "FGIndex")
  protected Integer fgIndex;
  @XmlElement(name = "FareGroup", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String fareGroup;
  @XmlElement(name = "FareGroupCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String fareGroupCode;
  @XmlElement(name = "ParentGroupName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String parentGroupName;

}
