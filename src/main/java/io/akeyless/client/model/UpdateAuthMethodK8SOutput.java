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
 * UpdateAuthMethodK8SOutput
 */

public class UpdateAuthMethodK8SOutput {
  public static final String SERIALIZED_NAME_PRV_KEY = "prv_key";
  @SerializedName(SERIALIZED_NAME_PRV_KEY)
  private String prvKey;


  public UpdateAuthMethodK8SOutput prvKey(String prvKey) {
    
    this.prvKey = prvKey;
    return this;
  }

   /**
   * Get prvKey
   * @return prvKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrvKey() {
    return prvKey;
  }


  public void setPrvKey(String prvKey) {
    this.prvKey = prvKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAuthMethodK8SOutput updateAuthMethodK8SOutput = (UpdateAuthMethodK8SOutput) o;
    return Objects.equals(this.prvKey, updateAuthMethodK8SOutput.prvKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prvKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAuthMethodK8SOutput {\n");
    sb.append("    prvKey: ").append(toIndentedString(prvKey)).append("\n");
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

