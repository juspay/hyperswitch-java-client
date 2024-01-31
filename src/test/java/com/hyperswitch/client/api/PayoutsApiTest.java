package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.PayoutActionRequest;
import com.hyperswitch.client.model.PayoutCreateRequest;
import com.hyperswitch.client.model.PayoutCreateResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PayoutsApi
 */
class PayoutsApiTest {

    private PayoutsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(PayoutsApi.class);
    }

    
    /**
     * Payouts - Cancel
     *
     * Payouts - Cancel
     */
    @Test
    void cancelAPayoutTest() {
        String payoutId = null;
        PayoutActionRequest payoutActionRequest = null;
        // PayoutCreateResponse response = api.cancelAPayout(payoutId, payoutActionRequest);

        // TODO: test validations
    }

    
    /**
     * Payouts - Create
     *
     * Payouts - Create
     */
    @Test
    void createAPayoutTest() {
        PayoutCreateRequest payoutCreateRequest = null;
        // PayoutCreateResponse response = api.createAPayout(payoutCreateRequest);

        // TODO: test validations
    }

    
    /**
     * Payouts - Fulfill
     *
     * Payouts - Fulfill
     */
    @Test
    void fulfillAPayoutTest() {
        String payoutId = null;
        PayoutActionRequest payoutActionRequest = null;
        // PayoutCreateResponse response = api.fulfillAPayout(payoutId, payoutActionRequest);

        // TODO: test validations
    }

    
    /**
     * Payouts - Retrieve
     *
     * Payouts - Retrieve
     */
    @Test
    void retrieveAPayoutTest() {
        String payoutId = null;
        // PayoutCreateResponse response = api.retrieveAPayout(payoutId);

        // TODO: test validations
    }

    
    /**
     * Payouts - Update
     *
     * Payouts - Update
     */
    @Test
    void updateAPayoutTest() {
        String payoutId = null;
        PayoutCreateRequest payoutCreateRequest = null;
        // PayoutCreateResponse response = api.updateAPayout(payoutId, payoutCreateRequest);

        // TODO: test validations
    }

    
}
