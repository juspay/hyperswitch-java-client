/*
 * Hyperswitch - API Documentation
 *  ## Get started  Hyperswitch provides a collection of APIs that enable you to process and manage payments. Our APIs accept and return JSON in the HTTP body, and return standard HTTP response codes.  You can consume the APIs directly using your favorite HTTP/REST library.  We have a testing environment referred to \"sandbox\", which you can setup to test API calls without affecting production data. Currently, our sandbox environment is live while our production environment is under development and will be available soon. You can sign up on our Dashboard to get API keys to access Hyperswitch API.  ### Environment  Use the following base URLs when making requests to the APIs:  | Environment   |  Base URL                          | |---------------|------------------------------------| | Sandbox       | <https://sandbox.hyperswitch.io>   | | Production    | <https://api.hyperswitch.io>       |  ## Authentication  When you sign up on our [dashboard](https://app.hyperswitch.io) and create a merchant account, you are given a secret key (also referred as api-key) and a publishable key. You may authenticate all API requests with Hyperswitch server by providing the appropriate key in the request Authorization header.  | Key             |  Description                                                                                  | |-----------------|-----------------------------------------------------------------------------------------------| | api-key         | Private key. Used to authenticate all API requests from your merchant server                  | | publishable key | Unique identifier for your account. Used to authenticate API requests from your app's client  |  Never share your secret api keys. Keep them guarded and secure. 
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: hyperswitch@juspay.in
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hyperswitch.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.hyperswitch.client.model.GpayAllowedPaymentMethods;
import com.hyperswitch.client.model.GpayMerchantInfo;
import com.hyperswitch.client.model.GpayTransactionInfo;
import com.hyperswitch.client.model.SdkNextAction;
import com.hyperswitch.client.model.SecretInfoToInitiateSdk;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GooglePaySessionResponse
 */
