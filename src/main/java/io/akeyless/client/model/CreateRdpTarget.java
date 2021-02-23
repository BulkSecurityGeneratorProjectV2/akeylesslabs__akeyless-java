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
 * CreateRdpTarget
 */

public class CreateRdpTarget {
  public static final String SERIALIZED_NAME_ADMIN_NAME = "admin_name";
  @SerializedName(SERIALIZED_NAME_ADMIN_NAME)
  private String adminName;

  public static final String SERIALIZED_NAME_ADMIN_PWD = "admin_pwd";
  @SerializedName(SERIALIZED_NAME_ADMIN_PWD)
  private String adminPwd;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_HOST_NAME = "host_name";
  @SerializedName(SERIALIZED_NAME_HOST_NAME)
  private String hostName;

  public static final String SERIALIZED_NAME_HOST_PORT = "host_port";
  @SerializedName(SERIALIZED_NAME_HOST_PORT)
  private String hostPort;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROTECTION_KEY = "protection_key";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY)
  private String protectionKey;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public CreateRdpTarget adminName(String adminName) {
    
    this.adminName = adminName;
    return this;
  }

   /**
   * Get adminName
   * @return adminName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdminName() {
    return adminName;
  }


  public void setAdminName(String adminName) {
    this.adminName = adminName;
  }


  public CreateRdpTarget adminPwd(String adminPwd) {
    
    this.adminPwd = adminPwd;
    return this;
  }

   /**
   * Get adminPwd
   * @return adminPwd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdminPwd() {
    return adminPwd;
  }


  public void setAdminPwd(String adminPwd) {
    this.adminPwd = adminPwd;
  }


  public CreateRdpTarget comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Comment about the target
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comment about the target")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public CreateRdpTarget hostName(String hostName) {
    
    this.hostName = hostName;
    return this;
  }

   /**
   * Get hostName
   * @return hostName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostName() {
    return hostName;
  }


  public void setHostName(String hostName) {
    this.hostName = hostName;
  }


  public CreateRdpTarget hostPort(String hostPort) {
    
    this.hostPort = hostPort;
    return this;
  }

   /**
   * Get hostPort
   * @return hostPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostPort() {
    return hostPort;
  }


  public void setHostPort(String hostPort) {
    this.hostPort = hostPort;
  }


  public CreateRdpTarget name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Target name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Target name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateRdpTarget protectionKey(String protectionKey) {
    
    this.protectionKey = protectionKey;
    return this;
  }

   /**
   * The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)
   * @return protectionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)")

  public String getProtectionKey() {
    return protectionKey;
  }


  public void setProtectionKey(String protectionKey) {
    this.protectionKey = protectionKey;
  }


  public CreateRdpTarget token(String token) {
    
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


  public CreateRdpTarget uidToken(String uidToken) {
    
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
    CreateRdpTarget createRdpTarget = (CreateRdpTarget) o;
    return Objects.equals(this.adminName, createRdpTarget.adminName) &&
        Objects.equals(this.adminPwd, createRdpTarget.adminPwd) &&
        Objects.equals(this.comment, createRdpTarget.comment) &&
        Objects.equals(this.hostName, createRdpTarget.hostName) &&
        Objects.equals(this.hostPort, createRdpTarget.hostPort) &&
        Objects.equals(this.name, createRdpTarget.name) &&
        Objects.equals(this.protectionKey, createRdpTarget.protectionKey) &&
        Objects.equals(this.token, createRdpTarget.token) &&
        Objects.equals(this.uidToken, createRdpTarget.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminName, adminPwd, comment, hostName, hostPort, name, protectionKey, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRdpTarget {\n");
    sb.append("    adminName: ").append(toIndentedString(adminName)).append("\n");
    sb.append("    adminPwd: ").append(toIndentedString(adminPwd)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protectionKey: ").append(toIndentedString(protectionKey)).append("\n");
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

