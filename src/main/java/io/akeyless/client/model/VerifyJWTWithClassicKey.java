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
 * VerifyJWTWithClassicKey
 */

public class VerifyJWTWithClassicKey {
  public static final String SERIALIZED_NAME_DISPLAY_ID = "display-id";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  private String displayId;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_JWT = "jwt";
  @SerializedName(SERIALIZED_NAME_JWT)
  private String jwt;

  public static final String SERIALIZED_NAME_REQUIRED_CLAIMS = "required-claims";
  @SerializedName(SERIALIZED_NAME_REQUIRED_CLAIMS)
  private String requiredClaims;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;


  public VerifyJWTWithClassicKey displayId(String displayId) {
    
    this.displayId = displayId;
    return this;
  }

   /**
   * The name of the key to use in the verify JWT process
   * @return displayId
  **/
  @ApiModelProperty(required = true, value = "The name of the key to use in the verify JWT process")

  public String getDisplayId() {
    return displayId;
  }


  public void setDisplayId(String displayId) {
    this.displayId = displayId;
  }


  public VerifyJWTWithClassicKey json(Boolean json) {
    
    this.json = json;
    return this;
  }

   /**
   * Set output format to JSON
   * @return json
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set output format to JSON")

  public Boolean getJson() {
    return json;
  }


  public void setJson(Boolean json) {
    this.json = json;
  }


  public VerifyJWTWithClassicKey jwt(String jwt) {
    
    this.jwt = jwt;
    return this;
  }

   /**
   * JWT
   * @return jwt
  **/
  @ApiModelProperty(required = true, value = "JWT")

  public String getJwt() {
    return jwt;
  }


  public void setJwt(String jwt) {
    this.jwt = jwt;
  }


  public VerifyJWTWithClassicKey requiredClaims(String requiredClaims) {
    
    this.requiredClaims = requiredClaims;
    return this;
  }

   /**
   * RequiredClaims
   * @return requiredClaims
  **/
  @ApiModelProperty(required = true, value = "RequiredClaims")

  public String getRequiredClaims() {
    return requiredClaims;
  }


  public void setRequiredClaims(String requiredClaims) {
    this.requiredClaims = requiredClaims;
  }


  public VerifyJWTWithClassicKey token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authentication token (see `/auth` and `/configure`)")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public VerifyJWTWithClassicKey uidToken(String uidToken) {
    
    this.uidToken = uidToken;
    return this;
  }

   /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The universal identity token, Required only for universal_identity authentication")

  public String getUidToken() {
    return uidToken;
  }


  public void setUidToken(String uidToken) {
    this.uidToken = uidToken;
  }


  public VerifyJWTWithClassicKey version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * classic key version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "classic key version")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
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
    VerifyJWTWithClassicKey verifyJWTWithClassicKey = (VerifyJWTWithClassicKey) o;
    return Objects.equals(this.displayId, verifyJWTWithClassicKey.displayId) &&
        Objects.equals(this.json, verifyJWTWithClassicKey.json) &&
        Objects.equals(this.jwt, verifyJWTWithClassicKey.jwt) &&
        Objects.equals(this.requiredClaims, verifyJWTWithClassicKey.requiredClaims) &&
        Objects.equals(this.token, verifyJWTWithClassicKey.token) &&
        Objects.equals(this.uidToken, verifyJWTWithClassicKey.uidToken) &&
        Objects.equals(this.version, verifyJWTWithClassicKey.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayId, json, jwt, requiredClaims, token, uidToken, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyJWTWithClassicKey {\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
    sb.append("    requiredClaims: ").append(toIndentedString(requiredClaims)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

