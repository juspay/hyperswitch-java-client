package com.hyperswitch.client.api;

import com.hyperswitch.client.HsApiClient;
import com.hyperswitch.client.api.CustomersApi;
import com.hyperswitch.client.model.CustomerDeleteResponse;
import com.hyperswitch.client.model.CustomerRequest;
import com.hyperswitch.client.model.CustomerResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;

/**
 * API tests for CustomersApi
 */
class CustomersApiTest {

    private CustomersApi api;

    @BeforeEach
    public void setup() {
        api = new HsApiClient("api_key","").buildClient(CustomersApi.class);
    }

    
    /**
     * Create Customer
     *
     * Create Customer  Create a customer object and store the customer details to be reused for future payments. Incase the customer already exists in the system, this API will respond with the customer details.
     */
    @Test
    void createACustomerTest() throws Exception{
        // CustomerRequest customerRequest = new CustomerRequest();
        // System.out.println(customerRequest.toString());
        // Random random = new Random();
        // customerRequest.setCustomerId("customer_id_" + random.nextInt(1000));
        // CustomerResponse response = api.createACustomer(customerRequest);
        // System.out.println(response.toString());
        // assertNotNull(response);
    }

    
    /**
     * Delete Customer
     *
     * Delete Customer  Delete a customer record.
     */
    @Test
    void deleteACustomerTest() {
        String customerId = null;
        // CustomerDeleteResponse response = api.deleteACustomer(customerId);

        // TODO: test validations
    }

    
    /**
     * Retrieve Customer
     *
     * Retrieve Customer  Retrieve a customer&#39;s details.
     */
    @Test
    void retrieveACustomerTest() {
        String customerId = null;
        // CustomerResponse response = api.retrieveACustomer(customerId);

        // TODO: test validations
    }

    
    /**
     * Update Customer
     *
     * Update Customer  Updates the customer&#39;s details in a customer object.
     */
    @Test
    void updateACustomerTest() {
        String customerId = null;
        CustomerRequest customerRequest = null;
        // CustomerResponse response = api.updateACustomer(customerId, customerRequest);

        // TODO: test validations
    }

    
}
