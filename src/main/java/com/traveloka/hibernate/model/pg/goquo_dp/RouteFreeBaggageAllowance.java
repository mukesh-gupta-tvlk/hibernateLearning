
package com.traveloka.hibernate.model.pg.goquo_dp;

import lombok.Data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteFreeBaggageAllowance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteFreeBaggageAllowance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CabinClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FBA" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}FreeBaggageAllowance" minOccurs="0"/>
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
@XmlType(name = "RouteFreeBaggageAllowance", propOrder = {
    "arrCity",
    "cabinClassCode",
    "classCode",
    "depCity",
    "fba"
})
public class RouteFreeBaggageAllowance {

    @XmlElement(name = "ArrCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
    protected String arrCity;
    @XmlElement(name = "CabinClassCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
    protected String cabinClassCode;
    @XmlElement(name = "ClassCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
    protected String classCode;
    @XmlElement(name = "DepCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
    protected String depCity;
    @XmlElement(name = "FBA", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
    protected FreeBaggageAllowance fba;


}
