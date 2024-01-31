package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.DisputeResponse;
import com.hyperswitch.client.model.DisputeStage;
import com.hyperswitch.client.model.DisputeStatus;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DisputesApi
 */
class DisputesApiTest {

    private DisputesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(DisputesApi.class);
    }

    
    /**
     * Disputes - List Disputes
     *
     * Disputes - List Disputes
     */
    @Test
    void listDisputesTest() {
        Long limit = null;
        DisputeStatus disputeStatus = null;
        DisputeStage disputeStage = null;
        String reason = null;
        String connector = null;
        OffsetDateTime receivedTime = null;
        OffsetDateTime receivedTimeLt = null;
        OffsetDateTime receivedTimeGt = null;
        OffsetDateTime receivedTimeLte = null;
        OffsetDateTime receivedTimeGte = null;
        // List<DisputeResponse> response = api.listDisputes(limit, disputeStatus, disputeStage, reason, connector, receivedTime, receivedTimeLt, receivedTimeGt, receivedTimeLte, receivedTimeGte);

        // TODO: test validations
    }

    /**
     * Disputes - List Disputes
     *
     * Disputes - List Disputes
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listDisputesTestQueryMap() {
        DisputesApi.ListDisputesQueryParams queryParams = new DisputesApi.ListDisputesQueryParams()
            .limit(null)
            .disputeStatus(null)
            .disputeStage(null)
            .reason(null)
            .connector(null)
            .receivedTime(null)
            .receivedTimeLt(null)
            .receivedTimeGt(null)
            .receivedTimeLte(null)
            .receivedTimeGte(null);
        // List<DisputeResponse> response = api.listDisputes(queryParams);

    // TODO: test validations
    }
    
    /**
     * Disputes - Retrieve Dispute
     *
     * Disputes - Retrieve Dispute
     */
    @Test
    void retrieveADisputeTest() {
        String disputeId = null;
        // DisputeResponse response = api.retrieveADispute(disputeId);

        // TODO: test validations
    }

    
}
