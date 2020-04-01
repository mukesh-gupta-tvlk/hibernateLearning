package com.traveloka.hibernate.model.pg.tempuri;

import com.traveloka.hibernate.model.pg.goquo_dp.APIMultiCitySearchCriteria;

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
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchCriteria" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_MultiCitySearchCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userName",
    "password",
    "ipAddress",
    "searchCriteria"
})
@XmlRootElement(name = "MultiSearchFlight")
public class MultiSearchFlight {

  @XmlElementRef(name = "UserName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<String> userName;
  @XmlElementRef(name = "Password", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<String> password;
  @XmlElementRef(name = "IPAddress", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<String> ipAddress;
  @XmlElementRef(name = "searchCriteria", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<APIMultiCitySearchCriteria> searchCriteria;

  /**
   * Gets the value of the userName property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getUserName() {
    return userName;
  }

  /**
   * Sets the value of the userName property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setUserName(JAXBElement<String> value) {
    this.userName = value;
  }

  /**
   * Gets the value of the password property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPassword() {
    return password;
  }

  /**
   * Sets the value of the password property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPassword(JAXBElement<String> value) {
    this.password = value;
  }

  /**
   * Gets the value of the ipAddress property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getIPAddress() {
    return ipAddress;
  }

  /**
   * Sets the value of the ipAddress property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setIPAddress(JAXBElement<String> value) {
    this.ipAddress = value;
  }

  /**
   * Gets the value of the searchCriteria property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link APIMultiCitySearchCriteria }{@code >}
   */
  public JAXBElement<APIMultiCitySearchCriteria> getSearchCriteria() {
    return searchCriteria;
  }

  /**
   * Sets the value of the searchCriteria property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link APIMultiCitySearchCriteria }{@code >}
   */
  public void setSearchCriteria(JAXBElement<APIMultiCitySearchCriteria> value) {
    this.searchCriteria = value;
  }

}
