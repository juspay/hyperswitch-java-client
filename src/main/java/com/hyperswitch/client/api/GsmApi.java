package com.hyperswitch.client.api;

import com.hyperswitch.client.HsApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.GsmCreateRequest;
import com.hyperswitch.client.model.GsmDeleteRequest;
import com.hyperswitch.client.model.GsmDeleteResponse;
import com.hyperswitch.client.model.GsmResponse;
import com.hyperswitch.client.model.GsmRetrieveRequest;
import com.hyperswitch.client.model.GsmUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public interface GsmApi extends HsApiClient.Api {


  /**
   * Gsm - Create
   * Gsm - Create  To create a Gsm Rule
   * @param gsmCreateRequest  (required)
   * @return GsmResponse
   */
  @RequestLine("POST /gsm")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GsmResponse createGsmRule(GsmCreateRequest gsmCreateRequest);

  /**
   * Gsm - Create
   * Similar to <code>createGsmRule</code> but it also returns the http response headers .
   * Gsm - Create  To create a Gsm Rule
   * @param gsmCreateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /gsm")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GsmResponse> createGsmRuleWithHttpInfo(GsmCreateRequest gsmCreateRequest);



  /**
   * Gsm - Delete
   * Gsm - Delete  To delete a Gsm Rule
   * @param gsmDeleteRequest  (required)
   * @return GsmDeleteResponse
   */
  @RequestLine("POST /gsm/delete")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GsmDeleteResponse deleteGsmRule(GsmDeleteRequest gsmDeleteRequest);

  /**
   * Gsm - Delete
   * Similar to <code>deleteGsmRule</code> but it also returns the http response headers .
   * Gsm - Delete  To delete a Gsm Rule
   * @param gsmDeleteRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /gsm/delete")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GsmDeleteResponse> deleteGsmRuleWithHttpInfo(GsmDeleteRequest gsmDeleteRequest);



  /**
   * Gsm - Get
   * Gsm - Get  To get a Gsm Rule
   * @param gsmRetrieveRequest  (required)
   * @return GsmResponse
   */
  @RequestLine("POST /gsm/get")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GsmResponse retrieveGsmRule(GsmRetrieveRequest gsmRetrieveRequest);

  /**
   * Gsm - Get
   * Similar to <code>retrieveGsmRule</code> but it also returns the http response headers .
   * Gsm - Get  To get a Gsm Rule
   * @param gsmRetrieveRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /gsm/get")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GsmResponse> retrieveGsmRuleWithHttpInfo(GsmRetrieveRequest gsmRetrieveRequest);



  /**
   * Gsm - Update
   * Gsm - Update  To update a Gsm Rule
   * @param gsmUpdateRequest  (required)
   * @return GsmResponse
   */
  @RequestLine("POST /gsm/update")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GsmResponse updateGsmRule(GsmUpdateRequest gsmUpdateRequest);

  /**
   * Gsm - Update
   * Similar to <code>updateGsmRule</code> but it also returns the http response headers .
   * Gsm - Update  To update a Gsm Rule
   * @param gsmUpdateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /gsm/update")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GsmResponse> updateGsmRuleWithHttpInfo(GsmUpdateRequest gsmUpdateRequest);


}
