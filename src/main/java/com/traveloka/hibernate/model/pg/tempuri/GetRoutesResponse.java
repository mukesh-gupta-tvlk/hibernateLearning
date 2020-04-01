package com.traveloka.hibernate.model.pg.tempuri;

import com.traveloka.hibernate.model.pg.goquo_dp.ArrayOfAPIRoutesEn;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetRoutesResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfAPIRoutesEn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getRoutesResult"
})
@XmlRootElement(name = "GetRoutesResponse")
public class GetRoutesResponse {

  @XmlElementRef(name = "GetRoutesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfAPIRoutesEn> getRoutesResult;

  /**
   * Gets the value of the getRoutesResult property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ArrayOfAPIRoutesEn }{@code >}
   */
  public JAXBElement<ArrayOfAPIRoutesEn> getGetRoutesResult() {
    return getRoutesResult;
  }

  /**
   * Sets the value of the getRoutesResult property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ArrayOfAPIRoutesEn }{@code >}
   */
  public void setGetRoutesResult(JAXBElement<ArrayOfAPIRoutesEn> value) {
    this.getRoutesResult = value;
  }

}
