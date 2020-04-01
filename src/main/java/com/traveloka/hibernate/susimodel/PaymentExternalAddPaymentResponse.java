package com.traveloka.hibernate.susimodel;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paymentResult"
})
@XmlRootElement(name = "PaymentExternalPaymentAddPaymentResponse", namespace = SusiAirBookingCommon.SUSI_PAYMENT_NAMESPACE)
public class PaymentExternalAddPaymentResponse {

  @XmlElement(name = "PaymentExternalPaymentAddPaymentResult",namespace = SusiAirBookingCommon.SUSI_PAYMENT_NAMESPACE)
  protected String paymentResult;

}
