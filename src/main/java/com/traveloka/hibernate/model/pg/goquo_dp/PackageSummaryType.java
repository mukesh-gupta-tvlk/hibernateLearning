
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageSummaryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PackageSummaryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="BaseFare"/>
 *     &lt;enumeration value="Tax"/>
 *     &lt;enumeration value="Insurance"/>
 *     &lt;enumeration value="InsuranceGST"/>
 *     &lt;enumeration value="PaymentDiscount"/>
 *     &lt;enumeration value="PaymentCharges"/>
 *     &lt;enumeration value="Seat"/>
 *     &lt;enumeration value="Meal"/>
 *     &lt;enumeration value="Baggage"/>
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="GST"/>
 *     &lt;enumeration value="Miles"/>
 *     &lt;enumeration value="Misc"/>
 *     &lt;enumeration value="VisaCharge"/>
 *     &lt;enumeration value="Promo"/>
 *     &lt;enumeration value="Loyalty"/>
 *     &lt;enumeration value="AdminFee"/>
 *     &lt;enumeration value="InsuranceTotal"/>
 *     &lt;enumeration value="Total"/>
 *     &lt;enumeration value="CashPlusMiles"/>
 *     &lt;enumeration value="Voucher"/>
 *     &lt;enumeration value="CardPromo"/>
 *     &lt;enumeration value="Taxi"/>
 *     &lt;enumeration value="Limo"/>
 *     &lt;enumeration value="Lounge"/>
 *     &lt;enumeration value="LionFast"/>
 *     &lt;enumeration value="PaymentMethodDiscount"/>
 *     &lt;enumeration value="InstantVoucher"/>
 *     &lt;enumeration value="Promotion"/>
 *     &lt;enumeration value="LoyaltyAwardFee"/>
 *     &lt;enumeration value="LoyaltyBookingFee"/>
 *     &lt;enumeration value="LoyaltyCash"/>
 *     &lt;enumeration value="PaymentCurrencyTotal"/>
 *     &lt;enumeration value="ExpCheckin"/>
 *     &lt;enumeration value="FareGuarantee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PackageSummaryType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils")
@XmlEnum
public enum PackageSummaryType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("BaseFare")
    BASE_FARE("BaseFare"),
    @XmlEnumValue("Tax")
    TAX("Tax"),
    @XmlEnumValue("Insurance")
    INSURANCE("Insurance"),
    @XmlEnumValue("InsuranceGST")
    INSURANCE_GST("InsuranceGST"),
    @XmlEnumValue("PaymentDiscount")
    PAYMENT_DISCOUNT("PaymentDiscount"),
    @XmlEnumValue("PaymentCharges")
    PAYMENT_CHARGES("PaymentCharges"),
    @XmlEnumValue("Seat")
    SEAT("Seat"),
    @XmlEnumValue("Meal")
    MEAL("Meal"),
    @XmlEnumValue("Baggage")
    BAGGAGE("Baggage"),
    SMS("SMS"),
    GST("GST"),
    @XmlEnumValue("Miles")
    MILES("Miles"),
    @XmlEnumValue("Misc")
    MISC("Misc"),
    @XmlEnumValue("VisaCharge")
    VISA_CHARGE("VisaCharge"),
    @XmlEnumValue("Promo")
    PROMO("Promo"),
    @XmlEnumValue("Loyalty")
    LOYALTY("Loyalty"),
    @XmlEnumValue("AdminFee")
    ADMIN_FEE("AdminFee"),
    @XmlEnumValue("InsuranceTotal")
    INSURANCE_TOTAL("InsuranceTotal"),
    @XmlEnumValue("Total")
    TOTAL("Total"),
    @XmlEnumValue("CashPlusMiles")
    CASH_PLUS_MILES("CashPlusMiles"),
    @XmlEnumValue("Voucher")
    VOUCHER("Voucher"),
    @XmlEnumValue("CardPromo")
    CARD_PROMO("CardPromo"),
    @XmlEnumValue("Taxi")
    TAXI("Taxi"),
    @XmlEnumValue("Limo")
    LIMO("Limo"),
    @XmlEnumValue("Lounge")
    LOUNGE("Lounge"),
    @XmlEnumValue("LionFast")
    LION_FAST("LionFast"),
    @XmlEnumValue("PaymentMethodDiscount")
    PAYMENT_METHOD_DISCOUNT("PaymentMethodDiscount"),
    @XmlEnumValue("InstantVoucher")
    INSTANT_VOUCHER("InstantVoucher"),
    @XmlEnumValue("Promotion")
    PROMOTION("Promotion"),
    @XmlEnumValue("LoyaltyAwardFee")
    LOYALTY_AWARD_FEE("LoyaltyAwardFee"),
    @XmlEnumValue("LoyaltyBookingFee")
    LOYALTY_BOOKING_FEE("LoyaltyBookingFee"),
    @XmlEnumValue("LoyaltyCash")
    LOYALTY_CASH("LoyaltyCash"),
    @XmlEnumValue("PaymentCurrencyTotal")
    PAYMENT_CURRENCY_TOTAL("PaymentCurrencyTotal"),
    @XmlEnumValue("ExpCheckin")
    EXP_CHECKIN("ExpCheckin"),
    @XmlEnumValue("FareGuarantee")
    FARE_GUARANTEE("FareGuarantee");
    private final String value;

    PackageSummaryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PackageSummaryType fromValue(String v) {
        for (PackageSummaryType c: PackageSummaryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
