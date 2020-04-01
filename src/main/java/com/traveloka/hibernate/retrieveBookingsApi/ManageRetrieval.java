package com.traveloka.hibernate.retrieveBookingsApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ManageRetrieval {
    @SerializedName("RecordsCount")
    @Expose
    private Integer recordsCount;
    @SerializedName("Bookings")
    @Expose
    private List<Booking> bookings = null;
}
