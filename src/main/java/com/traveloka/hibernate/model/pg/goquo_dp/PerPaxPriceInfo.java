package com.traveloka.hibernate.model.pg.goquo_dp;

import lombok.Data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerPaxPriceInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PerPaxPriceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GstTaxPerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerPaxTaxBreakDown" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfTaxBreakDownInfo" minOccurs="0"/>
 *         &lt;element name="PricePerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PromotionPerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SpecialFareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialTypePaxCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TaxPerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dispGstTaxPerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dispMLTotalPricePerPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispPricePerPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispPromotionPerPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispTaxPerPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispTotalPricePerPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerPaxPriceInfo", propOrder = {
    "gstTaxPerPax",
    "perPaxTaxBreakDown",
    "pricePerPax",
    "promotionPerPax",
    "specialFareType",
    "specialTypePaxCount",
    "taxPerPax",
    "dispGstTaxPerPax",
    "dispMLTotalPricePerPax",
    "dispPricePerPax",
    "dispPromotionPerPax",
    "dispTaxPerPax",
    "dispTotalPricePerPax"
})
public class PerPaxPriceInfo {

  @XmlElement(name = "GstTaxPerPax")
  protected BigDecimal gstTaxPerPax;
  @XmlElement(name = "PerPaxTaxBreakDown", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfTaxBreakDownInfo perPaxTaxBreakDown;
  @XmlElement(name = "PricePerPax")
  protected BigDecimal pricePerPax;
  @XmlElement(name = "PromotionPerPax")
  protected BigDecimal promotionPerPax;
  @XmlElement(name = "SpecialFareType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String specialFareType;
  @XmlElement(name = "SpecialTypePaxCount")
  protected Integer specialTypePaxCount;
  @XmlElement(name = "TaxPerPax")
  protected BigDecimal taxPerPax;
  @XmlElement(name = "dispGstTaxPerPax")
  protected BigDecimal dispGstTaxPerPax;
  @XmlElement(name = "dispMLTotalPricePerPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispMLTotalPricePerPax;
  @XmlElement(name = "dispPricePerPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispPricePerPax;
  @XmlElement(name = "dispPromotionPerPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispPromotionPerPax;
  @XmlElement(name = "dispTaxPerPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispTaxPerPax;
  @XmlElement(name = "dispTotalPricePerPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispTotalPricePerPax;

}
