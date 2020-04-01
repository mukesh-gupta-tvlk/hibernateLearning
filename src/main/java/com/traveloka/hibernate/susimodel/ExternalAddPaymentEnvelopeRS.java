package com.traveloka.hibernate.susimodel;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Envelope", namespace = SusiAirBookingCommon.SUSI_AIR_ENVELOPE_NAMESPACE)
public class ExternalAddPaymentEnvelopeRS {
  @XmlElement(name = "Body", namespace = SusiAirBookingCommon.SUSI_AIR_ENVELOPE_NAMESPACE)
  protected PaymentExternalAddPaymentBodyRS addPaymentBodyRS;
}
