package com.traveloka.hibernate.model.pg.tempuri;

import com.traveloka.hibernate.model.pg.goquo_dp.MultiSetSelectedReponse;

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
 *         &lt;element name="Booking_GetUpdatedMLAirlineFlightPriceResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}MultiSetSelectedReponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingGetUpdatedMLAirlineFlightPriceResult"
})
@XmlRootElement(name = "Booking_GetUpdatedMLAirlineFlightPriceResponse")
public class BookingGetUpdatedMLAirlineFlightPriceResponse {

  @XmlElementRef(name = "Booking_GetUpdatedMLAirlineFlightPriceResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<MultiSetSelectedReponse> bookingGetUpdatedMLAirlineFlightPriceResult;

  /**
   * Gets the value of the bookingGetUpdatedMLAirlineFlightPriceResult property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link MultiSetSelectedReponse }{@code >}
   */
  public JAXBElement<MultiSetSelectedReponse> getBookingGetUpdatedMLAirlineFlightPriceResult() {
    return bookingGetUpdatedMLAirlineFlightPriceResult;
  }

  /**
   * Sets the value of the bookingGetUpdatedMLAirlineFlightPriceResult property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link MultiSetSelectedReponse }{@code >}
   */
  public void setBookingGetUpdatedMLAirlineFlightPriceResult(JAXBElement<MultiSetSelectedReponse> value) {
    this.bookingGetUpdatedMLAirlineFlightPriceResult = value;
  }

}
