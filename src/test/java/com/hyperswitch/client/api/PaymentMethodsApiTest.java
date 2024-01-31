package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.Currency;
import com.hyperswitch.client.model.CustomerPaymentMethodsListResponse;
import com.hyperswitch.client.model.PaymentMethodCreate;
import com.hyperswitch.client.model.PaymentMethodDeleteResponse;
import com.hyperswitch.client.model.PaymentMethodListResponse;
import com.hyperswitch.client.model.PaymentMethodResponse;
import com.hyperswitch.client.model.PaymentMethodUpdate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentMethodsApi
 */
class PaymentMethodsApiTest {

    private PaymentMethodsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(PaymentMethodsApi.class);
    }

    
    /**
     * PaymentMethods - Create
     *
     * PaymentMethods - Create  To create a payment method against a customer object. In case of cards, this API could be used only by PCI compliant merchants
     */
    @Test
    void createAPaymentMethodTest() {
        PaymentMethodCreate paymentMethodCreate = null;
        // PaymentMethodResponse response = api.createAPaymentMethod(paymentMethodCreate);

        // TODO: test validations
    }

    
    /**
     * Payment Method - Delete
     *
     * Payment Method - Delete  Delete payment method
     */
    @Test
    void deleteAPaymentMethodTest() {
        String methodId = null;
        // PaymentMethodDeleteResponse response = api.deleteAPaymentMethod(methodId);

        // TODO: test validations
    }

    
    /**
     * List payment methods for a Customer
     *
     * List payment methods for a Customer  To filter and list the applicable payment methods for a particular Customer ID
     */
    @Test
    void listAllPaymentMethodsForACustomerTest() {
        String clientSecret = null;
        List<String> acceptedCountry = null;
        List<Currency> acceptedCurrency = null;
        Long minimumAmount = null;
        Long maximumAmount = null;
        Boolean recurringPaymentEnabled = null;
        Boolean installmentPaymentEnabled = null;
        // CustomerPaymentMethodsListResponse response = api.listAllPaymentMethodsForACustomer(clientSecret, acceptedCountry, acceptedCurrency, minimumAmount, maximumAmount, recurringPaymentEnabled, installmentPaymentEnabled);

        // TODO: test validations
    }

    /**
     * List payment methods for a Customer
     *
     * List payment methods for a Customer  To filter and list the applicable payment methods for a particular Customer ID
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listAllPaymentMethodsForACustomerTestQueryMap() {
        String clientSecret = null;
        List<Currency> acceptedCurrency = null;
        PaymentMethodsApi.ListAllPaymentMethodsForACustomerQueryParams queryParams = new PaymentMethodsApi.ListAllPaymentMethodsForACustomerQueryParams()
            .acceptedCountry(null)
            .minimumAmount(null)
            .maximumAmount(null)
            .recurringPaymentEnabled(null)
            .installmentPaymentEnabled(null);
        // CustomerPaymentMethodsListResponse response = api.listAllPaymentMethodsForACustomer(clientSecret, acceptedCurrency, queryParams);

    // TODO: test validations
    }
    
    /**
     * List payment methods for a Customer
     *
     * List payment methods for a Customer  To filter and list the applicable payment methods for a particular Customer ID
     */
    @Test
    void listAllPaymentMethodsForACustomer_0Test() {
        List<String> acceptedCountry = null;
        List<Currency> acceptedCurrency = null;
        Long minimumAmount = null;
        Long maximumAmount = null;
        Boolean recurringPaymentEnabled = null;
        Boolean installmentPaymentEnabled = null;
        // CustomerPaymentMethodsListResponse response = api.listAllPaymentMethodsForACustomer_0(acceptedCountry, acceptedCurrency, minimumAmount, maximumAmount, recurringPaymentEnabled, installmentPaymentEnabled);

        // TODO: test validations
    }

    /**
     * List payment methods for a Customer
     *
     * List payment methods for a Customer  To filter and list the applicable payment methods for a particular Customer ID
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listAllPaymentMethodsForACustomer_0TestQueryMap() {
        List<Currency> acceptedCurrency = null;
        PaymentMethodsApi.ListAllPaymentMethodsForACustomer0QueryParams queryParams = new PaymentMethodsApi.ListAllPaymentMethodsForACustomer0QueryParams()
            .acceptedCountry(null)
            .minimumAmount(null)
            .maximumAmount(null)
            .recurringPaymentEnabled(null)
            .installmentPaymentEnabled(null);
        // CustomerPaymentMethodsListResponse response = api.listAllPaymentMethodsForACustomer_0(acceptedCurrency, queryParams);

    // TODO: test validations
    }
    
    /**
     * List payment methods for a Merchant
     *
     * List payment methods for a Merchant  To filter and list the applicable payment methods for a particular Merchant ID
     */
    @Test
    void listAllPaymentMethodsForAMerchantTest() {
        String accountId = null;
        List<String> acceptedCountry = null;
        List<Currency> acceptedCurrency = null;
        Long minimumAmount = null;
        Long maximumAmount = null;
        Boolean recurringPaymentEnabled = null;
        Boolean installmentPaymentEnabled = null;
        // PaymentMethodListResponse response = api.listAllPaymentMethodsForAMerchant(accountId, acceptedCountry, acceptedCurrency, minimumAmount, maximumAmount, recurringPaymentEnabled, installmentPaymentEnabled);

        // TODO: test validations
    }

    /**
     * List payment methods for a Merchant
     *
     * List payment methods for a Merchant  To filter and list the applicable payment methods for a particular Merchant ID
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listAllPaymentMethodsForAMerchantTestQueryMap() {
        String accountId = null;
        List<Currency> acceptedCurrency = null;
        PaymentMethodsApi.ListAllPaymentMethodsForAMerchantQueryParams queryParams = new PaymentMethodsApi.ListAllPaymentMethodsForAMerchantQueryParams()
            .acceptedCountry(null)
            .minimumAmount(null)
            .maximumAmount(null)
            .recurringPaymentEnabled(null)
            .installmentPaymentEnabled(null);
        // PaymentMethodListResponse response = api.listAllPaymentMethodsForAMerchant(accountId, acceptedCurrency, queryParams);

    // TODO: test validations
    }
    
    /**
     * Payment Method - Retrieve
     *
     * Payment Method - Retrieve  To retrieve a payment method
     */
    @Test
    void retrieveAPaymentMethodTest() {
        String methodId = null;
        // PaymentMethodResponse response = api.retrieveAPaymentMethod(methodId);

        // TODO: test validations
    }

    
    /**
     * Payment Method - Update
     *
     * Payment Method - Update  To update an existing payment method attached to a customer object. This API is useful for use cases such as updating the card number for expired cards to prevent discontinuity in recurring payments
     */
    @Test
    void updateAPaymentMethodTest() {
        String methodId = null;
        PaymentMethodUpdate paymentMethodUpdate = null;
        // PaymentMethodResponse response = api.updateAPaymentMethod(methodId, paymentMethodUpdate);

        // TODO: test validations
    }

    
}
