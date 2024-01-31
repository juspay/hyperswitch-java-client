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
 * BankRedirectBilling
 */
@JsonPropertyOrder({
  BankRedirectBilling.JSON_PROPERTY_BILLING_NAME,
  BankRedirectBilling.JSON_PROPERTY_EMAIL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class BankRedirectBilling {
  public static final String JSON_PROPERTY_BILLING_NAME = "billing_name";
  private String billingName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public BankRedirectBilling() {
  }

  public BankRedirectBilling billingName(String billingName) {
    
    this.billingName = billingName;
    return this;
  }

   /**
   * The name for which billing is issued
   * @return billingName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BILLING_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBillingName() {
    return billingName;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBillingName(String billingName) {
    this.billingName = billingName;
  }


  public BankRedirectBilling email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The billing email for bank redirect
   * @return email
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankRedirectBilling bankRedirectBilling = (BankRedirectBilling) o;
    return Objects.equals(this.billingName, bankRedirectBilling.billingName) &&
        Objects.equals(this.email, bankRedirectBilling.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingName, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankRedirectBilling {\n");
    sb.append("    billingName: ").append(toIndentedString(billingName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
