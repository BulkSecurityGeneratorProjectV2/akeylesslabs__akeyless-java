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
 * updateAuthMethodSAML is a command that updates a new auth method that will be available to authenticate using SAML.
 */
@ApiModel(description = "updateAuthMethodSAML is a command that updates a new auth method that will be available to authenticate using SAML.")

public class UpdateAuthMethodSAML {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_ALLOWED_REDIRECT_URI = "allowed-redirect-uri";
  @SerializedName(SERIALIZED_NAME_ALLOWED_REDIRECT_URI)
  private List<String> allowedRedirectUri = null;

  public static final String SERIALIZED_NAME_BOUND_IPS = "bound-ips";
  @SerializedName(SERIALIZED_NAME_BOUND_IPS)
  private List<String> boundIps = null;

  public static final String SERIALIZED_NAME_FORCE_SUB_CLAIMS = "force-sub-claims";
  @SerializedName(SERIALIZED_NAME_FORCE_SUB_CLAIMS)
  private Boolean forceSubClaims;

  public static final String SERIALIZED_NAME_IDP_METADATA_URL = "idp-metadata-url";
  @SerializedName(SERIALIZED_NAME_IDP_METADATA_URL)
  private String idpMetadataUrl;

  public static final String SERIALIZED_NAME_IDP_METADATA_XML_DATA = "idp-metadata-xml-data";
  @SerializedName(SERIALIZED_NAME_IDP_METADATA_XML_DATA)
  private String idpMetadataXmlData;

  public static final String SERIALIZED_NAME_JWT_TTL = "jwt-ttl";
  @SerializedName(SERIALIZED_NAME_JWT_TTL)
  private Long jwtTtl;

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

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique-identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  private String uniqueIdentifier;


  public UpdateAuthMethodSAML accessExpires(Long accessExpires) {
    
    this.accessExpires = accessExpires;
    return this;
  }

   /**
   * Access expiration date in Unix timestamp (select 0 for access without expiry date)
   * @return accessExpires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access expiration date in Unix timestamp (select 0 for access without expiry date)")

  public Long getAccessExpires() {
    return accessExpires;
  }


  public void setAccessExpires(Long accessExpires) {
    this.accessExpires = accessExpires;
  }


  public UpdateAuthMethodSAML allowedRedirectUri(List<String> allowedRedirectUri) {
    
    this.allowedRedirectUri = allowedRedirectUri;
    return this;
  }

  public UpdateAuthMethodSAML addAllowedRedirectUriItem(String allowedRedirectUriItem) {
    if (this.allowedRedirectUri == null) {
      this.allowedRedirectUri = new ArrayList<String>();
    }
    this.allowedRedirectUri.add(allowedRedirectUriItem);
    return this;
  }

   /**
   * Allowed redirect URIs after the authentication
   * @return allowedRedirectUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allowed redirect URIs after the authentication")

  public List<String> getAllowedRedirectUri() {
    return allowedRedirectUri;
  }


  public void setAllowedRedirectUri(List<String> allowedRedirectUri) {
    this.allowedRedirectUri = allowedRedirectUri;
  }


  public UpdateAuthMethodSAML boundIps(List<String> boundIps) {
    
    this.boundIps = boundIps;
    return this;
  }

  public UpdateAuthMethodSAML addBoundIpsItem(String boundIpsItem) {
    if (this.boundIps == null) {
      this.boundIps = new ArrayList<String>();
    }
    this.boundIps.add(boundIpsItem);
    return this;
  }

   /**
   * A CIDR whitelist with the IPs that the access is restricted to
   * @return boundIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A CIDR whitelist with the IPs that the access is restricted to")

  public List<String> getBoundIps() {
    return boundIps;
  }


  public void setBoundIps(List<String> boundIps) {
    this.boundIps = boundIps;
  }


  public UpdateAuthMethodSAML forceSubClaims(Boolean forceSubClaims) {
    
    this.forceSubClaims = forceSubClaims;
    return this;
  }

   /**
   * if true: enforce role-association must include sub claims
   * @return forceSubClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if true: enforce role-association must include sub claims")

  public Boolean getForceSubClaims() {
    return forceSubClaims;
  }


  public void setForceSubClaims(Boolean forceSubClaims) {
    this.forceSubClaims = forceSubClaims;
  }


  public UpdateAuthMethodSAML idpMetadataUrl(String idpMetadataUrl) {
    
    this.idpMetadataUrl = idpMetadataUrl;
    return this;
  }

   /**
   * IDP metadata url
   * @return idpMetadataUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IDP metadata url")

  public String getIdpMetadataUrl() {
    return idpMetadataUrl;
  }


  public void setIdpMetadataUrl(String idpMetadataUrl) {
    this.idpMetadataUrl = idpMetadataUrl;
  }


  public UpdateAuthMethodSAML idpMetadataXmlData(String idpMetadataXmlData) {
    
    this.idpMetadataXmlData = idpMetadataXmlData;
    return this;
  }

   /**
   * IDP metadata xml data
   * @return idpMetadataXmlData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IDP metadata xml data")

  public String getIdpMetadataXmlData() {
    return idpMetadataXmlData;
  }


  public void setIdpMetadataXmlData(String idpMetadataXmlData) {
    this.idpMetadataXmlData = idpMetadataXmlData;
  }


  public UpdateAuthMethodSAML jwtTtl(Long jwtTtl) {
    
    this.jwtTtl = jwtTtl;
    return this;
  }

   /**
   * Jwt TTL
   * @return jwtTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Jwt TTL")

  public Long getJwtTtl() {
    return jwtTtl;
  }


  public void setJwtTtl(Long jwtTtl) {
    this.jwtTtl = jwtTtl;
  }


  public UpdateAuthMethodSAML name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Auth Method name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Auth Method name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateAuthMethodSAML newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Auth Method new name
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Auth Method new name")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public UpdateAuthMethodSAML token(String token) {
    
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


  public UpdateAuthMethodSAML uidToken(String uidToken) {
    
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


  public UpdateAuthMethodSAML uniqueIdentifier(String uniqueIdentifier) {
    
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

   /**
   * A unique identifier (ID) value should be configured for OAuth2, LDAP and SAML authentication method types and is usually a value such as the email, username, or upn for example. Whenever a user logs in with a token, these authentication types issue a \&quot;sub claim\&quot; that contains details uniquely identifying that user. This sub claim includes a key containing the ID value that you configured, and is used to distinguish between different users from within the same organization.
   * @return uniqueIdentifier
  **/
  @ApiModelProperty(required = true, value = "A unique identifier (ID) value should be configured for OAuth2, LDAP and SAML authentication method types and is usually a value such as the email, username, or upn for example. Whenever a user logs in with a token, these authentication types issue a \"sub claim\" that contains details uniquely identifying that user. This sub claim includes a key containing the ID value that you configured, and is used to distinguish between different users from within the same organization.")

