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
 * gatewayUpdateProducerGcp is a command that updates a GCP producer
 */
@ApiModel(description = "gatewayUpdateProducerGcp is a command that updates a GCP producer")

public class GatewayUpdateProducerGcp {
  public static final String SERIALIZED_NAME_GCP_CRED_TYPE = "gcp-cred-type";
  @SerializedName(SERIALIZED_NAME_GCP_CRED_TYPE)
  private String gcpCredType;

  public static final String SERIALIZED_NAME_GCP_KEY = "gcp-key";
  @SerializedName(SERIALIZED_NAME_GCP_KEY)
  private String gcpKey;

  public static final String SERIALIZED_NAME_GCP_KEY_ALGO = "gcp-key-algo";
  @SerializedName(SERIALIZED_NAME_GCP_KEY_ALGO)
  private String gcpKeyAlgo;

  public static final String SERIALIZED_NAME_GCP_SA_EMAIL = "gcp-sa-email";
  @SerializedName(SERIALIZED_NAME_GCP_SA_EMAIL)
  private String gcpSaEmail;

  public static final String SERIALIZED_NAME_GCP_TOKEN_SCOPES = "gcp-token-scopes";
  @SerializedName(SERIALIZED_NAME_GCP_TOKEN_SCOPES)
  private String gcpTokenScopes;

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


  public GatewayUpdateProducerGcp gcpCredType(String gcpCredType) {
    
    this.gcpCredType = gcpCredType;
    return this;
  }

   /**
   * Get gcpCredType
   * @return gcpCredType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGcpCredType() {
    return gcpCredType;
  }


  public void setGcpCredType(String gcpCredType) {
    this.gcpCredType = gcpCredType;
  }


  public GatewayUpdateProducerGcp gcpKey(String gcpKey) {
    
    this.gcpKey = gcpKey;
    return this;
  }

   /**
   * Base64-encoded service account private key text
   * @return gcpKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64-encoded service account private key text")

  public String getGcpKey() {
    return gcpKey;
  }


  public void setGcpKey(String gcpKey) {
    this.gcpKey = gcpKey;
  }


  public GatewayUpdateProducerGcp gcpKeyAlgo(String gcpKeyAlgo) {
    
    this.gcpKeyAlgo = gcpKeyAlgo;
    return this;
  }

   /**
   * Service account key algorithm, e.g. KEY_ALG_RSA_1024
   * @return gcpKeyAlgo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Service account key algorithm, e.g. KEY_ALG_RSA_1024")

  public String getGcpKeyAlgo() {
    return gcpKeyAlgo;
  }


  public void setGcpKeyAlgo(String gcpKeyAlgo) {
    this.gcpKeyAlgo = gcpKeyAlgo;
  }


  public GatewayUpdateProducerGcp gcpSaEmail(String gcpSaEmail) {
    
    this.gcpSaEmail = gcpSaEmail;
    return this;
  }

   /**
   * GCP service account email
   * @return gcpSaEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GCP service account email")

  public String getGcpSaEmail() {
    return gcpSaEmail;
  }


  public void setGcpSaEmail(String gcpSaEmail) {
    this.gcpSaEmail = gcpSaEmail;
  }


  public GatewayUpdateProducerGcp gcpTokenScopes(String gcpTokenScopes) {
    
    this.gcpTokenScopes = gcpTokenScopes;
    return this;
  }

   /**
   * Access token scopes list, e.g. scope1,scope2
   * @return gcpTokenScopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access token scopes list, e.g. scope1,scope2")

  public String getGcpTokenScopes() {
    return gcpTokenScopes;
  }


  public void setGcpTokenScopes(String gcpTokenScopes) {
    this.gcpTokenScopes = gcpTokenScopes;
  }


  public GatewayUpdateProducerGcp name(String name) {
    
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


  public GatewayUpdateProducerGcp newName(String newName) {
    
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


  public GatewayUpdateProducerGcp password(String password) {
    
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


  public GatewayUpdateProducerGcp producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayUpdateProducerGcp targetName(String targetName) {
    
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


  public GatewayUpdateProducerGcp token(String token) {
    
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


  public GatewayUpdateProducerGcp uidToken(String uidToken) {
    
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


  public GatewayUpdateProducerGcp userTtl(String userTtl) {
    
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


  public GatewayUpdateProducerGcp username(String username) {
    
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
    GatewayUpdateProducerGcp gatewayUpdateProducerGcp = (GatewayUpdateProducerGcp) o;
    return Objects.equals(this.gcpCredType, gatewayUpdateProducerGcp.gcpCredType) &&
        Objects.equals(this.gcpKey, gatewayUpdateProducerGcp.gcpKey) &&
        Objects.equals(this.gcpKeyAlgo, gatewayUpdateProducerGcp.gcpKeyAlgo) &&
        Objects.equals(this.gcpSaEmail, gatewayUpdateProducerGcp.gcpSaEmail) &&
        Objects.equals(this.gcpTokenScopes, gatewayUpdateProducerGcp.gcpTokenScopes) &&
        Objects.equals(this.name, gatewayUpdateProducerGcp.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerGcp.newName) &&
        Objects.equals(this.password, gatewayUpdateProducerGcp.password) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayUpdateProducerGcp.producerEncryptionKeyName) &&
        Objects.equals(this.targetName, gatewayUpdateProducerGcp.targetName) &&
        Objects.equals(this.token, gatewayUpdateProducerGcp.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerGcp.uidToken) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerGcp.userTtl) &&
        Objects.equals(this.username, gatewayUpdateProducerGcp.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcpCredType, gcpKey, gcpKeyAlgo, gcpSaEmail, gcpTokenScopes, name, newName, password, producerEncryptionKeyName, targetName, token, uidToken, userTtl, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerGcp {\n");
    sb.append("    gcpCredType: ").append(toIndentedString(gcpCredType)).append("\n");
    sb.append("    gcpKey: ").append(toIndentedString(gcpKey)).append("\n");
    sb.append("    gcpKeyAlgo: ").append(toIndentedString(gcpKeyAlgo)).append("\n");
    sb.append("    gcpSaEmail: ").append(toIndentedString(gcpSaEmail)).append("\n");
    sb.append("    gcpTokenScopes: ").append(toIndentedString(gcpTokenScopes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
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
