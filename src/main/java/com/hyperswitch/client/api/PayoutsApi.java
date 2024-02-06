package com.hyperswitch.client.api;

import com.hyperswitch.client.HsApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.PayoutActionRequest;
import com.hyperswitch.client.model.PayoutCreateRequest;
import com.hyperswitch.client.model.PayoutCreateResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public interface PayoutsApi extends HsApiClient.Api {


  /**
   * Payouts - Cancel
   * Payouts - Cancel
   * @param payoutId The identifier for payout (required)
   * @param payoutActionRequest  (required)
   * @return PayoutCreateResponse
   */
  @RequestLine("POST /payouts/{payoutId}/cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PayoutCreateResponse cancelAPayout(@Param("payoutId") String payoutId, PayoutActionRequest payoutActionRequest);

  /**
   * Payouts - Cancel
   * Similar to <code>cancelAPayout</code> but it also returns the http response headers .
   * Payouts - Cancel
   * @param payoutId The identifier for payout (required)
   * @param payoutActionRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payouts/{payoutId}/cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PayoutCreateResponse> cancelAPayoutWithHttpInfo(@Param("payoutId") String payoutId, PayoutActionRequest payoutActionRequest);



  /**
   * Payouts - Create
   * Payouts - Create
   * @param payoutCreateRequest  (required)
   * @return PayoutCreateResponse
   */
  @RequestLine("POST /payouts/create")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PayoutCreateResponse createAPayout(PayoutCreateRequest payoutCreateRequest);

  /**
   * Payouts - Create
   * Similar to <code>createAPayout</code> but it also returns the http response headers .
   * Payouts - Create
   * @param payoutCreateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payouts/create")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PayoutCreateResponse> createAPayoutWithHttpInfo(PayoutCreateRequest payoutCreateRequest);



  /**
   * Payouts - Fulfill
   * Payouts - Fulfill
   * @param payoutId The identifier for payout (required)
   * @param payoutActionRequest  (required)
   * @return PayoutCreateResponse
   */
  @RequestLine("POST /payouts/{payoutId}/fulfill")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PayoutCreateResponse fulfillAPayout(@Param("payoutId") String payoutId, PayoutActionRequest payoutActionRequest);

  /**
   * Payouts - Fulfill
   * Similar to <code>fulfillAPayout</code> but it also returns the http response headers .
   * Payouts - Fulfill
   * @param payoutId The identifier for payout (required)
   * @param payoutActionRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payouts/{payoutId}/fulfill")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PayoutCreateResponse> fulfillAPayoutWithHttpInfo(@Param("payoutId") String payoutId, PayoutActionRequest payoutActionRequest);



  /**
   * Payouts - Retrieve
   * Payouts - Retrieve
   * @param payoutId The identifier for payout] (required)
   * @return PayoutCreateResponse
   */
  @RequestLine("GET /payouts/{payoutId}")
  @Headers({
    "Accept: application/json",
  })
  PayoutCreateResponse retrieveAPayout(@Param("payoutId") String payoutId);

  /**
   * Payouts - Retrieve
   * Similar to <code>retrieveAPayout</code> but it also returns the http response headers .
   * Payouts - Retrieve
   * @param payoutId The identifier for payout] (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /payouts/{payoutId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PayoutCreateResponse> retrieveAPayoutWithHttpInfo(@Param("payoutId") String payoutId);



  /**
   * Payouts - Update
   * Payouts - Update
   * @param payoutId The identifier for payout] (required)
   * @param payoutCreateRequest  (required)
   * @return PayoutCreateResponse
   */
  @RequestLine("POST /payouts/{payoutId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PayoutCreateResponse updateAPayout(@Param("payoutId") String payoutId, PayoutCreateRequest payoutCreateRequest);

  /**
   * Payouts - Update
   * Similar to <code>updateAPayout</code> but it also returns the http response headers .
   * Payouts - Update
   * @param payoutId The identifier for payout] (required)
   * @param payoutCreateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payouts/{payoutId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PayoutCreateResponse> updateAPayoutWithHttpInfo(@Param("payoutId") String payoutId, PayoutCreateRequest payoutCreateRequest);


}
