package com.traveloka.hibernate.model.pg.tempuri;

import com.traveloka.hibernate.model.pg.goquo_dp.APIMultiCitySetSelectedFlights;

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
 *         &lt;element name="multiCitySetSelectedFlights" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_MultiCitySetSelectedFlights" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "multiCitySetSelectedFlights"
})
@XmlRootElement(name = "Booking_MultiSetSelectedAirlineFlights")
public class BookingMultiSetSelectedAirlineFlights {

  @XmlElementRef(name = "multiCitySetSelectedFlights", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<APIMultiCitySetSelectedFlights> multiCitySetSelectedFlights;

  /**
   * Gets the value of the multiCitySetSelectedFlights property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link APIMultiCitySetSelectedFlights }{@code >}
   */
  public JAXBElement<APIMultiCitySetSelectedFlights> getMultiCitySetSelectedFlights() {
    return multiCitySetSelectedFlights;
  }

  /**
   * Sets the value of the multiCitySetSelectedFlights property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link APIMultiCitySetSelectedFlights }{@code >}
   */
  public void setMultiCitySetSelectedFlights(JAXBElement<APIMultiCitySetSelectedFlights> value) {
    this.multiCitySetSelectedFlights = value;
  }

}
