package com.traveloka.hibernate.retrieveBookingsApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.swing.text.Segment;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Journey<SelectedAddon> {
    @SerializedName("JourneyFareSum")
    @Expose
    private Double journeyFareSum;
    @SerializedName("CurrencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("FlightLength")
    @Expose
    private String flightLength;
    @SerializedName("FlightType")
    @Expose
    private String flightType;
    @SerializedName("JourneySellKey")
    @Expose
    private String journeySellKey;
    @SerializedName("ArrivalStation")
    @Expose
    private ArrivalStation arrivalStation;
    @SerializedName("DepartureStation")
    @Expose
    private DepartureStation departureStation;
    @SerializedName("Fares")
    @Expose
    private List<Fare> fares = null;
    @SerializedName("Segments")
    @Expose
    private List<Segment> segments = null;
    @SerializedName("SelectedAddons")
    @Expose
    private List<SelectedAddon> selectedAddons = null;
    @SerializedName("IsReroutable")
    @Expose
    private Boolean isReroutable;
    @SerializedName("IsRebookable")
    @Expose
    private Boolean isRebookable;
    @SerializedName("IsCancellable")
    @Expose
    private Boolean isCancellable;
    @SerializedName("IsDisrupted")
    @Expose
    private Boolean isDisrupted;
    @SerializedName("IsCebTransferAllowed")
    @Expose
    private Boolean isCebTransferAllowed;
    @SerializedName("IsSportsEquipmentAllowed")
    @Expose
    private Boolean isSportsEquipmentAllowed;
    @SerializedName("IsWifiKitAllowed")
    @Expose
    private Boolean isWifiKitAllowed;
    @SerializedName("IsCebFlexiAllowed")
    @Expose
    private Boolean isCebFlexiAllowed;
    @SerializedName("IsFlown")
    @Expose
    private Boolean isFlown;
    @SerializedName("IsNewFareRule")
    @Expose
    private Boolean isNewFareRule;
}
