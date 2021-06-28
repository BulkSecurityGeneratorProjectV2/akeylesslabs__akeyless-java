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
 * gatewayCreateProducerMySQL is a command that creates mysql producer
 */
@ApiModel(description = "gatewayCreateProducerMySQL is a command that creates mysql producer")

public class GatewayCreateProducerMySQL {
  public static final String SERIALIZED_NAME_DB_SERVER_CERTIFICATES = "db-server-certificates";
  @SerializedName(SERIALIZED_NAME_DB_SERVER_CERTIFICATES)
  private String dbServerCertificates;

  public static final String SERIALIZED_NAME_DB_SERVER_NAME = "db-server-name";
  @SerializedName(SERIALIZED_NAME_DB_SERVER_NAME)
  private String dbServerName;

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

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

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


  public GatewayCreateProducerMySQL dbServerCertificates(String dbServerCertificates) {
    
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


  public GatewayCreateProducerMySQL dbServerName(String dbServerName) {
    
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


  public GatewayCreateProducerMySQL mysqlDbname(String mysqlDbname) {
    
    this.mysqlDbname = mysqlDbname;
    return this;
  }

   /**
   * MySQL DB Name
   * @return mysqlDbname
  **/
  @ApiModelProperty(required = true, value = "MySQL DB Name")

  public String getMysqlDbname() {
    return mysqlDbname;
  }


  public void setMysqlDbname(String mysqlDbname) {
    this.mysqlDbname = mysqlDbname;
  }


  public GatewayCreateProducerMySQL mysqlHost(String mysqlHost) {
    
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


  public GatewayCreateProducerMySQL mysqlPassword(String mysqlPassword) {
    
    this.mysqlPassword = mysqlPassword;
    return this;
  }

   /**
   * MySQL Password
   * @return mysqlPassword
  **/
  @ApiModelProperty(required = true, value = "MySQL Password")

  public String getMysqlPassword() {
    return mysqlPassword;
  }


  public void setMysqlPassword(String mysqlPassword) {
    this.mysqlPassword = mysqlPassword;
  }


  public GatewayCreateProducerMySQL mysqlPort(String mysqlPort) {
    
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


  public GatewayCreateProducerMySQL mysqlScreationStatements(String mysqlScreationStatements) {
    
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


  public GatewayCreateProducerMySQL mysqlUsername(String mysqlUsername) {
    
    this.mysqlUsername = mysqlUsername;
    return this;
  }

   /**
   * MySQL Username
   * @return mysqlUsername
  **/
  @ApiModelProperty(required = true, value = "MySQL Username")

  public String getMysqlUsername() {
    return mysqlUsername;
  }


  public void setMysqlUsername(String mysqlUsername) {
    this.mysqlUsername = mysqlUsername;
  }


  public GatewayCreateProducerMySQL name(String name) {
    
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


  public GatewayCreateProducerMySQL password(String password) {
    
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


  public GatewayCreateProducerMySQL producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayCreateProducerMySQL token(String token) {
    
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


  public GatewayCreateProducerMySQL uidToken(String uidToken) {
    
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


  public GatewayCreateProducerMySQL userTtl(String userTtl) {
    
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


  public GatewayCreateProducerMySQL username(String username) {
    
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
    GatewayCreateProducerMySQL gatewayCreateProducerMySQL = (GatewayCreateProducerMySQL) o;
    return Objects.equals(this.dbServerCertificates, gatewayCreateProducerMySQL.dbServerCertificates) &&
        Objects.equals(this.dbServerName, gatewayCreateProducerMySQL.dbServerName) &&
        Objects.equals(this.mysqlDbname, gatewayCreateProducerMySQL.mysqlDbname) &&
        Objects.equals(this.mysqlHost, gatewayCreateProducerMySQL.mysqlHost) &&
        Objects.equals(this.mysqlPassword, gatewayCreateProducerMySQL.mysqlPassword) &&
        Objects.equals(this.mysqlPort, gatewayCreateProducerMySQL.mysqlPort) &&
        Objects.equals(this.mysqlScreationStatements, gatewayCreateProducerMySQL.mysqlScreationStatements) &&
        Objects.equals(this.mysqlUsername, gatewayCreateProducerMySQL.mysqlUsername) &&
        Objects.equals(this.name, gatewayCreateProducerMySQL.name) &&
        Objects.equals(this.password, gatewayCreateProducerMySQL.password) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayCreateProducerMySQL.producerEncryptionKeyName) &&
        Objects.equals(this.token, gatewayCreateProducerMySQL.token) &&
        Objects.equals(this.uidToken, gatewayCreateProducerMySQL.uidToken) &&
        Objects.equals(this.userTtl, gatewayCreateProducerMySQL.userTtl) &&
        Objects.equals(this.username, gatewayCreateProducerMySQL.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbServerCertificates, dbServerName, mysqlDbname, mysqlHost, mysqlPassword, mysqlPort, mysqlScreationStatements, mysqlUsername, name, password, producerEncryptionKeyName, token, uidToken, userTtl, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateProducerMySQL {\n");
    sb.append("    dbServerCertificates: ").append(toIndentedString(dbServerCertificates)).append("\n");
    sb.append("    dbServerName: ").append(toIndentedString(dbServerName)).append("\n");
    sb.append("    mysqlDbname: ").append(toIndentedString(mysqlDbname)).append("\n");
    sb.append("    mysqlHost: ").append(toIndentedString(mysqlHost)).append("\n");
    sb.append("    mysqlPassword: ").append(toIndentedString(mysqlPassword)).append("\n");
    sb.append("    mysqlPort: ").append(toIndentedString(mysqlPort)).append("\n");
    sb.append("    mysqlScreationStatements: ").append(toIndentedString(mysqlScreationStatements)).append("\n");
    sb.append("    mysqlUsername: ").append(toIndentedString(mysqlUsername)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
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

