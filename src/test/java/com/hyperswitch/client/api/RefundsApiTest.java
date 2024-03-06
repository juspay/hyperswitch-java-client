package com.hyperswitch.client.api;

import com.hyperswitch.client.HsApiClient;
import com.hyperswitch.client.model.RefundListRequest;
import com.hyperswitch.client.model.RefundListResponse;
import com.hyperswitch.client.model.RefundRequest;
import com.hyperswitch.client.model.RefundResponse;
import com.hyperswitch.client.model.RefundUpdateRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RefundsApi
 */
class RefundsApiTest {

    private RefundsApi api;

    @BeforeEach
    public void setup() {
        api = new HsApiClient("api_key", "API_KEY")
                .buildClient(RefundsApi.class);
    }

    
    /**
     * Refunds - Create
     *
     * Refunds - Create  To create a refund against an already processed payment
     */
    @Test
    void createARefundTest() {
        RefundRequest refundRequest = new RefundRequest();
        // RefundResponse response = api.createARefund(refundRequest);
        // String paymentId = "PAYMENT_ID";
        // refundRequest.setPaymentId(paymentId);
        // Long amount = 100L;
        // refundRequest.setAmount(amount);
        // System.out.println(refundRequest.toString());
        // RefundResponse response = api.createARefund(refundRequest);
        // System.out.println(response.toString());
    }

    
    /**
     * Refunds - List
     *
     * Refunds - List  To list the refunds associated with a payment_id or with the merchant, if payment_id is not provided
     */
    @Test
    void listAllRefundsTest() {
        RefundListRequest refundListRequest = null;
        // Refun dListResponse response = api.listAllRefunds(refundListRequest);

        // TODO: test validations
    }

    
    /**
     * Refunds - Retrieve (GET)
     *
     * Refunds - Retrieve (GET)  To retrieve the properties of a Refund. This may be used to get the status of a previously initiated payment or next action for an ongoing payment
     */
    @Test
    void retrieveARefundTest() {
        String refundId = null;
        // RefundResponse response = api.retrieveARefund(refundId);

        // TODO: test validations
    }

    
    /**
     * Refunds - Update
     *
     * Refunds - Update  To update the properties of a Refund object. This may include attaching a reason for the refund or metadata fields
     */
    @Test
    void updateARefundTest() {
        String refundId = null;
        RefundUpdateRequest refundUpdateRequest = null;
        // RefundResponse response = api.updateARefund(refundId, refundUpdateRequest);

        // TODO: test validations
    }

    
}
