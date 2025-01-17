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
 * UpdateGKETarget
 */

public class UpdateGKETarget {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

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

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_KEEP_PREV_VERSION = "keep-prev-version";
  @SerializedName(SERIALIZED_NAME_KEEP_PREV_VERSION)
  private String keepPrevVersion;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_UPDATE_VERSION = "update-version";
  @SerializedName(SERIALIZED_NAME_UPDATE_VERSION)
  private Boolean updateVersion;

  public static final String SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY = "use-gw-cloud-identity";
  @SerializedName(SERIALIZED_NAME_USE_GW_CLOUD_IDENTITY)
  private Boolean useGwCloudIdentity;


  public UpdateGKETarget comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Comment about the target
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comment about the target")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public UpdateGKETarget gkeAccountKey(String gkeAccountKey) {
    
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


  public UpdateGKETarget gkeClusterCert(String gkeClusterCert) {
    
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


  public UpdateGKETarget gkeClusterEndpoint(String gkeClusterEndpoint) {
    
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


  public UpdateGKETarget gkeClusterName(String gkeClusterName) {
    
    this.gkeClusterName = gkeClusterName;
    return this;
  }

   /**
   * GKE cluster name
   * @return gkeClusterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GKE cluster name")

  public String getGkeClusterName() {
    return gkeClusterName;
  }


  public void setGkeClusterName(String gkeClusterName) {
    this.gkeClusterName = gkeClusterName;
  }


  public UpdateGKETarget gkeServiceAccountEmail(String gkeServiceAccountEmail) {
    
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


  public UpdateGKETarget json(Boolean json) {
    
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


  public UpdateGKETarget keepPrevVersion(String keepPrevVersion) {
    
    this.keepPrevVersion = keepPrevVersion;
    return this;
  }

   /**
   * Get keepPrevVersion
   * @return keepPrevVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeepPrevVersion() {
    return keepPrevVersion;
  }


  public void setKeepPrevVersion(String keepPrevVersion) {
    this.keepPrevVersion = keepPrevVersion;
  }


  public UpdateGKETarget key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a key that used to encrypt the target secret value (if empty, the account default protectionKey key will be used)")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public UpdateGKETarget name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Target name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Target name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateGKETarget newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * New target name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New target name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public UpdateGKETarget token(String token) {
    
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


  public UpdateGKETarget uidToken(String uidToken) {
    
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


  public UpdateGKETarget updateVersion(Boolean updateVersion) {
    
    this.updateVersion = updateVersion;
    return this;
  }

   /**
   * Deprecated
   * @return updateVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated")

  public Boolean getUpdateVersion() {
    return updateVersion;
  }


  public void setUpdateVersion(Boolean updateVersion) {
    this.updateVersion = updateVersion;
  }


  public UpdateGKETarget useGwCloudIdentity(Boolean useGwCloudIdentity) {
    
    this.useGwCloudIdentity = useGwCloudIdentity;
    return this;
  }

   /**
   * Get useGwCloudIdentity
   * @return useGwCloudIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseGwCloudIdentity() {
    return useGwCloudIdentity;
  }


  public void setUseGwCloudIdentity(Boolean useGwCloudIdentity) {
    this.useGwCloudIdentity = useGwCloudIdentity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGKETarget updateGKETarget = (UpdateGKETarget) o;
    return Objects.equals(this.comment, updateGKETarget.comment) &&
        Objects.equals(this.gkeAccountKey, updateGKETarget.gkeAccountKey) &&
        Objects.equals(this.gkeClusterCert, updateGKETarget.gkeClusterCert) &&
        Objects.equals(this.gkeClusterEndpoint, updateGKETarget.gkeClusterEndpoint) &&
        Objects.equals(this.gkeClusterName, updateGKETarget.gkeClusterName) &&
        Objects.equals(this.gkeServiceAccountEmail, updateGKETarget.gkeServiceAccountEmail) &&
        Objects.equals(this.json, updateGKETarget.json) &&
        Objects.equals(this.keepPrevVersion, updateGKETarget.keepPrevVersion) &&
        Objects.equals(this.key, updateGKETarget.key) &&
        Objects.equals(this.name, updateGKETarget.name) &&
        Objects.equals(this.newName, updateGKETarget.newName) &&
        Objects.equals(this.token, updateGKETarget.token) &&
        Objects.equals(this.uidToken, updateGKETarget.uidToken) &&
        Objects.equals(this.updateVersion, updateGKETarget.updateVersion) &&
        Objects.equals(this.useGwCloudIdentity, updateGKETarget.useGwCloudIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, gkeAccountKey, gkeClusterCert, gkeClusterEndpoint, gkeClusterName, gkeServiceAccountEmail, json, keepPrevVersion, key, name, newName, token, uidToken, updateVersion, useGwCloudIdentity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGKETarget {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    gkeAccountKey: ").append(toIndentedString(gkeAccountKey)).append("\n");
    sb.append("    gkeClusterCert: ").append(toIndentedString(gkeClusterCert)).append("\n");
    sb.append("    gkeClusterEndpoint: ").append(toIndentedString(gkeClusterEndpoint)).append("\n");
    sb.append("    gkeClusterName: ").append(toIndentedString(gkeClusterName)).append("\n");
    sb.append("    gkeServiceAccountEmail: ").append(toIndentedString(gkeServiceAccountEmail)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keepPrevVersion: ").append(toIndentedString(keepPrevVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    updateVersion: ").append(toIndentedString(updateVersion)).append("\n");
    sb.append("    useGwCloudIdentity: ").append(toIndentedString(useGwCloudIdentity)).append("\n");
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

