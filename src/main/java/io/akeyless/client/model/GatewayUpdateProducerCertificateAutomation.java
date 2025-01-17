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
 * gatewayUpdateProducerCertificateAutomation is a command that updates a Certificate Automation dynamic secret producer to dynamically update certificates generated by Venafi or have Akeyless generated certificates using PKI be monitored by Venafi
 */
@ApiModel(description = "gatewayUpdateProducerCertificateAutomation is a command that updates a Certificate Automation dynamic secret producer to dynamically update certificates generated by Venafi or have Akeyless generated certificates using PKI be monitored by Venafi")

public class GatewayUpdateProducerCertificateAutomation {
  public static final String SERIALIZED_NAME_ADMIN_ROTATION_INTERVAL_DAYS = "admin-rotation-interval-days";
  @SerializedName(SERIALIZED_NAME_ADMIN_ROTATION_INTERVAL_DAYS)
  private Long adminRotationIntervalDays = 0l;

  public static final String SERIALIZED_NAME_ALLOW_SUBDOMAINS = "allow-subdomains";
  @SerializedName(SERIALIZED_NAME_ALLOW_SUBDOMAINS)
  private Boolean allowSubdomains;

  public static final String SERIALIZED_NAME_ALLOWED_DOMAINS = "allowed-domains";
  @SerializedName(SERIALIZED_NAME_ALLOWED_DOMAINS)
  private List<String> allowedDomains = null;

  public static final String SERIALIZED_NAME_AUTO_GENERATED_FOLDER = "auto-generated-folder";
  @SerializedName(SERIALIZED_NAME_AUTO_GENERATED_FOLDER)
  private String autoGeneratedFolder;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_ENABLE_ADMIN_ROTATION = "enable-admin-rotation";
  @SerializedName(SERIALIZED_NAME_ENABLE_ADMIN_ROTATION)
  private Boolean enableAdminRotation = false;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_NAME = "new-name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME = "producer-encryption-key-name";
  @SerializedName(SERIALIZED_NAME_PRODUCER_ENCRYPTION_KEY_NAME)
  private String producerEncryptionKeyName;

  public static final String SERIALIZED_NAME_ROOT_FIRST_IN_CHAIN = "root-first-in-chain";
  @SerializedName(SERIALIZED_NAME_ROOT_FIRST_IN_CHAIN)
  private Boolean rootFirstInChain;

  public static final String SERIALIZED_NAME_SIGN_USING_AKEYLESS_PKI = "sign-using-akeyless-pki";
  @SerializedName(SERIALIZED_NAME_SIGN_USING_AKEYLESS_PKI)
  private Boolean signUsingAkeylessPki;

  public static final String SERIALIZED_NAME_SIGNER_KEY_NAME = "signer-key-name";
  @SerializedName(SERIALIZED_NAME_SIGNER_KEY_NAME)
  private String signerKeyName;

  public static final String SERIALIZED_NAME_STORE_PRIVATE_KEY = "store-private-key";
  @SerializedName(SERIALIZED_NAME_STORE_PRIVATE_KEY)
  private Boolean storePrivateKey;

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
  private String userTtl;

  public static final String SERIALIZED_NAME_VENAFI_API_KEY = "venafi-api-key";
  @SerializedName(SERIALIZED_NAME_VENAFI_API_KEY)
  private String venafiApiKey;

  public static final String SERIALIZED_NAME_VENAFI_BASEURL = "venafi-baseurl";
  @SerializedName(SERIALIZED_NAME_VENAFI_BASEURL)
  private String venafiBaseurl;

  public static final String SERIALIZED_NAME_VENAFI_PASSWORD = "venafi-password";
  @SerializedName(SERIALIZED_NAME_VENAFI_PASSWORD)
  private String venafiPassword;

  public static final String SERIALIZED_NAME_VENAFI_USE_TPP = "venafi-use-tpp";
  @SerializedName(SERIALIZED_NAME_VENAFI_USE_TPP)
  private Boolean venafiUseTpp;

  public static final String SERIALIZED_NAME_VENAFI_USERNAME = "venafi-username";
  @SerializedName(SERIALIZED_NAME_VENAFI_USERNAME)
  private String venafiUsername;

  public static final String SERIALIZED_NAME_VENAFI_ZONE = "venafi-zone";
  @SerializedName(SERIALIZED_NAME_VENAFI_ZONE)
  private String venafiZone;


  public GatewayUpdateProducerCertificateAutomation adminRotationIntervalDays(Long adminRotationIntervalDays) {
    
    this.adminRotationIntervalDays = adminRotationIntervalDays;
    return this;
  }

