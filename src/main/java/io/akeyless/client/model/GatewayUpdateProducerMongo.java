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
 * gatewayUpdateProducerMongo is a command that updates either mongodb  producer or mongodb atlas producer
 */
@ApiModel(description = "gatewayUpdateProducerMongo is a command that updates either mongodb  producer or mongodb atlas producer")

public class GatewayUpdateProducerMongo {
  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_MONGODB_ATLAS_API_PRIVATE_KEY = "mongodb-atlas-api-private-key";
  @SerializedName(SERIALIZED_NAME_MONGODB_ATLAS_API_PRIVATE_KEY)
  private String mongodbAtlasApiPrivateKey;

  public static final String SERIALIZED_NAME_MONGODB_ATLAS_API_PUBLIC_KEY = "mongodb-atlas-api-public-key";
  @SerializedName(SERIALIZED_NAME_MONGODB_ATLAS_API_PUBLIC_KEY)
  private String mongodbAtlasApiPublicKey;

  public static final String SERIALIZED_NAME_MONGODB_ATLAS_PROJECT_ID = "mongodb-atlas-project-id";
  @SerializedName(SERIALIZED_NAME_MONGODB_ATLAS_PROJECT_ID)
  private String mongodbAtlasProjectId;

  public static final String SERIALIZED_NAME_MONGODB_CUSTOM_DATA = "mongodb-custom-data";
  @SerializedName(SERIALIZED_NAME_MONGODB_CUSTOM_DATA)
  private String mongodbCustomData;

  public static final String SERIALIZED_NAME_MONGODB_DEFAULT_AUTH_DB = "mongodb-default-auth-db";
  @SerializedName(SERIALIZED_NAME_MONGODB_DEFAULT_AUTH_DB)
  private String mongodbDefaultAuthDb;

  public static final String SERIALIZED_NAME_MONGODB_HOST_PORT = "mongodb-host-port";
  @SerializedName(SERIALIZED_NAME_MONGODB_HOST_PORT)
  private String mongodbHostPort;

  public static final String SERIALIZED_NAME_MONGODB_NAME = "mongodb-name";
  @SerializedName(SERIALIZED_NAME_MONGODB_NAME)
  private String mongodbName;

  public static final String SERIALIZED_NAME_MONGODB_PASSWORD = "mongodb-password";
  @SerializedName(SERIALIZED_NAME_MONGODB_PASSWORD)
  private String mongodbPassword;

  public static final String SERIALIZED_NAME_MONGODB_ROLES = "mongodb-roles";
  @SerializedName(SERIALIZED_NAME_MONGODB_ROLES)
  private String mongodbRoles = "[]";

  public static final String SERIALIZED_NAME_MONGODB_SERVER_URI = "mongodb-server-uri";
  @SerializedName(SERIALIZED_NAME_MONGODB_SERVER_URI)
  private String mongodbServerUri;

  public static final String SERIALIZED_NAME_MONGODB_URI_OPTIONS = "mongodb-uri-options";
  @SerializedName(SERIALIZED_NAME_MONGODB_URI_OPTIONS)
  private String mongodbUriOptions;

