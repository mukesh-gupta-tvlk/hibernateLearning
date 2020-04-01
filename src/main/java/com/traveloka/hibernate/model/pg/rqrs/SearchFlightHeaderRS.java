package com.traveloka.hibernate.model.pg.rqrs;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Header", namespace = "http://www.w3.org/2003/05/soap-envelope")
public class SearchFlightHeaderRS {
  @XmlElement(name = "Action", namespace = "http://www.w3.org/2005/08/addressing")
  private String headerAction;
  @XmlElement(name = "servertoken", namespace = "http://schemas.microsoft.com/ws/2006/05/context")
  private String serverToken;
  @XmlElement(name = "Context", namespace = "http://schemas.microsoft.com/ws/2006/05/context")
  private Context context;
}
