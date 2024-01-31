package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.Currency;
import com.hyperswitch.client.model.CustomerPaymentMethodsListResponse;
import com.hyperswitch.client.model.PaymentMethodCreate;
import com.hyperswitch.client.model.PaymentMethodDeleteResponse;
import com.hyperswitch.client.model.PaymentMethodListResponse;
import com.hyperswitch.client.model.PaymentMethodResponse;
import com.hyperswitch.client.model.PaymentMethodUpdate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public interface PaymentMethodsApi extends ApiClient.Api {


  /**
   * PaymentMethods - Create
   * PaymentMethods - Create  To create a payment method against a customer object. In case of cards, this API could be used only by PCI compliant merchants
   * @param paymentMethodCreate  (required)
   * @return PaymentMethodResponse
   */
  @RequestLine("POST /payment_methods")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentMethodResponse createAPaymentMethod(PaymentMethodCreate paymentMethodCreate);

  /**
   * PaymentMethods - Create
   * Similar to <code>createAPaymentMethod</code> but it also returns the http response headers .
   * PaymentMethods - Create  To create a payment method against a customer object. In case of cards, this API could be used only by PCI compliant merchants
   * @param paymentMethodCreate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payment_methods")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentMethodResponse> createAPaymentMethodWithHttpInfo(PaymentMethodCreate paymentMethodCreate);



  /**
   * Payment Method - Delete
   * Payment Method - Delete  Delete payment method
   * @param methodId The unique identifier for the Payment Method (required)
   * @return PaymentMethodDeleteResponse
   */
  @RequestLine("DELETE /payment_methods/{methodId}")
  @Headers({
    "Accept: application/json",
  })
  PaymentMethodDeleteResponse deleteAPaymentMethod(@Param("methodId") String methodId);

  /**
   * Payment Method - Delete
   * Similar to <code>deleteAPaymentMethod</code> but it also returns the http response headers .
   * Payment Method - Delete  Delete payment method
   * @param methodId The unique identifier for the Payment Method (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /payment_methods/{methodId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PaymentMethodDeleteResponse> deleteAPaymentMethodWithHttpInfo(@Param("methodId") String methodId);



  /**
   * List payment methods for a Customer
   * List payment methods for a Customer  To filter and list the applicable payment methods for a particular Customer ID
   * @param clientSecret A secret known only to your application and the authorization server (required)
   * @param acceptedCountry The two-letter ISO currency code (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param minimumAmount The minimum amount accepted for processing by the particular payment method. (required)
   * @param maximumAmount The maximum amount amount accepted for processing by the particular payment method. (required)
   * @param recurringPaymentEnabled Indicates whether the payment method is eligible for recurring payments (required)
   * @param installmentPaymentEnabled Indicates whether the payment method is eligible for installment payments (required)
   * @return CustomerPaymentMethodsListResponse
   */
  @RequestLine("GET /customers/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
    "Accept: application/json",
  })
  CustomerPaymentMethodsListResponse listAllPaymentMethodsForACustomer(@Param("clientSecret") String clientSecret, @Param("acceptedCountry") List<String> acceptedCountry, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @Param("minimumAmount") Long minimumAmount, @Param("maximumAmount") Long maximumAmount, @Param("recurringPaymentEnabled") Boolean recurringPaymentEnabled, @Param("installmentPaymentEnabled") Boolean installmentPaymentEnabled);

  /**
   * List payment methods for a Customer
   * Similar to <code>listAllPaymentMethodsForACustomer</code> but it also returns the http response headers .
   * List payment methods for a Customer  To filter and list the applicable payment methods for a particular Customer ID
   * @param clientSecret A secret known only to your application and the authorization server (required)
   * @param acceptedCountry The two-letter ISO currency code (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param minimumAmount The minimum amount accepted for processing by the particular payment method. (required)
   * @param maximumAmount The maximum amount amount accepted for processing by the particular payment method. (required)
   * @param recurringPaymentEnabled Indicates whether the payment method is eligible for recurring payments (required)
   * @param installmentPaymentEnabled Indicates whether the payment method is eligible for installment payments (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /customers/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CustomerPaymentMethodsListResponse> listAllPaymentMethodsForACustomerWithHttpInfo(@Param("clientSecret") String clientSecret, @Param("acceptedCountry") List<String> acceptedCountry, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @Param("minimumAmount") Long minimumAmount, @Param("maximumAmount") Long maximumAmount, @Param("recurringPaymentEnabled") Boolean recurringPaymentEnabled, @Param("installmentPaymentEnabled") Boolean installmentPaymentEnabled);


  /**
   * List payment methods for a Customer
   * List payment methods for a Customer  To filter and list the applicable payment methods for a particular Customer ID
   * Note, this is equivalent to the other <code>listAllPaymentMethodsForACustomer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAllPaymentMethodsForACustomerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param clientSecret A secret known only to your application and the authorization server (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>acceptedCountry - The two-letter ISO currency code (required)</li>
   *   <li>minimumAmount - The minimum amount accepted for processing by the particular payment method. (required)</li>
   *   <li>maximumAmount - The maximum amount amount accepted for processing by the particular payment method. (required)</li>
   *   <li>recurringPaymentEnabled - Indicates whether the payment method is eligible for recurring payments (required)</li>
   *   <li>installmentPaymentEnabled - Indicates whether the payment method is eligible for installment payments (required)</li>
   *   </ul>
   * @return CustomerPaymentMethodsListResponse
   */
  @RequestLine("GET /customers/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
  "Accept: application/json",
  })
  CustomerPaymentMethodsListResponse listAllPaymentMethodsForACustomer(@Param("clientSecret") String clientSecret, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @QueryMap(encoded=true) ListAllPaymentMethodsForACustomerQueryParams queryParams);

  /**
  * List payment methods for a Customer
  * List payment methods for a Customer  To filter and list the applicable payment methods for a particular Customer ID
  * Note, this is equivalent to the other <code>listAllPaymentMethodsForACustomer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param clientSecret A secret known only to your application and the authorization server (required)
              * @param acceptedCurrency The three-letter ISO currency code (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>acceptedCountry - The two-letter ISO currency code (required)</li>
          *   <li>minimumAmount - The minimum amount accepted for processing by the particular payment method. (required)</li>
          *   <li>maximumAmount - The maximum amount amount accepted for processing by the particular payment method. (required)</li>
          *   <li>recurringPaymentEnabled - Indicates whether the payment method is eligible for recurring payments (required)</li>
          *   <li>installmentPaymentEnabled - Indicates whether the payment method is eligible for installment payments (required)</li>
      *   </ul>
          * @return CustomerPaymentMethodsListResponse
      */
      @RequestLine("GET /customers/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<CustomerPaymentMethodsListResponse> listAllPaymentMethodsForACustomerWithHttpInfo(@Param("clientSecret") String clientSecret, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @QueryMap(encoded=true) ListAllPaymentMethodsForACustomerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listAllPaymentMethodsForACustomer</code> method in a fluent style.
   */
  public static class ListAllPaymentMethodsForACustomerQueryParams extends HashMap<String, Object> {
    public ListAllPaymentMethodsForACustomerQueryParams acceptedCountry(final List<String> value) {
      put("accepted_country", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListAllPaymentMethodsForACustomerQueryParams minimumAmount(final Long value) {
      put("minimum_amount", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentMethodsForACustomerQueryParams maximumAmount(final Long value) {
      put("maximum_amount", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentMethodsForACustomerQueryParams recurringPaymentEnabled(final Boolean value) {
      put("recurring_payment_enabled", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentMethodsForACustomerQueryParams installmentPaymentEnabled(final Boolean value) {
      put("installment_payment_enabled", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List payment methods for a Customer
   * List payment methods for a Customer  To filter and list the applicable payment methods for a particular Customer ID
   * @param acceptedCountry The two-letter ISO currency code (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param minimumAmount The minimum amount accepted for processing by the particular payment method. (required)
   * @param maximumAmount The maximum amount amount accepted for processing by the particular payment method. (required)
   * @param recurringPaymentEnabled Indicates whether the payment method is eligible for recurring payments (required)
   * @param installmentPaymentEnabled Indicates whether the payment method is eligible for installment payments (required)
   * @return CustomerPaymentMethodsListResponse
   */
  @RequestLine("GET /customers/{customerId}/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
    "Accept: application/json",
  })
  CustomerPaymentMethodsListResponse listAllPaymentMethodsForACustomer_1(@Param("acceptedCountry") List<String> acceptedCountry, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @Param("minimumAmount") Long minimumAmount, @Param("maximumAmount") Long maximumAmount, @Param("recurringPaymentEnabled") Boolean recurringPaymentEnabled, @Param("installmentPaymentEnabled") Boolean installmentPaymentEnabled);

  /**
   * List payment methods for a Customer
   * Similar to <code>listAllPaymentMethodsForACustomer_0</code> but it also returns the http response headers .
   * List payment methods for a Customer  To filter and list the applicable payment methods for a particular Customer ID
   * @param acceptedCountry The two-letter ISO currency code (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param minimumAmount The minimum amount accepted for processing by the particular payment method. (required)
   * @param maximumAmount The maximum amount amount accepted for processing by the particular payment method. (required)
   * @param recurringPaymentEnabled Indicates whether the payment method is eligible for recurring payments (required)
   * @param installmentPaymentEnabled Indicates whether the payment method is eligible for installment payments (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /customers/{customerId}/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CustomerPaymentMethodsListResponse> listAllPaymentMethodsForACustomer_1WithHttpInfo(@Param("acceptedCountry") List<String> acceptedCountry, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @Param("minimumAmount") Long minimumAmount, @Param("maximumAmount") Long maximumAmount, @Param("recurringPaymentEnabled") Boolean recurringPaymentEnabled, @Param("installmentPaymentEnabled") Boolean installmentPaymentEnabled);


  /**
   * List payment methods for a Customer
   * List payment methods for a Customer  To filter and list the applicable payment methods for a particular Customer ID
   * Note, this is equivalent to the other <code>listAllPaymentMethodsForACustomer_0</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAllPaymentMethodsForACustomer0QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>acceptedCountry - The two-letter ISO currency code (required)</li>
   *   <li>minimumAmount - The minimum amount accepted for processing by the particular payment method. (required)</li>
   *   <li>maximumAmount - The maximum amount amount accepted for processing by the particular payment method. (required)</li>
   *   <li>recurringPaymentEnabled - Indicates whether the payment method is eligible for recurring payments (required)</li>
   *   <li>installmentPaymentEnabled - Indicates whether the payment method is eligible for installment payments (required)</li>
   *   </ul>
   * @return CustomerPaymentMethodsListResponse
   */
  @RequestLine("GET /customers/{customerId}/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
  "Accept: application/json",
  })
  CustomerPaymentMethodsListResponse listAllPaymentMethodsForACustomer_1(@Param("acceptedCurrency") List<Currency> acceptedCurrency, @QueryMap(encoded=true) ListAllPaymentMethodsForACustomer0QueryParams queryParams);

  /**
  * List payment methods for a Customer
  * List payment methods for a Customer  To filter and list the applicable payment methods for a particular Customer ID
  * Note, this is equivalent to the other <code>listAllPaymentMethodsForACustomer_0</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param acceptedCurrency The three-letter ISO currency code (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>acceptedCountry - The two-letter ISO currency code (required)</li>
          *   <li>minimumAmount - The minimum amount accepted for processing by the particular payment method. (required)</li>
          *   <li>maximumAmount - The maximum amount amount accepted for processing by the particular payment method. (required)</li>
          *   <li>recurringPaymentEnabled - Indicates whether the payment method is eligible for recurring payments (required)</li>
          *   <li>installmentPaymentEnabled - Indicates whether the payment method is eligible for installment payments (required)</li>
      *   </ul>
          * @return CustomerPaymentMethodsListResponse
      */
      @RequestLine("GET /customers/{customerId}/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<CustomerPaymentMethodsListResponse> listAllPaymentMethodsForACustomer_1WithHttpInfo(@Param("acceptedCurrency") List<Currency> acceptedCurrency, @QueryMap(encoded=true) ListAllPaymentMethodsForACustomer0QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listAllPaymentMethodsForACustomer_0</code> method in a fluent style.
   */
  public static class ListAllPaymentMethodsForACustomer0QueryParams extends HashMap<String, Object> {
    public ListAllPaymentMethodsForACustomer0QueryParams acceptedCountry(final List<String> value) {
      put("accepted_country", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListAllPaymentMethodsForACustomer0QueryParams minimumAmount(final Long value) {
      put("minimum_amount", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentMethodsForACustomer0QueryParams maximumAmount(final Long value) {
      put("maximum_amount", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentMethodsForACustomer0QueryParams recurringPaymentEnabled(final Boolean value) {
      put("recurring_payment_enabled", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentMethodsForACustomer0QueryParams installmentPaymentEnabled(final Boolean value) {
      put("installment_payment_enabled", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List payment methods for a Merchant
   * List payment methods for a Merchant  To filter and list the applicable payment methods for a particular Merchant ID
   * @param accountId The unique identifier for the merchant account (required)
   * @param acceptedCountry The two-letter ISO currency code (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param minimumAmount The minimum amount accepted for processing by the particular payment method. (required)
   * @param maximumAmount The maximum amount amount accepted for processing by the particular payment method. (required)
   * @param recurringPaymentEnabled Indicates whether the payment method is eligible for recurring payments (required)
   * @param installmentPaymentEnabled Indicates whether the payment method is eligible for installment payments (required)
   * @return PaymentMethodListResponse
   */
  @RequestLine("GET /account/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
    "Accept: application/json",
  })
  PaymentMethodListResponse listAllPaymentMethodsForAMerchant(@Param("accountId") String accountId, @Param("acceptedCountry") List<String> acceptedCountry, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @Param("minimumAmount") Long minimumAmount, @Param("maximumAmount") Long maximumAmount, @Param("recurringPaymentEnabled") Boolean recurringPaymentEnabled, @Param("installmentPaymentEnabled") Boolean installmentPaymentEnabled);

  /**
   * List payment methods for a Merchant
   * Similar to <code>listAllPaymentMethodsForAMerchant</code> but it also returns the http response headers .
   * List payment methods for a Merchant  To filter and list the applicable payment methods for a particular Merchant ID
   * @param accountId The unique identifier for the merchant account (required)
   * @param acceptedCountry The two-letter ISO currency code (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param minimumAmount The minimum amount accepted for processing by the particular payment method. (required)
   * @param maximumAmount The maximum amount amount accepted for processing by the particular payment method. (required)
   * @param recurringPaymentEnabled Indicates whether the payment method is eligible for recurring payments (required)
   * @param installmentPaymentEnabled Indicates whether the payment method is eligible for installment payments (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /account/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PaymentMethodListResponse> listAllPaymentMethodsForAMerchantWithHttpInfo(@Param("accountId") String accountId, @Param("acceptedCountry") List<String> acceptedCountry, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @Param("minimumAmount") Long minimumAmount, @Param("maximumAmount") Long maximumAmount, @Param("recurringPaymentEnabled") Boolean recurringPaymentEnabled, @Param("installmentPaymentEnabled") Boolean installmentPaymentEnabled);


  /**
   * List payment methods for a Merchant
   * List payment methods for a Merchant  To filter and list the applicable payment methods for a particular Merchant ID
   * Note, this is equivalent to the other <code>listAllPaymentMethodsForAMerchant</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAllPaymentMethodsForAMerchantQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId The unique identifier for the merchant account (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>acceptedCountry - The two-letter ISO currency code (required)</li>
   *   <li>minimumAmount - The minimum amount accepted for processing by the particular payment method. (required)</li>
   *   <li>maximumAmount - The maximum amount amount accepted for processing by the particular payment method. (required)</li>
   *   <li>recurringPaymentEnabled - Indicates whether the payment method is eligible for recurring payments (required)</li>
   *   <li>installmentPaymentEnabled - Indicates whether the payment method is eligible for installment payments (required)</li>
   *   </ul>
   * @return PaymentMethodListResponse
   */
  @RequestLine("GET /account/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
  "Accept: application/json",
  })
  PaymentMethodListResponse listAllPaymentMethodsForAMerchant(@Param("accountId") String accountId, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @QueryMap(encoded=true) ListAllPaymentMethodsForAMerchantQueryParams queryParams);

  /**
  * List payment methods for a Merchant
  * List payment methods for a Merchant  To filter and list the applicable payment methods for a particular Merchant ID
  * Note, this is equivalent to the other <code>listAllPaymentMethodsForAMerchant</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param accountId The unique identifier for the merchant account (required)
              * @param acceptedCurrency The three-letter ISO currency code (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>acceptedCountry - The two-letter ISO currency code (required)</li>
          *   <li>minimumAmount - The minimum amount accepted for processing by the particular payment method. (required)</li>
          *   <li>maximumAmount - The maximum amount amount accepted for processing by the particular payment method. (required)</li>
          *   <li>recurringPaymentEnabled - Indicates whether the payment method is eligible for recurring payments (required)</li>
          *   <li>installmentPaymentEnabled - Indicates whether the payment method is eligible for installment payments (required)</li>
      *   </ul>
          * @return PaymentMethodListResponse
      */
      @RequestLine("GET /account/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PaymentMethodListResponse> listAllPaymentMethodsForAMerchantWithHttpInfo(@Param("accountId") String accountId, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @QueryMap(encoded=true) ListAllPaymentMethodsForAMerchantQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listAllPaymentMethodsForAMerchant</code> method in a fluent style.
   */
  public static class ListAllPaymentMethodsForAMerchantQueryParams extends HashMap<String, Object> {
    public ListAllPaymentMethodsForAMerchantQueryParams acceptedCountry(final List<String> value) {
      put("accepted_country", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListAllPaymentMethodsForAMerchantQueryParams minimumAmount(final Long value) {
      put("minimum_amount", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentMethodsForAMerchantQueryParams maximumAmount(final Long value) {
      put("maximum_amount", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentMethodsForAMerchantQueryParams recurringPaymentEnabled(final Boolean value) {
      put("recurring_payment_enabled", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentMethodsForAMerchantQueryParams installmentPaymentEnabled(final Boolean value) {
      put("installment_payment_enabled", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Payment Method - Retrieve
   * Payment Method - Retrieve  To retrieve a payment method
   * @param methodId The unique identifier for the Payment Method (required)
   * @return PaymentMethodResponse
   */
  @RequestLine("GET /payment_methods/{methodId}")
  @Headers({
    "Accept: application/json",
  })
  PaymentMethodResponse retrieveAPaymentMethod(@Param("methodId") String methodId);

  /**
   * Payment Method - Retrieve
   * Similar to <code>retrieveAPaymentMethod</code> but it also returns the http response headers .
   * Payment Method - Retrieve  To retrieve a payment method
   * @param methodId The unique identifier for the Payment Method (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /payment_methods/{methodId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PaymentMethodResponse> retrieveAPaymentMethodWithHttpInfo(@Param("methodId") String methodId);



  /**
   * Payment Method - Update
   * Payment Method - Update  To update an existing payment method attached to a customer object. This API is useful for use cases such as updating the card number for expired cards to prevent discontinuity in recurring payments
   * @param methodId The unique identifier for the Payment Method (required)
   * @param paymentMethodUpdate  (required)
   * @return PaymentMethodResponse
   */
  @RequestLine("POST /payment_methods/{methodId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentMethodResponse updateAPaymentMethod(@Param("methodId") String methodId, PaymentMethodUpdate paymentMethodUpdate);

  /**
   * Payment Method - Update
   * Similar to <code>updateAPaymentMethod</code> but it also returns the http response headers .
   * Payment Method - Update  To update an existing payment method attached to a customer object. This API is useful for use cases such as updating the card number for expired cards to prevent discontinuity in recurring payments
   * @param methodId The unique identifier for the Payment Method (required)
   * @param paymentMethodUpdate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payment_methods/{methodId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentMethodResponse> updateAPaymentMethodWithHttpInfo(@Param("methodId") String methodId, PaymentMethodUpdate paymentMethodUpdate);


}
