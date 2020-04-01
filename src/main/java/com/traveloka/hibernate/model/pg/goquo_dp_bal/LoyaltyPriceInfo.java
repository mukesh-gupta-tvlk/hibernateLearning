package com.traveloka.hibernate.model.pg.goquo_dp_bal;

import lombok.Data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyPriceInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="LoyaltyPriceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalAwardFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalBookingFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalCashTobePaid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalLoyaltyPoints" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalYQ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lstPaxSectorPriceInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Loyalty}ArrayOfLoyaltyPaxSectorPriceInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyPriceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Loyalty", propOrder = {
    "totalAwardFee",
    "totalBookingFee",
    "totalCashTobePaid",
    "totalLoyaltyPoints",
    "totalYQ",
    "lstPaxSectorPriceInfo"
})
public class LoyaltyPriceInfo {

  @XmlElement(name = "TotalAwardFee")
  protected BigDecimal totalAwardFee;
  @XmlElement(name = "TotalBookingFee")
  protected BigDecimal totalBookingFee;
  @XmlElement(name = "TotalCashTobePaid")
  protected BigDecimal totalCashTobePaid;
  @XmlElement(name = "TotalLoyaltyPoints")
  protected BigDecimal totalLoyaltyPoints;
  @XmlElement(name = "TotalYQ")
  protected BigDecimal totalYQ;
  @XmlElement(name = "lstPaxSectorPriceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Loyalty", required = false)
  protected ArrayOfLoyaltyPaxSectorPriceInfo lstPaxSectorPriceInfo;
}
