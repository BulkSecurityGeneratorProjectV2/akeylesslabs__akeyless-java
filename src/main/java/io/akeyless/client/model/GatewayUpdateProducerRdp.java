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
 * gatewayUpdateProducerRdp is a command that updates rdp producer
 */
@ApiModel(description = "gatewayUpdateProducerRdp is a command that updates rdp producer")

public class GatewayUpdateProducerRdp {
  public static final String SERIALIZED_NAME_FIXED_USER_ONLY = "fixed-user-only";
  @SerializedName(SERIALIZED_NAME_FIXED_USER_ONLY)
  private String fixedUserOnly = "false";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_RDP_ADMIN_NAME = "rdp-admin-name";
  @SerializedName(SERIALIZED_NAME_RDP_ADMIN_NAME)
  private String rdpAdminName;

  public static final String SERIALIZED_NAME_RDP_ADMIN_PWD = "rdp-admin-pwd";
  @SerializedName(SERIALIZED_NAME_RDP_ADMIN_PWD)
  private String rdpAdminPwd;

  public static final String SERIALIZED_NAME_RDP_HOST_NAME = "rdp-host-name";
  @SerializedName(SERIALIZED_NAME_RDP_HOST_NAME)
  private String rdpHostName;

  public static final String SERIALIZED_NAME_RDP_HOST_PORT = "rdp-host-port";
  @SerializedName(SERIALIZED_NAME_RDP_HOST_PORT)
  private String rdpHostPort = "22";

