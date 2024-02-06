package com.hyperswitch.client.api;

import com.hyperswitch.client.HsApiClient;
import java.time.OffsetDateTime;

import com.hyperswitch.client.model.Currency;
import com.hyperswitch.client.model.PaymentRetrieveBody;
import com.hyperswitch.client.model.PaymentsCancelRequest;
import com.hyperswitch.client.model.PaymentsCaptureRequest;
import com.hyperswitch.client.model.PaymentsCreateRequest;
import com.hyperswitch.client.model.PaymentsRequest;
import com.hyperswitch.client.model.PaymentsResponse;
import com.hyperswitch.client.model.PaymentsSessionRequest;
import com.hyperswitch.client.model.PaymentsSessionResponse;
import com.hyperswitch.client.model.RetrievePaymentLinkRequest;
import com.hyperswitch.client.model.RetrievePaymentLinkResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Long;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;

/**
 * API tests for PaymentsApi
 */
class PaymentsApiTest {

    private PaymentsApi api;

    @BeforeEach
    public void setup() {
        api = new HsApiClient("api_key","").buildClient(PaymentsApi.class);
    }

    
    /**
     * Payments - Cancel
     *
     * Payments - Cancel  A Payment could can be cancelled when it is in one of these statuses: requires_payment_method, requires_capture, requires_confirmation, requires_customer_action
     */
    @Test
    void cancelPaymentTest() {
        String paymentId = null;
        PaymentsCancelRequest paymentsCancelRequest = null;
        // api.cancelPayment(paymentId, paymentsCancelRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - Capture
     *
     * Payments - Capture  To capture the funds for an uncaptured payment
     */
    @Test
    void captureAPaymentTest() {
        String paymentId = null;
        PaymentsCaptureRequest paymentsCaptureRequest = null;
        // PaymentsResponse response = api.captureAPayment(paymentId, paymentsCaptureRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - Confirm
     *
     * Payments - Confirm  This API is to confirm the payment request and forward payment to the payment processor. This API provides more granular control upon when the API is forwarded to the payment processor. Alternatively you can confirm the payment within the Payments Create API
     */
    @Test
    void confirmAPaymentTest() {
        String paymentId = null;
        PaymentsRequest paymentsRequest = null;
        // PaymentsResponse response = api.confirmAPayment(paymentId, paymentsRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - Create
     *
     * Payments - Create  To process a payment you will have to create a payment, attach a payment method and confirm. Depending on the user journey you wish to achieve, you may opt to all the steps in a single request or in a sequence of API request using following APIs: (i) Payments - Update, (ii) Payments - Confirm, and (iii) Payments - Capture
     */
    @Test
    void createAPaymentTest() throws Exception {
        // PaymentsCreateRequest paymentsCreateRequest = new PaymentsCreateRequest();
        // Long amount = 500L;
        // paymentsCreateRequest.setAmount(amount);
        // paymentsCreateRequest.setCurrency(Currency.USD);
        // System.out.println(paymentsCreateRequest.toString());
        // PaymentsResponse response = api.createAPayment(paymentsCreateRequest);
        // System.out.println(response.toString());
        // assertNotNull(response);
    }

    
    /**
     * Payments - Session token
     *
     * Payments - Session token  To create the session object or to get session token for wallets
     */
    @Test
    void createSessionTokensForAPaymentTest() {
        PaymentsSessionRequest paymentsSessionRequest = null;
        // PaymentsSessionResponse response = api.createSessionTokensForAPayment(paymentsSessionRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - List
     *
     * Payments - List  To list the payments
     */
    @Test
    void listAllPaymentsTest() {
        String customerId = null;
        String startingAfter = null;
        String endingBefore = null;
        Long limit = null;
        OffsetDateTime created = null;
        OffsetDateTime createdLt = null;
        OffsetDateTime createdGt = null;
        OffsetDateTime createdLte = null;
        OffsetDateTime createdGte = null;
        // api.listAllPayments(customerId, startingAfter, endingBefore, limit, created, createdLt, createdGt, createdLte, createdGte);

        // TODO: test validations
    }

    /**
     * Payments - List
     *
     * Payments - List  To list the payments
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listAllPaymentsTestQueryMap() {
        PaymentsApi.ListAllPaymentsQueryParams queryParams = new PaymentsApi.ListAllPaymentsQueryParams()
            .customerId(null)
            .startingAfter(null)
            .endingBefore(null)
            .limit(null)
            .created(null)
            .createdLt(null)
            .createdGt(null)
            .createdLte(null)
            .createdGte(null);
        // api.listAllPayments(queryParams);

    // TODO: test validations
    }
    
    /**
     * Payments - Retrieve
     *
     * Payments - Retrieve  To retrieve the properties of a Payment. This may be used to get the status of a previously initiated payment or next action for an ongoing payment
     */
    @Test
    void retrieveAPaymentTest() {
        String paymentId = null;
        PaymentRetrieveBody paymentRetrieveBody = null;
        // PaymentsResponse response = api.retrieveAPayment(paymentId, paymentRetrieveBody);

        // TODO: test validations
    }

    
    /**
     * Payments Link - Retrieve
     *
     * Payments Link - Retrieve  To retrieve the properties of a Payment Link. This may be used to get the status of a previously initiated payment or next action for an ongoing payment
     */
    @Test
    void retrieveAPaymentLinkTest() {
        String paymentLinkId = null;
        RetrievePaymentLinkRequest retrievePaymentLinkRequest = null;
        // RetrievePaymentLinkResponse response = api.retrieveAPaymentLink(paymentLinkId, retrievePaymentLinkRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - Update
     *
     * Payments - Update  To update the properties of a PaymentIntent object. This may include attaching a payment method, or attaching customer object or metadata fields after the Payment is created
     */
    @Test
    void updateAPaymentTest() {
        String paymentId = null;
        PaymentsRequest paymentsRequest = null;
        // PaymentsResponse response = api.updateAPayment(paymentId, paymentsRequest);

        // TODO: test validations
    }

    
}
