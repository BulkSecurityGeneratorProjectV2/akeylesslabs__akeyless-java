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
 * gatewayCreateProducerGke is a command that creates gke producer
 */
@ApiModel(description = "gatewayCreateProducerGke is a command that creates gke producer")

public class GatewayCreateProducerGke {
  public static final String SERIALIZED_NAME_GKE_ACCOUNT_KEY = "gke-account-key";
  @SerializedName(SERIALIZED_NAME_GKE_ACCOUNT_KEY)
  private String gkeAccountKey;

  public static final String SERIALIZED_NAME_GKE_CLUSTER_CERT = "gke-cluster-cert";
  @SerializedName(SERIALIZED_NAME_GKE_CLUSTER_CERT)
  private String gkeClusterCert;

  public static final String SERIALIZED_NAME_GKE_CLUSTER_ENDPOINT = "gke-cluster-endpoint";
  @SerializedName(SERIALIZED_NAME_GKE_CLUSTER_ENDPOINT)
  private String gkeClusterEndpoint;

  public static final String SERIALIZED_NAME_GKE_CLUSTER_NAME = "gke-cluster-name";
  @SerializedName(SERIALIZED_NAME_GKE_CLUSTER_NAME)
  private String gkeClusterName;

  public static final String SERIALIZED_NAME_GKE_SERVICE_ACCOUNT_EMAIL = "gke-service-account-email";
  @SerializedName(SERIALIZED_NAME_GKE_SERVICE_ACCOUNT_EMAIL)
  private String gkeServiceAccountEmail;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ALLOW_PORT_FORWADING = "secure-access-allow-port-forwading";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ALLOW_PORT_FORWADING)
  private Boolean secureAccessAllowPortForwading;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER = "secure-access-bastion-issuer";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_BASTION_ISSUER)
  private String secureAccessBastionIssuer;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_CLUSTER_ENDPOINT = "secure-access-cluster-endpoint";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_CLUSTER_ENDPOINT)
  private String secureAccessClusterEndpoint;

  public static final String SERIALIZED_NAME_SECURE_ACCESS_ENABLE = "secure-access-enable";
  @SerializedName(SERIALIZED_NAME_SECURE_ACCESS_ENABLE)
  private String secureAccessEnable;

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


  public GatewayCreateProducerGke gkeAccountKey(String gkeAccountKey) {
    
    this.gkeAccountKey = gkeAccountKey;
    return this;
  }

   /**
   * GKE Service Account key file path
   * @return gkeAccountKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GKE Service Account key file path")

  public String getGkeAccountKey() {
    return gkeAccountKey;
  }


  public void setGkeAccountKey(String gkeAccountKey) {
    this.gkeAccountKey = gkeAccountKey;
  }


  public GatewayCreateProducerGke gkeClusterCert(String gkeClusterCert) {
    
    this.gkeClusterCert = gkeClusterCert;
    return this;
  }

   /**
   * GKE cluster CA certificate
   * @return gkeClusterCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GKE cluster CA certificate")

  public String getGkeClusterCert() {
    return gkeClusterCert;
  }


  public void setGkeClusterCert(String gkeClusterCert) {
    this.gkeClusterCert = gkeClusterCert;
  }


  public GatewayCreateProducerGke gkeClusterEndpoint(String gkeClusterEndpoint) {
    
    this.gkeClusterEndpoint = gkeClusterEndpoint;
    return this;
  }

   /**
   * GKE cluster URL endpoint
   * @return gkeClusterEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GKE cluster URL endpoint")

  public String getGkeClusterEndpoint() {
    return gkeClusterEndpoint;
  }


  public void setGkeClusterEndpoint(String gkeClusterEndpoint) {
    this.gkeClusterEndpoint = gkeClusterEndpoint;
  }


  public GatewayCreateProducerGke gkeClusterName(String gkeClusterName) {
    
    this.gkeClusterName = gkeClusterName;
    return this;
  }

   /**
   * GKE cluster name
   * @return gkeClusterName
  **/
  @ApiModelProperty(required = true, value = "GKE cluster name")

  public String getGkeClusterName() {
    return gkeClusterName;
  }


  public void setGkeClusterName(String gkeClusterName) {
    this.gkeClusterName = gkeClusterName;
  }


  public GatewayCreateProducerGke gkeServiceAccountEmail(String gkeServiceAccountEmail) {
    
    this.gkeServiceAccountEmail = gkeServiceAccountEmail;
    return this;
  }

   /**
   * GKE service account email
   * @return gkeServiceAccountEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GKE service account email")

  public String getGkeServiceAccountEmail() {
    return gkeServiceAccountEmail;
  }


  public void setGkeServiceAccountEmail(String gkeServiceAccountEmail) {
    this.gkeServiceAccountEmail = gkeServiceAccountEmail;
  }


  public GatewayCreateProducerGke name(String name) {
    
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


  public GatewayCreateProducerGke password(String password) {
    
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


  public GatewayCreateProducerGke producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayCreateProducerGke secureAccessAllowPortForwading(Boolean secureAccessAllowPortForwading) {
    
    this.secureAccessAllowPortForwading = secureAccessAllowPortForwading;
    return this;
  }

   /**
   * Get secureAccessAllowPortForwading
   * @return secureAccessAllowPortForwading
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSecureAccessAllowPortForwading() {
    return secureAccessAllowPortForwading;
  }


  public void setSecureAccessAllowPortForwading(Boolean secureAccessAllowPortForwading) {
    this.secureAccessAllowPortForwading = secureAccessAllowPortForwading;
  }


  public GatewayCreateProducerGke secureAccessBastionIssuer(String secureAccessBastionIssuer) {
    
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


  public GatewayCreateProducerGke secureAccessClusterEndpoint(String secureAccessClusterEndpoint) {
    
    this.secureAccessClusterEndpoint = secureAccessClusterEndpoint;
    return this;
  }

   /**
   * Get secureAccessClusterEndpoint
   * @return secureAccessClusterEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecureAccessClusterEndpoint() {
    return secureAccessClusterEndpoint;
  }


  public void setSecureAccessClusterEndpoint(String secureAccessClusterEndpoint) {
    this.secureAccessClusterEndpoint = secureAccessClusterEndpoint;
  }


  public GatewayCreateProducerGke secureAccessEnable(String secureAccessEnable) {
    
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


  public GatewayCreateProducerGke targetName(String targetName) {
    
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


  public GatewayCreateProducerGke token(String token) {
    
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


  public GatewayCreateProducerGke uidToken(String uidToken) {
    
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


  public GatewayCreateProducerGke userTtl(String userTtl) {
    
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


  public GatewayCreateProducerGke username(String username) {
    
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
    GatewayCreateProducerGke gatewayCreateProducerGke = (GatewayCreateProducerGke) o;
    return Objects.equals(this.gkeAccountKey, gatewayCreateProducerGke.gkeAccountKey) &&
        Objects.equals(this.gkeClusterCert, gatewayCreateProducerGke.gkeClusterCert) &&
        Objects.equals(this.gkeClusterEndpoint, gatewayCreateProducerGke.gkeClusterEndpoint) &&
        Objects.equals(this.gkeClusterName, gatewayCreateProducerGke.gkeClusterName) &&
        Objects.equals(this.gkeServiceAccountEmail, gatewayCreateProducerGke.gkeServiceAccountEmail) &&
        Objects.equals(this.name, gatewayCreateProducerGke.name) &&
        Objects.equals(this.password, gatewayCreateProducerGke.password) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayCreateProducerGke.producerEncryptionKeyName) &&
        Objects.equals(this.secureAccessAllowPortForwading, gatewayCreateProducerGke.secureAccessAllowPortForwading) &&
        Objects.equals(this.secureAccessBastionIssuer, gatewayCreateProducerGke.secureAccessBastionIssuer) &&
        Objects.equals(this.secureAccessClusterEndpoint, gatewayCreateProducerGke.secureAccessClusterEndpoint) &&
        Objects.equals(this.secureAccessEnable, gatewayCreateProducerGke.secureAccessEnable) &&
        Objects.equals(this.targetName, gatewayCreateProducerGke.targetName) &&
        Objects.equals(this.token, gatewayCreateProducerGke.token) &&
        Objects.equals(this.uidToken, gatewayCreateProducerGke.uidToken) &&
        Objects.equals(this.userTtl, gatewayCreateProducerGke.userTtl) &&
        Objects.equals(this.username, gatewayCreateProducerGke.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gkeAccountKey, gkeClusterCert, gkeClusterEndpoint, gkeClusterName, gkeServiceAccountEmail, name, password, producerEncryptionKeyName, secureAccessAllowPortForwading, secureAccessBastionIssuer, secureAccessClusterEndpoint, secureAccessEnable, targetName, token, uidToken, userTtl, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCreateProducerGke {\n");
    sb.append("    gkeAccountKey: ").append(toIndentedString(gkeAccountKey)).append("\n");
    sb.append("    gkeClusterCert: ").append(toIndentedString(gkeClusterCert)).append("\n");
    sb.append("    gkeClusterEndpoint: ").append(toIndentedString(gkeClusterEndpoint)).append("\n");
    sb.append("    gkeClusterName: ").append(toIndentedString(gkeClusterName)).append("\n");
    sb.append("    gkeServiceAccountEmail: ").append(toIndentedString(gkeServiceAccountEmail)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    secureAccessAllowPortForwading: ").append(toIndentedString(secureAccessAllowPortForwading)).append("\n");
    sb.append("    secureAccessBastionIssuer: ").append(toIndentedString(secureAccessBastionIssuer)).append("\n");
    sb.append("    secureAccessClusterEndpoint: ").append(toIndentedString(secureAccessClusterEndpoint)).append("\n");
    sb.append("    secureAccessEnable: ").append(toIndentedString(secureAccessEnable)).append("\n");
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

