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
import java.util.ArrayList;
import java.util.List;

/**
 * updateAuthMethodUniversalIdentity is a command that updates a new auth method that will be able to authenticate using Akeyless Universal Identity.
 */
@ApiModel(description = "updateAuthMethodUniversalIdentity is a command that updates a new auth method that will be able to authenticate using Akeyless Universal Identity.")

public class UpdateAuthMethodUniversalIdentity {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_BOUND_IPS = "bound-ips";
  @SerializedName(SERIALIZED_NAME_BOUND_IPS)
  private List<String> boundIps = null;

  public static final String SERIALIZED_NAME_DENY_INHERITANCE = "deny-inheritance";
  @SerializedName(SERIALIZED_NAME_DENY_INHERITANCE)
  private Boolean denyInheritance;

  public static final String SERIALIZED_NAME_DENY_ROTATE = "deny-rotate";
  @SerializedName(SERIALIZED_NAME_DENY_ROTATE)
  private Boolean denyRotate;

  public static final String SERIALIZED_NAME_FORCE_SUB_CLAIMS = "force-sub-claims";
  @SerializedName(SERIALIZED_NAME_FORCE_SUB_CLAIMS)
  private Boolean forceSubClaims;

  public static final String SERIALIZED_NAME_GW_BOUND_IPS = "gw-bound-ips";
  @SerializedName(SERIALIZED_NAME_GW_BOUND_IPS)
  private List<String> gwBoundIps = null;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_JWT_TTL = "jwt-ttl";
  @SerializedName(SERIALIZED_NAME_JWT_TTL)
  private Long jwtTtl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private Integer ttl = 60;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public UpdateAuthMethodUniversalIdentity accessExpires(Long accessExpires) {
    
    this.accessExpires = accessExpires;
    return this;
  }

