package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.GsmCreateRequest;
import com.hyperswitch.client.model.GsmDeleteRequest;
import com.hyperswitch.client.model.GsmDeleteResponse;
import com.hyperswitch.client.model.GsmResponse;
import com.hyperswitch.client.model.GsmRetrieveRequest;
import com.hyperswitch.client.model.GsmUpdateRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GsmApi
 */
class GsmApiTest {

    private GsmApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(GsmApi.class);
    }

    
    /**
     * Gsm - Create
     *
     * Gsm - Create  To create a Gsm Rule
     */
    @Test
    void createGsmRuleTest() {
        GsmCreateRequest gsmCreateRequest = null;
        // GsmResponse response = api.createGsmRule(gsmCreateRequest);

        // TODO: test validations
    }

    
    /**
     * Gsm - Delete
     *
     * Gsm - Delete  To delete a Gsm Rule
     */
    @Test
    void deleteGsmRuleTest() {
        GsmDeleteRequest gsmDeleteRequest = null;
        // GsmDeleteResponse response = api.deleteGsmRule(gsmDeleteRequest);

        // TODO: test validations
    }

    
    /**
     * Gsm - Get
     *
     * Gsm - Get  To get a Gsm Rule
     */
    @Test
    void retrieveGsmRuleTest() {
        GsmRetrieveRequest gsmRetrieveRequest = null;
        // GsmResponse response = api.retrieveGsmRule(gsmRetrieveRequest);

        // TODO: test validations
    }

    
    /**
     * Gsm - Update
     *
     * Gsm - Update  To update a Gsm Rule
     */
    @Test
    void updateGsmRuleTest() {
        GsmUpdateRequest gsmUpdateRequest = null;
        // GsmResponse response = api.updateGsmRule(gsmUpdateRequest);

        // TODO: test validations
    }

    
}
