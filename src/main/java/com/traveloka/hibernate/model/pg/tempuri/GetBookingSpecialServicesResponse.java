package com.traveloka.hibernate.model.pg.tempuri;

import com.traveloka.hibernate.model.pg.goquo_dp.APIBookingSpecialServices;

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
 *         &lt;element name="GetBookingSpecialServicesResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_BookingSpecialServices" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getBookingSpecialServicesResult"
})
@XmlRootElement(name = "GetBookingSpecialServicesResponse")
public class GetBookingSpecialServicesResponse {

  @XmlElementRef(name = "GetBookingSpecialServicesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<APIBookingSpecialServices> getBookingSpecialServicesResult;

  /**
   * Gets the value of the getBookingSpecialServicesResult property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link APIBookingSpecialServices }{@code >}
   */
  public JAXBElement<APIBookingSpecialServices> getGetBookingSpecialServicesResult() {
    return getBookingSpecialServicesResult;
  }

  /**
   * Sets the value of the getBookingSpecialServicesResult property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link APIBookingSpecialServices }{@code >}
   */
  public void setGetBookingSpecialServicesResult(JAXBElement<APIBookingSpecialServices> value) {
    this.getBookingSpecialServicesResult = value;
  }

}