   /**
   * Admin credentials rotation interval (days)
   * @return adminRotationIntervalDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Admin credentials rotation interval (days)")

  public Long getAdminRotationIntervalDays() {
    return adminRotationIntervalDays;
  }


  public void setAdminRotationIntervalDays(Long adminRotationIntervalDays) {
    this.adminRotationIntervalDays = adminRotationIntervalDays;
  }


  public GatewayUpdateProducerCertificateAutomation allowSubdomains(Boolean allowSubdomains) {
    
    this.allowSubdomains = allowSubdomains;
    return this;
  }

   /**
   * Allow subdomains
   * @return allowSubdomains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow subdomains")

  public Boolean getAllowSubdomains() {
    return allowSubdomains;
  }


  public void setAllowSubdomains(Boolean allowSubdomains) {
    this.allowSubdomains = allowSubdomains;
  }


  public GatewayUpdateProducerCertificateAutomation allowedDomains(List<String> allowedDomains) {
    
    this.allowedDomains = allowedDomains;
    return this;
  }

  public GatewayUpdateProducerCertificateAutomation addAllowedDomainsItem(String allowedDomainsItem) {
    if (this.allowedDomains == null) {
      this.allowedDomains = new ArrayList<String>();
    }
    this.allowedDomains.add(allowedDomainsItem);
    return this;
  }

   /**
   * Allowed domains
   * @return allowedDomains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allowed domains")

  public List<String> getAllowedDomains() {
    return allowedDomains;
  }


  public void setAllowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
  }


  public GatewayUpdateProducerCertificateAutomation autoGeneratedFolder(String autoGeneratedFolder) {
    
    this.autoGeneratedFolder = autoGeneratedFolder;
    return this;
  }

   /**
   * Auto generated folder
   * @return autoGeneratedFolder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Auto generated folder")

  public String getAutoGeneratedFolder() {
    return autoGeneratedFolder;
  }


  public void setAutoGeneratedFolder(String autoGeneratedFolder) {
    this.autoGeneratedFolder = autoGeneratedFolder;
  }


  public GatewayUpdateProducerCertificateAutomation deleteProtection(String deleteProtection) {
    
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


  public GatewayUpdateProducerCertificateAutomation enableAdminRotation(Boolean enableAdminRotation) {
    
    this.enableAdminRotation = enableAdminRotation;
    return this;
  }

   /**
   * Automatic admin credentials rotation
   * @return enableAdminRotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Automatic admin credentials rotation")

  public Boolean getEnableAdminRotation() {
    return enableAdminRotation;
  }


  public void setEnableAdminRotation(Boolean enableAdminRotation) {
    this.enableAdminRotation = enableAdminRotation;
  }


  public GatewayUpdateProducerCertificateAutomation json(Boolean json) {
    
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


  public GatewayUpdateProducerCertificateAutomation name(String name) {
    
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


  public GatewayUpdateProducerCertificateAutomation newName(String newName) {
    
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


  public GatewayUpdateProducerCertificateAutomation producerEncryptionKeyName(String producerEncryptionKeyName) {
    
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


  public GatewayUpdateProducerCertificateAutomation rootFirstInChain(Boolean rootFirstInChain) {
    
    this.rootFirstInChain = rootFirstInChain;
    return this;
  }

   /**
   * Root first in chain
   * @return rootFirstInChain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Root first in chain")

  public Boolean getRootFirstInChain() {
    return rootFirstInChain;
  }


  public void setRootFirstInChain(Boolean rootFirstInChain) {
    this.rootFirstInChain = rootFirstInChain;
  }


  public GatewayUpdateProducerCertificateAutomation signUsingAkeylessPki(Boolean signUsingAkeylessPki) {
    
    this.signUsingAkeylessPki = signUsingAkeylessPki;
    return this;
  }

   /**
   * Use Akeyless PKI issuer or Venafi issuer
   * @return signUsingAkeylessPki
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use Akeyless PKI issuer or Venafi issuer")

  public Boolean getSignUsingAkeylessPki() {
    return signUsingAkeylessPki;
  }


  public void setSignUsingAkeylessPki(Boolean signUsingAkeylessPki) {
    this.signUsingAkeylessPki = signUsingAkeylessPki;
  }


  public GatewayUpdateProducerCertificateAutomation signerKeyName(String signerKeyName) {
    
    this.signerKeyName = signerKeyName;
    return this;
  }

   /**
   * Signer key name
   * @return signerKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Signer key name")

  public String getSignerKeyName() {
    return signerKeyName;
  }


  public void setSignerKeyName(String signerKeyName) {
    this.signerKeyName = signerKeyName;
  }


  public GatewayUpdateProducerCertificateAutomation storePrivateKey(Boolean storePrivateKey) {
    
    this.storePrivateKey = storePrivateKey;
    return this;
  }

   /**
   * Store private key
   * @return storePrivateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Store private key")

  public Boolean getStorePrivateKey() {
    return storePrivateKey;
  }


  public void setStorePrivateKey(Boolean storePrivateKey) {
    this.storePrivateKey = storePrivateKey;
  }


  public GatewayUpdateProducerCertificateAutomation tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GatewayUpdateProducerCertificateAutomation addTagsItem(String tagsItem) {
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


  public GatewayUpdateProducerCertificateAutomation targetName(String targetName) {
    
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


  public GatewayUpdateProducerCertificateAutomation token(String token) {
    
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


  public GatewayUpdateProducerCertificateAutomation uidToken(String uidToken) {
    
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


  public GatewayUpdateProducerCertificateAutomation userTtl(String userTtl) {
    
    this.userTtl = userTtl;
    return this;
  }

   /**
   * User TTL in time.Duration format (2160h / 129600m / etc...). When using sign-using-akeyless-pki certificates created will have this validity period, otherwise the user-ttl is taken from the Validity Period field of the Zone&#39;s&#39; Issuing Template. When using cert-manager it is advised to have a TTL of above 60 days (1440h). For more information - https://cert-manager.io/docs/usage/certificate/
   * @return userTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User TTL in time.Duration format (2160h / 129600m / etc...). When using sign-using-akeyless-pki certificates created will have this validity period, otherwise the user-ttl is taken from the Validity Period field of the Zone's' Issuing Template. When using cert-manager it is advised to have a TTL of above 60 days (1440h). For more information - https://cert-manager.io/docs/usage/certificate/")

  public String getUserTtl() {
    return userTtl;
  }


  public void setUserTtl(String userTtl) {
    this.userTtl = userTtl;
  }


  public GatewayUpdateProducerCertificateAutomation venafiApiKey(String venafiApiKey) {
    
    this.venafiApiKey = venafiApiKey;
    return this;
  }

   /**
   * Venafi API key
   * @return venafiApiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Venafi API key")

  public String getVenafiApiKey() {
    return venafiApiKey;
  }


  public void setVenafiApiKey(String venafiApiKey) {
    this.venafiApiKey = venafiApiKey;
  }


  public GatewayUpdateProducerCertificateAutomation venafiBaseurl(String venafiBaseurl) {
    
    this.venafiBaseurl = venafiBaseurl;
    return this;
  }

   /**
   * Venafi Baseurl
   * @return venafiBaseurl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Venafi Baseurl")

  public String getVenafiBaseurl() {
    return venafiBaseurl;
  }


  public void setVenafiBaseurl(String venafiBaseurl) {
    this.venafiBaseurl = venafiBaseurl;
  }


  public GatewayUpdateProducerCertificateAutomation venafiPassword(String venafiPassword) {
    
    this.venafiPassword = venafiPassword;
    return this;
  }

   /**
   * Venafi Password
   * @return venafiPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Venafi Password")

  public String getVenafiPassword() {
    return venafiPassword;
  }


  public void setVenafiPassword(String venafiPassword) {
    this.venafiPassword = venafiPassword;
  }


  public GatewayUpdateProducerCertificateAutomation venafiUseTpp(Boolean venafiUseTpp) {
    
    this.venafiUseTpp = venafiUseTpp;
    return this;
  }

   /**
   * Venafi using TPP
   * @return venafiUseTpp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Venafi using TPP")

  public Boolean getVenafiUseTpp() {
    return venafiUseTpp;
  }


  public void setVenafiUseTpp(Boolean venafiUseTpp) {
    this.venafiUseTpp = venafiUseTpp;
  }


  public GatewayUpdateProducerCertificateAutomation venafiUsername(String venafiUsername) {
    
    this.venafiUsername = venafiUsername;
    return this;
  }

   /**
   * Venafi Username
   * @return venafiUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Venafi Username")

  public String getVenafiUsername() {
    return venafiUsername;
  }


  public void setVenafiUsername(String venafiUsername) {
    this.venafiUsername = venafiUsername;
  }


  public GatewayUpdateProducerCertificateAutomation venafiZone(String venafiZone) {
    
    this.venafiZone = venafiZone;
    return this;
  }

   /**
   * Venafi Zone
   * @return venafiZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Venafi Zone")

  public String getVenafiZone() {
    return venafiZone;
  }


  public void setVenafiZone(String venafiZone) {
    this.venafiZone = venafiZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayUpdateProducerCertificateAutomation gatewayUpdateProducerCertificateAutomation = (GatewayUpdateProducerCertificateAutomation) o;
    return Objects.equals(this.adminRotationIntervalDays, gatewayUpdateProducerCertificateAutomation.adminRotationIntervalDays) &&
        Objects.equals(this.allowSubdomains, gatewayUpdateProducerCertificateAutomation.allowSubdomains) &&
        Objects.equals(this.allowedDomains, gatewayUpdateProducerCertificateAutomation.allowedDomains) &&
        Objects.equals(this.autoGeneratedFolder, gatewayUpdateProducerCertificateAutomation.autoGeneratedFolder) &&
        Objects.equals(this.deleteProtection, gatewayUpdateProducerCertificateAutomation.deleteProtection) &&
        Objects.equals(this.enableAdminRotation, gatewayUpdateProducerCertificateAutomation.enableAdminRotation) &&
        Objects.equals(this.json, gatewayUpdateProducerCertificateAutomation.json) &&
        Objects.equals(this.name, gatewayUpdateProducerCertificateAutomation.name) &&
        Objects.equals(this.newName, gatewayUpdateProducerCertificateAutomation.newName) &&
        Objects.equals(this.producerEncryptionKeyName, gatewayUpdateProducerCertificateAutomation.producerEncryptionKeyName) &&
        Objects.equals(this.rootFirstInChain, gatewayUpdateProducerCertificateAutomation.rootFirstInChain) &&
        Objects.equals(this.signUsingAkeylessPki, gatewayUpdateProducerCertificateAutomation.signUsingAkeylessPki) &&
        Objects.equals(this.signerKeyName, gatewayUpdateProducerCertificateAutomation.signerKeyName) &&
        Objects.equals(this.storePrivateKey, gatewayUpdateProducerCertificateAutomation.storePrivateKey) &&
        Objects.equals(this.tags, gatewayUpdateProducerCertificateAutomation.tags) &&
        Objects.equals(this.targetName, gatewayUpdateProducerCertificateAutomation.targetName) &&
        Objects.equals(this.token, gatewayUpdateProducerCertificateAutomation.token) &&
        Objects.equals(this.uidToken, gatewayUpdateProducerCertificateAutomation.uidToken) &&
        Objects.equals(this.userTtl, gatewayUpdateProducerCertificateAutomation.userTtl) &&
        Objects.equals(this.venafiApiKey, gatewayUpdateProducerCertificateAutomation.venafiApiKey) &&
        Objects.equals(this.venafiBaseurl, gatewayUpdateProducerCertificateAutomation.venafiBaseurl) &&
        Objects.equals(this.venafiPassword, gatewayUpdateProducerCertificateAutomation.venafiPassword) &&
        Objects.equals(this.venafiUseTpp, gatewayUpdateProducerCertificateAutomation.venafiUseTpp) &&
        Objects.equals(this.venafiUsername, gatewayUpdateProducerCertificateAutomation.venafiUsername) &&
        Objects.equals(this.venafiZone, gatewayUpdateProducerCertificateAutomation.venafiZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminRotationIntervalDays, allowSubdomains, allowedDomains, autoGeneratedFolder, deleteProtection, enableAdminRotation, json, name, newName, producerEncryptionKeyName, rootFirstInChain, signUsingAkeylessPki, signerKeyName, storePrivateKey, tags, targetName, token, uidToken, userTtl, venafiApiKey, venafiBaseurl, venafiPassword, venafiUseTpp, venafiUsername, venafiZone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayUpdateProducerCertificateAutomation {\n");
    sb.append("    adminRotationIntervalDays: ").append(toIndentedString(adminRotationIntervalDays)).append("\n");
    sb.append("    allowSubdomains: ").append(toIndentedString(allowSubdomains)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
    sb.append("    autoGeneratedFolder: ").append(toIndentedString(autoGeneratedFolder)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    enableAdminRotation: ").append(toIndentedString(enableAdminRotation)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    producerEncryptionKeyName: ").append(toIndentedString(producerEncryptionKeyName)).append("\n");
    sb.append("    rootFirstInChain: ").append(toIndentedString(rootFirstInChain)).append("\n");
    sb.append("    signUsingAkeylessPki: ").append(toIndentedString(signUsingAkeylessPki)).append("\n");
    sb.append("    signerKeyName: ").append(toIndentedString(signerKeyName)).append("\n");
    sb.append("    storePrivateKey: ").append(toIndentedString(storePrivateKey)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userTtl: ").append(toIndentedString(userTtl)).append("\n");
    sb.append("    venafiApiKey: ").append(toIndentedString(venafiApiKey)).append("\n");
    sb.append("    venafiBaseurl: ").append(toIndentedString(venafiBaseurl)).append("\n");
    sb.append("    venafiPassword: ").append(toIndentedString(venafiPassword)).append("\n");
    sb.append("    venafiUseTpp: ").append(toIndentedString(venafiUseTpp)).append("\n");
    sb.append("    venafiUsername: ").append(toIndentedString(venafiUsername)).append("\n");
    sb.append("    venafiZone: ").append(toIndentedString(venafiZone)).append("\n");
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