  public static final String SERIALIZED_NAME_MONGODB_USERNAME = "mongodb-username";
  @SerializedName(SERIALIZED_NAME_MONGODB_USERNAME)
  private String mongodbUsername;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  private String secureAccessBastionIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  private String secureAccessEnable;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_HOST = "secure-access-host";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_HOST)
  private List<String> secureAccessHost = null;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_WEB = "secure-access-web";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_WEB)
  private Boolean secureAccessWeb;

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


  public GatewayUpdateProducerMongo deleteProtection(String deleteProtection) {
    
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


  public GatewayUpdateProducerMongo json(Boolean json) {
    
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


  public GatewayUpdateProducerMongo mongodbAtlasApiPrivateKey(String mongodbAtlasApiPrivateKey) {
    
    this.mongodbAtlasApiPrivateKey = mongodbAtlasApiPrivateKey;
    return this;
  }

   /**
   * MongoDB Atlas private key
   * @return mongodbAtlasApiPrivateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB Atlas private key")

  public String getMongodbAtlasApiPrivateKey() {
    return mongodbAtlasApiPrivateKey;
  }


  public void setMongodbAtlasApiPrivateKey(String mongodbAtlasApiPrivateKey) {
    this.mongodbAtlasApiPrivateKey = mongodbAtlasApiPrivateKey;
  }


  public GatewayUpdateProducerMongo mongodbAtlasApiPublicKey(String mongodbAtlasApiPublicKey) {
    
    this.mongodbAtlasApiPublicKey = mongodbAtlasApiPublicKey;
    return this;
  }

   /**
   * MongoDB Atlas public key
   * @return mongodbAtlasApiPublicKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB Atlas public key")

  public String getMongodbAtlasApiPublicKey() {
    return mongodbAtlasApiPublicKey;
  }


  public void setMongodbAtlasApiPublicKey(String mongodbAtlasApiPublicKey) {
    this.mongodbAtlasApiPublicKey = mongodbAtlasApiPublicKey;
  }


  public GatewayUpdateProducerMongo mongodbAtlasProjectId(String mongodbAtlasProjectId) {
    
    this.mongodbAtlasProjectId = mongodbAtlasProjectId;
    return this;
  }

   /**
   * MongoDB Atlas project ID
   * @return mongodbAtlasProjectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB Atlas project ID")

  public String getMongodbAtlasProjectId() {
    return mongodbAtlasProjectId;
  }


  public void setMongodbAtlasProjectId(String mongodbAtlasProjectId) {
    this.mongodbAtlasProjectId = mongodbAtlasProjectId;
  }


  public GatewayUpdateProducerMongo mongodbCustomData(String mongodbCustomData) {
    
    this.mongodbCustomData = mongodbCustomData;
    return this;
  }

   /**
   * MongoDB custom data
   * @return mongodbCustomData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB custom data")

  public String getMongodbCustomData() {
    return mongodbCustomData;
  }


  public void setMongodbCustomData(String mongodbCustomData) {
    this.mongodbCustomData = mongodbCustomData;
  }


  public GatewayUpdateProducerMongo mongodbDefaultAuthDb(String mongodbDefaultAuthDb) {
    
    this.mongodbDefaultAuthDb = mongodbDefaultAuthDb;
    return this;
  }

   /**
   * MongoDB server default authentication database
   * @return mongodbDefaultAuthDb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB server default authentication database")

  public String getMongodbDefaultAuthDb() {
    return mongodbDefaultAuthDb;
  }


  public void setMongodbDefaultAuthDb(String mongodbDefaultAuthDb) {
    this.mongodbDefaultAuthDb = mongodbDefaultAuthDb;
  }


  public GatewayUpdateProducerMongo mongodbHostPort(String mongodbHostPort) {
    
    this.mongodbHostPort = mongodbHostPort;
    return this;
  }

   /**
   * MongoDB server host and port
   * @return mongodbHostPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB server host and port")

  public String getMongodbHostPort() {
    return mongodbHostPort;
  }


  public void setMongodbHostPort(String mongodbHostPort) {
    this.mongodbHostPort = mongodbHostPort;
  }


  public GatewayUpdateProducerMongo mongodbName(String mongodbName) {
    
    this.mongodbName = mongodbName;
    return this;
  }

   /**
   * MongoDB Name
   * @return mongodbName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB Name")

  public String getMongodbName() {
    return mongodbName;
  }


  public void setMongodbName(String mongodbName) {
    this.mongodbName = mongodbName;
  }


  public GatewayUpdateProducerMongo mongodbPassword(String mongodbPassword) {
    
    this.mongodbPassword = mongodbPassword;
    return this;
  }

   /**
   * MongoDB server password. You will prompted to provide a password if it will not appear in CLI parameters
   * @return mongodbPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB server password. You will prompted to provide a password if it will not appear in CLI parameters")

  public String getMongodbPassword() {
    return mongodbPassword;
  }


  public void setMongodbPassword(String mongodbPassword) {
    this.mongodbPassword = mongodbPassword;
  }


  public GatewayUpdateProducerMongo mongodbRoles(String mongodbRoles) {
    
    this.mongodbRoles = mongodbRoles;
    return this;
  }

   /**
   * MongoDB Roles
   * @return mongodbRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB Roles")

  public String getMongodbRoles() {
    return mongodbRoles;
  }


  public void setMongodbRoles(String mongodbRoles) {
    this.mongodbRoles = mongodbRoles;
  }


  public GatewayUpdateProducerMongo mongodbServerUri(String mongodbServerUri) {
    
    this.mongodbServerUri = mongodbServerUri;
    return this;
  }

   /**
   * MongoDB server URI
   * @return mongodbServerUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB server URI")

  public String getMongodbServerUri() {
    return mongodbServerUri;
  }


  public void setMongodbServerUri(String mongodbServerUri) {
    this.mongodbServerUri = mongodbServerUri;
  }


  public GatewayUpdateProducerMongo mongodbUriOptions(String mongodbUriOptions) {
    
    this.mongodbUriOptions = mongodbUriOptions;
    return this;
  }

   /**
   * MongoDB server URI options
   * @return mongodbUriOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB server URI options")

  public String getMongodbUriOptions() {
    return mongodbUriOptions;
  }


  public void setMongodbUriOptions(String mongodbUriOptions) {
    this.mongodbUriOptions = mongodbUriOptions;
  }


  public GatewayUpdateProducerMongo mongodbUsername(String mongodbUsername) {
    
    this.mongodbUsername = mongodbUsername;
    return this;
  }

   /**
   * MongoDB server username
   * @return mongodbUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MongoDB server username")

  public String getMongodbUsername() {
    return mongodbUsername;
  }


  public void setMongodbUsername(String mongodbUsername) {
    this.mongodbUsername = mongodbUsername;
  }


  public GatewayUpdateProducerMongo name(String name) {
    
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


  public GatewayUpdateProducerMongo newName(String newName) {
    
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


  public GatewayUpdateProducerMongo producerEncryptionKeyName(String producerEncryptionKeyName) {
    
    this.producerEncryptionKeyName = producerEncryptionKeyName;
    return this;
  }

   /**
   * Encrypt producer with following key
   * @return producerEncryptionKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Encrypt producer with following key")

  public String getProducerEncryptionKeyName() {
    return producerEncryptionKeyName;
  }


  public void setProducerEncryptionKeyName(String producerEncryptionKeyName) {
    this.producerEncryptionKeyName = producerEncryptionKeyName;
  }


  public GatewayUpdateProducerMongo secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
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


  public GatewayUpdateProducerMongo secureAccessEnable(String secureAccessEnable) {
    
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


  public GatewayUpdateProducerMongo secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public GatewayUpdateProducerMongo addSecureAccessHostItem(String secureAccessHostItem) {
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


  public GatewayUpdateProducerMongo secureAccessWeb(Boolean secureAccessWeb) {
    
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


  public GatewayUpdateProducerMongo tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerMongo addTagsItem(String tagsItem) {
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


  public GatewayUpdateProducerMongo targetName(String targetName) {
    
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


  public GatewayUpdateProducerMongo token(String token) {
    
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


  public GatewayUpdateProducerMongo uidToken(String uidToken) {
    
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


  public GatewayUpdateProducerMongo userTtl(String userTtl) {
    
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
    GatewayUpdateProducerMongo gatewayUpdateProducerMongo = (GatewayUpdateProducerMongo) o;
    return Objects.equals(this.deleteProtection, gatewayUpdateProducerMongo.deleteProtection) &&
        Objects.equals(this.json, gatewayUpdateProducerMongo.json) &&
        Objects.equals(this.mongodbAtlasApiPrivateKey, gatewayUpdateProducerMongo.mongodbAtlasApiPrivateKey) &&
        Objects.equals(this.mongodbAtlasApiPublicKey, gatewayUpdateProducerMongo.mongodbAtlasApiPublicKey) &&
        Objects.equals(this.mongodbAtlasProjectId, gatewayUpdateProducerMongo.mongodbAtlasProjectId) &&
        Objects.equals(this.mongodbCustomData, gatewayUpdateProducerMongo.mongodbCustomData) &&
        Objects.equals(this.mongodbDefaultAuthDb, gatewayUpdateProducerMongo.mongodbDefaultAuthDb) &&
        Objects.equals(this.mongodbHostPort, gatewayUpdateProducerMongo.mongodbHostPort) &&
        Objects.equals(this.mongodbName, gatewayUpdateProducerMongo.mongodbName) &&
        Objects.equals(this.mongodbPassword, gatewayUpdateProducerMongo.mongodbPassword) &&
        Objects.equals(this.mongodbRoles, gatewayUpdateProducerMongo.mongodbRoles) &&
        Objects.equals(this.mongodbServerUri, gatewayUpdateProducerMongo.mongodbServerUri) &&
        Objects.equals(this.mongodbUriOptions, gatewayUpdateProducerMongo.mongodbUriOptions) &&
        Objects.equals(this.mongodbUsername, gatewayUpdateProducerMongo.mongodbUsername) &&
        Objects.equals(this.name, gatewayUpdateProducerMongo.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerMongo.newName) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayUpdateProducerMongo.producerEncryptionKeyName) &&
        Objects.equals(this.secureAccessBastionIssuer, gatewayUpdateProducerMongo.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessEnable, gatewayUpdateProducerMongo.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, gatewayUpdateProducerMongo.secureAccessHost) &&
        Objects.equals(this.secureAccessWeb, gatewayUpdateProducerMongo.secureAccessWeb) &&
        Objects.equals(this.tags, gatewayUpdateProducerMongo.tags) &&
        Objects.equals(this.targetName, gatewayUpdateProducerMongo.targetName) &&
        Objects.equals(this.token, gatewayUpdateProducerMongo.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerMongo.uidToken) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerMongo.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteProtection, json, mongodbAtlasApiPrivateKey, mongodbAtlasApiPublicKey, mongodbAtlasProjectId, mongodbCustomData, mongodbDefaultAuthDb, mongodbHostPort, mongodbName, mongodbPassword, mongodbRoles, mongodbServerUri, mongodbUriOptions, mongodbUsername, name, newName, producerEncryptionKeyName, secureAccessBastionIssuer, secureAccessEnable, secureAccessHost, secureAccessWeb, tags, targetName, token, uidToken, userTtl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerMongo {\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    mongodbAtlasApiPrivateKey: ").append(toIndentedString(mongodbAtlasApiPrivateKey)).append("\n");
    sb.append("    mongodbAtlasApiPublicKey: ").append(toIndentedString(mongodbAtlasApiPublicKey)).append("\n");
    sb.append("    mongodbAtlasProjectId: ").append(toIndentedString(mongodbAtlasProjectId)).append("\n");
    sb.append("    mongodbCustomData: ").append(toIndentedString(mongodbCustomData)).append("\n");
    sb.append("    mongodbDefaultAuthDb: ").append(toIndentedString(mongodbDefaultAuthDb)).append("\n");
    sb.append("    mongodbHostPort: ").append(toIndentedString(mongodbHostPort)).append("\n");
    sb.append("    mongodbName: ").append(toIndentedString(mongodbName)).append("\n");
    sb.append("    mongodbPassword: ").append(toIndentedString(mongodbPassword)).append("\n");
    sb.append("    mongodbRoles: ").append(toIndentedString(mongodbRoles)).append("\n");
    sb.append("    mongodbServerUri: ").append(toIndentedString(mongodbServerUri)).append("\n");
    sb.append("    mongodbUriOptions: ").append(toIndentedString(mongodbUriOptions)).append("\n");
    sb.append("    mongodbUsername: ").append(toIndentedString(mongodbUsername)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessHost: ").append(toIndentedString(secureAccessHost)).append("\n");
    sb.append("    secureAccessWeb: ").append(toIndentedString(secureAccessWeb)).append("\n");
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

