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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AchTransfer
 */
@JsonPropertyOrder({
  AchTransfer.JSON_PROPERTY_ACCOUNT_NUMBER,
  AchTransfer.JSON_PROPERTY_BANK_NAME,
  AchTransfer.JSON_PROPERTY_ROUTING_NUMBER,
  AchTransfer.JSON_PROPERTY_SWIFT_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class AchTransfer {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "account_number";
  private String accountNumber;

  public static final String JSON_PROPERTY_BANK_NAME = "bank_name";
  private String bankName;

  public static final String JSON_PROPERTY_ROUTING_NUMBER = "routing_number";
  private String routingNumber;

  public static final String JSON_PROPERTY_SWIFT_CODE = "swift_code";
  private String swiftCode;

  public AchTransfer() {
  }

  public AchTransfer accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public AchTransfer bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBankName() {
    return bankName;
  }


  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public AchTransfer routingNumber(String routingNumber) {
    
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRoutingNumber() {
    return routingNumber;
  }


  @JsonProperty(JSON_PROPERTY_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }


  public AchTransfer swiftCode(String swiftCode) {
    
    this.swiftCode = swiftCode;
    return this;
  }

   /**
   * Get swiftCode
   * @return swiftCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SWIFT_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSwiftCode() {
    return swiftCode;
  }


  @JsonProperty(JSON_PROPERTY_SWIFT_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSwiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AchTransfer achTransfer = (AchTransfer) o;
    return Objects.equals(this.accountNumber, achTransfer.accountNumber) &&
        Objects.equals(this.bankName, achTransfer.bankName) &&
        Objects.equals(this.routingNumber, achTransfer.routingNumber) &&
        Objects.equals(this.swiftCode, achTransfer.swiftCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, bankName, routingNumber, swiftCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchTransfer {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    swiftCode: ").append(toIndentedString(swiftCode)).append("\n");
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
