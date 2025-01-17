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
import io.akeyless.client.model.ObjectVersionSettingsOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AccountObjectVersionSettingsOutput
 */

public class AccountObjectVersionSettingsOutput {
  public static final String SERIALIZED_NAME_DEFAULT_VERSIONING = "default-versioning";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VERSIONING)
  private Boolean defaultVersioning;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ObjectVersionSettingsOutput> items = null;


  public AccountObjectVersionSettingsOutput defaultVersioning(Boolean defaultVersioning) {
    
    this.defaultVersioning = defaultVersioning;
    return this;
  }

   /**
   * Get defaultVersioning
   * @return defaultVersioning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDefaultVersioning() {
    return defaultVersioning;
  }


  public void setDefaultVersioning(Boolean defaultVersioning) {
    this.defaultVersioning = defaultVersioning;
  }


  public AccountObjectVersionSettingsOutput items(List<ObjectVersionSettingsOutput> items) {
    
    this.items = items;
    return this;
  }

  public AccountObjectVersionSettingsOutput addItemsItem(ObjectVersionSettingsOutput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ObjectVersionSettingsOutput>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ObjectVersionSettingsOutput> getItems() {
    return items;
  }


  public void setItems(List<ObjectVersionSettingsOutput> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountObjectVersionSettingsOutput accountObjectVersionSettingsOutput = (AccountObjectVersionSettingsOutput) o;
    return Objects.equals(this.defaultVersioning, accountObjectVersionSettingsOutput.defaultVersioning) &&
        Objects.equals(this.items, accountObjectVersionSettingsOutput.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultVersioning, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountObjectVersionSettingsOutput {\n");
    sb.append("    defaultVersioning: ").append(toIndentedString(defaultVersioning)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

