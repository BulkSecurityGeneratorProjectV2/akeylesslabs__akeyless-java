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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * BastionListEntry
 */

public class BastionListEntry {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access_id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  private String accessId;

  public static final String SERIALIZED_NAME_ALLOWED_ACCESS_IDS = "allowed_access_ids";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ACCESS_IDS)
  private List<String> allowedAccessIds = null;

  public static final String SERIALIZED_NAME_ALLOWED_URLS = "allowed_urls";
  @SerializedName(SERIALIZED_NAME_ALLOWED_URLS)
  private List<String> allowedUrls = null;

  public static final String SERIALIZED_NAME_ALLOWED_URLS_PER_INSTANCE = "allowed_urls_per_instance";
  @SerializedName(SERIALIZED_NAME_ALLOWED_URLS_PER_INSTANCE)
  private Map<String, List<String>> allowedUrlsPerInstance = null;

  public static final String SERIALIZED_NAME_CLUSTER_NAME = "cluster_name";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NAME)
  private String clusterName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_LAST_REPORT = "last_report";
  @SerializedName(SERIALIZED_NAME_LAST_REPORT)
  private OffsetDateTime lastReport;


  public BastionListEntry accessId(String accessId) {
    
    this.accessId = accessId;
    return this;
  }

   /**
   * Get accessId
   * @return accessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessId() {
    return accessId;
  }


  public void setAccessId(String accessId) {
    this.accessId = accessId;
  }


  public BastionListEntry allowedAccessIds(List<String> allowedAccessIds) {
    
    this.allowedAccessIds = allowedAccessIds;
    return this;
  }

  public BastionListEntry addAllowedAccessIdsItem(String allowedAccessIdsItem) {
    if (this.allowedAccessIds == null) {
      this.allowedAccessIds = new ArrayList<String>();
    }
    this.allowedAccessIds.add(allowedAccessIdsItem);
    return this;
  }

   /**
   * Get allowedAccessIds
   * @return allowedAccessIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAllowedAccessIds() {
    return allowedAccessIds;
  }


  public void setAllowedAccessIds(List<String> allowedAccessIds) {
    this.allowedAccessIds = allowedAccessIds;
  }


  public BastionListEntry allowedUrls(List<String> allowedUrls) {
    
    this.allowedUrls = allowedUrls;
    return this;
  }

  public BastionListEntry addAllowedUrlsItem(String allowedUrlsItem) {
    if (this.allowedUrls == null) {
      this.allowedUrls = new ArrayList<String>();
    }
    this.allowedUrls.add(allowedUrlsItem);
    return this;
  }

   /**
   * Get allowedUrls
   * @return allowedUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAllowedUrls() {
    return allowedUrls;
  }


  public void setAllowedUrls(List<String> allowedUrls) {
    this.allowedUrls = allowedUrls;
  }


  public BastionListEntry allowedUrlsPerInstance(Map<String, List<String>> allowedUrlsPerInstance) {
    
    this.allowedUrlsPerInstance = allowedUrlsPerInstance;
    return this;
  }

  public BastionListEntry putAllowedUrlsPerInstanceItem(String key, List<String> allowedUrlsPerInstanceItem) {
    if (this.allowedUrlsPerInstance == null) {
      this.allowedUrlsPerInstance = new HashMap<String, List<String>>();
    }
    this.allowedUrlsPerInstance.put(key, allowedUrlsPerInstanceItem);
    return this;
  }

   /**
   * Get allowedUrlsPerInstance
   * @return allowedUrlsPerInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>> getAllowedUrlsPerInstance() {
    return allowedUrlsPerInstance;
  }


  public void setAllowedUrlsPerInstance(Map<String, List<String>> allowedUrlsPerInstance) {
    this.allowedUrlsPerInstance = allowedUrlsPerInstance;
  }


  public BastionListEntry clusterName(String clusterName) {
    
    this.clusterName = clusterName;
    return this;
  }

   /**
   * Get clusterName
   * @return clusterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClusterName() {
    return clusterName;
  }


  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }


  public BastionListEntry displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public BastionListEntry lastReport(OffsetDateTime lastReport) {
    
    this.lastReport = lastReport;
    return this;
  }

   /**
   * Get lastReport
   * @return lastReport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastReport() {
    return lastReport;
  }


  public void setLastReport(OffsetDateTime lastReport) {
    this.lastReport = lastReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BastionListEntry bastionListEntry = (BastionListEntry) o;
    return Objects.equals(this.accessId, bastionListEntry.accessId) &&
        Objects.equals(this.allowedAccessIds, bastionListEntry.allowedAccessIds) &&
        Objects.equals(this.allowedUrls, bastionListEntry.allowedUrls) &&
        Objects.equals(this.allowedUrlsPerInstance, bastionListEntry.allowedUrlsPerInstance) &&
        Objects.equals(this.clusterName, bastionListEntry.clusterName) &&
        Objects.equals(this.displayName, bastionListEntry.displayName) &&
        Objects.equals(this.lastReport, bastionListEntry.lastReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, allowedAccessIds, allowedUrls, allowedUrlsPerInstance, clusterName, displayName, lastReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BastionListEntry {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    allowedAccessIds: ").append(toIndentedString(allowedAccessIds)).append("\n");
    sb.append("    allowedUrls: ").append(toIndentedString(allowedUrls)).append("\n");
    sb.append("    allowedUrlsPerInstance: ").append(toIndentedString(allowedUrlsPerInstance)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    lastReport: ").append(toIndentedString(lastReport)).append("\n");
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

