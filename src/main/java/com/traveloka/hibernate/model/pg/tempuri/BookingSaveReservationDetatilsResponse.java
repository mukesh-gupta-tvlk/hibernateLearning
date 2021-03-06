package com.traveloka.hibernate.model.pg.tempuri;

import com.traveloka.hibernate.model.pg.goquo_dp.ReservationsEN;

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
 *         &lt;element name="Booking_SaveReservationDetatilsResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ReservationsEN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingSaveReservationDetatilsResult"
})
@XmlRootElement(name = "Booking_SaveReservationDetatilsResponse")
public class BookingSaveReservationDetatilsResponse {

  @XmlElementRef(name = "Booking_SaveReservationDetatilsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<ReservationsEN> bookingSaveReservationDetatilsResult;

  /**
   * Gets the value of the bookingSaveReservationDetatilsResult property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ReservationsEN }{@code >}
   */
  public JAXBElement<ReservationsEN> getBookingSaveReservationDetatilsResult() {
    return bookingSaveReservationDetatilsResult;
  }

  /**
   * Sets the value of the bookingSaveReservationDetatilsResult property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ReservationsEN }{@code >}
   */
  public void setBookingSaveReservationDetatilsResult(JAXBElement<ReservationsEN> value) {
    this.bookingSaveReservationDetatilsResult = value;
  }

}
