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
 * LdapConfigPart
 */

public class LdapConfigPart {
  public static final String SERIALIZED_NAME_LDAP_ACCESS_ID = "ldap_access_id";
  @SerializedName(SERIALIZED_NAME_LDAP_ACCESS_ID)
  private String ldapAccessId;

  public static final String SERIALIZED_NAME_LDAP_ANONYMOUS_SEARCH = "ldap_anonymous_search";
  @SerializedName(SERIALIZED_NAME_LDAP_ANONYMOUS_SEARCH)
  private Boolean ldapAnonymousSearch;

  public static final String SERIALIZED_NAME_LDAP_BIND_DN = "ldap_bind_dn";
  @SerializedName(SERIALIZED_NAME_LDAP_BIND_DN)
  private String ldapBindDn;

  public static final String SERIALIZED_NAME_LDAP_BIND_PASSWORD = "ldap_bind_password";
  @SerializedName(SERIALIZED_NAME_LDAP_BIND_PASSWORD)
  private String ldapBindPassword;

  public static final String SERIALIZED_NAME_LDAP_CERT = "ldap_cert";
  @SerializedName(SERIALIZED_NAME_LDAP_CERT)
  private String ldapCert;

  public static final String SERIALIZED_NAME_LDAP_ENABLE = "ldap_enable";
  @SerializedName(SERIALIZED_NAME_LDAP_ENABLE)
  private Boolean ldapEnable;

  public static final String SERIALIZED_NAME_LDAP_GROUP_ATTR = "ldap_group_attr";
  @SerializedName(SERIALIZED_NAME_LDAP_GROUP_ATTR)
  private String ldapGroupAttr;

  public static final String SERIALIZED_NAME_LDAP_GROUP_DN = "ldap_group_dn";
  @SerializedName(SERIALIZED_NAME_LDAP_GROUP_DN)
  private String ldapGroupDn;

  public static final String SERIALIZED_NAME_LDAP_GROUP_FILTER = "ldap_group_filter";
  @SerializedName(SERIALIZED_NAME_LDAP_GROUP_FILTER)
  private String ldapGroupFilter;

  public static final String SERIALIZED_NAME_LDAP_PRIVATE_KEY = "ldap_private_key";
  @SerializedName(SERIALIZED_NAME_LDAP_PRIVATE_KEY)
  private String ldapPrivateKey;

  public static final String SERIALIZED_NAME_LDAP_TOKEN_EXPIRATION = "ldap_token_expiration";
  @SerializedName(SERIALIZED_NAME_LDAP_TOKEN_EXPIRATION)
  private String ldapTokenExpiration;

  public static final String SERIALIZED_NAME_LDAP_URL = "ldap_url";
  @SerializedName(SERIALIZED_NAME_LDAP_URL)
  private String ldapUrl;

  public static final String SERIALIZED_NAME_LDAP_USER_ATTR = "ldap_user_attr";
  @SerializedName(SERIALIZED_NAME_LDAP_USER_ATTR)
  private String ldapUserAttr;

  public static final String SERIALIZED_NAME_LDAP_USER_DN = "ldap_user_dn";
  @SerializedName(SERIALIZED_NAME_LDAP_USER_DN)
  private String ldapUserDn;


  public LdapConfigPart ldapAccessId(String ldapAccessId) {
    
    this.ldapAccessId = ldapAccessId;
    return this;
  }

