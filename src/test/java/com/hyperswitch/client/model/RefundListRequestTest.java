/*
 * Hyperswitch - API Documentation
 *  ## Get started  Hyperswitch provides a collection of APIs that enable you to process and manage payments. Our APIs accept and return JSON in the HTTP body, and return standard HTTP response codes.  You can consume the APIs directly using your favorite HTTP/REST library.  We have a testing environment referred to \"sandbox\", which you can setup to test API calls without affecting production data. Currently, our sandbox environment is live while our production environment is under development and will be available soon. You can sign up on our Dashboard to get API keys to access Hyperswitch API.  ### Environment  Use the following base URLs when making requests to the APIs:  | Environment   |  Base URL                          | |---------------|------------------------------------| | Sandbox       | <https://sandbox.hyperswitch.io>   | | Production    | <https://api.hyperswitch.io>       |  ## Authentication  When you sign up on our [dashboard](https://app.hyperswitch.io) and create a merchant account, you are given a secret key (also referred as api-key) and a publishable key. You may authenticate all API requests with Hyperswitch server by providing the appropriate key in the request Authorization header.  | Key             |  Description                                                                                  | |-----------------|-----------------------------------------------------------------------------------------------| | api-key         | Private key. Used to authenticate all API requests from your merchant server                  | | publishable key | Unique identifier for your account. Used to authenticate API requests from your app's client  |  Never share your secret api keys. Keep them guarded and secure. 
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: hyperswitch@juspay.in
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hyperswitch.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.hyperswitch.client.model.Currency;
import com.hyperswitch.client.model.RefundStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

/**
 * Model tests for RefundListRequest
 */
class RefundListRequestTest {
    private final RefundListRequest model = new RefundListRequest();

    /**
     * Model tests for RefundListRequest
     */
    @Test
    void testRefundListRequest() {
        // TODO: test RefundListRequest
    }

    /**
     * Test the property 'startTime'
     */
    @Test
    void startTimeTest() {
        // TODO: test startTime
    }

    /**
     * Test the property 'endTime'
     */
    @Test
    void endTimeTest() {
        // TODO: test endTime
    }

    /**
     * Test the property 'paymentId'
     */
    @Test
    void paymentIdTest() {
        // TODO: test paymentId
    }

    /**
     * Test the property 'refundId'
     */
    @Test
    void refundIdTest() {
        // TODO: test refundId
    }

    /**
     * Test the property 'profileId'
     */
    @Test
    void profileIdTest() {
        // TODO: test profileId
    }

    /**
     * Test the property 'limit'
     */
    @Test
    void limitTest() {
        // TODO: test limit
    }

    /**
     * Test the property 'offset'
     */
    @Test
    void offsetTest() {
        // TODO: test offset
    }

    /**
     * Test the property 'connector'
     */
    @Test
    void connectorTest() {
        // TODO: test connector
    }

    /**
     * Test the property 'currency'
     */
    @Test
    void currencyTest() {
        // TODO: test currency
    }

    /**
     * Test the property 'refundStatus'
     */
    @Test
    void refundStatusTest() {
        // TODO: test refundStatus
    }

}