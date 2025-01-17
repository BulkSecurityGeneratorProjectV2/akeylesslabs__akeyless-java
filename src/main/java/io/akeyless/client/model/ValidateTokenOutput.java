/*
 * Akeyless API
 * The purpose of this application is to provide access to Akeyless API.
 *
 * The version of the OpenAPI document: 2.0
 * Contact: support@akeyless.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.akeyless.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ValidateTokenOutput
 */

public class ValidateTokenOutput {
  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private String expiration;

  public static final String SERIALIZED_NAME_IS_VALID = "is_valid";
  @SerializedName(SERIALIZED_NAME_IS_VALID)
  private Boolean isValid;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;


  public ValidateTokenOutput expiration(String expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpiration() {
    return expiration;
  }


  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }


  public ValidateTokenOutput isValid(Boolean isValid) {
    
    this.isValid = isValid;
    return this;
  }

   /**
   * Get isValid
   * @return isValid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsValid() {
    return isValid;
  }


  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }


  public ValidateTokenOutput reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateTokenOutput validateTokenOutput = (ValidateTokenOutput) o;
    return Objects.equals(this.expiration, validateTokenOutput.expiration) &&
        Objects.equals(this.isValid, validateTokenOutput.isValid) &&
        Objects.equals(this.reason, validateTokenOutput.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiration, isValid, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateTokenOutput {\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

