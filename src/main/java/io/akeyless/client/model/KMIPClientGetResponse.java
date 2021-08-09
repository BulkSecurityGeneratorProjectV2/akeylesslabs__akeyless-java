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
import io.akeyless.client.model.KMIPClient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * KMIPClientGetResponse
 */

public class KMIPClientGetResponse {
  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private KMIPClient client;


  public KMIPClientGetResponse client(KMIPClient client) {
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KMIPClient getClient() {
    return client;
  }


  public void setClient(KMIPClient client) {
    this.client = client;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KMIPClientGetResponse kmIPClientGetResponse = (KMIPClientGetResponse) o;
    return Objects.equals(this.client, kmIPClientGetResponse.client);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KMIPClientGetResponse {\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
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