   /**
   * Access expiration date in Unix timestamp (select 0 for access without expiry date)
   * @return accessExpires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access expiration date in Unix timestamp (select 0 for access without expiry date)")

  public Long getAccessExpires() {
    return accessExpires;
  }


  public void setAccessExpires(Long accessExpires) {
    this.accessExpires = accessExpires;
  }


  public UpdateAuthMethodUniversalIdentity boundIps(List<String> boundIps) {
    
    this.boundIps = boundIps;
    return this;
  }

  public UpdateAuthMethodUniversalIdentity addBoundIpsItem(String boundIpsItem) {
    if (this.boundIps == null) {
      this.boundIps = new ArrayList<String>();
    }
    this.boundIps.add(boundIpsItem);
    return this;
  }

   /**
   * A CIDR whitelist with the IPs that the access is restricted to
   * @return boundIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A CIDR whitelist with the IPs that the access is restricted to")

  public List<String> getBoundIps() {
    return boundIps;
  }


  public void setBoundIps(List<String> boundIps) {
    this.boundIps = boundIps;
  }


  public UpdateAuthMethodUniversalIdentity denyInheritance(Boolean denyInheritance) {
    
    this.denyInheritance = denyInheritance;
    return this;
  }

   /**
   * Deny from root to create children
   * @return denyInheritance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deny from root to create children")

  public Boolean getDenyInheritance() {
    return denyInheritance;
  }


  public void setDenyInheritance(Boolean denyInheritance) {
    this.denyInheritance = denyInheritance;
  }


  public UpdateAuthMethodUniversalIdentity denyRotate(Boolean denyRotate) {
    
    this.denyRotate = denyRotate;
    return this;
  }

   /**
   * Deny from the token to rotate
   * @return denyRotate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deny from the token to rotate")

  public Boolean getDenyRotate() {
    return denyRotate;
  }


  public void setDenyRotate(Boolean denyRotate) {
    this.denyRotate = denyRotate;
  }


  public UpdateAuthMethodUniversalIdentity forceSubClaims(Boolean forceSubClaims) {
    
    this.forceSubClaims = forceSubClaims;
    return this;
  }

   /**
   * if true: enforce role-association must include sub claims
   * @return forceSubClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if true: enforce role-association must include sub claims")

  public Boolean getForceSubClaims() {
    return forceSubClaims;
  }


  public void setForceSubClaims(Boolean forceSubClaims) {
    this.forceSubClaims = forceSubClaims;
  }


  public UpdateAuthMethodUniversalIdentity gwBoundIps(List<String> gwBoundIps) {
    
    this.gwBoundIps = gwBoundIps;
    return this;
  }

  public UpdateAuthMethodUniversalIdentity addGwBoundIpsItem(String gwBoundIpsItem) {
    if (this.gwBoundIps == null) {
      this.gwBoundIps = new ArrayList<String>();
    }
    this.gwBoundIps.add(gwBoundIpsItem);
    return this;
  }

   /**
   * A CIDR whitelist with the GW IPs that the access is restricted to
   * @return gwBoundIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A CIDR whitelist with the GW IPs that the access is restricted to")

  public List<String> getGwBoundIps() {
    return gwBoundIps;
  }


  public void setGwBoundIps(List<String> gwBoundIps) {
    this.gwBoundIps = gwBoundIps;
  }


  public UpdateAuthMethodUniversalIdentity json(Boolean json) {
    
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


  public UpdateAuthMethodUniversalIdentity jwtTtl(Long jwtTtl) {
    
    this.jwtTtl = jwtTtl;
    return this;
  }

   /**
   * Jwt TTL
   * @return jwtTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Jwt TTL")

  public Long getJwtTtl() {
    return jwtTtl;
  }


  public void setJwtTtl(Long jwtTtl) {
    this.jwtTtl = jwtTtl;
  }


  public UpdateAuthMethodUniversalIdentity name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Auth Method name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Auth Method name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateAuthMethodUniversalIdentity newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Auth Method new name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Auth Method new name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public UpdateAuthMethodUniversalIdentity token(String token) {
    
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


  public UpdateAuthMethodUniversalIdentity ttl(Integer ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Token ttl
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token ttl")

  public Integer getTtl() {
    return ttl;
  }


  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }


  public UpdateAuthMethodUniversalIdentity uidToken(String uidToken) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAuthMethodUniversalIdentity updateAuthMethodUniversalIdentity = (UpdateAuthMethodUniversalIdentity) o;
    return Objects.equals(this.accessExpires, updateAuthMethodUniversalIdentity.accessExpires) &&
        Objects.equals(this.boundIps, updateAuthMethodUniversalIdentity.boundIps) &&
        Objects.equals(this.denyInheritance, updateAuthMethodUniversalIdentity.denyInheritance) &&
        Objects.equals(this.denyRotate, updateAuthMethodUniversalIdentity.denyRotate) &&
        Objects.equals(this.forceSubClaims, updateAuthMethodUniversalIdentity.forceSubClaims) &&
        Objects.equals(this.gwBoundIps, updateAuthMethodUniversalIdentity.gwBoundIps) &&
        Objects.equals(this.json, updateAuthMethodUniversalIdentity.json) &&
        Objects.equals(this.jwtTtl, updateAuthMethodUniversalIdentity.jwtTtl) &&
        Objects.equals(this.name, updateAuthMethodUniversalIdentity.name) &&
        Objects.equals(this.newName, updateAuthMethodUniversalIdentity.newName) &&
        Objects.equals(this.token, updateAuthMethodUniversalIdentity.token) &&
        Objects.equals(this.ttl, updateAuthMethodUniversalIdentity.ttl) &&
        Objects.equals(this.uidToken, updateAuthMethodUniversalIdentity.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, boundIps, denyInheritance, denyRotate, forceSubClaims, gwBoundIps, json, jwtTtl, name, newName, token, ttl, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAuthMethodUniversalIdentity {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    denyInheritance: ").append(toIndentedString(denyInheritance)).append("\n");
    sb.append("    denyRotate: ").append(toIndentedString(denyRotate)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    gwBoundIps: ").append(toIndentedString(gwBoundIps)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    jwtTtl: ").append(toIndentedString(jwtTtl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

