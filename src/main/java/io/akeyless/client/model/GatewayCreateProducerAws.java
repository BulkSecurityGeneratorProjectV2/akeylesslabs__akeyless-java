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

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_ENABLE_ADMIN_ROTATION = "enable-admin-rotation";
  @SerializedName(SERIALIZED_NAME_ENABLE_ADMIN_ROTATION)
  private Boolean enableAdminRotation = false;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region = "us-east-2";

  public static final String SERIALIZED_NAME_SECURE_ACCESS_AWS_ACCOUNT_ID = "secure-access-aws-account-id";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_AWS_ACCOUNT_ID)
  private String secureAccessAwsAccountId;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_AWS_NATIVE_CLI = "secure-access-aws-native-cli";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_AWS_NATIVE_CLI)
  private Boolean secureAccessAwsNativeCli;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  private String secureAccessBastionIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB = "secure-access-web";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB)
  private Boolean secureAccessWeb;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING = "secure-access-web-browsing";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_BROWSING)
  private Boolean secureAccessWebBrowsing;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY = "secure-access-web-proxy";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB_PROXY)
  private Boolean secureAccessWebProxy;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TARGET_NAME = "target-name";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME)
  private String targetName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  private String userTtl = "60m";


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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access Key ID")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secret Access Key")

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


  public GatewayCreateProducerAws deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this item
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this item")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
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


  public GatewayCreateProducerAws json(Boolean json) {
    
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


  public GatewayCreateProducerAws secureAccessAwsAccountId(String secureAccessAwsAccountId) {
    
    this.secureAccessAwsAccountId = secureAccessAwsAccountId;
    return this;
  }

   /**
   * Get secureAccessAwsAccountId
   * @return secureAccessAwsAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessAwsAccountId() {
    return secureAccessAwsAccountId;
  }


  public void setSecureAccessAwsAccountId(String secureAccessAwsAccountId) {
    this.secureAccessAwsAccountId = secureAccessAwsAccountId;
  }


  public GatewayCreateProducerAws secureAccessAwsNativeCli(Boolean secureAccessAwsNativeCli) {
    
    this.secureAccessAwsNativeCli = secureAccessAwsNativeCli;
    return this;
  }

   /**
   * Get secureAccessAwsNativeCli
   * @return secureAccessAwsNativeCli
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSecureAccessAwsNativeCli() {
    return secureAccessAwsNativeCli;
  }


  public void setSecureAccessAwsNativeCli(Boolean secureAccessAwsNativeCli) {
    this.secureAccessAwsNativeCli = secureAccessAwsNativeCli;
  }


  public GatewayCreateProducerAws secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
    return this;
  }

   /**
   * Get secureAccessBastionIssuer
   * @return secureAccessBastionIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessBastionIssuer() {
    return secureAccessBastionIssuer;
  }


  public void setSecureAccessBastionIssuer(String secureAccessBastionIssuer) {
    this.secureAccessBastionIssuer = secureAccessBastionIssuer;
  }


  public GatewayCreateProducerAws secureAccessEnable(String secureAccessEnable) {
    
    this.secureAccessEnable = secureAccessEnable;
    return this;
  }

   /**
   * Get secureAccessEnable
   * @return secureAccessEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessEnable() {
    return secureAccessEnable;
  }


  public void setSecureAccessEnable(String secureAccessEnable) {
    this.secureAccessEnable = secureAccessEnable;
  }


  public GatewayCreateProducerAws secureAccessWeb(Boolean secureAccessWeb) {
    
    this.secureAccessWeb = secureAccessWeb;
    return this;
  }

   /**
   * Get secureAccessWeb
   * @return secureAccessWeb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSecureAccessWeb() {
    return secureAccessWeb;
  }


  public void setSecureAccessWeb(Boolean secureAccessWeb) {
    this.secureAccessWeb = secureAccessWeb;
  }


  public GatewayCreateProducerAws secureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    
    this.secureAccessWebBrowsing = secureAccessWebBrowsing;
    return this;
  }

   /**
   * Get secureAccessWebBrowsing
   * @return secureAccessWebBrowsing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSecureAccessWebBrowsing() {
    return secureAccessWebBrowsing;
  }


  public void setSecureAccessWebBrowsing(Boolean secureAccessWebBrowsing) {
    this.secureAccessWebBrowsing = secureAccessWebBrowsing;
  }


  public GatewayCreateProducerAws secureAccessWebProxy(Boolean secureAccessWebProxy) {
    
    this.secureAccessWebProxy = secureAccessWebProxy;
    return this;
  }

   /**
   * Get secureAccessWebProxy
   * @return secureAccessWebProxy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSecureAccessWebProxy() {
    return secureAccessWebProxy;
  }


  public void setSecureAccessWebProxy(Boolean secureAccessWebProxy) {
    this.secureAccessWebProxy = secureAccessWebProxy;
  }


  public GatewayCreateProducerAws tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayCreateProducerAws addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of the tags attached to this secret
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the tags attached to this secret")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public GatewayCreateProducerAws targetName(String targetName) {
    
    this.targetName = targetName;
    return this;
  }

   /**
   * Target name
   * @return targetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target name")

  public String getTargetName() {
    return targetName;
  }


  public void setTargetName(String targetName) {
    this.targetName = targetName;
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
        Objects.equals(this.deleteProtection, gatewayCreateProducerAws.deleteProtection) &&
        Objects.equals(this.enableAdminRotation, gatewayCreateProducerAws.enableAdminRotation) &&
        Objects.equals(this.json, gatewayCreateProducerAws.json) &&
        Objects.equals(this.name, gatewayCreateProducerAws.name) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayCreateProducerAws.producerEncryptionKeyName) &&
        Objects.equals(this.region, gatewayCreateProducerAws.region) &&
        Objects.equals(this.secureAccessAwsAccountId, gatewayCreateProducerAws.secureAccessAwsAccountId) &&
        Objects.equals(this.secureAccessAwsNativeCli, gatewayCreateProducerAws.secureAccessAwsNativeCli) &&
        Objects.equals(this.secureAccessBastionIssuer, gatewayCreateProducerAws.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessEnable, gatewayCreateProducerAws.secureAccessEnable) &&
        Objects.equals(this.secureAccessWeb, gatewayCreateProducerAws.secureAccessWeb) &&
        Objects.equals(this.secureAccessWebBrowsing, gatewayCreateProducerAws.secureAccessWebBrowsing) &&
        Objects.equals(this.secureAccessWebProxy, gatewayCreateProducerAws.secureAccessWebProxy) &&
        Objects.equals(this.tags, gatewayCreateProducerAws.tags) &&
        Objects.equals(this.targetName, gatewayCreateProducerAws.targetName) &&
        Objects.equals(this.token, gatewayCreateProducerAws.token) &&
        Objects.equals(this.uidToken, gatewayCreateProducerAws.uidToken) &&
        Objects.equals(this.userTtl, gatewayCreateProducerAws.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, adminRotationIntervalDays, awsAccessKeyId, awsAccessSecretKey, awsRoleArns, awsUserConsoleAccess, awsUserGroups, awsUserPolicies, awsUserProgrammaticAccess, deleteProtection, enableAdminRotation, json, name, producerEncryptionKeyName, region, secureAccessAwsAccountId, secureAccessAwsNativeCli, secureAccessBastionIssuer, secureAccessEnable, secureAccessWeb, secureAccessWebBrowsing, secureAccessWebProxy, tags, targetName, token, uidToken, userTtl);
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
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    enableAdminRotation: ").append(toIndentedString(enableAdminRotation)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    secureAccessAwsAccountId: ").append(toIndentedString(secureAccessAwsAccountId)).append("\n");
    sb.append("    secureAccessAwsNativeCli: ").append(toIndentedString(secureAccessAwsNativeCli)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessWeb: ").append(toIndentedString(secureAccessWeb)).append("\n");
    sb.append("    secureAccessWebBrowsing: ").append(toIndentedString(secureAccessWebBrowsing)).append("\n");
    sb.append("    secureAccessWebProxy: ").append(toIndentedString(secureAccessWebProxy)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userTtl: ").append(toIndentedString(userTtl)).append("\n");
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

