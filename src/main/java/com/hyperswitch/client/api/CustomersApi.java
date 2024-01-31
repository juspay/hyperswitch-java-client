package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.CustomerDeleteResponse;
import com.hyperswitch.client.model.CustomerResponse;
import com.hyperswitch.client.model.CustomerRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public interface CustomersApi extends ApiClient.Api {


  /**
   * Create Customer
   * Create Customer  Create a customer object and store the customer details to be reused for future payments. Incase the customer already exists in the system, this API will respond with the customer details.
   * @param customerRequest  (required)
   * @return CustomerResponse
   */
  @RequestLine("POST /customers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
CustomerResponse createACustomer(CustomerRequest customerRequest);

  /**
   * Create Customer
   * Similar to <code>createACustomer</code> but it also returns the http response headers .
   * Create Customer  Create a customer object and store the customer details to be reused for future payments. Incase the customer already exists in the system, this API will respond with the customer details.
   * @param customerRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /customers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomerResponse> createACustomerWithHttpInfo(CustomerRequest customerRequest);



  /**
   * Delete Customer
   * Delete Customer  Delete a customer record.
   * @param customerId The unique identifier for the Customer (required)
   * @return CustomerDeleteResponse
   */
  @RequestLine("DELETE /customers/{customerId}")
  @Headers({
    "Accept: application/json",
  })
  CustomerDeleteResponse deleteACustomer(@Param("customerId") String customerId);

  /**
   * Delete Customer
   * Similar to <code>deleteACustomer</code> but it also returns the http response headers .
   * Delete Customer  Delete a customer record.
   * @param customerId The unique identifier for the Customer (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /customers/{customerId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CustomerDeleteResponse> deleteACustomerWithHttpInfo(@Param("customerId") String customerId);



  /**
   * Retrieve Customer
   * Retrieve Customer  Retrieve a customer&#39;s details.
   * @param customerId The unique identifier for the Customer (required)
   * @return CustomerResponse
   */
  @RequestLine("GET /customers/{customerId}")
  @Headers({
    "Accept: application/json",
  })
  CustomerResponse retrieveACustomer(@Param("customerId") String customerId);

  /**
   * Retrieve Customer
   * Similar to <code>retrieveACustomer</code> but it also returns the http response headers .
   * Retrieve Customer  Retrieve a customer&#39;s details.
   * @param customerId The unique identifier for the Customer (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /customers/{customerId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CustomerResponse> retrieveACustomerWithHttpInfo(@Param("customerId") String customerId);



  /**
   * Update Customer
   * Update Customer  Updates the customer&#39;s details in a customer object.
   * @param customerId The unique identifier for the Customer (required)
   * @param customerRequest  (required)
   * @return CustomerResponse
   */
  @RequestLine("POST /customers/{customerId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomerResponse updateACustomer(@Param("customerId") String customerId, CustomerRequest customerRequest);

  /**
   * Update Customer
   * Similar to <code>updateACustomer</code> but it also returns the http response headers .
   * Update Customer  Updates the customer&#39;s details in a customer object.
   * @param customerId The unique identifier for the Customer (required)
   * @param customerRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /customers/{customerId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomerResponse> updateACustomerWithHttpInfo(@Param("customerId") String customerId, CustomerRequest customerRequest);

}
