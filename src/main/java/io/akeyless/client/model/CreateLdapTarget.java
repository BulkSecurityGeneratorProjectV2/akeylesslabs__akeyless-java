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
 * CreateLdapTarget
 */

public class CreateLdapTarget {
  public static final String SERIALIZED_NAME_ACCESS_ID = "access-id";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID)
  private String accessId;

  public static final String SERIALIZED_NAME_BIND_DN = "bind-dn";
  @SerializedName(SERIALIZED_NAME_BIND_DN)
  private String bindDn;

  public static final String SERIALIZED_NAME_BIND_DN_PASSWORD = "bind-dn-password";
  @SerializedName(SERIALIZED_NAME_BIND_DN_PASSWORD)
  private String bindDnPassword;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_ENABLE_ANONYM_SEARCH = "enable-anonym-search";
  @SerializedName(SERIALIZED_NAME_ENABLE_ANONYM_SEARCH)
  private Boolean enableAnonymSearch;

  public static final String SERIALIZED_NAME_GROUP_ATTRIBUTE = "group-attribute";
  @SerializedName(SERIALIZED_NAME_GROUP_ATTRIBUTE)
  private String groupAttribute;

  public static final String SERIALIZED_NAME_GROUP_DN = "group-dn";
  @SerializedName(SERIALIZED_NAME_GROUP_DN)
  private String groupDn;

  public static final String SERIALIZED_NAME_GROUP_FILTER = "group-filter";
  @SerializedName(SERIALIZED_NAME_GROUP_FILTER)
  private String groupFilter;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_LDAP_CA_CERT = "ldap-ca-cert";
  @SerializedName(SERIALIZED_NAME_LDAP_CA_CERT)
  private String ldapCaCert;

  public static final String SERIALIZED_NAME_LDAP_URL = "ldap-url";
  @SerializedName(SERIALIZED_NAME_LDAP_URL)
  private String ldapUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PRIVATE_KEY = "private-key";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  private String privateKey;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TOKEN_EXPIRATION = "token-expiration";
  @SerializedName(SERIALIZED_NAME_TOKEN_EXPIRATION)
  private String tokenExpiration;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_USER_ATTRIBUTE = "user-attribute";
  @SerializedName(SERIALIZED_NAME_USER_ATTRIBUTE)
  private String userAttribute;

  public static final String SERIALIZED_NAME_USER_DN = "user-dn";
  @SerializedName(SERIALIZED_NAME_USER_DN)
  private String userDn;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public CreateLdapTarget accessId(String accessId) {
    
    this.accessId = accessId;
    return this;
  }

   /**
   * Access ID
   * @return accessId
  **/
  @ApiModelProperty(required = true, value = "Access ID")

  public String getAccessId() {
    return accessId;
  }


  public void setAccessId(String accessId) {
    this.accessId = accessId;
  }


  public CreateLdapTarget bindDn(String bindDn) {
    
    this.bindDn = bindDn;
    return this;
  }

   /**
   * Bind DN
   * @return bindDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bind DN")

  public String getBindDn() {
    return bindDn;
  }


  public void setBindDn(String bindDn) {
    this.bindDn = bindDn;
  }


  public CreateLdapTarget bindDnPassword(String bindDnPassword) {
    
    this.bindDnPassword = bindDnPassword;
    return this;
  }

   /**
   * Bind DN Password
   * @return bindDnPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bind DN Password")

  public String getBindDnPassword() {
    return bindDnPassword;
  }


  public void setBindDnPassword(String bindDnPassword) {
    this.bindDnPassword = bindDnPassword;
  }


  public CreateLdapTarget comment(String comment) {
    
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


  public CreateLdapTarget enableAnonymSearch(Boolean enableAnonymSearch) {
    
    this.enableAnonymSearch = enableAnonymSearch;
    return this;
  }

   /**
   * EnableAnonymousSearch
   * @return enableAnonymSearch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EnableAnonymousSearch")

  public Boolean getEnableAnonymSearch() {
    return enableAnonymSearch;
  }


  public void setEnableAnonymSearch(Boolean enableAnonymSearch) {
    this.enableAnonymSearch = enableAnonymSearch;
  }


  public CreateLdapTarget groupAttribute(String groupAttribute) {
    
    this.groupAttribute = groupAttribute;
    return this;
  }

   /**
   * Group attribute
   * @return groupAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group attribute")

  public String getGroupAttribute() {
    return groupAttribute;
  }


  public void setGroupAttribute(String groupAttribute) {
    this.groupAttribute = groupAttribute;
  }


  public CreateLdapTarget groupDn(String groupDn) {
    
    this.groupDn = groupDn;
    return this;
  }

   /**
   * Group DN
   * @return groupDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group DN")

  public String getGroupDn() {
    return groupDn;
  }


  public void setGroupDn(String groupDn) {
    this.groupDn = groupDn;
  }


  public CreateLdapTarget groupFilter(String groupFilter) {
    
    this.groupFilter = groupFilter;
    return this;
  }

   /**
   * Group attribute
   * @return groupFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group attribute")

  public String getGroupFilter() {
    return groupFilter;
  }


  public void setGroupFilter(String groupFilter) {
    this.groupFilter = groupFilter;
  }


  public CreateLdapTarget key(String key) {
    
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


  public CreateLdapTarget ldapCaCert(String ldapCaCert) {
    
    this.ldapCaCert = ldapCaCert;
    return this;
  }

   /**
   * CA Certificate File Content
   * @return ldapCaCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CA Certificate File Content")

  public String getLdapCaCert() {
    return ldapCaCert;
  }


  public void setLdapCaCert(String ldapCaCert) {
    this.ldapCaCert = ldapCaCert;
  }


  public CreateLdapTarget ldapUrl(String ldapUrl) {
    
    this.ldapUrl = ldapUrl;
    return this;
  }

   /**
   * LDAP Server URL
   * @return ldapUrl
  **/
  @ApiModelProperty(required = true, value = "LDAP Server URL")

  public String getLdapUrl() {
    return ldapUrl;
  }


  public void setLdapUrl(String ldapUrl) {
    this.ldapUrl = ldapUrl;
  }


  public CreateLdapTarget name(String name) {
    
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


  public CreateLdapTarget password(String password) {
    
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


  public CreateLdapTarget privateKey(String privateKey) {
    
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Base64-encoded ldap private key text
   * @return privateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64-encoded ldap private key text")

  public String getPrivateKey() {
    return privateKey;
  }


  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


  public CreateLdapTarget token(String token) {
    
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


  public CreateLdapTarget tokenExpiration(String tokenExpiration) {
    
    this.tokenExpiration = tokenExpiration;
    return this;
  }

   /**
   * Token expiration
   * @return tokenExpiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token expiration")

  public String getTokenExpiration() {
    return tokenExpiration;
  }


  public void setTokenExpiration(String tokenExpiration) {
    this.tokenExpiration = tokenExpiration;
  }


  public CreateLdapTarget uidToken(String uidToken) {
    
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


  public CreateLdapTarget userAttribute(String userAttribute) {
    
    this.userAttribute = userAttribute;
    return this;
  }

   /**
   * User Attribute
   * @return userAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User Attribute")

  public String getUserAttribute() {
    return userAttribute;
  }


  public void setUserAttribute(String userAttribute) {
    this.userAttribute = userAttribute;
  }


  public CreateLdapTarget userDn(String userDn) {
    
    this.userDn = userDn;
    return this;
  }

   /**
   * User DN
   * @return userDn
  **/
  @ApiModelProperty(required = true, value = "User DN")

  public String getUserDn() {
    return userDn;
  }


  public void setUserDn(String userDn) {
    this.userDn = userDn;
  }


  public CreateLdapTarget username(String username) {
    
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
    CreateLdapTarget createLdapTarget = (CreateLdapTarget) o;
    return Objects.equals(this.accessId, createLdapTarget.accessId) &&
        Objects.equals(this.bindDn, createLdapTarget.bindDn) &&
        Objects.equals(this.bindDnPassword, createLdapTarget.bindDnPassword) &&
        Objects.equals(this.comment, createLdapTarget.comment) &&
        Objects.equals(this.enableAnonymSearch, createLdapTarget.enableAnonymSearch) &&
        Objects.equals(this.groupAttribute, createLdapTarget.groupAttribute) &&
        Objects.equals(this.groupDn, createLdapTarget.groupDn) &&
        Objects.equals(this.groupFilter, createLdapTarget.groupFilter) &&
        Objects.equals(this.key, createLdapTarget.key) &&
        Objects.equals(this.ldapCaCert, createLdapTarget.ldapCaCert) &&
        Objects.equals(this.ldapUrl, createLdapTarget.ldapUrl) &&
        Objects.equals(this.name, createLdapTarget.name) &&
        Objects.equals(this.password, createLdapTarget.password) &&
        Objects.equals(this.privateKey, createLdapTarget.privateKey) &&
        Objects.equals(this.token, createLdapTarget.token) &&
        Objects.equals(this.tokenExpiration, createLdapTarget.tokenExpiration) &&
        Objects.equals(this.uidToken, createLdapTarget.uidToken) &&
        Objects.equals(this.userAttribute, createLdapTarget.userAttribute) &&
        Objects.equals(this.userDn, createLdapTarget.userDn) &&
        Objects.equals(this.username, createLdapTarget.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId, bindDn, bindDnPassword, comment, enableAnonymSearch, groupAttribute, groupDn, groupFilter, key, ldapCaCert, ldapUrl, name, password, privateKey, token, tokenExpiration, uidToken, userAttribute, userDn, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLdapTarget {\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    bindDn: ").append(toIndentedString(bindDn)).append("\n");
    sb.append("    bindDnPassword: ").append(toIndentedString(bindDnPassword)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    enableAnonymSearch: ").append(toIndentedString(enableAnonymSearch)).append("\n");
    sb.append("    groupAttribute: ").append(toIndentedString(groupAttribute)).append("\n");
    sb.append("    groupDn: ").append(toIndentedString(groupDn)).append("\n");
    sb.append("    groupFilter: ").append(toIndentedString(groupFilter)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    ldapCaCert: ").append(toIndentedString(ldapCaCert)).append("\n");
    sb.append("    ldapUrl: ").append(toIndentedString(ldapUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenExpiration: ").append(toIndentedString(tokenExpiration)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    userAttribute: ").append(toIndentedString(userAttribute)).append("\n");
    sb.append("    userDn: ").append(toIndentedString(userDn)).append("\n");
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

