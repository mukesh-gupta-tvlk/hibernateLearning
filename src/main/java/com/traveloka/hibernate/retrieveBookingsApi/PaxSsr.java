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
public class PaxSsr {
    @SerializedName("SSRCode")
    @Expose
    private String sSRCode;
    @SerializedName("SSRDetail")
    @Expose
    private String sSRDetail;
    @SerializedName("SSRFeeCode")
    @Expose
    private String sSRFeeCode;
    @SerializedName("SSRNumber")
    @Expose
    private Integer sSRNumber;
    @SerializedName("PassengerNumber")
    @Expose
    private Integer passengerNumber;
    @SerializedName("DepartureStation")
    @Expose
    private String departureStation;
    @SerializedName("ArrivalStation")
    @Expose
    private String arrivalStation;
    @SerializedName("Note")
    @Expose
    private String note;
    @SerializedName("STD")
    @Expose
    private String sTD;
}
