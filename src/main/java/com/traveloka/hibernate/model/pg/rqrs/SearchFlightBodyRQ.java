package com.traveloka.hibernate.model.pg.rqrs;

import com.traveloka.hibernate.model.pg.tempuri.SearchFlightRQ;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Body")
public class SearchFlightBodyRQ {

  @XmlElement(name = "SearchFlight",namespace = "http://tempuri.org/")
  private SearchFlightRQ searchFlightRQ;
}
