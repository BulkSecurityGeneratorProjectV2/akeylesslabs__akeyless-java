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
 * LDAPAccessRules
 */

public class LDAPAccessRules {
  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  private String alg;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique_identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  private String uniqueIdentifier;


  public LDAPAccessRules alg(String alg) {
    
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


  public LDAPAccessRules key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The public key value of LDAP.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public key value of LDAP.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public LDAPAccessRules uniqueIdentifier(String uniqueIdentifier) {
    
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

   /**
   * A unique identifier to distinguish different users
   * @return uniqueIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier to distinguish different users")

  public String getUniqueIdentifier() {
    return uniqueIdentifier;
  }


  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LDAPAccessRules ldAPAccessRules = (LDAPAccessRules) o;
    return Objects.equals(this.alg, ldAPAccessRules.alg) &&
        Objects.equals(this.key, ldAPAccessRules.key) &&
        Objects.equals(this.uniqueIdentifier, ldAPAccessRules.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, key, uniqueIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LDAPAccessRules {\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    uniqueIdentifier: ").append(toIndentedString(uniqueIdentifier)).append("\n");
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
