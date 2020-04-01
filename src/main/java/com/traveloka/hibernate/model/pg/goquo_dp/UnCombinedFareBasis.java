package com.traveloka.hibernate.model.pg.goquo_dp;

import com.traveloka.hibernate.model.pg.serialization.arrays.ArrayOfstring;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnCombinedFareBasis complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UnCombinedFareBasis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CombinationalFareGroups" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="CombineFareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimeFareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnCombinedFareBasis", propOrder = {
    "combinationalFareGroups",
    "combineFareBasisCode",
    "fareBasisCode",
    "primeFareBasisCode"
})
public class UnCombinedFareBasis {

  @XmlElementRef(name = "CombinationalFareGroups", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfstring> combinationalFareGroups;
  @XmlElementRef(name = "CombineFareBasisCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> combineFareBasisCode;
  @XmlElementRef(name = "FareBasisCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> fareBasisCode;
  @XmlElementRef(name = "PrimeFareBasisCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> primeFareBasisCode;

  /**
   * Gets the value of the combinationalFareGroups property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
   */
  public JAXBElement<ArrayOfstring> getCombinationalFareGroups() {
    return combinationalFareGroups;
  }

  /**
   * Sets the value of the combinationalFareGroups property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
   */
  public void setCombinationalFareGroups(JAXBElement<ArrayOfstring> value) {
    this.combinationalFareGroups = value;
  }

  /**
   * Gets the value of the combineFareBasisCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getCombineFareBasisCode() {
    return combineFareBasisCode;
  }

  /**
   * Sets the value of the combineFareBasisCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setCombineFareBasisCode(JAXBElement<String> value) {
    this.combineFareBasisCode = value;
  }

  /**
   * Gets the value of the fareBasisCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getFareBasisCode() {
    return fareBasisCode;
  }

  /**
   * Sets the value of the fareBasisCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setFareBasisCode(JAXBElement<String> value) {
    this.fareBasisCode = value;
  }

  /**
   * Gets the value of the primeFareBasisCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPrimeFareBasisCode() {
    return primeFareBasisCode;
  }

  /**
   * Sets the value of the primeFareBasisCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPrimeFareBasisCode(JAXBElement<String> value) {
    this.primeFareBasisCode = value;
  }

}
