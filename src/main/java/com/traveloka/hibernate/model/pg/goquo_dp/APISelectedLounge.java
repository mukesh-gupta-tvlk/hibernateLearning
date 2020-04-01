package com.traveloka.hibernate.model.pg.goquo_dp;

import com.traveloka.hibernate.model.pg.serialization.arrays.ArrayOfint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_SelectedLounge complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="API_SelectedLounge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsSelectionSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SegmentDirection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SegmentIndex" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_SelectedLounge", propOrder = {
    "errorType",
    "isSelectionSuccess",
    "segmentDirection",
    "segmentIndex"
})
public class APISelectedLounge {

  @XmlElement(name = "ErrorType")
  protected Integer errorType;
  @XmlElement(name = "IsSelectionSuccess")
  protected Boolean isSelectionSuccess;
  @XmlElement(name = "SegmentDirection")
  protected Integer segmentDirection;
  @XmlElementRef(name = "SegmentIndex", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfint> segmentIndex;

  /**
   * Gets the value of the errorType property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getErrorType() {
    return errorType;
  }

  /**
   * Sets the value of the errorType property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setErrorType(Integer value) {
    this.errorType = value;
  }

  /**
   * Gets the value of the isSelectionSuccess property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsSelectionSuccess() {
    return isSelectionSuccess;
  }

  /**
   * Sets the value of the isSelectionSuccess property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsSelectionSuccess(Boolean value) {
    this.isSelectionSuccess = value;
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
