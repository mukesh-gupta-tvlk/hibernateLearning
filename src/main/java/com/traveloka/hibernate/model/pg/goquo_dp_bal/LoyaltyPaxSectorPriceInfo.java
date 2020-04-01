package com.traveloka.hibernate.model.pg.goquo_dp_bal;

import com.traveloka.hibernate.model.pg.goquo_dp.PassengerType;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyPaxSectorPriceInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="LoyaltyPaxSectorPriceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllPaxActualCash" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AllPaxActualLoyaltyPoints" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AllPaxAwardFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AllPaxBookingFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AllPaxCash" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AllPaxLoyaltyPoints" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AllPaxYQ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PassengerIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaxType" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PassengerType" minOccurs="0"/>
 *         &lt;element name="PerPaxActualCash" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerPaxActualLoyaltyPoints" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerPaxAwardFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerPaxBookingFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerPaxCash" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerPaxLoyaltyPoints" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerPaxYQ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SegmentDirection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyPaxSectorPriceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Loyalty", propOrder = {
    "allPaxActualCash",
    "allPaxActualLoyaltyPoints",
    "allPaxAwardFee",
    "allPaxBookingFee",
    "allPaxCash",
    "allPaxLoyaltyPoints",
    "allPaxYQ",
    "passengerIndex",
    "paxType",
    "perPaxActualCash",
    "perPaxActualLoyaltyPoints",
    "perPaxAwardFee",
    "perPaxBookingFee",
    "perPaxCash",
    "perPaxLoyaltyPoints",
    "perPaxYQ",
    "segmentDirection"
})
public class LoyaltyPaxSectorPriceInfo {

  @XmlElement(name = "AllPaxActualCash")
  protected BigDecimal allPaxActualCash;
  @XmlElement(name = "AllPaxActualLoyaltyPoints")
  protected BigDecimal allPaxActualLoyaltyPoints;
  @XmlElement(name = "AllPaxAwardFee")
  protected BigDecimal allPaxAwardFee;
  @XmlElement(name = "AllPaxBookingFee")
  protected BigDecimal allPaxBookingFee;
  @XmlElement(name = "AllPaxCash")
  protected BigDecimal allPaxCash;
  @XmlElement(name = "AllPaxLoyaltyPoints")
  protected BigDecimal allPaxLoyaltyPoints;
  @XmlElement(name = "AllPaxYQ")
  protected BigDecimal allPaxYQ;
  @XmlElement(name = "PassengerIndex")
  protected Integer passengerIndex;
  @XmlElement(name = "PaxType")
  @XmlSchemaType(name = "string")
  protected PassengerType paxType;
  @XmlElement(name = "PerPaxActualCash")
  protected BigDecimal perPaxActualCash;
  @XmlElement(name = "PerPaxActualLoyaltyPoints")
  protected BigDecimal perPaxActualLoyaltyPoints;
  @XmlElement(name = "PerPaxAwardFee")
  protected BigDecimal perPaxAwardFee;
  @XmlElement(name = "PerPaxBookingFee")
  protected BigDecimal perPaxBookingFee;
  @XmlElement(name = "PerPaxCash")
  protected BigDecimal perPaxCash;
  @XmlElement(name = "PerPaxLoyaltyPoints")
  protected BigDecimal perPaxLoyaltyPoints;
  @XmlElement(name = "PerPaxYQ")
  protected BigDecimal perPaxYQ;
  @XmlElement(name = "SegmentDirection")
  protected Integer segmentDirection;

