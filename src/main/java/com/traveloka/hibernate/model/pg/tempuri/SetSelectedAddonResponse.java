package com.traveloka.hibernate.model.pg.tempuri;

import com.traveloka.hibernate.model.pg.goquo_dp.APIAddonSetSelectedRes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SetSelectedAddonResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_AddonSetSelectedRes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "setSelectedAddonResult"
})
@XmlRootElement(name = "SetSelectedAddonResponse")
public class SetSelectedAddonResponse {

  @XmlElementRef(name = "SetSelectedAddonResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<APIAddonSetSelectedRes> setSelectedAddonResult;

  /**
   * Gets the value of the setSelectedAddonResult property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link APIAddonSetSelectedRes }{@code >}
   */
  public JAXBElement<APIAddonSetSelectedRes> getSetSelectedAddonResult() {
    return setSelectedAddonResult;
  }

  /**
   * Sets the value of the setSelectedAddonResult property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link APIAddonSetSelectedRes }{@code >}
   */
  public void setSetSelectedAddonResult(JAXBElement<APIAddonSetSelectedRes> value) {
    this.setSelectedAddonResult = value;
  }

}
