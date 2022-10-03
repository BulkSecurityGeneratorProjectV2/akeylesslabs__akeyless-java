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
import io.akeyless.client.model.MigrationItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GatewayMigratePersonalItemsOutput
 */

public class GatewayMigratePersonalItemsOutput {
  public static final String SERIALIZED_NAME_MIGRATION_ITEMS = "migration_items";
  @SerializedName(SERIALIZED_NAME_MIGRATION_ITEMS)
  private MigrationItems migrationItems;


  public GatewayMigratePersonalItemsOutput migrationItems(MigrationItems migrationItems) {
    
    this.migrationItems = migrationItems;
    return this;
  }

   /**
   * Get migrationItems
   * @return migrationItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MigrationItems getMigrationItems() {
    return migrationItems;
  }


  public void setMigrationItems(MigrationItems migrationItems) {
    this.migrationItems = migrationItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayMigratePersonalItemsOutput gatewayMigratePersonalItemsOutput = (GatewayMigratePersonalItemsOutput) o;
    return Objects.equals(this.migrationItems, gatewayMigratePersonalItemsOutput.migrationItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migrationItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayMigratePersonalItemsOutput {\n");
    sb.append("    migrationItems: ").append(toIndentedString(migrationItems)).append("\n");
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

