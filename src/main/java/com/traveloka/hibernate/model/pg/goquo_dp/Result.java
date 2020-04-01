package com.traveloka.hibernate.model.pg.goquo_dp;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Result complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Msgs" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "data",
    "isSuccess",
    "msgs"
})
public class Result {

  @XmlElement(name = "Data", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String data;
  @XmlElement(name = "IsSuccess")
  protected Boolean isSuccess;
  @XmlElement(name = "Msgs", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected ArrayOfMessage msgs;

}
