package com.traveloka.hibernate.model.pg.tempuri;

import com.traveloka.hibernate.model.pg.goquo_dp.APICancelBookingResponse;

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
 *         &lt;element name="TicketingQueue_CancelitineraryResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}APICancelBookingResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticketingQueueCancelitineraryResult"
})
@XmlRootElement(name = "TicketingQueue_CancelitineraryResponse")
public class TicketingQueueCancelitineraryResponse {

  @XmlElementRef(name = "TicketingQueue_CancelitineraryResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<APICancelBookingResponse> ticketingQueueCancelitineraryResult;

  /**
   * Gets the value of the ticketingQueueCancelitineraryResult property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link APICancelBookingResponse }{@code >}
   */
  public JAXBElement<APICancelBookingResponse> getTicketingQueueCancelitineraryResult() {
    return ticketingQueueCancelitineraryResult;
  }

  /**
   * Sets the value of the ticketingQueueCancelitineraryResult property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link APICancelBookingResponse }{@code >}
   */
  public void setTicketingQueueCancelitineraryResult(JAXBElement<APICancelBookingResponse> value) {
    this.ticketingQueueCancelitineraryResult = value;
  }

}
