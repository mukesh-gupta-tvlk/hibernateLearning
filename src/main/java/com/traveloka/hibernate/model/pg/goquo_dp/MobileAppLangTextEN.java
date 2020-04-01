package com.traveloka.hibernate.model.pg.goquo_dp;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileAppLangTextEN complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MobileAppLangTextEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ControlName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ControlText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DepCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LangCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileAppLangTextEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "controlName",
    "controlText",
    "customerUserID",
    "depCity",
    "id",
    "langCode",
    "resultMsg",
    "status"
})
public class MobileAppLangTextEN {

  @XmlElement(name = "ControlName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String controlName;
  @XmlElement(name = "ControlText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String controlText;
  @XmlElement(name = "CustomerUserID")
  protected Integer customerUserID;
  @XmlElement(name = "DepCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String depCity;
  @XmlElement(name = "ID")
  protected Integer id;
  @XmlElement(name = "LangCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String langCode;
  @XmlElement(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected Result resultMsg;
  @XmlElement(name = "Status")
  protected Boolean status;

}
