package com.traveloka.hibernate.model.pg.goquo_dp;

import lombok.Data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PromotionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdultPerPaxPromo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChildPerPaxPromo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrencyRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DisabledPerPaxPromo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GovernmentPerPaxPromo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InfantPerPaxPromo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PromotionSettings" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}PromotionSettingsEN" minOccurs="0"/>
 *         &lt;element name="SnrCitizenPerPaxPromo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StudentPerPaxPromo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WomenPerPaxPromo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionInfo", propOrder = {
    "adultPerPaxPromo",
    "childPerPaxPromo",
    "currencyRatio",
    "disabledPerPaxPromo",
    "governmentPerPaxPromo",
    "infantPerPaxPromo",
    "promotionSettings",
    "snrCitizenPerPaxPromo",
    "studentPerPaxPromo",
    "womenPerPaxPromo"
})
public class PromotionInfo {

  @XmlElement(name = "AdultPerPaxPromo")
  protected BigDecimal adultPerPaxPromo;
  @XmlElement(name = "ChildPerPaxPromo")
  protected BigDecimal childPerPaxPromo;
  @XmlElement(name = "CurrencyRatio")
  protected BigDecimal currencyRatio;
  @XmlElement(name = "DisabledPerPaxPromo")
  protected BigDecimal disabledPerPaxPromo;
  @XmlElement(name = "GovernmentPerPaxPromo")
  protected BigDecimal governmentPerPaxPromo;
  @XmlElement(name = "InfantPerPaxPromo")
  protected BigDecimal infantPerPaxPromo;
  @XmlElement(name = "PromotionSettings", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected PromotionSettingsEN promotionSettings;
  @XmlElement(name = "SnrCitizenPerPaxPromo")
  protected BigDecimal snrCitizenPerPaxPromo;
  @XmlElement(name = "StudentPerPaxPromo")
  protected BigDecimal studentPerPaxPromo;
  @XmlElement(name = "WomenPerPaxPromo")
  protected BigDecimal womenPerPaxPromo;

}
