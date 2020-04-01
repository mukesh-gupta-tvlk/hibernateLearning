package com.traveloka.hibernate.model.pg.goquo_dp_bal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Insuranceproduct complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Insuranceproduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VariantCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductVariant", propOrder = {
    "id",
    "offerId",
    "productCode",
    "quoteReference",
    "variantCode"
})
public class ProductVariant {

  @XmlElement(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String id;
  @XmlElement(name = "OfferId", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String offerId;
  @XmlElement(name = "ProductCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String productCode;
  @XmlElement(name = "QuoteReference", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String quoteReference;
  @XmlElement(name = "VariantCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String variantCode;


}
