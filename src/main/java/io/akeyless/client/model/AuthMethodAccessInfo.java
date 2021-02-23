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
import io.akeyless.client.model.APIKeyAccessRules;
import io.akeyless.client.model.AWSIAMAccessRules;
import io.akeyless.client.model.AzureADAccessRules;
import io.akeyless.client.model.EmailPassAccessRules;
import io.akeyless.client.model.HuaweiAccessRules;
import io.akeyless.client.model.LDAPAccessRules;
import io.akeyless.client.model.OAuth2AccessRules;
import io.akeyless.client.model.SAMLAccessRules;
import io.akeyless.client.model.UniversalIdentityAccessRules;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AuthMethodAccessInfo
 */

public class AuthMethodAccessInfo {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access_expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  private Long accessExpires;

  public static final String SERIALIZED_NAME_ACCESS_ID_ALIAS = "access_id_alias";
  @SerializedName(SERIALIZED_NAME_ACCESS_ID_ALIAS)
  private String accessIdAlias;

  public static final String SERIALIZED_NAME_API_KEY_ACCESS_RULES = "api_key_access_rules";
  @SerializedName(SERIALIZED_NAME_API_KEY_ACCESS_RULES)
  private APIKeyAccessRules apiKeyAccessRules;

  public static final String SERIALIZED_NAME_AWS_IAM_ACCESS_RULES = "aws_iam_access_rules";
  @SerializedName(SERIALIZED_NAME_AWS_IAM_ACCESS_RULES)
  private AWSIAMAccessRules awsIamAccessRules;

  public static final String SERIALIZED_NAME_AZURE_AD_ACCESS_RULES = "azure_ad_access_rules";
  @SerializedName(SERIALIZED_NAME_AZURE_AD_ACCESS_RULES)
  private AzureADAccessRules azureAdAccessRules;

  public static final String SERIALIZED_NAME_CIDR_WHITELIST = "cidr_whitelist";
  @SerializedName(SERIALIZED_NAME_CIDR_WHITELIST)
  private String cidrWhitelist;

  public static final String SERIALIZED_NAME_EMAIL_PASS_ACCESS_RULES = "email_pass_access_rules";
  @SerializedName(SERIALIZED_NAME_EMAIL_PASS_ACCESS_RULES)
  private EmailPassAccessRules emailPassAccessRules;

  public static final String SERIALIZED_NAME_HUAWEI_ACCESS_RULES = "huawei_access_rules";
  @SerializedName(SERIALIZED_NAME_HUAWEI_ACCESS_RULES)
  private HuaweiAccessRules huaweiAccessRules;

  public static final String SERIALIZED_NAME_LDAP_ACCESS_RULES = "ldap_access_rules";
  @SerializedName(SERIALIZED_NAME_LDAP_ACCESS_RULES)
  private LDAPAccessRules ldapAccessRules;

  public static final String SERIALIZED_NAME_OAUTH2_ACCESS_RULES = "oauth2_access_rules";
  @SerializedName(SERIALIZED_NAME_OAUTH2_ACCESS_RULES)
  private OAuth2AccessRules oauth2AccessRules;

  public static final String SERIALIZED_NAME_RULES_TYPE = "rules_type";
  @SerializedName(SERIALIZED_NAME_RULES_TYPE)
  private String rulesType;

  public static final String SERIALIZED_NAME_SAML_ACCESS_RULES = "saml_access_rules";
  @SerializedName(SERIALIZED_NAME_SAML_ACCESS_RULES)
  private SAMLAccessRules samlAccessRules;

  public static final String SERIALIZED_NAME_UNIVERSAL_IDENTITY_ACCESS_RULES = "universal_identity_access_rules";
  @SerializedName(SERIALIZED_NAME_UNIVERSAL_IDENTITY_ACCESS_RULES)
  private UniversalIdentityAccessRules universalIdentityAccessRules;


  public AuthMethodAccessInfo accessExpires(Long accessExpires) {
    
    this.accessExpires = accessExpires;
    return this;
  }