@JsonPropertyOrder({
  GooglePaySessionResponse.JSON_PROPERTY_MERCHANT_INFO,
  GooglePaySessionResponse.JSON_PROPERTY_ALLOWED_PAYMENT_METHODS,
  GooglePaySessionResponse.JSON_PROPERTY_TRANSACTION_INFO,
  GooglePaySessionResponse.JSON_PROPERTY_DELAYED_SESSION_TOKEN,
  GooglePaySessionResponse.JSON_PROPERTY_CONNECTOR,
  GooglePaySessionResponse.JSON_PROPERTY_SDK_NEXT_ACTION,
  GooglePaySessionResponse.JSON_PROPERTY_SECRETS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class GooglePaySessionResponse {
  public static final String JSON_PROPERTY_MERCHANT_INFO = "merchant_info";
  private GpayMerchantInfo merchantInfo;

  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_METHODS = "allowed_payment_methods";
  private List<GpayAllowedPaymentMethods> allowedPaymentMethods = new ArrayList<>();

  public static final String JSON_PROPERTY_TRANSACTION_INFO = "transaction_info";
  private GpayTransactionInfo transactionInfo;

  public static final String JSON_PROPERTY_DELAYED_SESSION_TOKEN = "delayed_session_token";
  private Boolean delayedSessionToken;

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private String connector;

  public static final String JSON_PROPERTY_SDK_NEXT_ACTION = "sdk_next_action";
  private SdkNextAction sdkNextAction;

  public static final String JSON_PROPERTY_SECRETS = "secrets";
  private JsonNullable<SecretInfoToInitiateSdk> secrets = JsonNullable.<SecretInfoToInitiateSdk>undefined();

  public GooglePaySessionResponse() {
  }

  public GooglePaySessionResponse merchantInfo(GpayMerchantInfo merchantInfo) {
    
    this.merchantInfo = merchantInfo;
    return this;
  }

   /**
   * Get merchantInfo
   * @return merchantInfo
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GpayMerchantInfo getMerchantInfo() {
    return merchantInfo;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantInfo(GpayMerchantInfo merchantInfo) {
    this.merchantInfo = merchantInfo;
  }


  public GooglePaySessionResponse allowedPaymentMethods(List<GpayAllowedPaymentMethods> allowedPaymentMethods) {
    
    this.allowedPaymentMethods = allowedPaymentMethods;
    return this;
  }

  public GooglePaySessionResponse addAllowedPaymentMethodsItem(GpayAllowedPaymentMethods allowedPaymentMethodsItem) {
    if (this.allowedPaymentMethods == null) {
      this.allowedPaymentMethods = new ArrayList<>();
    }
    this.allowedPaymentMethods.add(allowedPaymentMethodsItem);
    return this;
  }

   /**
   * List of the allowed payment meythods
   * @return allowedPaymentMethods
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<GpayAllowedPaymentMethods> getAllowedPaymentMethods() {
    return allowedPaymentMethods;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowedPaymentMethods(List<GpayAllowedPaymentMethods> allowedPaymentMethods) {
    this.allowedPaymentMethods = allowedPaymentMethods;
  }


  public GooglePaySessionResponse transactionInfo(GpayTransactionInfo transactionInfo) {
    
    this.transactionInfo = transactionInfo;
    return this;
  }

   /**
   * Get transactionInfo
   * @return transactionInfo
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSACTION_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GpayTransactionInfo getTransactionInfo() {
    return transactionInfo;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionInfo(GpayTransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
  }


  public GooglePaySessionResponse delayedSessionToken(Boolean delayedSessionToken) {
    
    this.delayedSessionToken = delayedSessionToken;
    return this;
  }

   /**
   * Identifier for the delayed session response
   * @return delayedSessionToken
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DELAYED_SESSION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDelayedSessionToken() {
    return delayedSessionToken;
  }


  @JsonProperty(JSON_PROPERTY_DELAYED_SESSION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDelayedSessionToken(Boolean delayedSessionToken) {
    this.delayedSessionToken = delayedSessionToken;
  }


  public GooglePaySessionResponse connector(String connector) {
    
    this.connector = connector;
    return this;
  }

   /**
   * The name of the connector
   * @return connector
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnector() {
    return connector;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnector(String connector) {
    this.connector = connector;
  }


  public GooglePaySessionResponse sdkNextAction(SdkNextAction sdkNextAction) {
    
    this.sdkNextAction = sdkNextAction;
    return this;
  }

   /**
   * Get sdkNextAction
   * @return sdkNextAction
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SDK_NEXT_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SdkNextAction getSdkNextAction() {
    return sdkNextAction;
  }


  @JsonProperty(JSON_PROPERTY_SDK_NEXT_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSdkNextAction(SdkNextAction sdkNextAction) {
    this.sdkNextAction = sdkNextAction;
  }


  public GooglePaySessionResponse secrets(SecretInfoToInitiateSdk secrets) {
    this.secrets = JsonNullable.<SecretInfoToInitiateSdk>of(secrets);
    
    return this;
  }

   /**
   * Get secrets
   * @return secrets
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public SecretInfoToInitiateSdk getSecrets() {
        return secrets.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECRETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SecretInfoToInitiateSdk> getSecrets_JsonNullable() {
    return secrets;
  }
  
  @JsonProperty(JSON_PROPERTY_SECRETS)
  public void setSecrets_JsonNullable(JsonNullable<SecretInfoToInitiateSdk> secrets) {
    this.secrets = secrets;
  }

  public void setSecrets(SecretInfoToInitiateSdk secrets) {
    this.secrets = JsonNullable.<SecretInfoToInitiateSdk>of(secrets);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GooglePaySessionResponse googlePaySessionResponse = (GooglePaySessionResponse) o;
    return Objects.equals(this.merchantInfo, googlePaySessionResponse.merchantInfo) &&
        Objects.equals(this.allowedPaymentMethods, googlePaySessionResponse.allowedPaymentMethods) &&
        Objects.equals(this.transactionInfo, googlePaySessionResponse.transactionInfo) &&
        Objects.equals(this.delayedSessionToken, googlePaySessionResponse.delayedSessionToken) &&
        Objects.equals(this.connector, googlePaySessionResponse.connector) &&
        Objects.equals(this.sdkNextAction, googlePaySessionResponse.sdkNextAction) &&
        equalsNullable(this.secrets, googlePaySessionResponse.secrets);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantInfo, allowedPaymentMethods, transactionInfo, delayedSessionToken, connector, sdkNextAction, hashCodeNullable(secrets));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GooglePaySessionResponse {\n");
    sb.append("    merchantInfo: ").append(toIndentedString(merchantInfo)).append("\n");
    sb.append("    allowedPaymentMethods: ").append(toIndentedString(allowedPaymentMethods)).append("\n");
    sb.append("    transactionInfo: ").append(toIndentedString(transactionInfo)).append("\n");
    sb.append("    delayedSessionToken: ").append(toIndentedString(delayedSessionToken)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    sdkNextAction: ").append(toIndentedString(sdkNextAction)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

