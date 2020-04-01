package com.traveloka.hibernate.susimodel;

import lombok.Data;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Payments", namespace = "")
public class ExternalPaymentAddPaymentsRS {

  @XmlElement(name = "Payment", namespace = "")
  List<PaymentRS> paymentRSList;
}
