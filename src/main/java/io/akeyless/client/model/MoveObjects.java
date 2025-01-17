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

/**
 * MoveObjects
 */

public class MoveObjects {
  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_OBJECTS_TYPE = "objects-type";
  @SerializedName(SERIALIZED_NAME_OBJECTS_TYPE)
  private String objectsType = "item";

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public MoveObjects json(Boolean json) {
    
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


  public MoveObjects objectsType(String objectsType) {
    
    this.objectsType = objectsType;
    return this;
  }

   /**
   * The objects type to move (item/auth_method/role)
   * @return objectsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The objects type to move (item/auth_method/role)")

  public String getObjectsType() {
    return objectsType;
  }


  public void setObjectsType(String objectsType) {
    this.objectsType = objectsType;
  }


  public MoveObjects source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Source path to move the objects from
   * @return source
  **/
  @ApiModelProperty(required = true, value = "Source path to move the objects from")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public MoveObjects target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * Target path to move the objects to
   * @return target
  **/
  @ApiModelProperty(required = true, value = "Target path to move the objects to")

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public MoveObjects token(String token) {
    
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


  public MoveObjects uidToken(String uidToken) {
    
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
    MoveObjects moveObjects = (MoveObjects) o;
    return Objects.equals(this.json, moveObjects.json) &&
        Objects.equals(this.objectsType, moveObjects.objectsType) &&
        Objects.equals(this.source, moveObjects.source) &&
        Objects.equals(this.target, moveObjects.target) &&
        Objects.equals(this.token, moveObjects.token) &&
        Objects.equals(this.uidToken, moveObjects.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(json, objectsType, source, target, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveObjects {\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    objectsType: ").append(toIndentedString(objectsType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

