package com.traveloka.hibernate.model.pg.rqrs;


import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"header", "searchFlightBodyRS"})
@XmlRootElement(name = "Envelope")
public class SearchFlightEnvelopeRS {

  @XmlElement(name = "Header")
  private SearchFlightHeaderRS header;

  @XmlElement(name = "Body")
  private SearchFlightBodyRS searchFlightBodyRS;
}
