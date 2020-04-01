package com.traveloka.hibernate.model.pg.tempuri;

import com.traveloka.hibernate.model.pg.goquo_dp.MultiFlightSearchReponse;

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
 *         &lt;element name="MultiSearchFlightResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}MultiFlightSearchReponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "multiSearchFlightResult"
})
@XmlRootElement(name = "MultiSearchFlightResponse")
public class MultiSearchFlightResponse {

  @XmlElementRef(name = "MultiSearchFlightResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<MultiFlightSearchReponse> multiSearchFlightResult;

  /**
   * Gets the value of the multiSearchFlightResult property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link MultiFlightSearchReponse }{@code >}
   */
  public JAXBElement<MultiFlightSearchReponse> getMultiSearchFlightResult() {
    return multiSearchFlightResult;
  }

  /**
   * Sets the value of the multiSearchFlightResult property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link MultiFlightSearchReponse }{@code >}
   */
  public void setMultiSearchFlightResult(JAXBElement<MultiFlightSearchReponse> value) {
    this.multiSearchFlightResult = value;
  }

}
