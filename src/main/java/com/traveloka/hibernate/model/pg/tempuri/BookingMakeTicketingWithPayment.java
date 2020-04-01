package com.traveloka.hibernate.model.pg.tempuri;

import com.traveloka.hibernate.model.pg.goquo_dp.CreditCardsEN;
import com.traveloka.hibernate.model.pg.goquo_dp.CustomerUserPaymentMethodsEN;

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
 *         &lt;element name="PNRNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="argEn" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}CreditCardsEN" minOccurs="0"/>
 *         &lt;element name="argEnPM" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}CustomerUserPaymentMethodsEN" minOccurs="0"/>
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
    "pnrNo",
    "argEn",
    "argEnPM"
})
@XmlRootElement(name = "Booking_MakeTicketingWithPayment")
public class BookingMakeTicketingWithPayment {

  @XmlElementRef(name = "UserName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<String> userName;
  @XmlElementRef(name = "Password", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<String> password;
  @XmlElementRef(name = "PNRNo", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<String> pnrNo;
  @XmlElementRef(name = "argEn", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<CreditCardsEN> argEn;
  @XmlElementRef(name = "argEnPM", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
  protected JAXBElement<CustomerUserPaymentMethodsEN> argEnPM;

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
   * Gets the value of the pnrNo property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPNRNo() {
    return pnrNo;
  }

  /**
   * Sets the value of the pnrNo property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPNRNo(JAXBElement<String> value) {
    this.pnrNo = value;
  }

  /**
   * Gets the value of the argEn property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link CreditCardsEN }{@code >}
   */
  public JAXBElement<CreditCardsEN> getArgEn() {
    return argEn;
  }

  /**
   * Sets the value of the argEn property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link CreditCardsEN }{@code >}
   */
  public void setArgEn(JAXBElement<CreditCardsEN> value) {
    this.argEn = value;
  }

  /**
   * Gets the value of the argEnPM property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link CustomerUserPaymentMethodsEN }{@code >}
   */
  public JAXBElement<CustomerUserPaymentMethodsEN> getArgEnPM() {
    return argEnPM;
  }

  /**
   * Sets the value of the argEnPM property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link CustomerUserPaymentMethodsEN }{@code >}
   */
  public void setArgEnPM(JAXBElement<CustomerUserPaymentMethodsEN> value) {
    this.argEnPM = value;
  }

}
