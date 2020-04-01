package com.traveloka.hibernate.retrieveBookingsApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AgentAccount {

    @SerializedName("RoleScope")
    @Expose
    private RoleScope roleScope;

}
