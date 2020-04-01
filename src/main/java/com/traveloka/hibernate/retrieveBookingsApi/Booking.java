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
public class Booking {

    @SerializedName("ReferenceNo")
    @Expose
    private String referenceNo;

    @SerializedName("HoldDateTime")
    @Expose
    private String holdDateTime;

    @SerializedName("BookingDate")
    @Expose
    private String bookingDate;

    @SerializedName("PassengerNames")
    @Expose
    private List<PassengerName> passengerNames = null;

    @SerializedName("Journeys")
    @Expose
    private List<Journey> journeys = null;

    @SerializedName("RecordLocator")
    @Expose
    private String recordLocator;

    @SerializedName("BookingStatus")
    @Expose
    private String bookingStatus;

    @SerializedName("BookingID")
    @Expose
    private Integer bookingID;

}
