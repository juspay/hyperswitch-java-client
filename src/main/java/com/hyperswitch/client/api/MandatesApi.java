package com.hyperswitch.client.api;

import com.hyperswitch.client.HsApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.MandateResponse;
import com.hyperswitch.client.model.MandateRevokedResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public interface MandatesApi extends HsApiClient.Api {


  /**
   * Mandates - Retrieve Mandate
   * Mandates - Retrieve Mandate  Retrieve a mandate
   * @param mandateId The identifier for mandate (required)
   * @return MandateResponse
   */
  @RequestLine("GET /mandates/{mandateId}")
  @Headers({
    "Accept: application/json",
  })
  MandateResponse retrieveAMandate(@Param("mandateId") String mandateId);

  /**
   * Mandates - Retrieve Mandate
   * Similar to <code>retrieveAMandate</code> but it also returns the http response headers .
   * Mandates - Retrieve Mandate  Retrieve a mandate
   * @param mandateId The identifier for mandate (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /mandates/{mandateId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MandateResponse> retrieveAMandateWithHttpInfo(@Param("mandateId") String mandateId);



  /**
   * Mandates - Revoke Mandate
   * Mandates - Revoke Mandate  Revoke a mandate
   * @param mandateId The identifier for mandate (required)
   * @return MandateRevokedResponse
   */
  @RequestLine("POST /mandates/revoke/{mandateId}")
  @Headers({
    "Accept: application/json",
  })
  MandateRevokedResponse revokeAMandate(@Param("mandateId") String mandateId);

  /**
   * Mandates - Revoke Mandate
   * Similar to <code>revokeAMandate</code> but it also returns the http response headers .
   * Mandates - Revoke Mandate  Revoke a mandate
   * @param mandateId The identifier for mandate (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /mandates/revoke/{mandateId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MandateRevokedResponse> revokeAMandateWithHttpInfo(@Param("mandateId") String mandateId);


}
