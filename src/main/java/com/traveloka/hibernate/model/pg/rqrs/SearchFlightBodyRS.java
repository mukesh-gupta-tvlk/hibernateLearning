package com.traveloka.hibernate.model.pg.rqrs;

import com.traveloka.hibernate.model.pg.tempuri.SearchFlightResponse;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Body")
public class SearchFlightBodyRS {
  @XmlElement(name = "SearchFlightResponse", namespace = "http://tempuri.org/")
  private SearchFlightResponse searchFlightResponse;
}
