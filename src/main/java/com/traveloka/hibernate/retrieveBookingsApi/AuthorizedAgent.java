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
public class AuthorizedAgent {

    @SerializedName("AgentAccount")
    @Expose
    private AgentAccount agentAccount;
}