  public String getUniqueIdentifier() {
    return uniqueIdentifier;
  }


  public void setUniqueIdentifier(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAuthMethodSAML updateAuthMethodSAML = (UpdateAuthMethodSAML) o;
    return Objects.equals(this.accessExpires, updateAuthMethodSAML.accessExpires) &&
        Objects.equals(this.allowedRedirectUri, updateAuthMethodSAML.allowedRedirectUri) &&
        Objects.equals(this.boundIps, updateAuthMethodSAML.boundIps) &&
        Objects.equals(this.forceSubClaims, updateAuthMethodSAML.forceSubClaims) &&
        Objects.equals(this.idpMetadataUrl, updateAuthMethodSAML.idpMetadataUrl) &&
        Objects.equals(this.idpMetadataXmlData, updateAuthMethodSAML.idpMetadataXmlData) &&
        Objects.equals(this.jwtTtl, updateAuthMethodSAML.jwtTtl) &&
        Objects.equals(this.name, updateAuthMethodSAML.name) &&
        Objects.equals(this.newName, updateAuthMethodSAML.newName) &&
        Objects.equals(this.token, updateAuthMethodSAML.token) &&
        Objects.equals(this.uidToken, updateAuthMethodSAML.uidToken) &&
        Objects.equals(this.uniqueIdentifier, updateAuthMethodSAML.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, allowedRedirectUri, boundIps, forceSubClaims, idpMetadataUrl, idpMetadataXmlData, jwtTtl, name, newName, token, uidToken, uniqueIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAuthMethodSAML {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    allowedRedirectUri: ").append(toIndentedString(allowedRedirectUri)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    idpMetadataUrl: ").append(toIndentedString(idpMetadataUrl)).append("\n");
    sb.append("    idpMetadataXmlData: ").append(toIndentedString(idpMetadataXmlData)).append("\n");
    sb.append("    jwtTtl: ").append(toIndentedString(jwtTtl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    uniqueIdentifier: ").append(toIndentedString(uniqueIdentifier)).append("\n");
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

