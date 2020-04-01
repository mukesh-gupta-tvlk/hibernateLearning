package com.traveloka.hibernate.model.pg.goquo_dp;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightSearchReponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FlightSearchReponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailableFlights" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAirlineFlight" minOccurs="0"/>
 *         &lt;element name="AvailableFreeBaggages" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfBaggages" minOccurs="0"/>
 *         &lt;element name="ErrorDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="afid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="aid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="b2bid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userLoginID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "availableFlights",
    "availableFreeBaggages",
    "errorDetails",
    "afid",
    "aid",
    "b2Bid",
    "userLoginID"
})
@XmlRootElement(name = "SearchFlightResult")
public class SearchFlightResult {

  @XmlElement(name = "AvailableFlights", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfAirlineFlight availableFlights;
  @XmlElement(name = "AvailableFreeBaggages", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfBaggages availableFreeBaggages;
  @XmlElement(name = "ErrorDetails", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String errorDetails;
  @XmlElement(name = "afid")
  protected Integer afid;
  @XmlElement(name = "aid")
  protected Integer aid;
  @XmlElement(name = "b2bid")
  protected Integer b2Bid;
  @XmlElement(name = "userLoginID")
  protected Integer userLoginID;
}
