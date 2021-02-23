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
import io.akeyless.client.model.K8SPayload;
import io.akeyless.client.model.MigrationGeneral;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * K8SMigration
 */

public class K8SMigration {
  public static final String SERIALIZED_NAME_GENERAL = "general";
  @SerializedName(SERIALIZED_NAME_GENERAL)
  private MigrationGeneral general;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private K8SPayload payload;


  public K8SMigration general(MigrationGeneral general) {
    
    this.general = general;
    return this;
  }

   /**
   * Get general
   * @return general
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MigrationGeneral getGeneral() {
    return general;
  }


  public void setGeneral(MigrationGeneral general) {
    this.general = general;
  }


  public K8SMigration payload(K8SPayload payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public K8SPayload getPayload() {
    return payload;
  }


  public void setPayload(K8SPayload payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    K8SMigration k8SMigration = (K8SMigration) o;
    return Objects.equals(this.general, k8SMigration.general) &&
        Objects.equals(this.payload, k8SMigration.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(general, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class K8SMigration {\n");
    sb.append("    general: ").append(toIndentedString(general)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

