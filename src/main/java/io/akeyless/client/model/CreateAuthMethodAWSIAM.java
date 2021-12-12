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
 * createAuthMethodAWSIAM is a command that creates a new Auth Method that will be able to authenticate using AWS IAM credentials.
 */
@ApiModel(description = "createAuthMethodAWSIAM is a command that creates a new Auth Method that will be able to authenticate using AWS IAM credentials.")

public class CreateAuthMethodAWSIAM {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_BOUND_ARN = "bound-arn";
  @SerializedName(SERIALIZED_NAME_BOUND_ARN)
  private List<String> boundArn = null;

  public static final String SERIALIZED_NAME_BOUND_AWS_ACCOUNT_ID = "bound-aws-account-id";
  @SerializedName(SERIALIZED_NAME_BOUND_AWS_ACCOUNT_ID)
  private List<String> boundAwsAccountId = new ArrayList<String>();

  public static final String SERIALIZED_NAME_BOUND_IPS = "bound-ips";
  @SerializedName(SERIALIZED_NAME_BOUND_IPS)
  private List<String> boundIps = null;

  public static final String SERIALIZED_NAME_BOUND_RESOURCE_ID = "bound-resource-id";
  @SerializedName(SERIALIZED_NAME_BOUND_RESOURCE_ID)
  private List<String> boundResourceId = null;

  public static final String SERIALIZED_NAME_BOUND_ROLE_ID = "bound-role-id";
  @SerializedName(SERIALIZED_NAME_BOUND_ROLE_ID)
  private List<String> boundRoleId = null;

  public static final String SERIALIZED_NAME_BOUND_ROLE_NAME = "bound-role-name";
  @SerializedName(SERIALIZED_NAME_BOUND_ROLE_NAME)
  private List<String> boundRoleName = null;

  public static final String SERIALIZED_NAME_BOUND_USER_ID = "bound-user-id";
  @SerializedName(SERIALIZED_NAME_BOUND_USER_ID)
  private List<String> boundUserId = null;

  public static final String SERIALIZED_NAME_BOUND_USER_NAME = "bound-user-name";
  @SerializedName(SERIALIZED_NAME_BOUND_USER_NAME)
  private List<String> boundUserName = null;

  public static final String SERIALIZED_NAME_FORCE_SUB_CLAIMS = "force-sub-claims";
  @SerializedName(SERIALIZED_NAME_FORCE_SUB_CLAIMS)
  private Boolean forceSubClaims;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_STS_URL = "sts-url";
  @SerializedName(SERIALIZED_NAME_STS_URL)
  private String stsUrl = "https://sts.amazonaws.com";

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public CreateAuthMethodAWSIAM accessExpires(Long accessExpires) {
    
    this.accessExpires = accessExpires;
    return this;
  }

   /**
   * Access expiration date in Unix timestamp (select 0 for access without expiry date)
   * @return accessExpires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access expiration date in Unix timestamp (select 0 for access without expiry date)")

  public Long getAccessExpires() {
    return accessExpires;
  }


  public void setAccessExpires(Long accessExpires) {
    this.accessExpires = accessExpires;
  }


  public CreateAuthMethodAWSIAM boundArn(List<String> boundArn) {
    
    this.boundArn = boundArn;
    return this;
  }

  public CreateAuthMethodAWSIAM addBoundArnItem(String boundArnItem) {
    if (this.boundArn == null) {
      this.boundArn = new ArrayList<String>();
    }
    this.boundArn.add(boundArnItem);
    return this;
  }

   /**
   * A list of full arns that the access is restricted to
   * @return boundArn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full arns that the access is restricted to")

  public List<String> getBoundArn() {
    return boundArn;
  }


  public void setBoundArn(List<String> boundArn) {
    this.boundArn = boundArn;
  }


  public CreateAuthMethodAWSIAM boundAwsAccountId(List<String> boundAwsAccountId) {
    
    this.boundAwsAccountId = boundAwsAccountId;
    return this;
  }

  public CreateAuthMethodAWSIAM addBoundAwsAccountIdItem(String boundAwsAccountIdItem) {
    this.boundAwsAccountId.add(boundAwsAccountIdItem);
    return this;
  }

   /**
   * A list of AWS account-IDs that the access is restricted to
   * @return boundAwsAccountId
  **/
  @ApiModelProperty(required = true, value = "A list of AWS account-IDs that the access is restricted to")

