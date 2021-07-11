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
 * gatewayCreateProducerAws is a command that creates aws producer
 */
@ApiModel(description = "gatewayCreateProducerAws is a command that creates aws producer")

public class GatewayCreateProducerAws {
  public static final String SERIALIZED_NAME_ACCESS_MODE = "access-mode";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODE)
  private String accessMode;

  public static final String SERIALIZED_NAME_ADMIN_ROTATION_INTERVAL_DAYS = "admin-rotation-interval-days";
  @SerializedName(SERIALIZED_NAME_ADMIN_ROTATION_INTERVAL_DAYS)
  private Long adminRotationIntervalDays = 0l;

  public static final String SERIALIZED_NAME_AWS_ACCESS_KEY_ID = "aws-access-key-id";
  @SerializedName(SERIALIZED_NAME_AWS_ACCESS_KEY_ID)
  private String awsAccessKeyId;

  public static final String SERIALIZED_NAME_AWS_ACCESS_SECRET_KEY = "aws-access-secret-key";
  @SerializedName(SERIALIZED_NAME_AWS_ACCESS_SECRET_KEY)
  private String awsAccessSecretKey;

  public static final String SERIALIZED_NAME_AWS_ROLE_ARNS = "aws-role-arns";
  @SerializedName(SERIALIZED_NAME_AWS_ROLE_ARNS)
  private String awsRoleArns;

  public static final String SERIALIZED_NAME_AWS_USER_CONSOLE_ACCESS = "aws-user-console-access";
  @SerializedName(SERIALIZED_NAME_AWS_USER_CONSOLE_ACCESS)
  private Boolean awsUserConsoleAccess = false;

  public static final String SERIALIZED_NAME_AWS_USER_GROUPS = "aws-user-groups";
  @SerializedName(SERIALIZED_NAME_AWS_USER_GROUPS)
  private String awsUserGroups;

  public static final String SERIALIZED_NAME_AWS_USER_POLICIES = "aws-user-policies";
  @SerializedName(SERIALIZED_NAME_AWS_USER_POLICIES)
  private String awsUserPolicies;

  public static final String SERIALIZED_NAME_AWS_USER_PROGRAMMATIC_ACCESS = "aws-user-programmatic-access";
  @SerializedName(SERIALIZED_NAME_AWS_USER_PROGRAMMATIC_ACCESS)
  private Boolean awsUserProgrammaticAccess = true;

  public static final String SERIALIZED_NAME_ENABLE_ADMIN_ROTATION = "enable-admin-rotation";
  @SerializedName(SERIALIZED_NAME_ENABLE_ADMIN_ROTATION)
  private Boolean enableAdminRotation = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region = "us-east-2";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  private String userTtl = "60m";

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public GatewayCreateProducerAws accessMode(String accessMode) {
    
    this.accessMode = accessMode;
    return this;
  }

   /**
   * Get accessMode
   * @return accessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessMode() {
    return accessMode;
  }


  public void setAccessMode(String accessMode) {
    this.accessMode = accessMode;
  }


  public GatewayCreateProducerAws adminRotationIntervalDays(Long adminRotationIntervalDays) {
    
    this.adminRotationIntervalDays = adminRotationIntervalDays;
    return this;
  }

   /**
   * Admin credentials rotation interval (days)
   * @return adminRotationIntervalDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Admin credentials rotation interval (days)")

  public Long getAdminRotationIntervalDays() {
    return adminRotationIntervalDays;
  }


  public void setAdminRotationIntervalDays(Long adminRotationIntervalDays) {
    this.adminRotationIntervalDays = adminRotationIntervalDays;
  }


  public GatewayCreateProducerAws awsAccessKeyId(String awsAccessKeyId) {
    
    this.awsAccessKeyId = awsAccessKeyId;
    return this;
  }

   /**
   * Access Key ID
   * @return awsAccessKeyId
  **/
  @ApiModelProperty(required = true, value = "Access Key ID")

  public String getAwsAccessKeyId() {
    return awsAccessKeyId;
  }


  public void setAwsAccessKeyId(String awsAccessKeyId) {
    this.awsAccessKeyId = awsAccessKeyId;
  }


  public GatewayCreateProducerAws awsAccessSecretKey(String awsAccessSecretKey) {
    
    this.awsAccessSecretKey = awsAccessSecretKey;
    return this;
  }

   /**
   * Secret Access Key
   * @return awsAccessSecretKey
  **/
  @ApiModelProperty(required = true, value = "Secret Access Key")

  public String getAwsAccessSecretKey() {
    return awsAccessSecretKey;
  }


  public void setAwsAccessSecretKey(String awsAccessSecretKey) {
    this.awsAccessSecretKey = awsAccessSecretKey;
  }


  public GatewayCreateProducerAws awsRoleArns(String awsRoleArns) {
    
    this.awsRoleArns = awsRoleArns;
    return this;
  }

   /**
   * AWS Role ARNs to be used in the Assume Role operation (relevant only for assume_role mode)
   * @return awsRoleArns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS Role ARNs to be used in the Assume Role operation (relevant only for assume_role mode)")

  public String getAwsRoleArns() {
    return awsRoleArns;
  }


  public void setAwsRoleArns(String awsRoleArns) {
    this.awsRoleArns = awsRoleArns;
  }


  public GatewayCreateProducerAws awsUserConsoleAccess(Boolean awsUserConsoleAccess) {
    
    this.awsUserConsoleAccess = awsUserConsoleAccess;
    return this;
  }

   /**
   * AWS User console access
   * @return awsUserConsoleAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS User console access")

  public Boolean getAwsUserConsoleAccess() {
    return awsUserConsoleAccess;
  }


  public void setAwsUserConsoleAccess(Boolean awsUserConsoleAccess) {
    this.awsUserConsoleAccess = awsUserConsoleAccess;
  }


  public GatewayCreateProducerAws awsUserGroups(String awsUserGroups) {
    
    this.awsUserGroups = awsUserGroups;
    return this;
  }

   /**
   * AWS User groups
   * @return awsUserGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS User groups")

  public String getAwsUserGroups() {
    return awsUserGroups;
  }


  public void setAwsUserGroups(String awsUserGroups) {
    this.awsUserGroups = awsUserGroups;
  }


  public GatewayCreateProducerAws awsUserPolicies(String awsUserPolicies) {
    
    this.awsUserPolicies = awsUserPolicies;
    return this;
  }

   /**
   * AWS User policies
   * @return awsUserPolicies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS User policies")

  public String getAwsUserPolicies() {
    return awsUserPolicies;
  }


  public void setAwsUserPolicies(String awsUserPolicies) {
    this.awsUserPolicies = awsUserPolicies;
  }


  public GatewayCreateProducerAws awsUserProgrammaticAccess(Boolean awsUserProgrammaticAccess) {
    
    this.awsUserProgrammaticAccess = awsUserProgrammaticAccess;
    return this;
  }

   /**
   * AWS User programmatic access
   * @return awsUserProgrammaticAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS User programmatic access")

  public Boolean getAwsUserProgrammaticAccess() {
    return awsUserProgrammaticAccess;
  }


  public void setAwsUserProgrammaticAccess(Boolean awsUserProgrammaticAccess) {
    this.awsUserProgrammaticAccess = awsUserProgrammaticAccess;
  }


  public GatewayCreateProducerAws enableAdminRotation(Boolean enableAdminRotation) {
    
    this.enableAdminRotation = enableAdminRotation;
    return this;
  }

   /**
   * Automatic admin credentials rotation
   * @return enableAdminRotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Automatic admin credentials rotation")

  public Boolean getEnableAdminRotation() {
    return enableAdminRotation;
  }


  public void setEnableAdminRotation(Boolean enableAdminRotation) {
    this.enableAdminRotation = enableAdminRotation;
  }


  public GatewayCreateProducerAws name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Producer name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Producer name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GatewayCreateProducerAws password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Required only when the authentication process requires a username and password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only when the authentication process requires a username and password")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public GatewayCreateProducerAws producerEncryptionKeyName(String producerEncryptionKeyName) {
    
    this.producerEncryptionKeyName = producerEncryptionKeyName;
    return this;
  }

   /**
   * Dynamic producer encryption key
   * @return producerEncryptionKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dynamic producer encryption key")

  public String getProducerEncryptionKeyName() {
    return producerEncryptionKeyName;
  }


  public void setProducerEncryptionKeyName(String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
  }


  public GatewayCreateProducerAws region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Region")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public GatewayCreateProducerAws token(String token) {
    
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


  public GatewayCreateProducerAws uidToken(String uidToken) {
    
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


  public GatewayCreateProducerAws userTtl(String userTtl) {
    
    this.userTtl = userTtl;
    return this;
  }

   /**
   * User TTL
   * @return userTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User TTL")

  public String getUserTtl() {
    return userTtl;
  }


  public void setUserTtl(String userTtl) {
    this.userTtl = userTtl;
  }


  public GatewayCreateProducerAws username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Required only when the authentication process requires a username and password
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required only when the authentication process requires a username and password")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayCreateProducerAws gatewayCreateProducerAws = (GatewayCreateProducerAws) o;
    return Objects.equals(this.accessMode, gatewayCreateProducerAws.accessMode) &&
        Objects.equals(this.adminRotationIntervalDays, gatewayCreateProducerAws.adminRotationIntervalDays) &&
        Objects.equals(this.awsAccessKeyId, gatewayCreateProducerAws.awsAccessKeyId) &&
        Objects.equals(this.awsAccessSecretKey, gatewayCreateProducerAws.awsAccessSecretKey) &&
        Objects.equals(this.awsRoleArns, gatewayCreateProducerAws.awsRoleArns) &&
        Objects.equals(this.awsUserConsoleAccess, gatewayCreateProducerAws.awsUserConsoleAccess) &&
        Objects.equals(this.awsUserGroups, gatewayCreateProducerAws.awsUserGroups) &&
        Objects.equals(this.awsUserPolicies, gatewayCreateProducerAws.awsUserPolicies) &&
        Objects.equals(this.awsUserProgrammaticAccess, gatewayCreateProducerAws.awsUserProgrammaticAccess) &&
        Objects.equals(this.enableAdminRotation, gatewayCreateProducerAws.enableAdminRotation) &&
        Objects.equals(this.name, gatewayCreateProducerAws.name) &&
        Objects.equals(this.password, gatewayCreateProducerAws.password) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayCreateProducerAws.producerEncryptionKeyName) &&
        Objects.equals(this.region, gatewayCreateProducerAws.region) &&
        Objects.equals(this.token, gatewayCreateProducerAws.token) &&
        Objects.equals(this.uidToken, gatewayCreateProducerAws.uidToken) &&
        Objects.equals(this.userTtl, gatewayCreateProducerAws.userTtl) &&
        Objects.equals(this.username, gatewayCreateProducerAws.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, adminRotationIntervalDays, awsAccessKeyId, awsAccessSecretKey, awsRoleArns, awsUserConsoleAccess, awsUserGroups, awsUserPolicies, awsUserProgrammaticAccess, enableAdminRotation, name, password, producerEncryptionKeyName, region, token, uidToken, userTtl, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateProducerAws {\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    adminRotationIntervalDays: ").append(toIndentedString(adminRotationIntervalDays)).append("\n");
    sb.append("    awsAccessKeyId: ").append(toIndentedString(awsAccessKeyId)).append("\n");
    sb.append("    awsAccessSecretKey: ").append(toIndentedString(awsAccessSecretKey)).append("\n");
    sb.append("    awsRoleArns: ").append(toIndentedString(awsRoleArns)).append("\n");
    sb.append("    awsUserConsoleAccess: ").append(toIndentedString(awsUserConsoleAccess)).append("\n");
    sb.append("    awsUserGroups: ").append(toIndentedString(awsUserGroups)).append("\n");
    sb.append("    awsUserPolicies: ").append(toIndentedString(awsUserPolicies)).append("\n");
    sb.append("    awsUserProgrammaticAccess: ").append(toIndentedString(awsUserProgrammaticAccess)).append("\n");
    sb.append("    enableAdminRotation: ").append(toIndentedString(enableAdminRotation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userTtl: ").append(toIndentedString(userTtl)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