   /**
   * Get accessExpires
   * @return accessExpires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAccessExpires() {
    return accessExpires;
  }


  public void setAccessExpires(Long accessExpires) {
    this.accessExpires = accessExpires;
  }


  public AuthMethodAccessInfo accessIdAlias(String accessIdAlias) {
    
    this.accessIdAlias = accessIdAlias;
    return this;
  }

   /**
   * for accounts where AccessId holds encrypted email this field will hold generated AccessId, for accounts based on regular AccessId it will be equal to accessId itself
   * @return accessIdAlias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "for accounts where AccessId holds encrypted email this field will hold generated AccessId, for accounts based on regular AccessId it will be equal to accessId itself")

  public String getAccessIdAlias() {
    return accessIdAlias;
  }


  public void setAccessIdAlias(String accessIdAlias) {
    this.accessIdAlias = accessIdAlias;
  }


  public AuthMethodAccessInfo apiKeyAccessRules(APIKeyAccessRules apiKeyAccessRules) {
    
    this.apiKeyAccessRules = apiKeyAccessRules;
    return this;
  }

   /**
   * Get apiKeyAccessRules
   * @return apiKeyAccessRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public APIKeyAccessRules getApiKeyAccessRules() {
    return apiKeyAccessRules;
  }


  public void setApiKeyAccessRules(APIKeyAccessRules apiKeyAccessRules) {
    this.apiKeyAccessRules = apiKeyAccessRules;
  }


  public AuthMethodAccessInfo awsIamAccessRules(AWSIAMAccessRules awsIamAccessRules) {
    
    this.awsIamAccessRules = awsIamAccessRules;
    return this;
  }

   /**
   * Get awsIamAccessRules
   * @return awsIamAccessRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AWSIAMAccessRules getAwsIamAccessRules() {
    return awsIamAccessRules;
  }


  public void setAwsIamAccessRules(AWSIAMAccessRules awsIamAccessRules) {
    this.awsIamAccessRules = awsIamAccessRules;
  }


  public AuthMethodAccessInfo azureAdAccessRules(AzureADAccessRules azureAdAccessRules) {
    
    this.azureAdAccessRules = azureAdAccessRules;
    return this;
  }

   /**
   * Get azureAdAccessRules
   * @return azureAdAccessRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AzureADAccessRules getAzureAdAccessRules() {
    return azureAdAccessRules;
  }


  public void setAzureAdAccessRules(AzureADAccessRules azureAdAccessRules) {
    this.azureAdAccessRules = azureAdAccessRules;
  }


  public AuthMethodAccessInfo cidrWhitelist(String cidrWhitelist) {
    
    this.cidrWhitelist = cidrWhitelist;
    return this;
  }

   /**
   * Get cidrWhitelist
   * @return cidrWhitelist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCidrWhitelist() {
    return cidrWhitelist;
  }


  public void setCidrWhitelist(String cidrWhitelist) {
    this.cidrWhitelist = cidrWhitelist;
  }


  public AuthMethodAccessInfo emailPassAccessRules(EmailPassAccessRules emailPassAccessRules) {
    
    this.emailPassAccessRules = emailPassAccessRules;
    return this;
  }

   /**
   * Get emailPassAccessRules
   * @return emailPassAccessRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmailPassAccessRules getEmailPassAccessRules() {
    return emailPassAccessRules;
  }


  public void setEmailPassAccessRules(EmailPassAccessRules emailPassAccessRules) {
    this.emailPassAccessRules = emailPassAccessRules;
  }


  public AuthMethodAccessInfo huaweiAccessRules(HuaweiAccessRules huaweiAccessRules) {
    
    this.huaweiAccessRules = huaweiAccessRules;
    return this;
  }

   /**
   * Get huaweiAccessRules
   * @return huaweiAccessRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HuaweiAccessRules getHuaweiAccessRules() {
    return huaweiAccessRules;
  }


  public void setHuaweiAccessRules(HuaweiAccessRules huaweiAccessRules) {
    this.huaweiAccessRules = huaweiAccessRules;
  }


  public AuthMethodAccessInfo ldapAccessRules(LDAPAccessRules ldapAccessRules) {
    
    this.ldapAccessRules = ldapAccessRules;
    return this;
  }

   /**
   * Get ldapAccessRules
   * @return ldapAccessRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LDAPAccessRules getLdapAccessRules() {
    return ldapAccessRules;
  }


  public void setLdapAccessRules(LDAPAccessRules ldapAccessRules) {
    this.ldapAccessRules = ldapAccessRules;
  }


  public AuthMethodAccessInfo oauth2AccessRules(OAuth2AccessRules oauth2AccessRules) {
    
    this.oauth2AccessRules = oauth2AccessRules;
    return this;
  }

   /**
   * Get oauth2AccessRules
   * @return oauth2AccessRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OAuth2AccessRules getOauth2AccessRules() {
    return oauth2AccessRules;
  }


  public void setOauth2AccessRules(OAuth2AccessRules oauth2AccessRules) {
    this.oauth2AccessRules = oauth2AccessRules;
  }


  public AuthMethodAccessInfo rulesType(String rulesType) {
    
    this.rulesType = rulesType;
    return this;
  }

   /**
   * Get rulesType
   * @return rulesType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRulesType() {
    return rulesType;
  }


  public void setRulesType(String rulesType) {
    this.rulesType = rulesType;
  }


  public AuthMethodAccessInfo samlAccessRules(SAMLAccessRules samlAccessRules) {
    
    this.samlAccessRules = samlAccessRules;
    return this;
  }

   /**
   * Get samlAccessRules
   * @return samlAccessRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SAMLAccessRules getSamlAccessRules() {
    return samlAccessRules;
  }


  public void setSamlAccessRules(SAMLAccessRules samlAccessRules) {
    this.samlAccessRules = samlAccessRules;
  }


  public AuthMethodAccessInfo universalIdentityAccessRules(UniversalIdentityAccessRules universalIdentityAccessRules) {
    
    this.universalIdentityAccessRules = universalIdentityAccessRules;
    return this;
  }

   /**
   * Get universalIdentityAccessRules
   * @return universalIdentityAccessRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UniversalIdentityAccessRules getUniversalIdentityAccessRules() {
    return universalIdentityAccessRules;
  }


  public void setUniversalIdentityAccessRules(UniversalIdentityAccessRules universalIdentityAccessRules) {
    this.universalIdentityAccessRules = universalIdentityAccessRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthMethodAccessInfo authMethodAccessInfo = (AuthMethodAccessInfo) o;
    return Objects.equals(this.accessExpires, authMethodAccessInfo.accessExpires) &&
        Objects.equals(this.accessIdAlias, authMethodAccessInfo.accessIdAlias) &&
        Objects.equals(this.apiKeyAccessRules, authMethodAccessInfo.apiKeyAccessRules) &&
        Objects.equals(this.awsIamAccessRules, authMethodAccessInfo.awsIamAccessRules) &&
        Objects.equals(this.azureAdAccessRules, authMethodAccessInfo.azureAdAccessRules) &&
        Objects.equals(this.cidrWhitelist, authMethodAccessInfo.cidrWhitelist) &&
        Objects.equals(this.emailPassAccessRules, authMethodAccessInfo.emailPassAccessRules) &&
        Objects.equals(this.huaweiAccessRules, authMethodAccessInfo.huaweiAccessRules) &&
        Objects.equals(this.ldapAccessRules, authMethodAccessInfo.ldapAccessRules) &&
        Objects.equals(this.oauth2AccessRules, authMethodAccessInfo.oauth2AccessRules) &&
        Objects.equals(this.rulesType, authMethodAccessInfo.rulesType) &&
        Objects.equals(this.samlAccessRules, authMethodAccessInfo.samlAccessRules) &&
        Objects.equals(this.universalIdentityAccessRules, authMethodAccessInfo.universalIdentityAccessRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, accessIdAlias, apiKeyAccessRules, awsIamAccessRules, azureAdAccessRules, cidrWhitelist, emailPassAccessRules, huaweiAccessRules, ldapAccessRules, oauth2AccessRules, rulesType, samlAccessRules, universalIdentityAccessRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthMethodAccessInfo {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    accessIdAlias: ").append(toIndentedString(accessIdAlias)).append("\n");
    sb.append("    apiKeyAccessRules: ").append(toIndentedString(apiKeyAccessRules)).append("\n");
    sb.append("    awsIamAccessRules: ").append(toIndentedString(awsIamAccessRules)).append("\n");
    sb.append("    azureAdAccessRules: ").append(toIndentedString(azureAdAccessRules)).append("\n");
    sb.append("    cidrWhitelist: ").append(toIndentedString(cidrWhitelist)).append("\n");
    sb.append("    emailPassAccessRules: ").append(toIndentedString(emailPassAccessRules)).append("\n");
    sb.append("    huaweiAccessRules: ").append(toIndentedString(huaweiAccessRules)).append("\n");
    sb.append("    ldapAccessRules: ").append(toIndentedString(ldapAccessRules)).append("\n");
    sb.append("    oauth2AccessRules: ").append(toIndentedString(oauth2AccessRules)).append("\n");
    sb.append("    rulesType: ").append(toIndentedString(rulesType)).append("\n");
    sb.append("    samlAccessRules: ").append(toIndentedString(samlAccessRules)).append("\n");
    sb.append("    universalIdentityAccessRules: ").append(toIndentedString(universalIdentityAccessRules)).append("\n");
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

