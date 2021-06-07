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
import org.threeten.bp.OffsetDateTime;

/**
 * ClassicKeyStatusInfo
 */

public class ClassicKeyStatusInfo {
  public static final String SERIALIZED_NAME_ERROR_DATE = "error_date";
  @SerializedName(SERIALIZED_NAME_ERROR_DATE)
  private OffsetDateTime errorDate;

  public static final String SERIALIZED_NAME_LAST_ERROR = "last_error";
  @SerializedName(SERIALIZED_NAME_LAST_ERROR)
  private String lastError;

  public static final String SERIALIZED_NAME_LAST_STATUS = "last_status";
  @SerializedName(SERIALIZED_NAME_LAST_STATUS)
  private String lastStatus;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Long version;


  public ClassicKeyStatusInfo errorDate(OffsetDateTime errorDate) {
    
    this.errorDate = errorDate;
    return this;
  }

   /**
   * Get errorDate
   * @return errorDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getErrorDate() {
    return errorDate;
  }


  public void setErrorDate(OffsetDateTime errorDate) {
    this.errorDate = errorDate;
  }


  public ClassicKeyStatusInfo lastError(String lastError) {
    
    this.lastError = lastError;
    return this;
  }

   /**
   * Get lastError
   * @return lastError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastError() {
    return lastError;
  }


  public void setLastError(String lastError) {
    this.lastError = lastError;
  }


  public ClassicKeyStatusInfo lastStatus(String lastStatus) {
    
    this.lastStatus = lastStatus;
    return this;
  }

   /**
   * ClassicKeyTargetStatus defines status of managed key target
   * @return lastStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ClassicKeyTargetStatus defines status of managed key target")

  public String getLastStatus() {
    return lastStatus;
  }


  public void setLastStatus(String lastStatus) {
    this.lastStatus = lastStatus;
  }


  public ClassicKeyStatusInfo version(Long version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getVersion() {
    return version;
  }


  public void setVersion(Long version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassicKeyStatusInfo classicKeyStatusInfo = (ClassicKeyStatusInfo) o;
    return Objects.equals(this.errorDate, classicKeyStatusInfo.errorDate) &&
        Objects.equals(this.lastError, classicKeyStatusInfo.lastError) &&
        Objects.equals(this.lastStatus, classicKeyStatusInfo.lastStatus) &&
        Objects.equals(this.version, classicKeyStatusInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDate, lastError, lastStatus, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassicKeyStatusInfo {\n");
    sb.append("    errorDate: ").append(toIndentedString(errorDate)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
    sb.append("    lastStatus: ").append(toIndentedString(lastStatus)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
