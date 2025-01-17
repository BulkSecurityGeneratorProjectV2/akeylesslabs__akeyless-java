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
import org.threeten.bp.OffsetDateTime;

/**
 * RotateKeyOutput defines output of RotateKey operation
 */
@ApiModel(description = "RotateKeyOutput defines output of RotateKey operation")

public class RotateKeyOutput {
  public static final String SERIALIZED_NAME_CLASSIC_KEY_GW_URL = "classic_key_gw_url";
  @SerializedName(SERIALIZED_NAME_CLASSIC_KEY_GW_URL)
  private String classicKeyGwUrl;

  public static final String SERIALIZED_NAME_ITEM_TYPE = "item_type";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  private String itemType;

  public static final String SERIALIZED_NAME_NEW_ITEM_VERSION = "new_item_version";
  @SerializedName(SERIALIZED_NAME_NEW_ITEM_VERSION)
  private Integer newItemVersion;

  public static final String SERIALIZED_NAME_NEXT_ROTATION_DATE = "next_rotation_date";
  @SerializedName(SERIALIZED_NAME_NEXT_ROTATION_DATE)
  private OffsetDateTime nextRotationDate;


  public RotateKeyOutput classicKeyGwUrl(String classicKeyGwUrl) {
    
    this.classicKeyGwUrl = classicKeyGwUrl;
    return this;
  }

   /**
   * Get classicKeyGwUrl
   * @return classicKeyGwUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClassicKeyGwUrl() {
    return classicKeyGwUrl;
  }


  public void setClassicKeyGwUrl(String classicKeyGwUrl) {
    this.classicKeyGwUrl = classicKeyGwUrl;
  }


  public RotateKeyOutput itemType(String itemType) {
    
    this.itemType = itemType;
    return this;
  }

   /**
   * Get itemType
   * @return itemType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getItemType() {
    return itemType;
  }


  public void setItemType(String itemType) {
    this.itemType = itemType;
  }


  public RotateKeyOutput newItemVersion(Integer newItemVersion) {
    
    this.newItemVersion = newItemVersion;
    return this;
  }

   /**
   * Get newItemVersion
   * @return newItemVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNewItemVersion() {
    return newItemVersion;
  }


  public void setNewItemVersion(Integer newItemVersion) {
    this.newItemVersion = newItemVersion;
  }


  public RotateKeyOutput nextRotationDate(OffsetDateTime nextRotationDate) {
    
    this.nextRotationDate = nextRotationDate;
    return this;
  }

   /**
   * Get nextRotationDate
   * @return nextRotationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getNextRotationDate() {
    return nextRotationDate;
  }


  public void setNextRotationDate(OffsetDateTime nextRotationDate) {
    this.nextRotationDate = nextRotationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RotateKeyOutput rotateKeyOutput = (RotateKeyOutput) o;
    return Objects.equals(this.classicKeyGwUrl, rotateKeyOutput.classicKeyGwUrl) &&
        Objects.equals(this.itemType, rotateKeyOutput.itemType) &&
        Objects.equals(this.newItemVersion, rotateKeyOutput.newItemVersion) &&
        Objects.equals(this.nextRotationDate, rotateKeyOutput.nextRotationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classicKeyGwUrl, itemType, newItemVersion, nextRotationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotateKeyOutput {\n");
    sb.append("    classicKeyGwUrl: ").append(toIndentedString(classicKeyGwUrl)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    newItemVersion: ").append(toIndentedString(newItemVersion)).append("\n");
    sb.append("    nextRotationDate: ").append(toIndentedString(nextRotationDate)).append("\n");
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