  public static final String SERIALIZED_NAME_RDP_USER_GROUPS = "rdp-user-groups";
  @SerializedName(SERIALIZED_NAME_RDP_USER_GROUPS)
  private String rdpUserGroups;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ALLOW_EXTERNAL_USER = "secure-access-allow-external-user";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ALLOW_EXTERNAL_USER)
  private Boolean secureAccessAllowExternalUser;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_HOST = "secure-access-host";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_HOST)
  private List<String> secureAccessHost = null;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_RDP_DOMAIN = "secure-access-rdp-domain";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_RDP_DOMAIN)
  private String secureAccessRdpDomain;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_RDP_USER = "secure-access-rdp-user";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_RDP_USER)
  private String secureAccessRdpUser;

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

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public GatewayUpdateProducerRdp fixedUserOnly(String fixedUserOnly) {
    
    this.fixedUserOnly = fixedUserOnly;
    return this;
  }

   /**
   * Fixed user
   * @return fixedUserOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fixed user")

  public String getFixedUserOnly() {
    return fixedUserOnly;
  }


  public void setFixedUserOnly(String fixedUserOnly) {
    this.fixedUserOnly = fixedUserOnly;
  }


  public GatewayUpdateProducerRdp name(String name) {
    
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


  public GatewayUpdateProducerRdp newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Producer name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Producer name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public GatewayUpdateProducerRdp password(String password) {
    
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


  public GatewayUpdateProducerRdp producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayUpdateProducerRdp rdpAdminName(String rdpAdminName) {
    
    this.rdpAdminName = rdpAdminName;
    return this;
  }

   /**
   * RDP Admin Name
   * @return rdpAdminName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RDP Admin Name")

  public String getRdpAdminName() {
    return rdpAdminName;
  }


  public void setRdpAdminName(String rdpAdminName) {
    this.rdpAdminName = rdpAdminName;
  }


  public GatewayUpdateProducerRdp rdpAdminPwd(String rdpAdminPwd) {
    
    this.rdpAdminPwd = rdpAdminPwd;
    return this;
  }

   /**
   * RDP Admin password
   * @return rdpAdminPwd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RDP Admin password")

  public String getRdpAdminPwd() {
    return rdpAdminPwd;
  }


  public void setRdpAdminPwd(String rdpAdminPwd) {
    this.rdpAdminPwd = rdpAdminPwd;
  }


  public GatewayUpdateProducerRdp rdpHostName(String rdpHostName) {
    
    this.rdpHostName = rdpHostName;
    return this;
  }

   /**
   * Hostname
   * @return rdpHostName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hostname")

  public String getRdpHostName() {
    return rdpHostName;
  }


  public void setRdpHostName(String rdpHostName) {
    this.rdpHostName = rdpHostName;
  }


  public GatewayUpdateProducerRdp rdpHostPort(String rdpHostPort) {
    
    this.rdpHostPort = rdpHostPort;
    return this;
  }

   /**
   * Port
   * @return rdpHostPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Port")

  public String getRdpHostPort() {
    return rdpHostPort;
  }


  public void setRdpHostPort(String rdpHostPort) {
    this.rdpHostPort = rdpHostPort;
  }


  public GatewayUpdateProducerRdp rdpUserGroups(String rdpUserGroups) {
    
    this.rdpUserGroups = rdpUserGroups;
    return this;
  }

   /**
   * Groups
   * @return rdpUserGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Groups")

  public String getRdpUserGroups() {
    return rdpUserGroups;
  }


  public void setRdpUserGroups(String rdpUserGroups) {
    this.rdpUserGroups = rdpUserGroups;
  }


  public GatewayUpdateProducerRdp secureAccessAllowExternalUser(Boolean secureAccessAllowExternalUser) {
    
    this.secureAccessAllowExternalUser = secureAccessAllowExternalUser;
    return this;
  }

   /**
   * Get secureAccessAllowExternalUser
   * @return secureAccessAllowExternalUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSecureAccessAllowExternalUser() {
    return secureAccessAllowExternalUser;
  }


  public void setSecureAccessAllowExternalUser(Boolean secureAccessAllowExternalUser) {
    this.secureAccessAllowExternalUser = secureAccessAllowExternalUser;
  }


  public GatewayUpdateProducerRdp secureAccessEnable(String secureAccessEnable) {
    
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


  public GatewayUpdateProducerRdp secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public GatewayUpdateProducerRdp addSecureAccessHostItem(String secureAccessHostItem) {
    if (this.secureAccessHost == null) {
      this.secureAccessHost = new ArrayList<String>();
    }
    this.secureAccessHost.add(secureAccessHostItem);
    return this;
  }

   /**
   * Get secureAccessHost
   * @return secureAccessHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSecureAccessHost() {
    return secureAccessHost;
  }


  public void setSecureAccessHost(List<String> secureAccessHost) {
    this.secureAccessHost = secureAccessHost;
  }


  public GatewayUpdateProducerRdp secureAccessRdpDomain(String secureAccessRdpDomain) {
    
    this.secureAccessRdpDomain = secureAccessRdpDomain;
    return this;
  }

   /**
   * Get secureAccessRdpDomain
   * @return secureAccessRdpDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessRdpDomain() {
    return secureAccessRdpDomain;
  }


  public void setSecureAccessRdpDomain(String secureAccessRdpDomain) {
    this.secureAccessRdpDomain = secureAccessRdpDomain;
  }


  public GatewayUpdateProducerRdp secureAccessRdpUser(String secureAccessRdpUser) {
    
    this.secureAccessRdpUser = secureAccessRdpUser;
    return this;
  }

   /**
   * Get secureAccessRdpUser
   * @return secureAccessRdpUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessRdpUser() {
    return secureAccessRdpUser;
  }


  public void setSecureAccessRdpUser(String secureAccessRdpUser) {
    this.secureAccessRdpUser = secureAccessRdpUser;
  }


  public GatewayUpdateProducerRdp targetName(String targetName) {
    
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


  public GatewayUpdateProducerRdp token(String token) {
    
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


  public GatewayUpdateProducerRdp uidToken(String uidToken) {
    
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


  public GatewayUpdateProducerRdp userTtl(String userTtl) {
    
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


  public GatewayUpdateProducerRdp username(String username) {
    
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
    GatewayUpdateProducerRdp gatewayUpdateProducerRdp = (GatewayUpdateProducerRdp) o;
    return Objects.equals(this.fixedUserOnly, gatewayUpdateProducerRdp.fixedUserOnly) &&
        Objects.equals(this.name, gatewayUpdateProducerRdp.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerRdp.newName) &&
        Objects.equals(this.password, gatewayUpdateProducerRdp.password) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayUpdateProducerRdp.producerEncryptionKeyName) &&
        Objects.equals(this.rdpAdminName, gatewayUpdateProducerRdp.rdpAdminName) &&
        Objects.equals(this.rdpAdminPwd, gatewayUpdateProducerRdp.rdpAdminPwd) &&
        Objects.equals(this.rdpHostName, gatewayUpdateProducerRdp.rdpHostName) &&
        Objects.equals(this.rdpHostPort, gatewayUpdateProducerRdp.rdpHostPort) &&
        Objects.equals(this.rdpUserGroups, gatewayUpdateProducerRdp.rdpUserGroups) &&
        Objects.equals(this.secureAccessAllowExternalUser, gatewayUpdateProducerRdp.secureAccessAllowExternalUser) &&
        Objects.equals(this.secureAccessEnable, gatewayUpdateProducerRdp.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, gatewayUpdateProducerRdp.secureAccessHost) &&
        Objects.equals(this.secureAccessRdpDomain, gatewayUpdateProducerRdp.secureAccessRdpDomain) &&
        Objects.equals(this.secureAccessRdpUser, gatewayUpdateProducerRdp.secureAccessRdpUser) &&
        Objects.equals(this.targetName, gatewayUpdateProducerRdp.targetName) &&
        Objects.equals(this.token, gatewayUpdateProducerRdp.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerRdp.uidToken) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerRdp.userTtl) &&
        Objects.equals(this.username, gatewayUpdateProducerRdp.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixedUserOnly, name, newName, password, producerEncryptionKeyName, rdpAdminName, rdpAdminPwd, rdpHostName, rdpHostPort, rdpUserGroups, secureAccessAllowExternalUser, secureAccessEnable, secureAccessHost, secureAccessRdpDomain, secureAccessRdpUser, targetName, token, uidToken, userTtl, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerRdp {\n");
    sb.append("    fixedUserOnly: ").append(toIndentedString(fixedUserOnly)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    rdpAdminName: ").append(toIndentedString(rdpAdminName)).append("\n");
    sb.append("    rdpAdminPwd: ").append(toIndentedString(rdpAdminPwd)).append("\n");
    sb.append("    rdpHostName: ").append(toIndentedString(rdpHostName)).append("\n");
    sb.append("    rdpHostPort: ").append(toIndentedString(rdpHostPort)).append("\n");
    sb.append("    rdpUserGroups: ").append(toIndentedString(rdpUserGroups)).append("\n");
    sb.append("    secureAccessAllowExternalUser: ").append(toIndentedString(secureAccessAllowExternalUser)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessHost: ").append(toIndentedString(secureAccessHost)).append("\n");
    sb.append("    secureAccessRdpDomain: ").append(toIndentedString(secureAccessRdpDomain)).append("\n");
    sb.append("    secureAccessRdpUser: ").append(toIndentedString(secureAccessRdpUser)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
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
