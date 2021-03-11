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
import io.akeyless.client.model.Producer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProducersConfigPart
 */

public class ProducersConfigPart {
  public static final String SERIALIZED_NAME_PRODUCERS = "producers";
  @SerializedName(SERIALIZED_NAME_PRODUCERS)
  private List<Producer> producers = null;


  public ProducersConfigPart producers(List<Producer> producers) {
    
    this.producers = producers;
    return this;
  }

  public ProducersConfigPart addProducersItem(Producer producersItem) {
    if (this.producers == null) {
      this.producers = new ArrayList<Producer>();
    }
    this.producers.add(producersItem);
    return this;
  }

   /**
   * Get producers
   * @return producers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Producer> getProducers() {
    return producers;
  }


  public void setProducers(List<Producer> producers) {
    this.producers = producers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProducersConfigPart producersConfigPart = (ProducersConfigPart) o;
    return Objects.equals(this.producers, producersConfigPart.producers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(producers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProducersConfigPart {\n");
    sb.append("    producers: ").append(toIndentedString(producers)).append("\n");
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
