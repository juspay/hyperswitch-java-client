package com.hyperswitch.client.api;

import com.hyperswitch.client.HsApiClient;
import com.hyperswitch.client.model.CustomerResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomersListApi
 */
class CustomersListApiTest {

    private CustomersListApi api;

    @BeforeEach
    public void setup() {
        api = new HsApiClient().buildClient(CustomersListApi.class);
    }

    
    /**
     * List customers for a merchant
     *
     * List customers for a merchant  To filter and list the customers for a particular merchant id
     */
    @Test
    void listAllCustomersForAMerchantTest() {
        // List<CustomerResponse> response = api.listAllCustomersForAMerchant();

        // TODO: test validations
    }

    
}
