package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentFareInfoEN complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SegmentFareInfoEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="SegmentIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentFareInfoEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "arrCode",
    "currencyCode",
    "depCode",
    "fareAmount",
    "fareBasisCode",
    "paxType",
    "resultMsg",
    "segmentIndex"
})
public class SegmentFareInfoEN {

  @XmlElement(name = "ArrCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String arrCode;
  @XmlElement(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String currencyCode;
  @XmlElement(name = "DepCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String depCode;
  @XmlElement(name = "FareAmount")
  protected BigDecimal fareAmount;
  @XmlElement(name = "FareBasisCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String fareBasisCode;
  @XmlElement(name = "PaxType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String paxType;
  @XmlElement(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected Result resultMsg;
  @XmlElement(name = "SegmentIndex")
  protected Integer segmentIndex;

  /**
   * Gets the value of the arrCode property.
   *
   * @return possible object is
   * {@link String }{@code <}{@link String }{@code >}
   */
  public String getArrCode() {
    return arrCode;
  }

  /**
   * Sets the value of the arrCode property.
   *
   * @param value allowed object is
   *              {@link String }{@code <}{@link String }{@code >}
   */
  public void setArrCode(String value) {
    this.arrCode = value;
  }

  /**
   * Gets the value of the currencyCode property.
   *
   * @return possible object is
   * {@link String }{@code <}{@link String }{@code >}
   */
  public String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * Sets the value of the currencyCode property.
   *
   * @param value allowed object is
   *              {@link String }{@code <}{@link String }{@code >}
   */
  public void setCurrencyCode(String value) {
    this.currencyCode = value;
  }

  /**
   * Gets the value of the depCode property.
   *
   * @return possible object is
   * {@link String }{@code <}{@link String }{@code >}
   */
  public String getDepCode() {
    return depCode;
  }

  /**
   * Sets the value of the depCode property.
   *
   * @param value allowed object is
   *              {@link String }{@code <}{@link String }{@code >}
   */
  public void setDepCode(String value) {
    this.depCode = value;
  }

  /**
   * Gets the value of the fareAmount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getFareAmount() {
    return fareAmount;
  }

  /**
   * Sets the value of the fareAmount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setFareAmount(BigDecimal value) {
    this.fareAmount = value;
  }

  /**
   * Gets the value of the fareBasisCode property.
   *
   * @return possible object is
   * {@link String }{@code <}{@link String }{@code >}
   */
  public String getFareBasisCode() {
    return fareBasisCode;
  }

  /**
   * Sets the value of the fareBasisCode property.
   *
   * @param value allowed object is
   *              {@link String }{@code <}{@link String }{@code >}
   */
  public void setFareBasisCode(String value) {
    this.fareBasisCode = value;
  }

  /**
   * Gets the value of the paxType property.
   *
   * @return possible object is
   * {@link String }{@code <}{@link String }{@code >}
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
   * Gets the value of the resultMsg property.
   *
   * @return possible object is
   * {@link String }{@code <}{@link Result }{@code >}
   */
  public Result getResultMsg() {
    return resultMsg;
  }

  /**
   * Sets the value of the resultMsg property.
   *
   * @param value allowed object is
   *              {@link Result }{@code <}{@link Result }{@code >}
   */
  public void setResultMsg(Result value) {
    this.resultMsg = value;
  }

  /**
   * Gets the value of the segmentIndex property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getSegmentIndex() {
    return segmentIndex;
  }

  /**
   * Sets the value of the segmentIndex property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setSegmentIndex(Integer value) {
    this.segmentIndex = value;
  }

}
