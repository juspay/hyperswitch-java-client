package com.hyperswitch.client.api;

import com.hyperswitch.client.HsApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.MerchantConnectorCreate;
import com.hyperswitch.client.model.MerchantConnectorDeleteResponse;
import com.hyperswitch.client.model.MerchantConnectorResponse;
import com.hyperswitch.client.model.MerchantConnectorUpdate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public interface MerchantConnectorAccountApi extends HsApiClient.Api {


  /**
   * Merchant Connector - Create
   * Merchant Connector - Create  Create a new Merchant Connector for the merchant account. The connector could be a payment processor / facilitator / acquirer or specialized services like Fraud / Accounting etc.\&quot;
   * @param merchantConnectorCreate  (required)
   * @return MerchantConnectorResponse
   */
  @RequestLine("POST /accounts/{accountId}/connectors")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MerchantConnectorResponse createAMerchantConnector(MerchantConnectorCreate merchantConnectorCreate);

  /**
   * Merchant Connector - Create
   * Similar to <code>createAMerchantConnector</code> but it also returns the http response headers .
   * Merchant Connector - Create  Create a new Merchant Connector for the merchant account. The connector could be a payment processor / facilitator / acquirer or specialized services like Fraud / Accounting etc.\&quot;
   * @param merchantConnectorCreate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /accounts/{accountId}/connectors")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MerchantConnectorResponse> createAMerchantConnectorWithHttpInfo(MerchantConnectorCreate merchantConnectorCreate);



  /**
   * Merchant Connector - Delete
   * Merchant Connector - Delete  Delete or Detach a Merchant Connector from Merchant Account
   * @param accountId The unique identifier for the merchant account (required)
   * @param connectorId The unique identifier for the Merchant Connector (required)
   * @return MerchantConnectorDeleteResponse
   */
  @RequestLine("DELETE /accounts/{accountId}/connectors/{connectorId}")
  @Headers({
    "Accept: application/json",
  })
  MerchantConnectorDeleteResponse deleteAMerchantConnector(@Param("accountId") String accountId, @Param("connectorId") Integer connectorId);

  /**
   * Merchant Connector - Delete
   * Similar to <code>deleteAMerchantConnector</code> but it also returns the http response headers .
   * Merchant Connector - Delete  Delete or Detach a Merchant Connector from Merchant Account
   * @param accountId The unique identifier for the merchant account (required)
   * @param connectorId The unique identifier for the Merchant Connector (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /accounts/{accountId}/connectors/{connectorId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MerchantConnectorDeleteResponse> deleteAMerchantConnectorWithHttpInfo(@Param("accountId") String accountId, @Param("connectorId") Integer connectorId);



  /**
   * Merchant Connector - List
   * Merchant Connector - List  List Merchant Connector Details for the merchant
   * @param accountId The unique identifier for the merchant account (required)
   * @return List&lt;MerchantConnectorResponse&gt;
   */
  @RequestLine("GET /accounts/{accountId}/connectors")
  @Headers({
    "Accept: application/json",
  })
  List<MerchantConnectorResponse> listAllMerchantConnectors(@Param("accountId") String accountId);

  /**
   * Merchant Connector - List
   * Similar to <code>listAllMerchantConnectors</code> but it also returns the http response headers .
   * Merchant Connector - List  List Merchant Connector Details for the merchant
   * @param accountId The unique identifier for the merchant account (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /accounts/{accountId}/connectors")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<MerchantConnectorResponse>> listAllMerchantConnectorsWithHttpInfo(@Param("accountId") String accountId);



  /**
   * Merchant Connector - Retrieve
   * Merchant Connector - Retrieve  Retrieve Merchant Connector Details
   * @param accountId The unique identifier for the merchant account (required)
   * @param connectorId The unique identifier for the Merchant Connector (required)
   * @return MerchantConnectorResponse
   */
  @RequestLine("GET /accounts/{accountId}/connectors/{connectorId}")
  @Headers({
    "Accept: application/json",
  })
  MerchantConnectorResponse retrieveAMerchantConnector(@Param("accountId") String accountId, @Param("connectorId") Integer connectorId);

  /**
   * Merchant Connector - Retrieve
   * Similar to <code>retrieveAMerchantConnector</code> but it also returns the http response headers .
   * Merchant Connector - Retrieve  Retrieve Merchant Connector Details
   * @param accountId The unique identifier for the merchant account (required)
   * @param connectorId The unique identifier for the Merchant Connector (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /accounts/{accountId}/connectors/{connectorId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MerchantConnectorResponse> retrieveAMerchantConnectorWithHttpInfo(@Param("accountId") String accountId, @Param("connectorId") Integer connectorId);



  /**
   * Merchant Connector - Update
   * Merchant Connector - Update  To update an existing Merchant Connector. Helpful in enabling / disabling different payment methods and other settings for the connector etc.
   * @param accountId The unique identifier for the merchant account (required)
   * @param connectorId The unique identifier for the Merchant Connector (required)
   * @param merchantConnectorUpdate  (required)
   * @return MerchantConnectorResponse
   */
  @RequestLine("POST /accounts/{accountId}/connectors/{connectorId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MerchantConnectorResponse updateAMerchantConnector(@Param("accountId") String accountId, @Param("connectorId") Integer connectorId, MerchantConnectorUpdate merchantConnectorUpdate);

  /**
   * Merchant Connector - Update
   * Similar to <code>updateAMerchantConnector</code> but it also returns the http response headers .
   * Merchant Connector - Update  To update an existing Merchant Connector. Helpful in enabling / disabling different payment methods and other settings for the connector etc.
   * @param accountId The unique identifier for the merchant account (required)
   * @param connectorId The unique identifier for the Merchant Connector (required)
   * @param merchantConnectorUpdate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /accounts/{accountId}/connectors/{connectorId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MerchantConnectorResponse> updateAMerchantConnectorWithHttpInfo(@Param("accountId") String accountId, @Param("connectorId") Integer connectorId, MerchantConnectorUpdate merchantConnectorUpdate);


}
