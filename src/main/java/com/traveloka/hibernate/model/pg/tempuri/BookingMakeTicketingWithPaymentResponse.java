package com.traveloka.hibernate.model.pg.tempuri;

import com.traveloka.hibernate.model.pg.goquo_dp.TicketingResponse;

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
 *         &lt;element name="Booking_MakeTicketingWithPaymentResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}TicketingResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingMakeTicketingWithPaymentResult"
})
@XmlRootElement(name = "Booking_MakeTicketingWithPaymentResponse")
public class BookingMakeTicketingWithPaymentResponse {

  @XmlElementRef(name = "Booking_MakeTicketingWithPaymentResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<TicketingResponse> bookingMakeTicketingWithPaymentResult;

  /**
   * Gets the value of the bookingMakeTicketingWithPaymentResult property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link TicketingResponse }{@code >}
   */
  public JAXBElement<TicketingResponse> getBookingMakeTicketingWithPaymentResult() {
    return bookingMakeTicketingWithPaymentResult;
  }

  /**
   * Sets the value of the bookingMakeTicketingWithPaymentResult property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TicketingResponse }{@code >}
   */
  public void setBookingMakeTicketingWithPaymentResult(JAXBElement<TicketingResponse> value) {
    this.bookingMakeTicketingWithPaymentResult = value;
  }

}
