package com.traveloka.hibernate.model.pg.tempuri;

import com.traveloka.hibernate.model.pg.goquo_dp.ReservationDetails;

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
 *         &lt;element name="GetUpdatedBookingDetailsResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ReservationDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getUpdatedBookingDetailsResult"
})
@XmlRootElement(name = "GetUpdatedBookingDetailsResponse")
public class GetUpdatedBookingDetailsResponse {

  @XmlElementRef(name = "GetUpdatedBookingDetailsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<ReservationDetails> getUpdatedBookingDetailsResult;

  /**
   * Gets the value of the getUpdatedBookingDetailsResult property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ReservationDetails }{@code >}
   */
  public JAXBElement<ReservationDetails> getGetUpdatedBookingDetailsResult() {
    return getUpdatedBookingDetailsResult;
  }

  /**
   * Sets the value of the getUpdatedBookingDetailsResult property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ReservationDetails }{@code >}
   */
  public void setGetUpdatedBookingDetailsResult(JAXBElement<ReservationDetails> value) {
    this.getUpdatedBookingDetailsResult = value;
  }

}
