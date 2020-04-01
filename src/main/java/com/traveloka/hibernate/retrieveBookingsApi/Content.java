package com.traveloka.hibernate.retrieveBookingsApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Content {

//    @SerializedName("IsBookingSessionExpiredOrEmpty")
////    @Expose(serialize = false, deserialize = false)
//    private transient Boolean isBookingSessionExpiredOrEmpty;

    @SerializedName("AUTH_TOKEN")
//    @Expose(serialize = false, deserialize = false)
    private String authToken;

    @SerializedName("AuthorizedAgent")
//    @Expose(serialize = false, deserialize = false)
    private transient Map<String, Object> authorizedAgent;

    @SerializedName("ManageRetrieval")
    @Expose
    private ManageRetrieval manageRetrieval;

}
