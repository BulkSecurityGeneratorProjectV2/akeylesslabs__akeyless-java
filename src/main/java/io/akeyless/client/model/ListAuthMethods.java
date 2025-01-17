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
 * listAuthMethods is a command that returns a list of all auth methods in the account.
 */
@ApiModel(description = "listAuthMethods is a command that returns a list of all auth methods in the account.")

public class ListAuthMethods {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_PAGINATION_TOKEN = "pagination-token";
  @SerializedName(SERIALIZED_NAME_PAGINATION_TOKEN)
  private String paginationToken;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private List<String> type = null;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public ListAuthMethods filter(String filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Filter by auth method name or part of it
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by auth method name or part of it")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    this.filter = filter;
  }


  public ListAuthMethods json(Boolean json) {
    
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


  public ListAuthMethods paginationToken(String paginationToken) {
    
    this.paginationToken = paginationToken;
    return this;
  }

   /**
   * Next page reference
   * @return paginationToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Next page reference")

  public String getPaginationToken() {
    return paginationToken;
  }


  public void setPaginationToken(String paginationToken) {
    this.paginationToken = paginationToken;
  }


  public ListAuthMethods token(String token) {
    
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


  public ListAuthMethods type(List<String> type) {
    
    this.type = type;
    return this;
  }

  public ListAuthMethods addTypeItem(String typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<String>();
    }
    this.type.add(typeItem);
    return this;
  }

   /**
   * The Auth method types list of the requested method. In case it is empty, all types of auth methods will be returned. options: [api_key, azure_ad, oauth2/jwt, saml2, ldap, aws_iam, oidc, universal_identity, gcp, k8s, cert]
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Auth method types list of the requested method. In case it is empty, all types of auth methods will be returned. options: [api_key, azure_ad, oauth2/jwt, saml2, ldap, aws_iam, oidc, universal_identity, gcp, k8s, cert]")

  public List<String> getType() {
    return type;
  }


  public void setType(List<String> type) {
    this.type = type;
  }


  public ListAuthMethods uidToken(String uidToken) {
    
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
    ListAuthMethods listAuthMethods = (ListAuthMethods) o;
    return Objects.equals(this.filter, listAuthMethods.filter) &&
        Objects.equals(this.json, listAuthMethods.json) &&
        Objects.equals(this.paginationToken, listAuthMethods.paginationToken) &&
        Objects.equals(this.token, listAuthMethods.token) &&
        Objects.equals(this.type, listAuthMethods.type) &&
        Objects.equals(this.uidToken, listAuthMethods.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, json, paginationToken, token, type, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAuthMethods {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    paginationToken: ").append(toIndentedString(paginationToken)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

