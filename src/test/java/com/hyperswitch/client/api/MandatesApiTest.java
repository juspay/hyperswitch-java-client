package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.MandateResponse;
import com.hyperswitch.client.model.MandateRevokedResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MandatesApi
 */
class MandatesApiTest {

    private MandatesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(MandatesApi.class);
    }

    
    /**
     * Mandates - Retrieve Mandate
     *
     * Mandates - Retrieve Mandate  Retrieve a mandate
     */
    @Test
    void retrieveAMandateTest() {
        String mandateId = null;
        // MandateResponse response = api.retrieveAMandate(mandateId);

        // TODO: test validations
    }

    
    /**
     * Mandates - Revoke Mandate
     *
     * Mandates - Revoke Mandate  Revoke a mandate
     */
    @Test
    void revokeAMandateTest() {
        String mandateId = null;
        // MandateRevokedResponse response = api.revokeAMandate(mandateId);

        // TODO: test validations
    }

    
}
