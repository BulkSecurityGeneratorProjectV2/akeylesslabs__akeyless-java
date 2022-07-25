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
 * gatewayUpdateK8SAuth is a command that updates k8s auth config
 */
@ApiModel(description = "gatewayUpdateK8SAuth is a command that updates k8s auth config")

public class GatewayUpdateK8SAuthConfig {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access-id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  private String accessId;

  public static final String SERIALIZED_NAME_CONFIG_ENCRYPTION_KEY_NAME = "config-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_CONFIG_ENCRYPTION_KEY_NAME)
  private String configEncryptionKeyName;

  public static final String SERIALIZED_NAME_K8S_CA_CERT = "k8s-ca-cert";
  @SerializedName(SERIALIZED_NAME_K8S_CA_CERT)
  private String k8sCaCert;

  public static final String SERIALIZED_NAME_K8S_HOST = "k8s-host";
  @SerializedName(SERIALIZED_NAME_K8S_HOST)
  private String k8sHost;

  public static final String SERIALIZED_NAME_K8S_ISSUER = "k8s-issuer";
  @SerializedName(SERIALIZED_NAME_K8S_ISSUER)
  private String k8sIssuer;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_SIGNING_KEY = "signing-key";
  @SerializedName(SERIALIZED_NAME_SIGNING_KEY)
  private String signingKey;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TOKEN_EXP = "token-exp";
  @SerializedName(SERIALIZED_NAME_TOKEN_EXP)
  private Long tokenExp = 300l;

  public static final String SERIALIZED_NAME_TOKEN_REVIEWER_JWT = "token-reviewer-jwt";
  @SerializedName(SERIALIZED_NAME_TOKEN_REVIEWER_JWT)
  private String tokenReviewerJwt;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public GatewayUpdateK8SAuthConfig accessId(String accessId) {
    
    this.accessId = accessId;
    return this;
  }

   /**
   * The access ID of the Kubernetes auth method
   * @return accessId
  **/
  @ApiModelProperty(required = true, value = "The access ID of the Kubernetes auth method")

  public String getAccessId() {
    return accessId;
  }


  public void setAccessId(String accessId) {
    this.accessId = accessId;
  }


  public GatewayUpdateK8SAuthConfig configEncryptionKeyName(String configEncryptionKeyName) {
    
    this.configEncryptionKeyName = configEncryptionKeyName;
    return this;
  }

   /**
   * Config encryption key
   * @return configEncryptionKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Config encryption key")

  public String getConfigEncryptionKeyName() {
    return configEncryptionKeyName;
  }


  public void setConfigEncryptionKeyName(String configEncryptionKeyName) {
    this.configEncryptionKeyName = configEncryptionKeyName;
  }


  public GatewayUpdateK8SAuthConfig k8sCaCert(String k8sCaCert) {
    
    this.k8sCaCert = k8sCaCert;
    return this;
  }

   /**
   * The CA Cert (in PEM format) to use to call into the kubernetes API server
   * @return k8sCaCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The CA Cert (in PEM format) to use to call into the kubernetes API server")

  public String getK8sCaCert() {
    return k8sCaCert;
  }


  public void setK8sCaCert(String k8sCaCert) {
    this.k8sCaCert = k8sCaCert;
  }


  public GatewayUpdateK8SAuthConfig k8sHost(String k8sHost) {
    
    this.k8sHost = k8sHost;
    return this;
  }

   /**
   * The URL of the kubernetes API server
   * @return k8sHost
  **/
  @ApiModelProperty(required = true, value = "The URL of the kubernetes API server")

  public String getK8sHost() {
    return k8sHost;
  }


  public void setK8sHost(String k8sHost) {
    this.k8sHost = k8sHost;
  }


  public GatewayUpdateK8SAuthConfig k8sIssuer(String k8sIssuer) {
    
    this.k8sIssuer = k8sIssuer;
    return this;
  }

   /**
   * The Kubernetes JWT issuer name. If not set, kubernetes/serviceaccount will use as an issuer.
   * @return k8sIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Kubernetes JWT issuer name. If not set, kubernetes/serviceaccount will use as an issuer.")

  public String getK8sIssuer() {
    return k8sIssuer;
  }


  public void setK8sIssuer(String k8sIssuer) {
    this.k8sIssuer = k8sIssuer;
  }


  public GatewayUpdateK8SAuthConfig name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * K8S Auth config name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "K8S Auth config name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GatewayUpdateK8SAuthConfig newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * K8S Auth config new name
   * @return newName
  **/
  @ApiModelProperty(required = true, value = "K8S Auth config new name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public GatewayUpdateK8SAuthConfig signingKey(String signingKey) {
    
    this.signingKey = signingKey;
    return this;
  }

