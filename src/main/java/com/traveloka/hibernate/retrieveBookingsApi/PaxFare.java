package com.traveloka.hibernate.retrieveBookingsApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaxFare {
    @SerializedName("Count")
    @Expose
    private Integer count;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("FareDiscount")
    @Expose
    private Object fareDiscount;
    @SerializedName("FareDiscountCode")
    @Expose
    private String fareDiscountCode;
    @SerializedName("Charges")
    @Expose
    private List<Charge> charges = null;
    @SerializedName("PaxType")
    @Expose
    private String paxType;
    @SerializedName("PaxDiscountCode")
    @Expose
    private String paxDiscountCode;
}
