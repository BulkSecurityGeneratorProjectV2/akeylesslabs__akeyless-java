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
 * K8SAuthsConfigLastChange
 */

public class K8SAuthsConfigLastChange {
  public static final String SERIALIZED_NAME_CHANGED_K8S_AUTHS_IDS = "changed_k8s_auths_ids";
  @SerializedName(SERIALIZED_NAME_CHANGED_K8S_AUTHS_IDS)
  private List<String> changedK8sAuthsIds = null;

  public static final String SERIALIZED_NAME_CREATED_K8S_AUTHS_IDS = "created_k8s_auths_ids";
  @SerializedName(SERIALIZED_NAME_CREATED_K8S_AUTHS_IDS)
  private List<String> createdK8sAuthsIds = null;

  public static final String SERIALIZED_NAME_DELETED_K8S_AUTHS_IDS = "deleted_k8s_auths_ids";
  @SerializedName(SERIALIZED_NAME_DELETED_K8S_AUTHS_IDS)
  private List<String> deletedK8sAuthsIds = null;


  public K8SAuthsConfigLastChange changedK8sAuthsIds(List<String> changedK8sAuthsIds) {
    
    this.changedK8sAuthsIds = changedK8sAuthsIds;
    return this;
  }

  public K8SAuthsConfigLastChange addChangedK8sAuthsIdsItem(String changedK8sAuthsIdsItem) {
    if (this.changedK8sAuthsIds == null) {
      this.changedK8sAuthsIds = new ArrayList<String>();
    }
    this.changedK8sAuthsIds.add(changedK8sAuthsIdsItem);
    return this;
  }

   /**
   * Get changedK8sAuthsIds
   * @return changedK8sAuthsIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getChangedK8sAuthsIds() {
    return changedK8sAuthsIds;
  }


  public void setChangedK8sAuthsIds(List<String> changedK8sAuthsIds) {
    this.changedK8sAuthsIds = changedK8sAuthsIds;
  }


  public K8SAuthsConfigLastChange createdK8sAuthsIds(List<String> createdK8sAuthsIds) {
    
    this.createdK8sAuthsIds = createdK8sAuthsIds;
    return this;
  }

  public K8SAuthsConfigLastChange addCreatedK8sAuthsIdsItem(String createdK8sAuthsIdsItem) {
    if (this.createdK8sAuthsIds == null) {
      this.createdK8sAuthsIds = new ArrayList<String>();
    }
    this.createdK8sAuthsIds.add(createdK8sAuthsIdsItem);
    return this;
  }

   /**
   * Get createdK8sAuthsIds
   * @return createdK8sAuthsIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCreatedK8sAuthsIds() {
    return createdK8sAuthsIds;
  }


  public void setCreatedK8sAuthsIds(List<String> createdK8sAuthsIds) {
    this.createdK8sAuthsIds = createdK8sAuthsIds;
  }


  public K8SAuthsConfigLastChange deletedK8sAuthsIds(List<String> deletedK8sAuthsIds) {
    
    this.deletedK8sAuthsIds = deletedK8sAuthsIds;
    return this;
  }

  public K8SAuthsConfigLastChange addDeletedK8sAuthsIdsItem(String deletedK8sAuthsIdsItem) {
    if (this.deletedK8sAuthsIds == null) {
      this.deletedK8sAuthsIds = new ArrayList<String>();
    }
    this.deletedK8sAuthsIds.add(deletedK8sAuthsIdsItem);
    return this;
  }

   /**
   * Get deletedK8sAuthsIds
   * @return deletedK8sAuthsIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDeletedK8sAuthsIds() {
    return deletedK8sAuthsIds;
  }


  public void setDeletedK8sAuthsIds(List<String> deletedK8sAuthsIds) {
    this.deletedK8sAuthsIds = deletedK8sAuthsIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    K8SAuthsConfigLastChange k8SAuthsConfigLastChange = (K8SAuthsConfigLastChange) o;
    return Objects.equals(this.changedK8sAuthsIds, k8SAuthsConfigLastChange.changedK8sAuthsIds) &&
        Objects.equals(this.createdK8sAuthsIds, k8SAuthsConfigLastChange.createdK8sAuthsIds) &&
        Objects.equals(this.deletedK8sAuthsIds, k8SAuthsConfigLastChange.deletedK8sAuthsIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedK8sAuthsIds, createdK8sAuthsIds, deletedK8sAuthsIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class K8SAuthsConfigLastChange {\n");
    sb.append("    changedK8sAuthsIds: ").append(toIndentedString(changedK8sAuthsIds)).append("\n");
    sb.append("    createdK8sAuthsIds: ").append(toIndentedString(createdK8sAuthsIds)).append("\n");
    sb.append("    deletedK8sAuthsIds: ").append(toIndentedString(deletedK8sAuthsIds)).append("\n");
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

