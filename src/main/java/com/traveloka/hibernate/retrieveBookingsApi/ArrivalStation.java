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
public class ArrivalStation {

    @SerializedName("StationCode")
    @Expose
    private String stationCode;
    @SerializedName("StationName")
    @Expose
    private String stationName;
    @SerializedName("AirportName")
    @Expose
    private String airportName;
    @SerializedName("CountryCode")
    @Expose
    private String countryCode;
    @SerializedName("CountryName")
    @Expose
    private String countryName;

}
