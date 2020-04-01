package com.traveloka.hibernate.model.pg.tempuri;

import com.traveloka.hibernate.model.pg.goquo_dp.APIAddonSetSelectedReq;

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
 *         &lt;element name="pRequest" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_AddonSetSelectedReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pRequest"
})
@XmlRootElement(name = "SetSelectedAddon")
public class SetSelectedAddon {

  @XmlElementRef(name = "pRequest", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<APIAddonSetSelectedReq> pRequest;

  /**
   * Gets the value of the pRequest property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link APIAddonSetSelectedReq }{@code >}
   */
  public JAXBElement<APIAddonSetSelectedReq> getPRequest() {
    return pRequest;
  }

  /**
   * Sets the value of the pRequest property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link APIAddonSetSelectedReq }{@code >}
   */
  public void setPRequest(JAXBElement<APIAddonSetSelectedReq> value) {
    this.pRequest = value;
  }

}
