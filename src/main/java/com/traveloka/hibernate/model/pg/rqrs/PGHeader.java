package com.traveloka.hibernate.model.pg.rqrs;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Header",namespace = "http://www.w3.org/2005/08/addressing")
public class PGHeader {
  @XmlElement(name = "Action",namespace = "http://www.w3.org/2005/08/addressing")
  private String action;
}
