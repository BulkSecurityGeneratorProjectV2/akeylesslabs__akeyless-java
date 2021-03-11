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
 * APIKeyAccessRules
 */

public class APIKeyAccessRules {
  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  private String alg;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;


  public APIKeyAccessRules alg(String alg) {
    
    this.alg = alg;
    return this;
  }

   /**
   * Get alg
   * @return alg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlg() {
    return alg;
  }


  public void setAlg(String alg) {
    this.alg = alg;
  }


  public APIKeyAccessRules key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The public key value of the API-key.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public key value of the API-key.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIKeyAccessRules apIKeyAccessRules = (APIKeyAccessRules) o;
    return Objects.equals(this.alg, apIKeyAccessRules.alg) &&
        Objects.equals(this.key, apIKeyAccessRules.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIKeyAccessRules {\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
