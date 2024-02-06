package com.hyperswitch.client.api;

import com.hyperswitch.client.HsApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.CustomerResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public interface CustomersListApi extends HsApiClient.Api {


  /**
   * List customers for a merchant
   * List customers for a merchant  To filter and list the customers for a particular merchant id
   * @return List&lt;CustomerResponse&gt;
   */
  @RequestLine("POST /customers/list")
  @Headers({
    "Accept: application/json",
  })
  List<CustomerResponse> listAllCustomersForAMerchant();

  /**
   * List customers for a merchant
   * Similar to <code>listAllCustomersForAMerchant</code> but it also returns the http response headers .
   * List customers for a merchant  To filter and list the customers for a particular merchant id
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /customers/list")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<CustomerResponse>> listAllCustomersForAMerchantWithHttpInfo();


}
