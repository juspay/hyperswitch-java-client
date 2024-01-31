package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.RefundListRequest;
import com.hyperswitch.client.model.RefundListResponse;
import com.hyperswitch.client.model.RefundRequest;
import com.hyperswitch.client.model.RefundResponse;
import com.hyperswitch.client.model.RefundUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public interface RefundsApi extends ApiClient.Api {


  /**
   * Refunds - Create
   * Refunds - Create  To create a refund against an already processed payment
   * @param refundRequest  (required)
   * @return RefundResponse
   */
  @RequestLine("POST /refunds")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RefundResponse createARefund(RefundRequest refundRequest);

  /**
   * Refunds - Create
   * Similar to <code>createARefund</code> but it also returns the http response headers .
   * Refunds - Create  To create a refund against an already processed payment
   * @param refundRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /refunds")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RefundResponse> createARefundWithHttpInfo(RefundRequest refundRequest);



  /**
   * Refunds - List
   * Refunds - List  To list the refunds associated with a payment_id or with the merchant, if payment_id is not provided
   * @param refundListRequest  (required)
   * @return RefundListResponse
   */
  @RequestLine("POST /refunds/list")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RefundListResponse listAllRefunds(RefundListRequest refundListRequest);

  /**
   * Refunds - List
   * Similar to <code>listAllRefunds</code> but it also returns the http response headers .
   * Refunds - List  To list the refunds associated with a payment_id or with the merchant, if payment_id is not provided
   * @param refundListRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /refunds/list")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RefundListResponse> listAllRefundsWithHttpInfo(RefundListRequest refundListRequest);



  /**
   * Refunds - Retrieve (GET)
   * Refunds - Retrieve (GET)  To retrieve the properties of a Refund. This may be used to get the status of a previously initiated payment or next action for an ongoing payment
   * @param refundId The identifier for refund (required)
   * @return RefundResponse
   */
  @RequestLine("GET /refunds/{refundId}")
  @Headers({
    "Accept: application/json",
  })
  RefundResponse retrieveARefund(@Param("refundId") String refundId);

  /**
   * Refunds - Retrieve (GET)
   * Similar to <code>retrieveARefund</code> but it also returns the http response headers .
   * Refunds - Retrieve (GET)  To retrieve the properties of a Refund. This may be used to get the status of a previously initiated payment or next action for an ongoing payment
   * @param refundId The identifier for refund (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /refunds/{refundId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<RefundResponse> retrieveARefundWithHttpInfo(@Param("refundId") String refundId);



  /**
   * Refunds - Update
   * Refunds - Update  To update the properties of a Refund object. This may include attaching a reason for the refund or metadata fields
   * @param refundId The identifier for refund (required)
   * @param refundUpdateRequest  (required)
   * @return RefundResponse
   */
  @RequestLine("POST /refunds/{refundId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RefundResponse updateARefund(@Param("refundId") String refundId, RefundUpdateRequest refundUpdateRequest);

  /**
   * Refunds - Update
   * Similar to <code>updateARefund</code> but it also returns the http response headers .
   * Refunds - Update  To update the properties of a Refund object. This may include attaching a reason for the refund or metadata fields
   * @param refundId The identifier for refund (required)
   * @param refundUpdateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /refunds/{refundId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RefundResponse> updateARefundWithHttpInfo(@Param("refundId") String refundId, RefundUpdateRequest refundUpdateRequest);


}
