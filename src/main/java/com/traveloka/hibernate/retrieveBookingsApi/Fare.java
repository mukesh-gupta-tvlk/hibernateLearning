package com.traveloka.hibernate.retrieveBookingsApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Fare {

    @SerializedName("FareApplicationType")
    @Expose
    private String fareApplicationType;
    @SerializedName("ClassOfService")
    @Expose
    private String classOfService;
    @SerializedName("CarrierCode")
    @Expose
    private String carrierCode;
    @SerializedName("FareBasisCode")
    @Expose
    private String fareBasisCode;
    @SerializedName("FareTypeCode")
    @Expose
    private String fareTypeCode;
    @SerializedName("FareTypeName")
    @Expose
    private String fareTypeName;
    @SerializedName("ProductClass")
    @Expose
    private String productClass;
    @SerializedName("FareSellKey")
    @Expose
    private String fareSellKey;
    @SerializedName("BaseSum")
    @Expose
    private Double baseSum;
    @SerializedName("BaseFare")
    @Expose
    private Double baseFare;
    @SerializedName("BaseFee")
    @Expose
    private Double baseFee;
    @SerializedName("BaseTax")
    @Expose
    private Double baseTax;
    @SerializedName("SegmentIdentity")
    @Expose
    private List<String> segmentIdentity = null;
    @SerializedName("FareBundles")
    @Expose
    private Object fareBundles;
    @SerializedName("PaxFares")
    @Expose
    private List<PaxFare> paxFares = null;
    @SerializedName("AvailableCount")
    @Expose
    private Integer availableCount;
    @SerializedName("IsAlmostSoldOut")
    @Expose
    private Boolean isAlmostSoldOut;
}