   /**
   * Get ldapAccessId
   * @return ldapAccessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapAccessId() {
    return ldapAccessId;
  }


  public void setLdapAccessId(String ldapAccessId) {
    this.ldapAccessId = ldapAccessId;
  }


  public LdapConfigPart ldapAnonymousSearch(Boolean ldapAnonymousSearch) {
    
    this.ldapAnonymousSearch = ldapAnonymousSearch;
    return this;
  }

   /**
   * Get ldapAnonymousSearch
   * @return ldapAnonymousSearch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLdapAnonymousSearch() {
    return ldapAnonymousSearch;
  }


  public void setLdapAnonymousSearch(Boolean ldapAnonymousSearch) {
    this.ldapAnonymousSearch = ldapAnonymousSearch;
  }


  public LdapConfigPart ldapBindDn(String ldapBindDn) {
    
    this.ldapBindDn = ldapBindDn;
    return this;
  }

   /**
   * Get ldapBindDn
   * @return ldapBindDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapBindDn() {
    return ldapBindDn;
  }


  public void setLdapBindDn(String ldapBindDn) {
    this.ldapBindDn = ldapBindDn;
  }


  public LdapConfigPart ldapBindPassword(String ldapBindPassword) {
    
    this.ldapBindPassword = ldapBindPassword;
    return this;
  }

   /**
   * Get ldapBindPassword
   * @return ldapBindPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapBindPassword() {
    return ldapBindPassword;
  }


  public void setLdapBindPassword(String ldapBindPassword) {
    this.ldapBindPassword = ldapBindPassword;
  }


  public LdapConfigPart ldapCert(String ldapCert) {
    
    this.ldapCert = ldapCert;
    return this;
  }

   /**
   * Get ldapCert
   * @return ldapCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapCert() {
    return ldapCert;
  }


  public void setLdapCert(String ldapCert) {
    this.ldapCert = ldapCert;
  }


  public LdapConfigPart ldapEnable(Boolean ldapEnable) {
    
    this.ldapEnable = ldapEnable;
    return this;
  }

   /**
   * Get ldapEnable
   * @return ldapEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLdapEnable() {
    return ldapEnable;
  }


  public void setLdapEnable(Boolean ldapEnable) {
    this.ldapEnable = ldapEnable;
  }


  public LdapConfigPart ldapGroupAttr(String ldapGroupAttr) {
    
    this.ldapGroupAttr = ldapGroupAttr;
    return this;
  }

   /**
   * Get ldapGroupAttr
   * @return ldapGroupAttr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapGroupAttr() {
    return ldapGroupAttr;
  }


  public void setLdapGroupAttr(String ldapGroupAttr) {
    this.ldapGroupAttr = ldapGroupAttr;
  }


  public LdapConfigPart ldapGroupDn(String ldapGroupDn) {
    
    this.ldapGroupDn = ldapGroupDn;
    return this;
  }

   /**
   * Get ldapGroupDn
   * @return ldapGroupDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapGroupDn() {
    return ldapGroupDn;
  }


  public void setLdapGroupDn(String ldapGroupDn) {
    this.ldapGroupDn = ldapGroupDn;
  }


  public LdapConfigPart ldapGroupFilter(String ldapGroupFilter) {
    
    this.ldapGroupFilter = ldapGroupFilter;
    return this;
  }

   /**
   * Get ldapGroupFilter
   * @return ldapGroupFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapGroupFilter() {
    return ldapGroupFilter;
  }


  public void setLdapGroupFilter(String ldapGroupFilter) {
    this.ldapGroupFilter = ldapGroupFilter;
  }


  public LdapConfigPart ldapPrivateKey(String ldapPrivateKey) {
    
    this.ldapPrivateKey = ldapPrivateKey;
    return this;
  }

   /**
   * Get ldapPrivateKey
   * @return ldapPrivateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapPrivateKey() {
    return ldapPrivateKey;
  }


  public void setLdapPrivateKey(String ldapPrivateKey) {
    this.ldapPrivateKey = ldapPrivateKey;
  }


  public LdapConfigPart ldapTokenExpiration(String ldapTokenExpiration) {
    
    this.ldapTokenExpiration = ldapTokenExpiration;
    return this;
  }

   /**
   * Get ldapTokenExpiration
   * @return ldapTokenExpiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapTokenExpiration() {
    return ldapTokenExpiration;
  }


  public void setLdapTokenExpiration(String ldapTokenExpiration) {
    this.ldapTokenExpiration = ldapTokenExpiration;
  }


  public LdapConfigPart ldapUrl(String ldapUrl) {
    
    this.ldapUrl = ldapUrl;
    return this;
  }

   /**
   * Get ldapUrl
   * @return ldapUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapUrl() {
    return ldapUrl;
  }


  public void setLdapUrl(String ldapUrl) {
    this.ldapUrl = ldapUrl;
  }


  public LdapConfigPart ldapUserAttr(String ldapUserAttr) {
    
    this.ldapUserAttr = ldapUserAttr;
    return this;
  }

   /**
   * Get ldapUserAttr
   * @return ldapUserAttr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapUserAttr() {
    return ldapUserAttr;
  }


  public void setLdapUserAttr(String ldapUserAttr) {
    this.ldapUserAttr = ldapUserAttr;
  }


  public LdapConfigPart ldapUserDn(String ldapUserDn) {
    
    this.ldapUserDn = ldapUserDn;
    return this;
  }

   /**
   * Get ldapUserDn
   * @return ldapUserDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapUserDn() {
    return ldapUserDn;
  }


  public void setLdapUserDn(String ldapUserDn) {
    this.ldapUserDn = ldapUserDn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LdapConfigPart ldapConfigPart = (LdapConfigPart) o;
    return Objects.equals(this.ldapAccessId, ldapConfigPart.ldapAccessId) &&
        Objects.equals(this.ldapAnonymousSearch, ldapConfigPart.ldapAnonymousSearch) &&
        Objects.equals(this.ldapBindDn, ldapConfigPart.ldapBindDn) &&
        Objects.equals(this.ldapBindPassword, ldapConfigPart.ldapBindPassword) &&
        Objects.equals(this.ldapCert, ldapConfigPart.ldapCert) &&
        Objects.equals(this.ldapEnable, ldapConfigPart.ldapEnable) &&
        Objects.equals(this.ldapGroupAttr, ldapConfigPart.ldapGroupAttr) &&
        Objects.equals(this.ldapGroupDn, ldapConfigPart.ldapGroupDn) &&
        Objects.equals(this.ldapGroupFilter, ldapConfigPart.ldapGroupFilter) &&
        Objects.equals(this.ldapPrivateKey, ldapConfigPart.ldapPrivateKey) &&
        Objects.equals(this.ldapTokenExpiration, ldapConfigPart.ldapTokenExpiration) &&
        Objects.equals(this.ldapUrl, ldapConfigPart.ldapUrl) &&
        Objects.equals(this.ldapUserAttr, ldapConfigPart.ldapUserAttr) &&
        Objects.equals(this.ldapUserDn, ldapConfigPart.ldapUserDn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ldapAccessId, ldapAnonymousSearch, ldapBindDn, ldapBindPassword, ldapCert, ldapEnable, ldapGroupAttr, ldapGroupDn, ldapGroupFilter, ldapPrivateKey, ldapTokenExpiration, ldapUrl, ldapUserAttr, ldapUserDn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapConfigPart {\n");
    sb.append("    ldapAccessId: ").append(toIndentedString(ldapAccessId)).append("\n");
    sb.append("    ldapAnonymousSearch: ").append(toIndentedString(ldapAnonymousSearch)).append("\n");
    sb.append("    ldapBindDn: ").append(toIndentedString(ldapBindDn)).append("\n");
    sb.append("    ldapBindPassword: ").append(toIndentedString(ldapBindPassword)).append("\n");
    sb.append("    ldapCert: ").append(toIndentedString(ldapCert)).append("\n");
    sb.append("    ldapEnable: ").append(toIndentedString(ldapEnable)).append("\n");
    sb.append("    ldapGroupAttr: ").append(toIndentedString(ldapGroupAttr)).append("\n");
    sb.append("    ldapGroupDn: ").append(toIndentedString(ldapGroupDn)).append("\n");
    sb.append("    ldapGroupFilter: ").append(toIndentedString(ldapGroupFilter)).append("\n");
    sb.append("    ldapPrivateKey: ").append(toIndentedString(ldapPrivateKey)).append("\n");
    sb.append("    ldapTokenExpiration: ").append(toIndentedString(ldapTokenExpiration)).append("\n");
    sb.append("    ldapUrl: ").append(toIndentedString(ldapUrl)).append("\n");
    sb.append("    ldapUserAttr: ").append(toIndentedString(ldapUserAttr)).append("\n");
    sb.append("    ldapUserDn: ").append(toIndentedString(ldapUserDn)).append("\n");
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