   /**
   * The private key (in base64 encoded of the PEM format) associated with the public key defined in the Kubernetes auth
   * @return signingKey
  **/
  @ApiModelProperty(required = true, value = "The private key (in base64 encoded of the PEM format) associated with the public key defined in the Kubernetes auth")

  public String getSigningKey() {
    return signingKey;
  }


  public void setSigningKey(String signingKey) {
    this.signingKey = signingKey;
  }


  public GatewayUpdateK8SAuthConfig token(String token) {
    
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


  public GatewayUpdateK8SAuthConfig tokenExp(Long tokenExp) {
    
    this.tokenExp = tokenExp;
    return this;
  }

   /**
   * Time in seconds of expiration of the Akeyless Kube Auth Method token
   * @return tokenExp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time in seconds of expiration of the Akeyless Kube Auth Method token")

  public Long getTokenExp() {
    return tokenExp;
  }


  public void setTokenExp(Long tokenExp) {
    this.tokenExp = tokenExp;
  }


  public GatewayUpdateK8SAuthConfig tokenReviewerJwt(String tokenReviewerJwt) {
    
    this.tokenReviewerJwt = tokenReviewerJwt;
    return this;
  }

   /**
   * A Kubernetes service account JWT used to access the TokenReview API to validate other JWTs. If not set, the JWT submitted in the authentication process will be used to access the Kubernetes TokenReview API.
   * @return tokenReviewerJwt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A Kubernetes service account JWT used to access the TokenReview API to validate other JWTs. If not set, the JWT submitted in the authentication process will be used to access the Kubernetes TokenReview API.")

  public String getTokenReviewerJwt() {
    return tokenReviewerJwt;
  }


  public void setTokenReviewerJwt(String tokenReviewerJwt) {
    this.tokenReviewerJwt = tokenReviewerJwt;
  }


  public GatewayUpdateK8SAuthConfig uidToken(String uidToken) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayUpdateK8SAuthConfig gatewayUpdateK8SAuthConfig = (GatewayUpdateK8SAuthConfig) o;
    return Objects.equals(this.accessId, gatewayUpdateK8SAuthConfig.accessId) &&
        Objects.equals(this.configEncryptionKeyName, gatewayUpdateK8SAuthConfig.configEncryptionKeyName) &&
        Objects.equals(this.k8sCaCert, gatewayUpdateK8SAuthConfig.k8sCaCert) &&
        Objects.equals(this.k8sHost, gatewayUpdateK8SAuthConfig.k8sHost) &&
        Objects.equals(this.k8sIssuer, gatewayUpdateK8SAuthConfig.k8sIssuer) &&
        Objects.equals(this.name, gatewayUpdateK8SAuthConfig.name) &&
        Objects.equals(this.newName, gatewayUpdateK8SAuthConfig.newName) &&
        Objects.equals(this.signingKey, gatewayUpdateK8SAuthConfig.signingKey) &&
        Objects.equals(this.token, gatewayUpdateK8SAuthConfig.token) &&
        Objects.equals(this.tokenExp, gatewayUpdateK8SAuthConfig.tokenExp) &&
        Objects.equals(this.tokenReviewerJwt, gatewayUpdateK8SAuthConfig.tokenReviewerJwt) &&
        Objects.equals(this.uidToken, gatewayUpdateK8SAuthConfig.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, configEncryptionKeyName, k8sCaCert, k8sHost, k8sIssuer, name, newName, signingKey, token, tokenExp, tokenReviewerJwt, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateK8SAuthConfig {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    configEncryptionKeyName: ").append(toIndentedString(configEncryptionKeyName)).append("\n");
    sb.append("    k8sCaCert: ").append(toIndentedString(k8sCaCert)).append("\n");
    sb.append("    k8sHost: ").append(toIndentedString(k8sHost)).append("\n");
    sb.append("    k8sIssuer: ").append(toIndentedString(k8sIssuer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    signingKey: ").append(toIndentedString(signingKey)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenExp: ").append(toIndentedString(tokenExp)).append("\n");
    sb.append("    tokenReviewerJwt: ").append(toIndentedString(tokenReviewerJwt)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

