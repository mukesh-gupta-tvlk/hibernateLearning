package com.traveloka.hibernate.retrieveBookingsApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Charge {

    @SerializedName("ChargeType")
    @Expose
    private Integer chargeType;
    @SerializedName("ChargeCode")
    @Expose
    private String chargeCode;
    @SerializedName("TicketCode")
    @Expose
    private String ticketCode;
    @SerializedName("TicketType")
    @Expose
    private Integer ticketType;
    @SerializedName("CurrencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("ChargeDetail")
    @Expose
    private String chargeDetail;
    @SerializedName("Amount")
    @Expose
    private Double amount;

}
