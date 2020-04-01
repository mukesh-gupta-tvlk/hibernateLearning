package com.traveloka.hibernate.model.pg.goquo_dp;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkupGroupsEN complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MarkupGroupsEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="B2BID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserLoginID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkupGroupsEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "b2BID",
    "customerUserID",
    "groupID",
    "groupName",
    "resultMsg",
    "status",
    "userLoginID"
})
@XmlSeeAlso( {
    MarkupFlightEN.class
})
public class MarkupGroupsEN {

  @XmlElement(name = "B2BID")
  protected Integer b2BID;
  @XmlElement(name = "CustomerUserID")
  protected Integer customerUserID;
  @XmlElement(name = "GroupID")
  protected Integer groupID;
  @XmlElement(name = "GroupName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String groupName;
  @XmlElement(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected Result resultMsg;
  @XmlElement(name = "Status", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String status;
  @XmlElement(name = "UserLoginID")
  protected Integer userLoginID;

}
