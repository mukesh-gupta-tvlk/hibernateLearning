package com.traveloka.hibernate.model.pg.rqrs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType
@XmlRootElement(name = "Property", namespace = "")
public class Property {
  @XmlAttribute(name = "name", namespace = "")
  private String name;
  @XmlElement(name = "Property", namespace = "")
  private String property;
}
