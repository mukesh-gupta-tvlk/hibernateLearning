package com.traveloka.hibernate.retrieveBookingsApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CebuPacificRetrieveSegment {
    @SerializedName("Duration")
    @Expose
    private String duration;

    @SerializedName("SegmentSellKey")
    @Expose
    private String segmentSellKey;

    @SerializedName("ArrivalStation")
    @Expose
    private ArrivalStation arrivalStation;

    @SerializedName("DepartureStation")
    @Expose
    private DepartureStation departureStation;

    @SerializedName("FlightDesignator")
    @Expose
    private FlightDesignator flightDesignator;

    @SerializedName("IsInternational")
    @Expose
    private Boolean isInternational;

    @SerializedName("STA")
    @Expose
    private String sTA;

    @SerializedName("STD")
    @Expose
    private String sTD;

    @SerializedName("UTCA")
    @Expose
    private String uTCA;

    @SerializedName("UTCD")
    @Expose
    private String uTCD;

    @SerializedName("Fares")
    @Expose
    private List<Fare> fares = null;

    @SerializedName("PaxSsrs")
    @Expose
    private List<PaxSsr> paxSsrs = null;

    @SerializedName("PaxBags")
    @Expose
    private List<Object> paxBags = null;

    @SerializedName("PaxSeats")
    @Expose
    private List<Object> paxSeats = null;
    @SerializedName("EquipmentType")
    @Expose
    private String equipmentType;

    @SerializedName("EquipmentTypeSuffix")
    @Expose
    private String equipmentTypeSuffix;

    @SerializedName("AircraftType")
    @Expose
    private Object aircraftType;

    @SerializedName("Airline")
    @Expose
    private String airline;
}
