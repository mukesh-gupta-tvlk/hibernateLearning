package com.traveloka.hibernate.model.pg.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBaggages complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfBaggages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Baggages" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}Baggages" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBaggages", propOrder = {
    "baggages"
})
public class ArrayOfBaggages {

  @XmlElement(name = "Baggages", nillable = true)
  protected List<Baggages> baggages;

  /**
   * Gets the value of the baggages property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the baggages property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBaggages().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Baggages }
   */
  public List<Baggages> getBaggages() {
    if (baggages == null) {
      baggages = new ArrayList<Baggages>();
    }
    return this.baggages;
  }

}
