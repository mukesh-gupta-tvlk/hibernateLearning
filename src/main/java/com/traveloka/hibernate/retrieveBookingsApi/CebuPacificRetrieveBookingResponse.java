package com.traveloka.hibernate.retrieveBookingsApi;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CebuPacificRetrieveBookingResponse {
    @SerializedName("StatusCodeCe")
    private int statusCode;
    @SerializedName("Content")
    private String content;
}
