package com.traveloka.hibernate.model.pg.rqrs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Context", namespace = "http://schemas.microsoft.com/ws/2006/05/context")
public class Context {
  @XmlElement(name = "Property", namespace = "")
  private String property;
}
