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
import com.hyperswitch.client.model.AttemptStatus;
import com.hyperswitch.client.model.AuthenticationType;
import com.hyperswitch.client.model.CaptureMethod;
import com.hyperswitch.client.model.Currency;
import com.hyperswitch.client.model.PaymentExperience;
import com.hyperswitch.client.model.PaymentMethod;
import com.hyperswitch.client.model.PaymentMethodType;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PaymentAttemptResponse
 */
@JsonPropertyOrder({
  PaymentAttemptResponse.JSON_PROPERTY_ATTEMPT_ID,
  PaymentAttemptResponse.JSON_PROPERTY_STATUS,
  PaymentAttemptResponse.JSON_PROPERTY_AMOUNT,
  PaymentAttemptResponse.JSON_PROPERTY_CURRENCY,
  PaymentAttemptResponse.JSON_PROPERTY_CONNECTOR,
  PaymentAttemptResponse.JSON_PROPERTY_ERROR_MESSAGE,
  PaymentAttemptResponse.JSON_PROPERTY_PAYMENT_METHOD,
  PaymentAttemptResponse.JSON_PROPERTY_CONNECTOR_TRANSACTION_ID,
  PaymentAttemptResponse.JSON_PROPERTY_CAPTURE_METHOD,
  PaymentAttemptResponse.JSON_PROPERTY_AUTHENTICATION_TYPE,
  PaymentAttemptResponse.JSON_PROPERTY_CANCELLATION_REASON,
  PaymentAttemptResponse.JSON_PROPERTY_MANDATE_ID,
  PaymentAttemptResponse.JSON_PROPERTY_ERROR_CODE,
  PaymentAttemptResponse.JSON_PROPERTY_PAYMENT_TOKEN,
  PaymentAttemptResponse.JSON_PROPERTY_CONNECTOR_METADATA,
  PaymentAttemptResponse.JSON_PROPERTY_PAYMENT_EXPERIENCE,
  PaymentAttemptResponse.JSON_PROPERTY_PAYMENT_METHOD_TYPE,
  PaymentAttemptResponse.JSON_PROPERTY_REFERENCE_ID,
  PaymentAttemptResponse.JSON_PROPERTY_UNIFIED_CODE,
  PaymentAttemptResponse.JSON_PROPERTY_UNIFIED_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class PaymentAttemptResponse {
  public static final String JSON_PROPERTY_ATTEMPT_ID = "attempt_id";
  private String attemptId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private AttemptStatus status;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private JsonNullable<Currency> currency = JsonNullable.<Currency>undefined();

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private JsonNullable<String> connector = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "payment_method";
  private JsonNullable<PaymentMethod> paymentMethod = JsonNullable.<PaymentMethod>undefined();

  public static final String JSON_PROPERTY_CONNECTOR_TRANSACTION_ID = "connector_transaction_id";
  private JsonNullable<String> connectorTransactionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CAPTURE_METHOD = "capture_method";
  private JsonNullable<CaptureMethod> captureMethod = JsonNullable.<CaptureMethod>undefined();

  public static final String JSON_PROPERTY_AUTHENTICATION_TYPE = "authentication_type";
  private JsonNullable<AuthenticationType> authenticationType = JsonNullable.<AuthenticationType>of(AuthenticationType.THREE_DS);

  public static final String JSON_PROPERTY_CANCELLATION_REASON = "cancellation_reason";
  private JsonNullable<String> cancellationReason = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MANDATE_ID = "mandate_id";
  private JsonNullable<String> mandateId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ERROR_CODE = "error_code";
  private JsonNullable<String> errorCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAYMENT_TOKEN = "payment_token";
  private JsonNullable<String> paymentToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONNECTOR_METADATA = "connector_metadata";
  private JsonNullable<Object> connectorMetadata = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PAYMENT_EXPERIENCE = "payment_experience";
  private JsonNullable<PaymentExperience> paymentExperience = JsonNullable.<PaymentExperience>undefined();

  public static final String JSON_PROPERTY_PAYMENT_METHOD_TYPE = "payment_method_type";
  private JsonNullable<PaymentMethodType> paymentMethodType = JsonNullable.<PaymentMethodType>undefined();

  public static final String JSON_PROPERTY_REFERENCE_ID = "reference_id";
  private JsonNullable<String> referenceId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UNIFIED_CODE = "unified_code";
  private JsonNullable<String> unifiedCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UNIFIED_MESSAGE = "unified_message";
  private JsonNullable<String> unifiedMessage = JsonNullable.<String>undefined();

  public PaymentAttemptResponse() {
  }

  public PaymentAttemptResponse attemptId(String attemptId) {
    
    this.attemptId = attemptId;
    return this;
  }

   /**
   * Unique identifier for the attempt
   * @return attemptId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAttemptId() {
    return attemptId;
  }


  @JsonProperty(JSON_PROPERTY_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttemptId(String attemptId) {
    this.attemptId = attemptId;
  }


  public PaymentAttemptResponse status(AttemptStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AttemptStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(AttemptStatus status) {
    this.status = status;
  }


  public PaymentAttemptResponse amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The payment attempt amount. Amount for the payment in lowest denomination of the currency. (i.e) in cents for USD denomination, in paisa for INR denomination etc.,
   * @return amount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public PaymentAttemptResponse currency(Currency currency) {
    this.currency = JsonNullable.<Currency>of(currency);
    
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Currency getCurrency() {
        return currency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Currency> getCurrency_JsonNullable() {
    return currency;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  public void setCurrency_JsonNullable(JsonNullable<Currency> currency) {
    this.currency = currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = JsonNullable.<Currency>of(currency);
  }


  public PaymentAttemptResponse connector(String connector) {
    this.connector = JsonNullable.<String>of(connector);
    
    return this;
  }

   /**
   * The connector used for the payment
   * @return connector
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getConnector() {
        return connector.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getConnector_JsonNullable() {
    return connector;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  public void setConnector_JsonNullable(JsonNullable<String> connector) {
    this.connector = connector;
  }

  public void setConnector(String connector) {
    this.connector = JsonNullable.<String>of(connector);
  }


  public PaymentAttemptResponse errorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
    
    return this;
  }

   /**
   * If there was an error while calling the connector the error message is received here
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getErrorMessage() {
        return errorMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getErrorMessage_JsonNullable() {
    return errorMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  public void setErrorMessage_JsonNullable(JsonNullable<String> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
  }


  public PaymentAttemptResponse paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = JsonNullable.<PaymentMethod>of(paymentMethod);
    
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public PaymentMethod getPaymentMethod() {
        return paymentMethod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PaymentMethod> getPaymentMethod_JsonNullable() {
    return paymentMethod;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  public void setPaymentMethod_JsonNullable(JsonNullable<PaymentMethod> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = JsonNullable.<PaymentMethod>of(paymentMethod);
  }


  public PaymentAttemptResponse connectorTransactionId(String connectorTransactionId) {
    this.connectorTransactionId = JsonNullable.<String>of(connectorTransactionId);
    
    return this;
  }

   /**
   * A unique identifier for a payment provided by the connector
   * @return connectorTransactionId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getConnectorTransactionId() {
        return connectorTransactionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getConnectorTransactionId_JsonNullable() {
    return connectorTransactionId;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_TRANSACTION_ID)
  public void setConnectorTransactionId_JsonNullable(JsonNullable<String> connectorTransactionId) {
    this.connectorTransactionId = connectorTransactionId;
  }

  public void setConnectorTransactionId(String connectorTransactionId) {
    this.connectorTransactionId = JsonNullable.<String>of(connectorTransactionId);
  }


  public PaymentAttemptResponse captureMethod(CaptureMethod captureMethod) {
    this.captureMethod = JsonNullable.<CaptureMethod>of(captureMethod);
    
    return this;
  }

   /**
   * Get captureMethod
   * @return captureMethod
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public CaptureMethod getCaptureMethod() {
        return captureMethod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CAPTURE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CaptureMethod> getCaptureMethod_JsonNullable() {
    return captureMethod;
  }
  
  @JsonProperty(JSON_PROPERTY_CAPTURE_METHOD)
  public void setCaptureMethod_JsonNullable(JsonNullable<CaptureMethod> captureMethod) {
    this.captureMethod = captureMethod;
  }

  public void setCaptureMethod(CaptureMethod captureMethod) {
    this.captureMethod = JsonNullable.<CaptureMethod>of(captureMethod);
  }


  public PaymentAttemptResponse authenticationType(AuthenticationType authenticationType) {
    this.authenticationType = JsonNullable.<AuthenticationType>of(authenticationType);
    
    return this;
  }

   /**
   * Get authenticationType
   * @return authenticationType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public AuthenticationType getAuthenticationType() {
        return authenticationType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AuthenticationType> getAuthenticationType_JsonNullable() {
    return authenticationType;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_TYPE)
  public void setAuthenticationType_JsonNullable(JsonNullable<AuthenticationType> authenticationType) {
    this.authenticationType = authenticationType;
  }

  public void setAuthenticationType(AuthenticationType authenticationType) {
    this.authenticationType = JsonNullable.<AuthenticationType>of(authenticationType);
  }


  public PaymentAttemptResponse cancellationReason(String cancellationReason) {
    this.cancellationReason = JsonNullable.<String>of(cancellationReason);
    
    return this;
  }

   /**
   * If the payment was cancelled the reason provided here
   * @return cancellationReason
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCancellationReason() {
        return cancellationReason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CANCELLATION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCancellationReason_JsonNullable() {
    return cancellationReason;
  }
  
  @JsonProperty(JSON_PROPERTY_CANCELLATION_REASON)
  public void setCancellationReason_JsonNullable(JsonNullable<String> cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = JsonNullable.<String>of(cancellationReason);
  }


  public PaymentAttemptResponse mandateId(String mandateId) {
    this.mandateId = JsonNullable.<String>of(mandateId);
    
    return this;
  }

   /**
   * A unique identifier to link the payment to a mandate, can be use instead of payment_method_data
   * @return mandateId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMandateId() {
        return mandateId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MANDATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMandateId_JsonNullable() {
    return mandateId;
  }
  
  @JsonProperty(JSON_PROPERTY_MANDATE_ID)
  public void setMandateId_JsonNullable(JsonNullable<String> mandateId) {
    this.mandateId = mandateId;
  }

  public void setMandateId(String mandateId) {
    this.mandateId = JsonNullable.<String>of(mandateId);
  }


  public PaymentAttemptResponse errorCode(String errorCode) {
    this.errorCode = JsonNullable.<String>of(errorCode);
    
    return this;
  }

   /**
   * If there was an error while calling the connectors the code is received here
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getErrorCode() {
        return errorCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getErrorCode_JsonNullable() {
    return errorCode;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  public void setErrorCode_JsonNullable(JsonNullable<String> errorCode) {
    this.errorCode = errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = JsonNullable.<String>of(errorCode);
  }


  public PaymentAttemptResponse paymentToken(String paymentToken) {
    this.paymentToken = JsonNullable.<String>of(paymentToken);
    
    return this;
  }

   /**
   * Provide a reference to a stored payment method
   * @return paymentToken
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPaymentToken() {
        return paymentToken.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPaymentToken_JsonNullable() {
    return paymentToken;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_TOKEN)
  public void setPaymentToken_JsonNullable(JsonNullable<String> paymentToken) {
    this.paymentToken = paymentToken;
  }

  public void setPaymentToken(String paymentToken) {
    this.paymentToken = JsonNullable.<String>of(paymentToken);
  }


  public PaymentAttemptResponse connectorMetadata(Object connectorMetadata) {
    this.connectorMetadata = JsonNullable.<Object>of(connectorMetadata);
    
    return this;
  }

   /**
   * additional data related to some connectors
   * @return connectorMetadata
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getConnectorMetadata() {
        return connectorMetadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getConnectorMetadata_JsonNullable() {
    return connectorMetadata;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_METADATA)
  public void setConnectorMetadata_JsonNullable(JsonNullable<Object> connectorMetadata) {
    this.connectorMetadata = connectorMetadata;
  }

  public void setConnectorMetadata(Object connectorMetadata) {
    this.connectorMetadata = JsonNullable.<Object>of(connectorMetadata);
  }


  public PaymentAttemptResponse paymentExperience(PaymentExperience paymentExperience) {
    this.paymentExperience = JsonNullable.<PaymentExperience>of(paymentExperience);
    
    return this;
  }

   /**
   * Get paymentExperience
   * @return paymentExperience
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public PaymentExperience getPaymentExperience() {
        return paymentExperience.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_EXPERIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PaymentExperience> getPaymentExperience_JsonNullable() {
    return paymentExperience;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_EXPERIENCE)
  public void setPaymentExperience_JsonNullable(JsonNullable<PaymentExperience> paymentExperience) {
    this.paymentExperience = paymentExperience;
  }

  public void setPaymentExperience(PaymentExperience paymentExperience) {
    this.paymentExperience = JsonNullable.<PaymentExperience>of(paymentExperience);
  }


  public PaymentAttemptResponse paymentMethodType(PaymentMethodType paymentMethodType) {
    this.paymentMethodType = JsonNullable.<PaymentMethodType>of(paymentMethodType);
    
    return this;
  }

   /**
   * Get paymentMethodType
   * @return paymentMethodType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PaymentMethodType> getPaymentMethodType_JsonNullable() {
    return paymentMethodType;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  public void setPaymentMethodType_JsonNullable(JsonNullable<PaymentMethodType> paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
    this.paymentMethodType = JsonNullable.<PaymentMethodType>of(paymentMethodType);
  }


  public PaymentAttemptResponse referenceId(String referenceId) {
    this.referenceId = JsonNullable.<String>of(referenceId);
    
    return this;
  }

   /**
   * reference to the payment at connector side
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getReferenceId() {
        return referenceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReferenceId_JsonNullable() {
    return referenceId;
  }
  
  @JsonProperty(JSON_PROPERTY_REFERENCE_ID)
  public void setReferenceId_JsonNullable(JsonNullable<String> referenceId) {
    this.referenceId = referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = JsonNullable.<String>of(referenceId);
  }


  public PaymentAttemptResponse unifiedCode(String unifiedCode) {
    this.unifiedCode = JsonNullable.<String>of(unifiedCode);
    
    return this;
  }

   /**
   * error code unified across the connectors is received here if there was an error while calling connector
   * @return unifiedCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUnifiedCode() {
        return unifiedCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIFIED_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUnifiedCode_JsonNullable() {
    return unifiedCode;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIFIED_CODE)
  public void setUnifiedCode_JsonNullable(JsonNullable<String> unifiedCode) {
    this.unifiedCode = unifiedCode;
  }

  public void setUnifiedCode(String unifiedCode) {
    this.unifiedCode = JsonNullable.<String>of(unifiedCode);
  }


  public PaymentAttemptResponse unifiedMessage(String unifiedMessage) {
    this.unifiedMessage = JsonNullable.<String>of(unifiedMessage);
    
    return this;
  }

   /**
   * error message unified across the connectors is received here if there was an error while calling connector
   * @return unifiedMessage
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUnifiedMessage() {
        return unifiedMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIFIED_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUnifiedMessage_JsonNullable() {
    return unifiedMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIFIED_MESSAGE)
  public void setUnifiedMessage_JsonNullable(JsonNullable<String> unifiedMessage) {
    this.unifiedMessage = unifiedMessage;
  }

  public void setUnifiedMessage(String unifiedMessage) {
    this.unifiedMessage = JsonNullable.<String>of(unifiedMessage);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAttemptResponse paymentAttemptResponse = (PaymentAttemptResponse) o;
    return Objects.equals(this.attemptId, paymentAttemptResponse.attemptId) &&
        Objects.equals(this.status, paymentAttemptResponse.status) &&
        Objects.equals(this.amount, paymentAttemptResponse.amount) &&
        equalsNullable(this.currency, paymentAttemptResponse.currency) &&
        equalsNullable(this.connector, paymentAttemptResponse.connector) &&
        equalsNullable(this.errorMessage, paymentAttemptResponse.errorMessage) &&
        equalsNullable(this.paymentMethod, paymentAttemptResponse.paymentMethod) &&
        equalsNullable(this.connectorTransactionId, paymentAttemptResponse.connectorTransactionId) &&
        equalsNullable(this.captureMethod, paymentAttemptResponse.captureMethod) &&
        equalsNullable(this.authenticationType, paymentAttemptResponse.authenticationType) &&
        equalsNullable(this.cancellationReason, paymentAttemptResponse.cancellationReason) &&
        equalsNullable(this.mandateId, paymentAttemptResponse.mandateId) &&
        equalsNullable(this.errorCode, paymentAttemptResponse.errorCode) &&
        equalsNullable(this.paymentToken, paymentAttemptResponse.paymentToken) &&
        equalsNullable(this.connectorMetadata, paymentAttemptResponse.connectorMetadata) &&
        equalsNullable(this.paymentExperience, paymentAttemptResponse.paymentExperience) &&
        equalsNullable(this.paymentMethodType, paymentAttemptResponse.paymentMethodType) &&
        equalsNullable(this.referenceId, paymentAttemptResponse.referenceId) &&
        equalsNullable(this.unifiedCode, paymentAttemptResponse.unifiedCode) &&
        equalsNullable(this.unifiedMessage, paymentAttemptResponse.unifiedMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptId, status, amount, hashCodeNullable(currency), hashCodeNullable(connector), hashCodeNullable(errorMessage), hashCodeNullable(paymentMethod), hashCodeNullable(connectorTransactionId), hashCodeNullable(captureMethod), hashCodeNullable(authenticationType), hashCodeNullable(cancellationReason), hashCodeNullable(mandateId), hashCodeNullable(errorCode), hashCodeNullable(paymentToken), hashCodeNullable(connectorMetadata), hashCodeNullable(paymentExperience), hashCodeNullable(paymentMethodType), hashCodeNullable(referenceId), hashCodeNullable(unifiedCode), hashCodeNullable(unifiedMessage));
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
    sb.append("class PaymentAttemptResponse {\n");
    sb.append("    attemptId: ").append(toIndentedString(attemptId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    connectorTransactionId: ").append(toIndentedString(connectorTransactionId)).append("\n");
    sb.append("    captureMethod: ").append(toIndentedString(captureMethod)).append("\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    mandateId: ").append(toIndentedString(mandateId)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    connectorMetadata: ").append(toIndentedString(connectorMetadata)).append("\n");
    sb.append("    paymentExperience: ").append(toIndentedString(paymentExperience)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    unifiedCode: ").append(toIndentedString(unifiedCode)).append("\n");
    sb.append("    unifiedMessage: ").append(toIndentedString(unifiedMessage)).append("\n");
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
