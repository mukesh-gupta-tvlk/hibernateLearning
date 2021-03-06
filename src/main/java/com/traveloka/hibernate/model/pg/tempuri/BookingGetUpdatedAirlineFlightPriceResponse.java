package com.traveloka.hibernate.model.pg.tempuri;

import com.traveloka.hibernate.model.pg.goquo_dp.Flights;

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
 *         &lt;element name="Booking_GetUpdatedAirlineFlightPriceResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}Flights" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingGetUpdatedAirlineFlightPriceResult"
})
@XmlRootElement(name = "Booking_GetUpdatedAirlineFlightPriceResponse")
public class BookingGetUpdatedAirlineFlightPriceResponse {

  @XmlElementRef(name = "Booking_GetUpdatedAirlineFlightPriceResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<Flights> bookingGetUpdatedAirlineFlightPriceResult;

  /**
   * Gets the value of the bookingGetUpdatedAirlineFlightPriceResult property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link Flights }{@code >}
   */
  public JAXBElement<Flights> getBookingGetUpdatedAirlineFlightPriceResult() {
    return bookingGetUpdatedAirlineFlightPriceResult;
  }

  /**
   * Sets the value of the bookingGetUpdatedAirlineFlightPriceResult property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Flights }{@code >}
   */
  public void setBookingGetUpdatedAirlineFlightPriceResult(JAXBElement<Flights> value) {
    this.bookingGetUpdatedAirlineFlightPriceResult = value;
  }

}
