package com.hyperswitch.client.api;

import com.hyperswitch.client.HsApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import java.time.OffsetDateTime;
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public interface PaymentsApi extends HsApiClient.Api {


  /**
   * Payments - Cancel
   * Payments - Cancel  A Payment could can be cancelled when it is in one of these statuses: requires_payment_method, requires_capture, requires_confirmation, requires_customer_action
   * @param paymentId The identifier for payment (required)
   * @param paymentsCancelRequest  (required)
   */
  @RequestLine("POST /payments/{paymentId}/cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void cancelPayment(@Param("paymentId") String paymentId, PaymentsCancelRequest paymentsCancelRequest);

  /**
   * Payments - Cancel
   * Similar to <code>cancelPayment</code> but it also returns the http response headers .
   * Payments - Cancel  A Payment could can be cancelled when it is in one of these statuses: requires_payment_method, requires_capture, requires_confirmation, requires_customer_action
   * @param paymentId The identifier for payment (required)
   * @param paymentsCancelRequest  (required)
   */
  @RequestLine("POST /payments/{paymentId}/cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Void> cancelPaymentWithHttpInfo(@Param("paymentId") String paymentId, PaymentsCancelRequest paymentsCancelRequest);



  /**
   * Payments - Capture
   * Payments - Capture  To capture the funds for an uncaptured payment
   * @param paymentId The identifier for payment (required)
   * @param paymentsCaptureRequest  (required)
   * @return PaymentsResponse
   */
  @RequestLine("POST /payments/{paymentId}/capture")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsResponse captureAPayment(@Param("paymentId") String paymentId, PaymentsCaptureRequest paymentsCaptureRequest);

  /**
   * Payments - Capture
   * Similar to <code>captureAPayment</code> but it also returns the http response headers .
   * Payments - Capture  To capture the funds for an uncaptured payment
   * @param paymentId The identifier for payment (required)
   * @param paymentsCaptureRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payments/{paymentId}/capture")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsResponse> captureAPaymentWithHttpInfo(@Param("paymentId") String paymentId, PaymentsCaptureRequest paymentsCaptureRequest);



  /**
   * Payments - Confirm
   * Payments - Confirm  This API is to confirm the payment request and forward payment to the payment processor. This API provides more granular control upon when the API is forwarded to the payment processor. Alternatively you can confirm the payment within the Payments Create API
   * @param paymentId The identifier for payment (required)
   * @param paymentsRequest  (required)
   * @return PaymentsResponse
   */
  @RequestLine("POST /payments/{paymentId}/confirm")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsResponse confirmAPayment(@Param("paymentId") String paymentId, PaymentsRequest paymentsRequest);

  /**
   * Payments - Confirm
   * Similar to <code>confirmAPayment</code> but it also returns the http response headers .
   * Payments - Confirm  This API is to confirm the payment request and forward payment to the payment processor. This API provides more granular control upon when the API is forwarded to the payment processor. Alternatively you can confirm the payment within the Payments Create API
   * @param paymentId The identifier for payment (required)
   * @param paymentsRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payments/{paymentId}/confirm")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsResponse> confirmAPaymentWithHttpInfo(@Param("paymentId") String paymentId, PaymentsRequest paymentsRequest);



  /**
   * Payments - Create
   * Payments - Create  To process a payment you will have to create a payment, attach a payment method and confirm. Depending on the user journey you wish to achieve, you may opt to all the steps in a single request or in a sequence of API request using following APIs: (i) Payments - Update, (ii) Payments - Confirm, and (iii) Payments - Capture
   * @param paymentsCreateRequest  (required)
   * @return PaymentsResponse
   */
  @RequestLine("POST /payments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsResponse createAPayment(PaymentsCreateRequest paymentsCreateRequest);

  /**
   * Payments - Create
   * Similar to <code>createAPayment</code> but it also returns the http response headers .
   * Payments - Create  To process a payment you will have to create a payment, attach a payment method and confirm. Depending on the user journey you wish to achieve, you may opt to all the steps in a single request or in a sequence of API request using following APIs: (i) Payments - Update, (ii) Payments - Confirm, and (iii) Payments - Capture
   * @param paymentsCreateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsResponse> createAPaymentWithHttpInfo(PaymentsCreateRequest paymentsCreateRequest);



  /**
   * Payments - Session token
   * Payments - Session token  To create the session object or to get session token for wallets
   * @param paymentsSessionRequest  (required)
   * @return PaymentsSessionResponse
   */
  @RequestLine("POST /payments/session_tokens")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsSessionResponse createSessionTokensForAPayment(PaymentsSessionRequest paymentsSessionRequest);

  /**
   * Payments - Session token
   * Similar to <code>createSessionTokensForAPayment</code> but it also returns the http response headers .
   * Payments - Session token  To create the session object or to get session token for wallets
   * @param paymentsSessionRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payments/session_tokens")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsSessionResponse> createSessionTokensForAPaymentWithHttpInfo(PaymentsSessionRequest paymentsSessionRequest);



  /**
   * Payments - List
   * Payments - List  To list the payments
   * @param customerId The identifier for the customer (required)
   * @param startingAfter A cursor for use in pagination, fetch the next list after some object (required)
   * @param endingBefore A cursor for use in pagination, fetch the previous list before some object (required)
   * @param limit Limit on the number of objects to return (required)
   * @param created The time at which payment is created (required)
   * @param createdLt Time less than the payment created time (required)
   * @param createdGt Time greater than the payment created time (required)
   * @param createdLte Time less than or equals to the payment created time (required)
   * @param createdGte Time greater than or equals to the payment created time (required)
   */
  @RequestLine("GET /payments/list?customer_id={customerId}&starting_after={startingAfter}&ending_before={endingBefore}&limit={limit}&created={created}&created_lt={createdLt}&created_gt={createdGt}&created_lte={createdLte}&created_gte={createdGte}")
  @Headers({
    "Accept: application/json",
  })
  void listAllPayments(@Param("customerId") String customerId, @Param("startingAfter") String startingAfter, @Param("endingBefore") String endingBefore, @Param("limit") Long limit, @Param("created") OffsetDateTime created, @Param("createdLt") OffsetDateTime createdLt, @Param("createdGt") OffsetDateTime createdGt, @Param("createdLte") OffsetDateTime createdLte, @Param("createdGte") OffsetDateTime createdGte);

  /**
   * Payments - List
   * Similar to <code>listAllPayments</code> but it also returns the http response headers .
   * Payments - List  To list the payments
   * @param customerId The identifier for the customer (required)
   * @param startingAfter A cursor for use in pagination, fetch the next list after some object (required)
   * @param endingBefore A cursor for use in pagination, fetch the previous list before some object (required)
   * @param limit Limit on the number of objects to return (required)
   * @param created The time at which payment is created (required)
   * @param createdLt Time less than the payment created time (required)
   * @param createdGt Time greater than the payment created time (required)
   * @param createdLte Time less than or equals to the payment created time (required)
   * @param createdGte Time greater than or equals to the payment created time (required)
   */
  @RequestLine("GET /payments/list?customer_id={customerId}&starting_after={startingAfter}&ending_before={endingBefore}&limit={limit}&created={created}&created_lt={createdLt}&created_gt={createdGt}&created_lte={createdLte}&created_gte={createdGte}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> listAllPaymentsWithHttpInfo(@Param("customerId") String customerId, @Param("startingAfter") String startingAfter, @Param("endingBefore") String endingBefore, @Param("limit") Long limit, @Param("created") OffsetDateTime created, @Param("createdLt") OffsetDateTime createdLt, @Param("createdGt") OffsetDateTime createdGt, @Param("createdLte") OffsetDateTime createdLte, @Param("createdGte") OffsetDateTime createdGte);


  /**
   * Payments - List
   * Payments - List  To list the payments
   * Note, this is equivalent to the other <code>listAllPayments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAllPaymentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>customerId - The identifier for the customer (required)</li>
   *   <li>startingAfter - A cursor for use in pagination, fetch the next list after some object (required)</li>
   *   <li>endingBefore - A cursor for use in pagination, fetch the previous list before some object (required)</li>
   *   <li>limit - Limit on the number of objects to return (required)</li>
   *   <li>created - The time at which payment is created (required)</li>
   *   <li>createdLt - Time less than the payment created time (required)</li>
   *   <li>createdGt - Time greater than the payment created time (required)</li>
   *   <li>createdLte - Time less than or equals to the payment created time (required)</li>
   *   <li>createdGte - Time greater than or equals to the payment created time (required)</li>
   *   </ul>
   */
  @RequestLine("GET /payments/list?customer_id={customerId}&starting_after={startingAfter}&ending_before={endingBefore}&limit={limit}&created={created}&created_lt={createdLt}&created_gt={createdGt}&created_lte={createdLte}&created_gte={createdGte}")
  @Headers({
  "Accept: application/json",
  })
  void listAllPayments(@QueryMap(encoded=true) ListAllPaymentsQueryParams queryParams);

  /**
  * Payments - List
  * Payments - List  To list the payments
  * Note, this is equivalent to the other <code>listAllPayments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>customerId - The identifier for the customer (required)</li>
          *   <li>startingAfter - A cursor for use in pagination, fetch the next list after some object (required)</li>
          *   <li>endingBefore - A cursor for use in pagination, fetch the previous list before some object (required)</li>
          *   <li>limit - Limit on the number of objects to return (required)</li>
          *   <li>created - The time at which payment is created (required)</li>
          *   <li>createdLt - Time less than the payment created time (required)</li>
          *   <li>createdGt - Time greater than the payment created time (required)</li>
          *   <li>createdLte - Time less than or equals to the payment created time (required)</li>
          *   <li>createdGte - Time greater than or equals to the payment created time (required)</li>
      *   </ul>
      */
      @RequestLine("GET /payments/list?customer_id={customerId}&starting_after={startingAfter}&ending_before={endingBefore}&limit={limit}&created={created}&created_lt={createdLt}&created_gt={createdGt}&created_lte={createdLte}&created_gte={createdGte}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> listAllPaymentsWithHttpInfo(@QueryMap(encoded=true) ListAllPaymentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listAllPayments</code> method in a fluent style.
   */
  public static class ListAllPaymentsQueryParams extends HashMap<String, Object> {
    public ListAllPaymentsQueryParams customerId(final String value) {
      put("customer_id", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentsQueryParams startingAfter(final String value) {
      put("starting_after", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentsQueryParams endingBefore(final String value) {
      put("ending_before", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentsQueryParams limit(final Long value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentsQueryParams created(final OffsetDateTime value) {
      put("created", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentsQueryParams createdLt(final OffsetDateTime value) {
      put("created_lt", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentsQueryParams createdGt(final OffsetDateTime value) {
      put("created_gt", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentsQueryParams createdLte(final OffsetDateTime value) {
      put("created_lte", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentsQueryParams createdGte(final OffsetDateTime value) {
      put("created_gte", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Payments - Retrieve
   * Payments - Retrieve  To retrieve the properties of a Payment. This may be used to get the status of a previously initiated payment or next action for an ongoing payment
   * @param paymentId The identifier for payment (required)
   * @param paymentRetrieveBody  (required)
   * @return PaymentsResponse
   */
  @RequestLine("GET /payments/{paymentId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsResponse retrieveAPayment(@Param("paymentId") String paymentId, PaymentRetrieveBody paymentRetrieveBody);

  /**
   * Payments - Retrieve
   * Similar to <code>retrieveAPayment</code> but it also returns the http response headers .
   * Payments - Retrieve  To retrieve the properties of a Payment. This may be used to get the status of a previously initiated payment or next action for an ongoing payment
   * @param paymentId The identifier for payment (required)
   * @param paymentRetrieveBody  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /payments/{paymentId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsResponse> retrieveAPaymentWithHttpInfo(@Param("paymentId") String paymentId, PaymentRetrieveBody paymentRetrieveBody);



  /**
   * Payments Link - Retrieve
   * Payments Link - Retrieve  To retrieve the properties of a Payment Link. This may be used to get the status of a previously initiated payment or next action for an ongoing payment
   * @param paymentLinkId The identifier for payment link (required)
   * @param retrievePaymentLinkRequest  (required)
   * @return RetrievePaymentLinkResponse
   */
  @RequestLine("GET /payment_link/{paymentLinkId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RetrievePaymentLinkResponse retrieveAPaymentLink(@Param("paymentLinkId") String paymentLinkId, RetrievePaymentLinkRequest retrievePaymentLinkRequest);

  /**
   * Payments Link - Retrieve
   * Similar to <code>retrieveAPaymentLink</code> but it also returns the http response headers .
   * Payments Link - Retrieve  To retrieve the properties of a Payment Link. This may be used to get the status of a previously initiated payment or next action for an ongoing payment
   * @param paymentLinkId The identifier for payment link (required)
   * @param retrievePaymentLinkRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /payment_link/{paymentLinkId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RetrievePaymentLinkResponse> retrieveAPaymentLinkWithHttpInfo(@Param("paymentLinkId") String paymentLinkId, RetrievePaymentLinkRequest retrievePaymentLinkRequest);



  /**
   * Payments - Update
   * Payments - Update  To update the properties of a PaymentIntent object. This may include attaching a payment method, or attaching customer object or metadata fields after the Payment is created
   * @param paymentId The identifier for payment (required)
   * @param paymentsRequest  (required)
   * @return PaymentsResponse
   */
  @RequestLine("POST /payments/{paymentId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsResponse updateAPayment(@Param("paymentId") String paymentId, PaymentsRequest paymentsRequest);

  /**
   * Payments - Update
   * Similar to <code>updateAPayment</code> but it also returns the http response headers .
   * Payments - Update  To update the properties of a PaymentIntent object. This may include attaching a payment method, or attaching customer object or metadata fields after the Payment is created
   * @param paymentId The identifier for payment (required)
   * @param paymentsRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payments/{paymentId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsResponse> updateAPaymentWithHttpInfo(@Param("paymentId") String paymentId, PaymentsRequest paymentsRequest);


}
