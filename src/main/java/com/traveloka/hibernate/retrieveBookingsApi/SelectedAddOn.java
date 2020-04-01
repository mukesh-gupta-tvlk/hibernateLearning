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
public class SelectedAddOn {
    @SerializedName("SsrCode")
    @Expose
    private String ssrCode;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("FeeCode")
    @Expose
    private String feeCode;
    @SerializedName("SsrNumber")
    @Expose
    private Integer ssrNumber;
    @SerializedName("Amount")
    @Expose
    private Double amount;
    @SerializedName("SSRNote")
    @Expose
    private Object sSRNote;
    @SerializedName("SSRType")
    @Expose
    private Integer sSRType;
    @SerializedName("ServiceType")
    @Expose
    private Integer serviceType;
}
