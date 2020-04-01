package com.traveloka.hibernate.model.pg.goquo_dp;

import com.traveloka.hibernate.model.pg.serialization.arrays.ArrayOfint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_BaggageSegment complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="API_BaggageSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrAirCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Baggages" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAPI_BaggageInfo" minOccurs="0"/>
 *         &lt;element name="DepAirCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SegmentIndex" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_BaggageSegment", propOrder = {
    "arrAirCode",
    "baggages",
    "depAirCode",
    "direction",
    "segmentIndex"
})
public class APIBaggageSegment {

  @XmlElementRef(name = "ArrAirCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> arrAirCode;
  @XmlElementRef(name = "Baggages", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfAPIBaggageInfo> baggages;
  @XmlElementRef(name = "DepAirCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> depAirCode;
  @XmlElement(name = "Direction")
  protected Integer direction;
  @XmlElementRef(name = "SegmentIndex", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfint> segmentIndex;

  /**
   * Gets the value of the arrAirCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getArrAirCode() {
    return arrAirCode;
  }

  /**
   * Sets the value of the arrAirCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setArrAirCode(JAXBElement<String> value) {
    this.arrAirCode = value;
  }

  /**
   * Gets the value of the baggages property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ArrayOfAPIBaggageInfo }{@code >}
   */
  public JAXBElement<ArrayOfAPIBaggageInfo> getBaggages() {
    return baggages;
  }

  /**
   * Sets the value of the baggages property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ArrayOfAPIBaggageInfo }{@code >}
   */
  public void setBaggages(JAXBElement<ArrayOfAPIBaggageInfo> value) {
    this.baggages = value;
  }

  /**
   * Gets the value of the depAirCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDepAirCode() {
    return depAirCode;
  }

  /**
   * Sets the value of the depAirCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDepAirCode(JAXBElement<String> value) {
    this.depAirCode = value;
  }

  /**
   * Gets the value of the direction property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getDirection() {
    return direction;
  }

  /**
   * Sets the value of the direction property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setDirection(Integer value) {
    this.direction = value;
  }

  /**
   * Gets the value of the segmentIndex property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
   */
  public JAXBElement<ArrayOfint> getSegmentIndex() {
    return segmentIndex;
  }

  /**
   * Sets the value of the segmentIndex property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
   */
  public void setSegmentIndex(JAXBElement<ArrayOfint> value) {
    this.segmentIndex = value;
  }

}
