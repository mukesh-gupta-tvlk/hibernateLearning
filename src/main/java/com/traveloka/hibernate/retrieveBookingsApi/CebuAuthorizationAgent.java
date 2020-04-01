package com.traveloka.hibernate.retrieveBookingsApi;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CebuAuthorizationAgent {

    @SerializedName("AgentAccount")
    private AgentAccount agentAccount;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AgentAccount {
        //don't need to create another pojo
        @SerializedName("RoleScope")
        private Map<String, Object> RoleScope;
    }
}
