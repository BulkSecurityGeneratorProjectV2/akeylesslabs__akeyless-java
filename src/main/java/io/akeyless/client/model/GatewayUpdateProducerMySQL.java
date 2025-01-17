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
 * gatewayUpdateProducerMySQL is a command that updates mysql producer
 */
@ApiModel(description = "gatewayUpdateProducerMySQL is a command that updates mysql producer")

public class GatewayUpdateProducerMySQL {
  public static final String SERIALIZED_NAME_DB_SERVER_CERTIFICATES = "db-server-certificates";
  @SerializedName(SERIALIZED_NAME_DB_SERVER_CERTIFICATES)
  private String dbServerCertificates;

  public static final String SERIALIZED_NAME_DB_SERVER_NAME = "db-server-name";
  @SerializedName(SERIALIZED_NAME_DB_SERVER_NAME)
  private String dbServerName;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_MYSQL_DBNAME = "mysql-dbname";
  @SerializedName(SERIALIZED_NAME_MYSQL_DBNAME)
  private String mysqlDbname;

  public static final String SERIALIZED_NAME_MYSQL_HOST = "mysql-host";
  @SerializedName(SERIALIZED_NAME_MYSQL_HOST)
  private String mysqlHost = "127.0.0.1";

  public static final String SERIALIZED_NAME_MYSQL_PASSWORD = "mysql-password";
  @SerializedName(SERIALIZED_NAME_MYSQL_PASSWORD)
  private String mysqlPassword;

  public static final String SERIALIZED_NAME_MYSQL_PORT = "mysql-port";
  @SerializedName(SERIALIZED_NAME_MYSQL_PORT)
  private String mysqlPort = "3306";

  public static final String SERIALIZED_NAME_MYSQL_SCREATION_STATEMENTS = "mysql-screation-statements";
  @SerializedName(SERIALIZED_NAME_MYSQL_SCREATION_STATEMENTS)
  private String mysqlScreationStatements;

  public static final String SERIALIZED_NAME_MYSQL_USERNAME = "mysql-username";
  @SerializedName(SERIALIZED_NAME_MYSQL_USERNAME)
  private String mysqlUsername;

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

  public static final String SERIALIZED_NAME_SSL = "ssl";
  @SerializedName(SERIALIZED_NAME_SSL)
  private Boolean ssl;

  public static final String SERIALIZED_NAME_SSL_CERTIFICATE = "ssl-certificate";
  @SerializedName(SERIALIZED_NAME_SSL_CERTIFICATE)
  private String sslCertificate;

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


  public GatewayUpdateProducerMySQL dbServerCertificates(String dbServerCertificates) {
    
    this.dbServerCertificates = dbServerCertificates;
    return this;
  }

