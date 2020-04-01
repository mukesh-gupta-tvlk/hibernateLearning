package com.traveloka.hibernate.model.pg.goquo_dp;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightSegment complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FlightSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefaultSelected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Segments" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfGDS_FlightSegment" minOccurs="0"/>
 *         &lt;element name="Selected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TotalDurInMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegment", propOrder = {
    "defaultSelected",
    "index",
    "isSelected",
    "segments",
    "selected",
    "totalDurInMin",
    "totalDuration"
})
public class FlightSegment {

  @XmlElement(name = "DefaultSelected", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String defaultSelected;
  @XmlElement(name = "Index", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String index;
  @XmlElement(name = "IsSelected")
  protected Boolean isSelected;
  @XmlElement(name = "Segments", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfGDSFlightSegment segments;
  @XmlElement(name = "Selected")
  protected Boolean selected;
  @XmlElement(name = "TotalDurInMin")
  protected Integer totalDurInMin;
  @XmlElement(name = "TotalDuration", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String totalDuration;

}
