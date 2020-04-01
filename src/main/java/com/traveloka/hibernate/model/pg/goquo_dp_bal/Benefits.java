package com.traveloka.hibernate.model.pg.goquo_dp_bal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Benefits complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Benefits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Benefitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HtmlUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Benefits", propOrder = {
    "benefitid",
    "description",
    "htmlUrl",
    "name"
})
public class Benefits {

  @XmlElement(name = "Benefitid", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String benefitid;
  @XmlElement(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required =
      false)
  protected String description;
  @XmlElement(name = "HtmlUrl", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String htmlUrl;
  @XmlElement(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String name;

  /**
   * Gets the value of the benefitid property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public String getBenefitid() {
    return benefitid;
  }

  /**
   * Sets the value of the benefitid property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setBenefitid(String value) {
    this.benefitid = value;
  }

  /**
   * Gets the value of the description property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDescription(String value) {
    this.description = value;
  }

  /**
   * Gets the value of the htmlUrl property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public String getHtmlUrl() {
    return htmlUrl;
  }

  /**
   * Sets the value of the htmlUrl property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setHtmlUrl(String value) {
    this.htmlUrl = value;
  }

  /**
   * Gets the value of the name property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setName(String value) {
    this.name = value;
  }

}
