package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialPaxPriceDifference complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SpecialPaxPriceDifference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaxCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerPaxFareDiff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerPaxTaxDiff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialPaxPriceDifference", propOrder = {
    "paxCount",
    "paxType",
    "perPaxFareDiff",
    "perPaxTaxDiff"
})
public class SpecialPaxPriceDifference {

  @XmlElement(name = "PaxCount")
  protected Integer paxCount;
  @XmlElement(name = "PaxType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String paxType;
  @XmlElement(name = "PerPaxFareDiff")
  protected BigDecimal perPaxFareDiff;
  @XmlElement(name = "PerPaxTaxDiff")
  protected BigDecimal perPaxTaxDiff;

  /**
   * Gets the value of the paxCount property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getPaxCount() {
    return paxCount;
  }

  /**
   * Sets the value of the paxCount property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setPaxCount(Integer value) {
    this.paxCount = value;
  }

  /**
   * Gets the value of the paxType property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public String getPaxType() {
    return paxType;
  }

  /**
   * Sets the value of the paxType property.
   *
   * @param value allowed object is
   *              {@link String }{@code <}{@link String }{@code >}
   */
  public void setPaxType(String value) {
    this.paxType = value;
  }

  /**
   * Gets the value of the perPaxFareDiff property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPerPaxFareDiff() {
    return perPaxFareDiff;
  }

  /**
   * Sets the value of the perPaxFareDiff property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPerPaxFareDiff(BigDecimal value) {
    this.perPaxFareDiff = value;
  }

  /**
   * Gets the value of the perPaxTaxDiff property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPerPaxTaxDiff() {
    return perPaxTaxDiff;
  }

  /**
   * Sets the value of the perPaxTaxDiff property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPerPaxTaxDiff(BigDecimal value) {
    this.perPaxTaxDiff = value;
  }

}
