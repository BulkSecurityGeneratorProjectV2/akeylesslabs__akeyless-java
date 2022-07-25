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
 * ListItems
 */

public class ListItems {
  public static final String SERIALIZED_NAME_ACCESSIBILITY = "accessibility";
  @SerializedName(SERIALIZED_NAME_ACCESSIBILITY)
  private String accessibility;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_MINIMAL_VIEW = "minimal-view";
  @SerializedName(SERIALIZED_NAME_MINIMAL_VIEW)
  private Boolean minimalView;

  public static final String SERIALIZED_NAME_PAGINATION_TOKEN = "pagination-token";
  @SerializedName(SERIALIZED_NAME_PAGINATION_TOKEN)
  private String paginationToken;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_SUB_TYPES = "sub_types";
  @SerializedName(SERIALIZED_NAME_SUB_TYPES)
  private List<String> subTypes = null;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private List<String> type = null;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public ListItems accessibility(String accessibility) {
    
    this.accessibility = accessibility;
    return this;
  }

   /**
   * for personal password manager
   * @return accessibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "for personal password manager")

  public String getAccessibility() {
    return accessibility;
  }


  public void setAccessibility(String accessibility) {
    this.accessibility = accessibility;
  }


  public ListItems filter(String filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Filter by item name or part of it
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by item name or part of it")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    this.filter = filter;
  }


  public ListItems minimalView(Boolean minimalView) {
    
    this.minimalView = minimalView;
    return this;
  }

   /**
   * Get minimalView
   * @return minimalView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMinimalView() {
    return minimalView;
  }


  public void setMinimalView(Boolean minimalView) {
    this.minimalView = minimalView;
  }


  public ListItems paginationToken(String paginationToken) {
    
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


  public ListItems path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path to folder
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to folder")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ListItems subTypes(List<String> subTypes) {
    
    this.subTypes = subTypes;
    return this;
  }

  public ListItems addSubTypesItem(String subTypesItem) {
    if (this.subTypes == null) {
      this.subTypes = new ArrayList<String>();
    }
    this.subTypes.add(subTypesItem);
    return this;
  }

   /**
   * Get subTypes
   * @return subTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSubTypes() {
    return subTypes;
  }


  public void setSubTypes(List<String> subTypes) {
    this.subTypes = subTypes;
  }


  public ListItems tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Filter by item tag
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by item tag")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public ListItems token(String token) {
    
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


  public ListItems type(List<String> type) {
    
    this.type = type;
    return this;
  }

  public ListItems addTypeItem(String typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<String>();
    }
    this.type.add(typeItem);
    return this;
  }

   /**
   * The item types list of the requested items. In case it is empty, all types of items will be returned. options: [key, static-secret, dynamic-secret]
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The item types list of the requested items. In case it is empty, all types of items will be returned. options: [key, static-secret, dynamic-secret]")

  public List<String> getType() {
    return type;
  }


  public void setType(List<String> type) {
    this.type = type;
  }


  public ListItems uidToken(String uidToken) {
    
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
    ListItems listItems = (ListItems) o;
    return Objects.equals(this.accessibility, listItems.accessibility) &&
        Objects.equals(this.filter, listItems.filter) &&
        Objects.equals(this.minimalView, listItems.minimalView) &&
        Objects.equals(this.paginationToken, listItems.paginationToken) &&
        Objects.equals(this.path, listItems.path) &&
        Objects.equals(this.subTypes, listItems.subTypes) &&
        Objects.equals(this.tag, listItems.tag) &&
        Objects.equals(this.token, listItems.token) &&
        Objects.equals(this.type, listItems.type) &&
        Objects.equals(this.uidToken, listItems.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessibility, filter, minimalView, paginationToken, path, subTypes, tag, token, type, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListItems {\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    minimalView: ").append(toIndentedString(minimalView)).append("\n");
    sb.append("    paginationToken: ").append(toIndentedString(paginationToken)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

