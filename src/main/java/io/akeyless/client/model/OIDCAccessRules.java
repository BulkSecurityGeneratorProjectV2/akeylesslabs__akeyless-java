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
import io.akeyless.client.model.OIDCCustomClaim;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OIDCAccessRules contains access rules specific to Open Id Connect authentication method.
 */
@ApiModel(description = "OIDCAccessRules contains access rules specific to Open Id Connect authentication method.")

public class OIDCAccessRules {
  public static final String SERIALIZED_NAME_BOUND_CLAIMS = "bound_claims";
  @SerializedName(SERIALIZED_NAME_BOUND_CLAIMS)
  private List<OIDCCustomClaim> boundClaims = null;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique_identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  private String uniqueIdentifier;


  public OIDCAccessRules boundClaims(List<OIDCCustomClaim> boundClaims) {
    
    this.boundClaims = boundClaims;
    return this;
  }

  public OIDCAccessRules addBoundClaimsItem(OIDCCustomClaim boundClaimsItem) {
    if (this.boundClaims == null) {
      this.boundClaims = new ArrayList<OIDCCustomClaim>();
    }
    this.boundClaims.add(boundClaimsItem);
    return this;
  }

   /**
   * The claims that login is restricted to.
   * @return boundClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The claims that login is restricted to.")

  public List<OIDCCustomClaim> getBoundClaims() {
    return boundClaims;
  }


  public void setBoundClaims(List<OIDCCustomClaim> boundClaims) {
    this.boundClaims = boundClaims;
  }


  public OIDCAccessRules clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Client ID
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Client ID")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public OIDCAccessRules clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Client Secret
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Client Secret")

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public OIDCAccessRules issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Issuer URL
   * @return issuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Issuer URL")

  public String getIssuer() {
    return issuer;
  }


  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public OIDCAccessRules uniqueIdentifier(String uniqueIdentifier) {
    
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
    OIDCAccessRules oiDCAccessRules = (OIDCAccessRules) o;
    return Objects.equals(this.boundClaims, oiDCAccessRules.boundClaims) &&
        Objects.equals(this.clientId, oiDCAccessRules.clientId) &&
        Objects.equals(this.clientSecret, oiDCAccessRules.clientSecret) &&
        Objects.equals(this.issuer, oiDCAccessRules.issuer) &&
        Objects.equals(this.uniqueIdentifier, oiDCAccessRules.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundClaims, clientId, clientSecret, issuer, uniqueIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OIDCAccessRules {\n");
    sb.append("    boundClaims: ").append(toIndentedString(boundClaims)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

