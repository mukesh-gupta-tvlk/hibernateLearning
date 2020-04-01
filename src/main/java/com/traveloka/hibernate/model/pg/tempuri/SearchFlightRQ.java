package com.traveloka.hibernate.model.pg.tempuri;

import com.traveloka.hibernate.model.pg.goquo_dp.FlightSearchCriteriaRQ;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchCriteria" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}FlightSearchCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userName",
    "password",
    "ipAddress",
    "searchCriteria"
})
@XmlRootElement(name = "SearchFlight")
public class SearchFlightRQ {

  @XmlElement(name = "UserName", namespace = "http://tempuri.org/", required = false)
  protected String userName;
  @XmlElement(name = "Password", namespace = "http://tempuri.org/", required = false)
  protected String password;
  @XmlElement(name = "IPAddress", namespace = "http://tempuri.org/", required = false)
  protected String ipAddress;
  @XmlElement(name = "searchCriteria", namespace = "http://tempuri.org/", required = false)
  protected FlightSearchCriteriaRQ searchCriteria;

}
