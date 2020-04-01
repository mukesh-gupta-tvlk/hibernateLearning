package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StrikeoutInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="StrikeoutInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceStrikeoutSetting" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}PriceStrikeoutSettingsEN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrikeoutInfo", propOrder = {
    "currencyRatio",
    "priceStrikeoutSetting"
})
public class StrikeoutInfo {

  @XmlElement(name = "CurrencyRatio")
  protected BigDecimal currencyRatio;
  @XmlElement(name = "PriceStrikeoutSetting", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected PriceStrikeoutSettingsEN priceStrikeoutSetting;

  /**
   * Gets the value of the currencyRatio property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getCurrencyRatio() {
    return currencyRatio;
  }

  /**
   * Sets the value of the currencyRatio property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setCurrencyRatio(BigDecimal value) {
    this.currencyRatio = value;
  }

  /**
   * Gets the value of the priceStrikeoutSetting property.
   *
   * @return possible object is
   * {@link PriceStrikeoutSettingsEN }{@code <}{@link PriceStrikeoutSettingsEN }{@code >}
   */
  public PriceStrikeoutSettingsEN getPriceStrikeoutSetting() {
    return priceStrikeoutSetting;
  }

  /**
   * Sets the value of the priceStrikeoutSetting property.
   *
   * @param value allowed object is
   *              {@link PriceStrikeoutSettingsEN }{@code <}{@link PriceStrikeoutSettingsEN }{@code >}
   */
  public void setPriceStrikeoutSetting(PriceStrikeoutSettingsEN value) {
    this.priceStrikeoutSetting = value;
  }

}
