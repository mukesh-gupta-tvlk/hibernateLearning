
package com.traveloka.hibernate.model.pg.goquo_dp;

import lombok.Data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareGroupAirlineFlight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareGroupAirlineFlight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DispFareGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareGroupDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreeBaggageAllowance" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}RouteFreeBaggageAllowance" minOccurs="0"/>
 *         &lt;element name="HasFlights" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareGroupAirlineFlight", propOrder = {
    "dispFareGroup",
    "fareGroup",
    "fareGroupCode",
    "fareGroupDesc",
    "freeBaggageAllowance",
    "hasFlights"
})
public class FareGroupAirlineFlight {

    @XmlElement(name = "DispFareGroup", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",  required = false)
    protected String dispFareGroup;
    @XmlElement(name = "FareGroup", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",  required = false)
    protected String fareGroup;
    @XmlElement(name = "FareGroupCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",  required = false)
    protected String fareGroupCode;
    @XmlElement(name = "FareGroupDesc", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",  required = false)
    protected String fareGroupDesc;
    @XmlElement(name = "FreeBaggageAllowance", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",  required = false)
    protected RouteFreeBaggageAllowance freeBaggageAllowance;
    @XmlElement(name = "HasFlights")
    protected Boolean hasFlights;

}