  public List<String> getBoundAwsAccountId() {
    return boundAwsAccountId;
  }


  public void setBoundAwsAccountId(List<String> boundAwsAccountId) {
    this.boundAwsAccountId = boundAwsAccountId;
  }


  public CreateAuthMethodAWSIAM boundIps(List<String> boundIps) {
    
    this.boundIps = boundIps;
    return this;
  }

  public CreateAuthMethodAWSIAM addBoundIpsItem(String boundIpsItem) {
    if (this.boundIps == null) {
      this.boundIps = new ArrayList<String>();
    }
    this.boundIps.add(boundIpsItem);
    return this;
  }

   /**
   * A CIDR whitelist with the IPs that the access is restricted to
   * @return boundIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A CIDR whitelist with the IPs that the access is restricted to")

  public List<String> getBoundIps() {
    return boundIps;
  }


  public void setBoundIps(List<String> boundIps) {
    this.boundIps = boundIps;
  }


  public CreateAuthMethodAWSIAM boundResourceId(List<String> boundResourceId) {
    
    this.boundResourceId = boundResourceId;
    return this;
  }

  public CreateAuthMethodAWSIAM addBoundResourceIdItem(String boundResourceIdItem) {
    if (this.boundResourceId == null) {
      this.boundResourceId = new ArrayList<String>();
    }
    this.boundResourceId.add(boundResourceIdItem);
    return this;
  }

   /**
   * A list of full resource ids that the access is restricted to
   * @return boundResourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full resource ids that the access is restricted to")

  public List<String> getBoundResourceId() {
    return boundResourceId;
  }


  public void setBoundResourceId(List<String> boundResourceId) {
    this.boundResourceId = boundResourceId;
  }


  public CreateAuthMethodAWSIAM boundRoleId(List<String> boundRoleId) {
    
    this.boundRoleId = boundRoleId;
    return this;
  }

  public CreateAuthMethodAWSIAM addBoundRoleIdItem(String boundRoleIdItem) {
    if (this.boundRoleId == null) {
      this.boundRoleId = new ArrayList<String>();
    }
    this.boundRoleId.add(boundRoleIdItem);
    return this;
  }

   /**
   * A list of full role ids that the access is restricted to
   * @return boundRoleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full role ids that the access is restricted to")

  public List<String> getBoundRoleId() {
    return boundRoleId;
  }


  public void setBoundRoleId(List<String> boundRoleId) {
    this.boundRoleId = boundRoleId;
  }


  public CreateAuthMethodAWSIAM boundRoleName(List<String> boundRoleName) {
    
    this.boundRoleName = boundRoleName;
    return this;
  }

  public CreateAuthMethodAWSIAM addBoundRoleNameItem(String boundRoleNameItem) {
    if (this.boundRoleName == null) {
      this.boundRoleName = new ArrayList<String>();
    }
    this.boundRoleName.add(boundRoleNameItem);
    return this;
  }

   /**
   * A list of full role-name that the access is restricted to
   * @return boundRoleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full role-name that the access is restricted to")

  public List<String> getBoundRoleName() {
    return boundRoleName;
  }


  public void setBoundRoleName(List<String> boundRoleName) {
    this.boundRoleName = boundRoleName;
  }


  public CreateAuthMethodAWSIAM boundUserId(List<String> boundUserId) {
    
    this.boundUserId = boundUserId;
    return this;
  }

  public CreateAuthMethodAWSIAM addBoundUserIdItem(String boundUserIdItem) {
    if (this.boundUserId == null) {
      this.boundUserId = new ArrayList<String>();
    }
    this.boundUserId.add(boundUserIdItem);
    return this;
  }

   /**
   * A list of full user ids that the access is restricted to
   * @return boundUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full user ids that the access is restricted to")

  public List<String> getBoundUserId() {
    return boundUserId;
  }


  public void setBoundUserId(List<String> boundUserId) {
    this.boundUserId = boundUserId;
  }


  public CreateAuthMethodAWSIAM boundUserName(List<String> boundUserName) {
    
    this.boundUserName = boundUserName;
    return this;
  }

  public CreateAuthMethodAWSIAM addBoundUserNameItem(String boundUserNameItem) {
    if (this.boundUserName == null) {
      this.boundUserName = new ArrayList<String>();
    }
    this.boundUserName.add(boundUserNameItem);
    return this;
  }

   /**
   * A list of full user-name that the access is restricted to
   * @return boundUserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of full user-name that the access is restricted to")

  public List<String> getBoundUserName() {
    return boundUserName;
  }


  public void setBoundUserName(List<String> boundUserName) {
    this.boundUserName = boundUserName;
  }


  public CreateAuthMethodAWSIAM forceSubClaims(Boolean forceSubClaims) {
    
    this.forceSubClaims = forceSubClaims;
    return this;
  }

   /**
   * if true: enforce role-association must include sub claims
   * @return forceSubClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if true: enforce role-association must include sub claims")

  public Boolean getForceSubClaims() {
    return forceSubClaims;
  }


  public void setForceSubClaims(Boolean forceSubClaims) {
    this.forceSubClaims = forceSubClaims;
  }


  public CreateAuthMethodAWSIAM name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Auth Method name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Auth Method name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateAuthMethodAWSIAM password(String password) {
    
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


  public CreateAuthMethodAWSIAM stsUrl(String stsUrl) {
    
    this.stsUrl = stsUrl;
    return this;
  }

   /**
   * sts URL
   * @return stsUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "sts URL")

  public String getStsUrl() {
    return stsUrl;
  }


  public void setStsUrl(String stsUrl) {
    this.stsUrl = stsUrl;
  }


  public CreateAuthMethodAWSIAM token(String token) {
    
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


  public CreateAuthMethodAWSIAM uidToken(String uidToken) {
    
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


  public CreateAuthMethodAWSIAM username(String username) {
    
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
    CreateAuthMethodAWSIAM createAuthMethodAWSIAM = (CreateAuthMethodAWSIAM) o;
    return Objects.equals(this.accessExpires, createAuthMethodAWSIAM.accessExpires) &&
        Objects.equals(this.boundArn, createAuthMethodAWSIAM.boundArn) &&
        Objects.equals(this.boundAwsAccountId, createAuthMethodAWSIAM.boundAwsAccountId) &&
        Objects.equals(this.boundIps, createAuthMethodAWSIAM.boundIps) &&
        Objects.equals(this.boundResourceId, createAuthMethodAWSIAM.boundResourceId) &&
        Objects.equals(this.boundRoleId, createAuthMethodAWSIAM.boundRoleId) &&
        Objects.equals(this.boundRoleName, createAuthMethodAWSIAM.boundRoleName) &&
        Objects.equals(this.boundUserId, createAuthMethodAWSIAM.boundUserId) &&
        Objects.equals(this.boundUserName, createAuthMethodAWSIAM.boundUserName) &&
        Objects.equals(this.forceSubClaims, createAuthMethodAWSIAM.forceSubClaims) &&
        Objects.equals(this.name, createAuthMethodAWSIAM.name) &&
        Objects.equals(this.password, createAuthMethodAWSIAM.password) &&
        Objects.equals(this.stsUrl, createAuthMethodAWSIAM.stsUrl) &&
        Objects.equals(this.token, createAuthMethodAWSIAM.token) &&
        Objects.equals(this.uidToken, createAuthMethodAWSIAM.uidToken) &&
        Objects.equals(this.username, createAuthMethodAWSIAM.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, boundArn, boundAwsAccountId, boundIps, boundResourceId, boundRoleId, boundRoleName, boundUserId, boundUserName, forceSubClaims, name, password, stsUrl, token, uidToken, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAuthMethodAWSIAM {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    boundArn: ").append(toIndentedString(boundArn)).append("\n");
    sb.append("    boundAwsAccountId: ").append(toIndentedString(boundAwsAccountId)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    boundResourceId: ").append(toIndentedString(boundResourceId)).append("\n");
    sb.append("    boundRoleId: ").append(toIndentedString(boundRoleId)).append("\n");
    sb.append("    boundRoleName: ").append(toIndentedString(boundRoleName)).append("\n");
    sb.append("    boundUserId: ").append(toIndentedString(boundUserId)).append("\n");
    sb.append("    boundUserName: ").append(toIndentedString(boundUserName)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    stsUrl: ").append(toIndentedString(stsUrl)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