   /**
   * (Optional) DB server certificates
   * @return dbServerCertificates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(Optional) DB server certificates")

  public String getDbServerCertificates() {
    return dbServerCertificates;
  }


  public void setDbServerCertificates(String dbServerCertificates) {
    this.dbServerCertificates = dbServerCertificates;
  }


  public GatewayUpdateProducerMySQL dbServerName(String dbServerName) {
    
    this.dbServerName = dbServerName;
    return this;
  }

   /**
   * (Optional) Server name for certificate verification
   * @return dbServerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(Optional) Server name for certificate verification")

  public String getDbServerName() {
    return dbServerName;
  }


  public void setDbServerName(String dbServerName) {
    this.dbServerName = dbServerName;
  }


  public GatewayUpdateProducerMySQL deleteProtection(String deleteProtection) {
    
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


  public GatewayUpdateProducerMySQL json(Boolean json) {
    
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


  public GatewayUpdateProducerMySQL mysqlDbname(String mysqlDbname) {
    
    this.mysqlDbname = mysqlDbname;
    return this;
  }

   /**
   * MySQL DB Name
   * @return mysqlDbname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MySQL DB Name")

  public String getMysqlDbname() {
    return mysqlDbname;
  }


  public void setMysqlDbname(String mysqlDbname) {
    this.mysqlDbname = mysqlDbname;
  }


  public GatewayUpdateProducerMySQL mysqlHost(String mysqlHost) {
    
    this.mysqlHost = mysqlHost;
    return this;
  }

   /**
   * MySQL Host
   * @return mysqlHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MySQL Host")

  public String getMysqlHost() {
    return mysqlHost;
  }


  public void setMysqlHost(String mysqlHost) {
    this.mysqlHost = mysqlHost;
  }


  public GatewayUpdateProducerMySQL mysqlPassword(String mysqlPassword) {
    
    this.mysqlPassword = mysqlPassword;
    return this;
  }

   /**
   * MySQL Password
   * @return mysqlPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MySQL Password")

  public String getMysqlPassword() {
    return mysqlPassword;
  }


  public void setMysqlPassword(String mysqlPassword) {
    this.mysqlPassword = mysqlPassword;
  }


  public GatewayUpdateProducerMySQL mysqlPort(String mysqlPort) {
    
    this.mysqlPort = mysqlPort;
    return this;
  }

   /**
   * MySQL Port
   * @return mysqlPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MySQL Port")

  public String getMysqlPort() {
    return mysqlPort;
  }


  public void setMysqlPort(String mysqlPort) {
    this.mysqlPort = mysqlPort;
  }


  public GatewayUpdateProducerMySQL mysqlScreationStatements(String mysqlScreationStatements) {
    
    this.mysqlScreationStatements = mysqlScreationStatements;
    return this;
  }

   /**
   * MySQL Creation statements
   * @return mysqlScreationStatements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MySQL Creation statements")

  public String getMysqlScreationStatements() {
    return mysqlScreationStatements;
  }


  public void setMysqlScreationStatements(String mysqlScreationStatements) {
    this.mysqlScreationStatements = mysqlScreationStatements;
  }


  public GatewayUpdateProducerMySQL mysqlUsername(String mysqlUsername) {
    
    this.mysqlUsername = mysqlUsername;
    return this;
  }

   /**
   * MySQL Username
   * @return mysqlUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MySQL Username")

  public String getMysqlUsername() {
    return mysqlUsername;
  }


  public void setMysqlUsername(String mysqlUsername) {
    this.mysqlUsername = mysqlUsername;
  }


  public GatewayUpdateProducerMySQL name(String name) {
    
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


  public GatewayUpdateProducerMySQL newName(String newName) {
    
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


  public GatewayUpdateProducerMySQL producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayUpdateProducerMySQL secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
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


  public GatewayUpdateProducerMySQL secureAccessEnable(String secureAccessEnable) {
    
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


  public GatewayUpdateProducerMySQL secureAccessHost(List<String> secureAccessHost) {
    
    this.secureAccessHost = secureAccessHost;
    return this;
  }

  public GatewayUpdateProducerMySQL addSecureAccessHostItem(String secureAccessHostItem) {
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


  public GatewayUpdateProducerMySQL secureAccessWeb(Boolean secureAccessWeb) {
    
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


  public GatewayUpdateProducerMySQL ssl(Boolean ssl) {
    
    this.ssl = ssl;
    return this;
  }

   /**
   * SSL connection mode
   * @return ssl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SSL connection mode")

  public Boolean getSsl() {
    return ssl;
  }


  public void setSsl(Boolean ssl) {
    this.ssl = ssl;
  }


  public GatewayUpdateProducerMySQL sslCertificate(String sslCertificate) {
    
    this.sslCertificate = sslCertificate;
    return this;
  }

   /**
   * SSL connection certificate
   * @return sslCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SSL connection certificate")

  public String getSslCertificate() {
    return sslCertificate;
  }


  public void setSslCertificate(String sslCertificate) {
    this.sslCertificate = sslCertificate;
  }


  public GatewayUpdateProducerMySQL tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerMySQL addTagsItem(String tagsItem) {
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


  public GatewayUpdateProducerMySQL targetName(String targetName) {
    
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


  public GatewayUpdateProducerMySQL token(String token) {
    
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


  public GatewayUpdateProducerMySQL uidToken(String uidToken) {
    
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


  public GatewayUpdateProducerMySQL userTtl(String userTtl) {
    
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
    GatewayUpdateProducerMySQL gatewayUpdateProducerMySQL = (GatewayUpdateProducerMySQL) o;
    return Objects.equals(this.dbServerCertificates, gatewayUpdateProducerMySQL.dbServerCertificates) &&
        Objects.equals(this.dbServerName, gatewayUpdateProducerMySQL.dbServerName) &&
        Objects.equals(this.deleteProtection, gatewayUpdateProducerMySQL.deleteProtection) &&
        Objects.equals(this.json, gatewayUpdateProducerMySQL.json) &&
        Objects.equals(this.mysqlDbname, gatewayUpdateProducerMySQL.mysqlDbname) &&
        Objects.equals(this.mysqlHost, gatewayUpdateProducerMySQL.mysqlHost) &&
        Objects.equals(this.mysqlPassword, gatewayUpdateProducerMySQL.mysqlPassword) &&
        Objects.equals(this.mysqlPort, gatewayUpdateProducerMySQL.mysqlPort) &&
        Objects.equals(this.mysqlScreationStatements, gatewayUpdateProducerMySQL.mysqlScreationStatements) &&
        Objects.equals(this.mysqlUsername, gatewayUpdateProducerMySQL.mysqlUsername) &&
        Objects.equals(this.name, gatewayUpdateProducerMySQL.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerMySQL.newName) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayUpdateProducerMySQL.producerEncryptionKeyName) &&
        Objects.equals(this.secureAccessBastionIssuer, gatewayUpdateProducerMySQL.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessEnable, gatewayUpdateProducerMySQL.secureAccessEnable) &&
        Objects.equals(this.secureAccessHost, gatewayUpdateProducerMySQL.secureAccessHost) &&
        Objects.equals(this.secureAccessWeb, gatewayUpdateProducerMySQL.secureAccessWeb) &&
        Objects.equals(this.ssl, gatewayUpdateProducerMySQL.ssl) &&
        Objects.equals(this.sslCertificate, gatewayUpdateProducerMySQL.sslCertificate) &&
        Objects.equals(this.tags, gatewayUpdateProducerMySQL.tags) &&
        Objects.equals(this.targetName, gatewayUpdateProducerMySQL.targetName) &&
        Objects.equals(this.token, gatewayUpdateProducerMySQL.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerMySQL.uidToken) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerMySQL.userTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbServerCertificates, dbServerName, deleteProtection, json, mysqlDbname, mysqlHost, mysqlPassword, mysqlPort, mysqlScreationStatements, mysqlUsername, name, newName, producerEncryptionKeyName, secureAccessBastionIssuer, secureAccessEnable, secureAccessHost, secureAccessWeb, ssl, sslCertificate, tags, targetName, token, uidToken, userTtl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerMySQL {\n");
    sb.append("    dbServerCertificates: ").append(toIndentedString(dbServerCertificates)).append("\n");
    sb.append("    dbServerName: ").append(toIndentedString(dbServerName)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    mysqlDbname: ").append(toIndentedString(mysqlDbname)).append("\n");
    sb.append("    mysqlHost: ").append(toIndentedString(mysqlHost)).append("\n");
    sb.append("    mysqlPassword: ").append(toIndentedString(mysqlPassword)).append("\n");
    sb.append("    mysqlPort: ").append(toIndentedString(mysqlPort)).append("\n");
    sb.append("    mysqlScreationStatements: ").append(toIndentedString(mysqlScreationStatements)).append("\n");
    sb.append("    mysqlUsername: ").append(toIndentedString(mysqlUsername)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
    sb.append("    secureAccessHost: ").append(toIndentedString(secureAccessHost)).append("\n");
    sb.append("    secureAccessWeb: ").append(toIndentedString(secureAccessWeb)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    sslCertificate: ").append(toIndentedString(sslCertificate)).append("\n");
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

