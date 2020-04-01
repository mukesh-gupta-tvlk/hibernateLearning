package com.traveloka.hibernate.model.pg.rqrs;


import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"header", "searchFlightBodyRQ"})
@XmlRootElement(name = "Envelope",namespace = "http://www.w3.org/2003/05/soap-envelope")
public class SearchFlightEnvelopeRQ {

  @XmlElement(name = "Header")
  private PGHeader header;

  @XmlElement(name = "Body")
  private SearchFlightBodyRQ searchFlightBodyRQ;
}