  /**
   * Gets the value of the allPaxActualCash property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getAllPaxActualCash() {
    return allPaxActualCash;
  }

  /**
   * Sets the value of the allPaxActualCash property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setAllPaxActualCash(BigDecimal value) {
    this.allPaxActualCash = value;
  }

  /**
   * Gets the value of the allPaxActualLoyaltyPoints property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getAllPaxActualLoyaltyPoints() {
    return allPaxActualLoyaltyPoints;
  }

  /**
   * Sets the value of the allPaxActualLoyaltyPoints property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setAllPaxActualLoyaltyPoints(BigDecimal value) {
    this.allPaxActualLoyaltyPoints = value;
  }

  /**
   * Gets the value of the allPaxAwardFee property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getAllPaxAwardFee() {
    return allPaxAwardFee;
  }

  /**
   * Sets the value of the allPaxAwardFee property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setAllPaxAwardFee(BigDecimal value) {
    this.allPaxAwardFee = value;
  }

  /**
   * Gets the value of the allPaxBookingFee property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getAllPaxBookingFee() {
    return allPaxBookingFee;
  }

  /**
   * Sets the value of the allPaxBookingFee property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setAllPaxBookingFee(BigDecimal value) {
    this.allPaxBookingFee = value;
  }

  /**
   * Gets the value of the allPaxCash property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getAllPaxCash() {
    return allPaxCash;
  }

  /**
   * Sets the value of the allPaxCash property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setAllPaxCash(BigDecimal value) {
    this.allPaxCash = value;
  }

  /**
   * Gets the value of the allPaxLoyaltyPoints property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getAllPaxLoyaltyPoints() {
    return allPaxLoyaltyPoints;
  }

  /**
   * Sets the value of the allPaxLoyaltyPoints property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setAllPaxLoyaltyPoints(BigDecimal value) {
    this.allPaxLoyaltyPoints = value;
  }

  /**
   * Gets the value of the allPaxYQ property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getAllPaxYQ() {
    return allPaxYQ;
  }

  /**
   * Sets the value of the allPaxYQ property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setAllPaxYQ(BigDecimal value) {
    this.allPaxYQ = value;
  }

  /**
   * Gets the value of the passengerIndex property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getPassengerIndex() {
    return passengerIndex;
  }

  /**
   * Sets the value of the passengerIndex property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setPassengerIndex(Integer value) {
    this.passengerIndex = value;
  }

  /**
   * Gets the value of the paxType property.
   *
   * @return possible object is
   * {@link PassengerType }
   */
  public PassengerType getPaxType() {
    return paxType;
  }

  /**
   * Sets the value of the paxType property.
   *
   * @param value allowed object is
   *              {@link PassengerType }
   */
  public void setPaxType(PassengerType value) {
    this.paxType = value;
  }

  /**
   * Gets the value of the perPaxActualCash property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPerPaxActualCash() {
    return perPaxActualCash;
  }

  /**
   * Sets the value of the perPaxActualCash property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPerPaxActualCash(BigDecimal value) {
    this.perPaxActualCash = value;
  }

  /**
   * Gets the value of the perPaxActualLoyaltyPoints property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPerPaxActualLoyaltyPoints() {
    return perPaxActualLoyaltyPoints;
  }

  /**
   * Sets the value of the perPaxActualLoyaltyPoints property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPerPaxActualLoyaltyPoints(BigDecimal value) {
    this.perPaxActualLoyaltyPoints = value;
  }

  /**
   * Gets the value of the perPaxAwardFee property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPerPaxAwardFee() {
    return perPaxAwardFee;
  }

  /**
   * Sets the value of the perPaxAwardFee property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPerPaxAwardFee(BigDecimal value) {
    this.perPaxAwardFee = value;
  }

  /**
   * Gets the value of the perPaxBookingFee property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPerPaxBookingFee() {
    return perPaxBookingFee;
  }

  /**
   * Sets the value of the perPaxBookingFee property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPerPaxBookingFee(BigDecimal value) {
    this.perPaxBookingFee = value;
  }

  /**
   * Gets the value of the perPaxCash property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPerPaxCash() {
    return perPaxCash;
  }

  /**
   * Sets the value of the perPaxCash property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPerPaxCash(BigDecimal value) {
    this.perPaxCash = value;
  }

  /**
   * Gets the value of the perPaxLoyaltyPoints property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPerPaxLoyaltyPoints() {
    return perPaxLoyaltyPoints;
  }

  /**
   * Sets the value of the perPaxLoyaltyPoints property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPerPaxLoyaltyPoints(BigDecimal value) {
    this.perPaxLoyaltyPoints = value;
  }

  /**
   * Gets the value of the perPaxYQ property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPerPaxYQ() {
    return perPaxYQ;
  }

  /**
   * Sets the value of the perPaxYQ property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPerPaxYQ(BigDecimal value) {
    this.perPaxYQ = value;
  }

  /**
   * Gets the value of the segmentDirection property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getSegmentDirection() {
    return segmentDirection;
  }

  /**
   * Sets the value of the segmentDirection property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setSegmentDirection(Integer value) {
    this.segmentDirection = value;
  }

}
