package com.traveloka.hibernate.retrieveBookingsApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FlightDesignator {

    @SerializedName("CarrierCode")
    @Expose
    private String carrierCode;
    @SerializedName("FlightNumber")
    @Expose
    private String flightNumber;
    @SerializedName("OpSuffix")
    @Expose
    private String opSuffix;

}
