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
 * RequiredActivity
 */

public class RequiredActivity {
  public static final String SERIALIZED_NAME_MIGRATIONS_REQUIRED_ACTIVITY = "migrations_required_activity";
  @SerializedName(SERIALIZED_NAME_MIGRATIONS_REQUIRED_ACTIVITY)
  private Map<String, Boolean> migrationsRequiredActivity = null;


  public RequiredActivity migrationsRequiredActivity(Map<String, Boolean> migrationsRequiredActivity) {
    
    this.migrationsRequiredActivity = migrationsRequiredActivity;
    return this;
  }

  public RequiredActivity putMigrationsRequiredActivityItem(String key, Boolean migrationsRequiredActivityItem) {
    if (this.migrationsRequiredActivity == null) {
      this.migrationsRequiredActivity = new HashMap<String, Boolean>();
    }
    this.migrationsRequiredActivity.put(key, migrationsRequiredActivityItem);
    return this;
  }

   /**
   * Get migrationsRequiredActivity
   * @return migrationsRequiredActivity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Boolean> getMigrationsRequiredActivity() {
    return migrationsRequiredActivity;
  }


  public void setMigrationsRequiredActivity(Map<String, Boolean> migrationsRequiredActivity) {
    this.migrationsRequiredActivity = migrationsRequiredActivity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequiredActivity requiredActivity = (RequiredActivity) o;
    return Objects.equals(this.migrationsRequiredActivity, requiredActivity.migrationsRequiredActivity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migrationsRequiredActivity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequiredActivity {\n");
    sb.append("    migrationsRequiredActivity: ").append(toIndentedString(migrationsRequiredActivity)).append("\n");
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

