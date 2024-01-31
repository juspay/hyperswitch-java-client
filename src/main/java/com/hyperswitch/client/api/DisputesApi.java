package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.DisputeResponse;
import com.hyperswitch.client.model.DisputeStage;
import com.hyperswitch.client.model.DisputeStatus;
import java.time.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public interface DisputesApi extends ApiClient.Api {


  /**
   * Disputes - List Disputes
   * Disputes - List Disputes
   * @param limit The maximum number of Dispute Objects to include in the response (optional)
   * @param disputeStatus The status of dispute (optional)
   * @param disputeStage The stage of dispute (optional)
   * @param reason The reason for dispute (optional)
   * @param connector The connector linked to dispute (optional)
   * @param receivedTime The time at which dispute is received (optional)
   * @param receivedTimeLt Time less than the dispute received time (optional)
   * @param receivedTimeGt Time greater than the dispute received time (optional)
   * @param receivedTimeLte Time less than or equals to the dispute received time (optional)
   * @param receivedTimeGte Time greater than or equals to the dispute received time (optional)
   * @return List&lt;DisputeResponse&gt;
   */
  @RequestLine("GET /disputes/list?limit={limit}&dispute_status={disputeStatus}&dispute_stage={disputeStage}&reason={reason}&connector={connector}&received_time={receivedTime}&received_time.lt={receivedTimeLt}&received_time.gt={receivedTimeGt}&received_time.lte={receivedTimeLte}&received_time.gte={receivedTimeGte}")
  @Headers({
    "Accept: application/json",
  })
  List<DisputeResponse> listDisputes(@Param("limit") Long limit, @Param("disputeStatus") DisputeStatus disputeStatus, @Param("disputeStage") DisputeStage disputeStage, @Param("reason") String reason, @Param("connector") String connector, @Param("receivedTime") OffsetDateTime receivedTime, @Param("receivedTimeLt") OffsetDateTime receivedTimeLt, @Param("receivedTimeGt") OffsetDateTime receivedTimeGt, @Param("receivedTimeLte") OffsetDateTime receivedTimeLte, @Param("receivedTimeGte") OffsetDateTime receivedTimeGte);

  /**
   * Disputes - List Disputes
   * Similar to <code>listDisputes</code> but it also returns the http response headers .
   * Disputes - List Disputes
   * @param limit The maximum number of Dispute Objects to include in the response (optional)
   * @param disputeStatus The status of dispute (optional)
   * @param disputeStage The stage of dispute (optional)
   * @param reason The reason for dispute (optional)
   * @param connector The connector linked to dispute (optional)
   * @param receivedTime The time at which dispute is received (optional)
   * @param receivedTimeLt Time less than the dispute received time (optional)
   * @param receivedTimeGt Time greater than the dispute received time (optional)
   * @param receivedTimeLte Time less than or equals to the dispute received time (optional)
   * @param receivedTimeGte Time greater than or equals to the dispute received time (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /disputes/list?limit={limit}&dispute_status={disputeStatus}&dispute_stage={disputeStage}&reason={reason}&connector={connector}&received_time={receivedTime}&received_time.lt={receivedTimeLt}&received_time.gt={receivedTimeGt}&received_time.lte={receivedTimeLte}&received_time.gte={receivedTimeGte}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<DisputeResponse>> listDisputesWithHttpInfo(@Param("limit") Long limit, @Param("disputeStatus") DisputeStatus disputeStatus, @Param("disputeStage") DisputeStage disputeStage, @Param("reason") String reason, @Param("connector") String connector, @Param("receivedTime") OffsetDateTime receivedTime, @Param("receivedTimeLt") OffsetDateTime receivedTimeLt, @Param("receivedTimeGt") OffsetDateTime receivedTimeGt, @Param("receivedTimeLte") OffsetDateTime receivedTimeLte, @Param("receivedTimeGte") OffsetDateTime receivedTimeGte);


  /**
   * Disputes - List Disputes
   * Disputes - List Disputes
   * Note, this is equivalent to the other <code>listDisputes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListDisputesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - The maximum number of Dispute Objects to include in the response (optional)</li>
   *   <li>disputeStatus - The status of dispute (optional)</li>
   *   <li>disputeStage - The stage of dispute (optional)</li>
   *   <li>reason - The reason for dispute (optional)</li>
   *   <li>connector - The connector linked to dispute (optional)</li>
   *   <li>receivedTime - The time at which dispute is received (optional)</li>
   *   <li>receivedTimeLt - Time less than the dispute received time (optional)</li>
   *   <li>receivedTimeGt - Time greater than the dispute received time (optional)</li>
   *   <li>receivedTimeLte - Time less than or equals to the dispute received time (optional)</li>
   *   <li>receivedTimeGte - Time greater than or equals to the dispute received time (optional)</li>
   *   </ul>
   * @return List&lt;DisputeResponse&gt;
   */
  @RequestLine("GET /disputes/list?limit={limit}&dispute_status={disputeStatus}&dispute_stage={disputeStage}&reason={reason}&connector={connector}&received_time={receivedTime}&received_time.lt={receivedTimeLt}&received_time.gt={receivedTimeGt}&received_time.lte={receivedTimeLte}&received_time.gte={receivedTimeGte}")
  @Headers({
  "Accept: application/json",
  })
  List<DisputeResponse> listDisputes(@QueryMap(encoded=true) ListDisputesQueryParams queryParams);

  /**
  * Disputes - List Disputes
  * Disputes - List Disputes
  * Note, this is equivalent to the other <code>listDisputes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>limit - The maximum number of Dispute Objects to include in the response (optional)</li>
          *   <li>disputeStatus - The status of dispute (optional)</li>
          *   <li>disputeStage - The stage of dispute (optional)</li>
          *   <li>reason - The reason for dispute (optional)</li>
          *   <li>connector - The connector linked to dispute (optional)</li>
          *   <li>receivedTime - The time at which dispute is received (optional)</li>
          *   <li>receivedTimeLt - Time less than the dispute received time (optional)</li>
          *   <li>receivedTimeGt - Time greater than the dispute received time (optional)</li>
          *   <li>receivedTimeLte - Time less than or equals to the dispute received time (optional)</li>
          *   <li>receivedTimeGte - Time greater than or equals to the dispute received time (optional)</li>
      *   </ul>
          * @return List&lt;DisputeResponse&gt;
      */
      @RequestLine("GET /disputes/list?limit={limit}&dispute_status={disputeStatus}&dispute_stage={disputeStage}&reason={reason}&connector={connector}&received_time={receivedTime}&received_time.lt={receivedTimeLt}&received_time.gt={receivedTimeGt}&received_time.lte={receivedTimeLte}&received_time.gte={receivedTimeGte}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<List<DisputeResponse>> listDisputesWithHttpInfo(@QueryMap(encoded=true) ListDisputesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listDisputes</code> method in a fluent style.
   */
  public static class ListDisputesQueryParams extends HashMap<String, Object> {
    public ListDisputesQueryParams limit(final Long value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListDisputesQueryParams disputeStatus(final DisputeStatus value) {
      put("dispute_status", EncodingUtils.encode(value));
      return this;
    }
    public ListDisputesQueryParams disputeStage(final DisputeStage value) {
      put("dispute_stage", EncodingUtils.encode(value));
      return this;
    }
    public ListDisputesQueryParams reason(final String value) {
      put("reason", EncodingUtils.encode(value));
      return this;
    }
    public ListDisputesQueryParams connector(final String value) {
      put("connector", EncodingUtils.encode(value));
      return this;
    }
    public ListDisputesQueryParams receivedTime(final OffsetDateTime value) {
      put("received_time", EncodingUtils.encode(value));
      return this;
    }
    public ListDisputesQueryParams receivedTimeLt(final OffsetDateTime value) {
      put("received_time.lt", EncodingUtils.encode(value));
      return this;
    }
    public ListDisputesQueryParams receivedTimeGt(final OffsetDateTime value) {
      put("received_time.gt", EncodingUtils.encode(value));
      return this;
    }
    public ListDisputesQueryParams receivedTimeLte(final OffsetDateTime value) {
      put("received_time.lte", EncodingUtils.encode(value));
      return this;
    }
    public ListDisputesQueryParams receivedTimeGte(final OffsetDateTime value) {
      put("received_time.gte", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Disputes - Retrieve Dispute
   * Disputes - Retrieve Dispute
   * @param disputeId The identifier for dispute (required)
   * @return DisputeResponse
   */
  @RequestLine("GET /disputes/{disputeId}")
  @Headers({
    "Accept: application/json",
  })
  DisputeResponse retrieveADispute(@Param("disputeId") String disputeId);

  /**
   * Disputes - Retrieve Dispute
   * Similar to <code>retrieveADispute</code> but it also returns the http response headers .
   * Disputes - Retrieve Dispute
   * @param disputeId The identifier for dispute (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /disputes/{disputeId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DisputeResponse> retrieveADisputeWithHttpInfo(@Param("disputeId") String disputeId);


}
