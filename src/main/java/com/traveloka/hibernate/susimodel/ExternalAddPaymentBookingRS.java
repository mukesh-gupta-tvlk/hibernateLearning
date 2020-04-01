package com.traveloka.hibernate.susimodel;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Booking", namespace = "")
public class ExternalAddPaymentBookingRS {
  @XmlElement(name = "Payments", namespace = "")
  protected ExternalPaymentAddPaymentsRS externalPaymentAddPaymentsRS;
}
