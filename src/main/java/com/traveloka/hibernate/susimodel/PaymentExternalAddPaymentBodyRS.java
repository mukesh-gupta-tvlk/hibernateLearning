package com.traveloka.hibernate.susimodel;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Body", namespace = SusiAirBookingCommon.SUSI_AIR_ENVELOPE_NAMESPACE)
public class PaymentExternalAddPaymentBodyRS {
  @XmlElement(name = "PaymentExternalPaymentAddPaymentResponse", namespace = SusiAirBookingCommon.SUSI_PAYMENT_NAMESPACE)
  protected PaymentExternalAddPaymentResponse addPaymentResponseRS;
}
