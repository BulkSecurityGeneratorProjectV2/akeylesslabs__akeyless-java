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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CFConfigPart
 */

public class CFConfigPart {
  public static final String SERIALIZED_NAME_CUSTOMER_FRAGEMENTS = "customer_fragements";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_FRAGEMENTS)
  private Map<String, String> customerFragements = null;


  public CFConfigPart customerFragements(Map<String, String> customerFragements) {
    
    this.customerFragements = customerFragements;
    return this;
  }

  public CFConfigPart putCustomerFragementsItem(String key, String customerFragementsItem) {
    if (this.customerFragements == null) {
      this.customerFragements = new HashMap<String, String>();
    }
    this.customerFragements.put(key, customerFragementsItem);
    return this;
  }

   /**
   * Get customerFragements
   * @return customerFragements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getCustomerFragements() {
    return customerFragements;
  }


  public void setCustomerFragements(Map<String, String> customerFragements) {
    this.customerFragements = customerFragements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CFConfigPart cfConfigPart = (CFConfigPart) o;
    return Objects.equals(this.customerFragements, cfConfigPart.customerFragements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerFragements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFConfigPart {\n");
    sb.append("    customerFragements: ").append(toIndentedString(customerFragements)).append("\n");
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
