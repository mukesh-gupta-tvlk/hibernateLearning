package com.traveloka.hibernate.model.pg.goquo_dp;

import lombok.Data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuranceGSTInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="InsuranceGSTInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuranceGSTTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerTaxGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dispTotalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceGSTInfo", propOrder = {
    "currencyCode",
    "insuranceGSTTaxCode",
    "perTaxGST",
    "taxDescription",
    "totalTaxAmount",
    "dispTotalTaxAmount"
})
public class InsuranceGSTInfo {

  @XmlElement(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String currencyCode;
  @XmlElement(name = "InsuranceGSTTaxCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String insuranceGSTTaxCode;
  @XmlElement(name = "PerTaxGST")
  protected BigDecimal perTaxGST;
  @XmlElement(name = "TaxDescription", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String taxDescription;
  @XmlElement(name = "TotalTaxAmount")
  protected BigDecimal totalTaxAmount;
  @XmlElement(name = "dispTotalTaxAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispTotalTaxAmount;


}
