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
 * gatewayCreateProducerRabbitMQ is a command that creates rabbitmq producer
 */
@ApiModel(description = "gatewayCreateProducerRabbitMQ is a command that creates rabbitmq producer")

public class GatewayCreateProducerRabbitMQ {
  public static final String SERIALIZED_NAME_GATEWAY_URL = "gateway-url";
  @SerializedName(SERIALIZED_NAME_GATEWAY_URL)
  private String gatewayUrl = "http://localhost:8000";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_RABBITMQ_ADMIN_PWD = "rabbitmq-admin-pwd";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_ADMIN_PWD)
  private String rabbitmqAdminPwd;

  public static final String SERIALIZED_NAME_RABBITMQ_ADMIN_USER = "rabbitmq-admin-user";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_ADMIN_USER)
  private String rabbitmqAdminUser;

  public static final String SERIALIZED_NAME_RABBITMQ_SERVER_URI = "rabbitmq-server-uri";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_SERVER_URI)
  private String rabbitmqServerUri;

  public static final String SERIALIZED_NAME_RABBITMQ_USER_CONF_PERMISSION = "rabbitmq-user-conf-permission";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_USER_CONF_PERMISSION)
  private String rabbitmqUserConfPermission;

  public static final String SERIALIZED_NAME_RABBITMQ_USER_READ_PERMISSION = "rabbitmq-user-read-permission";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_USER_READ_PERMISSION)
  private String rabbitmqUserReadPermission;

  public static final String SERIALIZED_NAME_RABBITMQ_USER_TAGS = "rabbitmq-user-tags";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_USER_TAGS)
  private String rabbitmqUserTags;

  public static final String SERIALIZED_NAME_RABBITMQ_USER_VHOST = "rabbitmq-user-vhost";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_USER_VHOST)
  private String rabbitmqUserVhost;

  public static final String SERIALIZED_NAME_RABBITMQ_USER_WRITE_PERMISSION = "rabbitmq-user-write-permission";
  @SerializedName(SERIALIZED_NAME_RABBITMQ_USER_WRITE_PERMISSION)
  private String rabbitmqUserWritePermission;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_TTL = "user-ttl";
  @SerializedName(SERIALIZED_NAME_USER_TTL)
  private String userTtl = "60m";


  public GatewayCreateProducerRabbitMQ gatewayUrl(String gatewayUrl) {
    
    this.gatewayUrl = gatewayUrl;
    return this;
  }

   /**
   * Gateway url
   * @return gatewayUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gateway url")

  public String getGatewayUrl() {
    return gatewayUrl;
  }


  public void setGatewayUrl(String gatewayUrl) {
    this.gatewayUrl = gatewayUrl;
  }


  public GatewayCreateProducerRabbitMQ name(String name) {
    
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


  public GatewayCreateProducerRabbitMQ producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayCreateProducerRabbitMQ rabbitmqAdminPwd(String rabbitmqAdminPwd) {
    
    this.rabbitmqAdminPwd = rabbitmqAdminPwd;
    return this;
  }

   /**
   * RabbitMQ Admin password
   * @return rabbitmqAdminPwd
  **/
  @ApiModelProperty(required = true, value = "RabbitMQ Admin password")

  public String getRabbitmqAdminPwd() {
    return rabbitmqAdminPwd;
  }


  public void setRabbitmqAdminPwd(String rabbitmqAdminPwd) {
    this.rabbitmqAdminPwd = rabbitmqAdminPwd;
  }


  public GatewayCreateProducerRabbitMQ rabbitmqAdminUser(String rabbitmqAdminUser) {
    
    this.rabbitmqAdminUser = rabbitmqAdminUser;
    return this;
  }

   /**
   * RabbitMQ Admin User
   * @return rabbitmqAdminUser
  **/
  @ApiModelProperty(required = true, value = "RabbitMQ Admin User")

  public String getRabbitmqAdminUser() {
    return rabbitmqAdminUser;
  }


  public void setRabbitmqAdminUser(String rabbitmqAdminUser) {
    this.rabbitmqAdminUser = rabbitmqAdminUser;
  }


  public GatewayCreateProducerRabbitMQ rabbitmqServerUri(String rabbitmqServerUri) {
    
    this.rabbitmqServerUri = rabbitmqServerUri;
    return this;
  }

   /**
   * Server URI
   * @return rabbitmqServerUri
  **/
  @ApiModelProperty(required = true, value = "Server URI")

  public String getRabbitmqServerUri() {
    return rabbitmqServerUri;
  }


  public void setRabbitmqServerUri(String rabbitmqServerUri) {
    this.rabbitmqServerUri = rabbitmqServerUri;
  }


  public GatewayCreateProducerRabbitMQ rabbitmqUserConfPermission(String rabbitmqUserConfPermission) {
    
    this.rabbitmqUserConfPermission = rabbitmqUserConfPermission;
    return this;
  }

   /**
   * User configuration permission
   * @return rabbitmqUserConfPermission
  **/
  @ApiModelProperty(required = true, value = "User configuration permission")

  public String getRabbitmqUserConfPermission() {
    return rabbitmqUserConfPermission;
  }


  public void setRabbitmqUserConfPermission(String rabbitmqUserConfPermission) {
    this.rabbitmqUserConfPermission = rabbitmqUserConfPermission;
  }


  public GatewayCreateProducerRabbitMQ rabbitmqUserReadPermission(String rabbitmqUserReadPermission) {
    
    this.rabbitmqUserReadPermission = rabbitmqUserReadPermission;
    return this;
  }

   /**
   * User read permission
   * @return rabbitmqUserReadPermission
  **/
  @ApiModelProperty(required = true, value = "User read permission")

  public String getRabbitmqUserReadPermission() {
    return rabbitmqUserReadPermission;
  }


  public void setRabbitmqUserReadPermission(String rabbitmqUserReadPermission) {
    this.rabbitmqUserReadPermission = rabbitmqUserReadPermission;
  }


  public GatewayCreateProducerRabbitMQ rabbitmqUserTags(String rabbitmqUserTags) {
    
    this.rabbitmqUserTags = rabbitmqUserTags;
    return this;
  }

   /**
   * User Tags
   * @return rabbitmqUserTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User Tags")

  public String getRabbitmqUserTags() {
    return rabbitmqUserTags;
  }


  public void setRabbitmqUserTags(String rabbitmqUserTags) {
    this.rabbitmqUserTags = rabbitmqUserTags;
  }


  public GatewayCreateProducerRabbitMQ rabbitmqUserVhost(String rabbitmqUserVhost) {
    
    this.rabbitmqUserVhost = rabbitmqUserVhost;
    return this;
  }

   /**
   * User Virtual Host
   * @return rabbitmqUserVhost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User Virtual Host")

  public String getRabbitmqUserVhost() {
    return rabbitmqUserVhost;
  }


  public void setRabbitmqUserVhost(String rabbitmqUserVhost) {
    this.rabbitmqUserVhost = rabbitmqUserVhost;
  }


  public GatewayCreateProducerRabbitMQ rabbitmqUserWritePermission(String rabbitmqUserWritePermission) {
    
    this.rabbitmqUserWritePermission = rabbitmqUserWritePermission;
    return this;
  }

   /**
   * User write permission
   * @return rabbitmqUserWritePermission
  **/
  @ApiModelProperty(required = true, value = "User write permission")

  public String getRabbitmqUserWritePermission() {
    return rabbitmqUserWritePermission;
  }


  public void setRabbitmqUserWritePermission(String rabbitmqUserWritePermission) {
    this.rabbitmqUserWritePermission = rabbitmqUserWritePermission;
  }


  public GatewayCreateProducerRabbitMQ token(String token) {
    
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


  public GatewayCreateProducerRabbitMQ uidToken(String uidToken) {
    
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


  public GatewayCreateProducerRabbitMQ userTtl(String userTtl) {
    
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
    GatewayCreateProducerRabbitMQ gatewayCreateProducerRabbitMQ = (GatewayCreateProducerRabbitMQ) o;
    return Objects.equals(this.gatewayUrl, gatewayCreateProducerRabbitMQ.gatewayUrl) &&
        Objects.equals(this.name, gatewayCreateProducerRabbitMQ.name) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayCreateProducerRabbitMQ.producerEncryptionKeyName) &&
        Objects.equals(this.rabbitmqAdminPwd, gatewayCreateProducerRabbitMQ.rabbitmqAdminPwd) &&
        Objects.equals(this.rabbitmqAdminUser, gatewayCreateProducerRabbitMQ.rabbitmqAdminUser) &&
        Objects.equals(this.rabbitmqServerUri, gatewayCreateProducerRabbitMQ.rabbitmqServerUri) &&
        Objects.equals(this.rabbitmqUserConfPermission, gatewayCreateProducerRabbitMQ.rabbitmqUserConfPermission) &&
        Objects.equals(this.rabbitmqUserReadPermission, gatewayCreateProducerRabbitMQ.rabbitmqUserReadPermission) &&
        Objects.equals(this.rabbitmqUserTags, gatewayCreateProducerRabbitMQ.rabbitmqUserTags) &&
        Objects.equals(this.rabbitmqUserVhost, gatewayCreateProducerRabbitMQ.rabbitmqUserVhost) &&
        Objects.equals(this.rabbitmqUserWritePermission, gatewayCreateProducerRabbitMQ.rabbitmqUserWritePermission) &&
        Objects.equals(this.token, gatewayCreateProducerRabbitMQ.token) &&
        Objects.equals(this.uidToken, gatewayCreateProducerRabbitMQ.uidToken) &&
        Objects.equals(this.userTtl, gatewayCreateProducerRabbitMQ.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayUrl, name, producerEncryptionKeyName, rabbitmqAdminPwd, rabbitmqAdminUser, rabbitmqServerUri, rabbitmqUserConfPermission, rabbitmqUserReadPermission, rabbitmqUserTags, rabbitmqUserVhost, rabbitmqUserWritePermission, token, uidToken, userTtl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateProducerRabbitMQ {\n");
    sb.append("    gatewayUrl: ").append(toIndentedString(gatewayUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    rabbitmqAdminPwd: ").append(toIndentedString(rabbitmqAdminPwd)).append("\n");
    sb.append("    rabbitmqAdminUser: ").append(toIndentedString(rabbitmqAdminUser)).append("\n");
    sb.append("    rabbitmqServerUri: ").append(toIndentedString(rabbitmqServerUri)).append("\n");
    sb.append("    rabbitmqUserConfPermission: ").append(toIndentedString(rabbitmqUserConfPermission)).append("\n");
    sb.append("    rabbitmqUserReadPermission: ").append(toIndentedString(rabbitmqUserReadPermission)).append("\n");
    sb.append("    rabbitmqUserTags: ").append(toIndentedString(rabbitmqUserTags)).append("\n");
    sb.append("    rabbitmqUserVhost: ").append(toIndentedString(rabbitmqUserVhost)).append("\n");
    sb.append("    rabbitmqUserWritePermission: ").append(toIndentedString(rabbitmqUserWritePermission)).append("\n");
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

