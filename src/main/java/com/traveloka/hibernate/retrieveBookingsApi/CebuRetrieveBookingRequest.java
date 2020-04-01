package com.traveloka.hibernate.retrieveBookingsApi;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CebuRetrieveBookingRequest {

    @SerializedName("RetrieveByParentCriteria")
    private int retrieveByParentCriteria;

    @SerializedName("RetrieveBySubCriteria")
    private int retrieveBySubCriteria;

    @SerializedName("SubCriteriaSearchString")
    private String subCriteriaSearchString;

    @SerializedName("CurrentPageIndex")
    private int currentPageIndex;

}
