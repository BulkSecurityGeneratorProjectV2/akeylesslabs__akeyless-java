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
 * createAuthMethodCert is a command that creates a new auth method that will be able to authenticate using a client certificae
 */
@ApiModel(description = "createAuthMethodCert is a command that creates a new auth method that will be able to authenticate using a client certificae")

public class CreateAuthMethodCert {
  public static final String SERIALIZED_NAME_ACCESS_EXPIRES = "access-expires";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXPIRES)
  private Long accessExpires = 0l;

  public static final String SERIALIZED_NAME_BOUND_COMMON_NAMES = "bound-common-names";
  @SerializedName(SERIALIZED_NAME_BOUND_COMMON_NAMES)
  private List<String> boundCommonNames = null;

  public static final String SERIALIZED_NAME_BOUND_DNS_SANS = "bound-dns-sans";
  @SerializedName(SERIALIZED_NAME_BOUND_DNS_SANS)
  private List<String> boundDnsSans = null;

  public static final String SERIALIZED_NAME_BOUND_EMAIL_SANS = "bound-email-sans";
  @SerializedName(SERIALIZED_NAME_BOUND_EMAIL_SANS)
  private List<String> boundEmailSans = null;

  public static final String SERIALIZED_NAME_BOUND_EXTENSIONS = "bound-extensions";
  @SerializedName(SERIALIZED_NAME_BOUND_EXTENSIONS)
  private List<String> boundExtensions = null;

  public static final String SERIALIZED_NAME_BOUND_IPS = "bound-ips";
  @SerializedName(SERIALIZED_NAME_BOUND_IPS)
  private List<String> boundIps = null;

  public static final String SERIALIZED_NAME_BOUND_ORGANIZATIONAL_UNITS = "bound-organizational-units";
  @SerializedName(SERIALIZED_NAME_BOUND_ORGANIZATIONAL_UNITS)
  private List<String> boundOrganizationalUnits = null;

  public static final String SERIALIZED_NAME_BOUND_URI_SANS = "bound-uri-sans";
  @SerializedName(SERIALIZED_NAME_BOUND_URI_SANS)
  private List<String> boundUriSans = null;

  public static final String SERIALIZED_NAME_CERTIFICATE_DATA = "certificate-data";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_DATA)
  private String certificateData;

  public static final String SERIALIZED_NAME_FORCE_SUB_CLAIMS = "force-sub-claims";
  @SerializedName(SERIALIZED_NAME_FORCE_SUB_CLAIMS)
  private Boolean forceSubClaims;

  public static final String SERIALIZED_NAME_JWT_TTL = "jwt-ttl";
  @SerializedName(SERIALIZED_NAME_JWT_TTL)
  private Long jwtTtl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REVOKED_CERT_IDS = "revoked-cert-ids";
  @SerializedName(SERIALIZED_NAME_REVOKED_CERT_IDS)
  private List<String> revokedCertIds = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique-identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  private String uniqueIdentifier;


  public CreateAuthMethodCert accessExpires(Long accessExpires) {
    
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


  public CreateAuthMethodCert boundCommonNames(List<String> boundCommonNames) {
    
    this.boundCommonNames = boundCommonNames;
    return this;
  }

  public CreateAuthMethodCert addBoundCommonNamesItem(String boundCommonNamesItem) {
    if (this.boundCommonNames == null) {
      this.boundCommonNames = new ArrayList<String>();
    }
    this.boundCommonNames.add(boundCommonNamesItem);
    return this;
  }

   /**
   * A list of names. At least one must exist in the Common Name. Supports globbing.
   * @return boundCommonNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of names. At least one must exist in the Common Name. Supports globbing.")

  public List<String> getBoundCommonNames() {
    return boundCommonNames;
  }


  public void setBoundCommonNames(List<String> boundCommonNames) {
    this.boundCommonNames = boundCommonNames;
  }


  public CreateAuthMethodCert boundDnsSans(List<String> boundDnsSans) {
    
    this.boundDnsSans = boundDnsSans;
    return this;
  }

  public CreateAuthMethodCert addBoundDnsSansItem(String boundDnsSansItem) {
    if (this.boundDnsSans == null) {
      this.boundDnsSans = new ArrayList<String>();
    }
    this.boundDnsSans.add(boundDnsSansItem);
    return this;
  }

   /**
   * A list of DNS names. At least one must exist in the SANs. Supports globbing.
   * @return boundDnsSans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of DNS names. At least one must exist in the SANs. Supports globbing.")

  public List<String> getBoundDnsSans() {
    return boundDnsSans;
  }


  public void setBoundDnsSans(List<String> boundDnsSans) {
    this.boundDnsSans = boundDnsSans;
  }


  public CreateAuthMethodCert boundEmailSans(List<String> boundEmailSans) {
    
    this.boundEmailSans = boundEmailSans;
    return this;
  }

  public CreateAuthMethodCert addBoundEmailSansItem(String boundEmailSansItem) {
    if (this.boundEmailSans == null) {
      this.boundEmailSans = new ArrayList<String>();
    }
    this.boundEmailSans.add(boundEmailSansItem);
    return this;
  }

   /**
   * A list of Email Addresses. At least one must exist in the SANs. Supports globbing.
   * @return boundEmailSans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Email Addresses. At least one must exist in the SANs. Supports globbing.")

  public List<String> getBoundEmailSans() {
    return boundEmailSans;
  }


  public void setBoundEmailSans(List<String> boundEmailSans) {
    this.boundEmailSans = boundEmailSans;
  }


  public CreateAuthMethodCert boundExtensions(List<String> boundExtensions) {
    
    this.boundExtensions = boundExtensions;
    return this;
  }

  public CreateAuthMethodCert addBoundExtensionsItem(String boundExtensionsItem) {
    if (this.boundExtensions == null) {
      this.boundExtensions = new ArrayList<String>();
    }
    this.boundExtensions.add(boundExtensionsItem);
    return this;
  }

   /**
   * A list of extensions formatted as \&quot;oid:value\&quot;. Expects the extension value to be some type of ASN1 encoded string. All values much match. Supports globbing on \&quot;value\&quot;.
   * @return boundExtensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of extensions formatted as \"oid:value\". Expects the extension value to be some type of ASN1 encoded string. All values much match. Supports globbing on \"value\".")

  public List<String> getBoundExtensions() {
    return boundExtensions;
  }


  public void setBoundExtensions(List<String> boundExtensions) {
    this.boundExtensions = boundExtensions;
  }


  public CreateAuthMethodCert boundIps(List<String> boundIps) {
    
    this.boundIps = boundIps;
    return this;
  }

  public CreateAuthMethodCert addBoundIpsItem(String boundIpsItem) {
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


  public CreateAuthMethodCert boundOrganizationalUnits(List<String> boundOrganizationalUnits) {
    
    this.boundOrganizationalUnits = boundOrganizationalUnits;
    return this;
  }

  public CreateAuthMethodCert addBoundOrganizationalUnitsItem(String boundOrganizationalUnitsItem) {
    if (this.boundOrganizationalUnits == null) {
      this.boundOrganizationalUnits = new ArrayList<String>();
    }
    this.boundOrganizationalUnits.add(boundOrganizationalUnitsItem);
    return this;
  }

   /**
   * A list of Organizational Units names. At least one must exist in the OU field.
   * @return boundOrganizationalUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Organizational Units names. At least one must exist in the OU field.")

  public List<String> getBoundOrganizationalUnits() {
    return boundOrganizationalUnits;
  }


  public void setBoundOrganizationalUnits(List<String> boundOrganizationalUnits) {
    this.boundOrganizationalUnits = boundOrganizationalUnits;
  }


  public CreateAuthMethodCert boundUriSans(List<String> boundUriSans) {
    
    this.boundUriSans = boundUriSans;
    return this;
  }

  public CreateAuthMethodCert addBoundUriSansItem(String boundUriSansItem) {
    if (this.boundUriSans == null) {
      this.boundUriSans = new ArrayList<String>();
    }
    this.boundUriSans.add(boundUriSansItem);
    return this;
  }

   /**
   * A list of URIs. At least one must exist in the SANs. Supports globbing.
   * @return boundUriSans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of URIs. At least one must exist in the SANs. Supports globbing.")

  public List<String> getBoundUriSans() {
    return boundUriSans;
  }


  public void setBoundUriSans(List<String> boundUriSans) {
    this.boundUriSans = boundUriSans;
  }


  public CreateAuthMethodCert certificateData(String certificateData) {
    
    this.certificateData = certificateData;
    return this;
  }

   /**
   * The certificate data in base64, if no file was provided
   * @return certificateData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The certificate data in base64, if no file was provided")

  public String getCertificateData() {
    return certificateData;
  }


  public void setCertificateData(String certificateData) {
    this.certificateData = certificateData;
  }


  public CreateAuthMethodCert forceSubClaims(Boolean forceSubClaims) {
    
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


  public CreateAuthMethodCert jwtTtl(Long jwtTtl) {
    
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


  public CreateAuthMethodCert name(String name) {
    
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


  public CreateAuthMethodCert revokedCertIds(List<String> revokedCertIds) {
    
    this.revokedCertIds = revokedCertIds;
    return this;
  }

  public CreateAuthMethodCert addRevokedCertIdsItem(String revokedCertIdsItem) {
    if (this.revokedCertIds == null) {
      this.revokedCertIds = new ArrayList<String>();
    }
    this.revokedCertIds.add(revokedCertIdsItem);
    return this;
  }

   /**
   * A list of revoked cert ids
   * @return revokedCertIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of revoked cert ids")

  public List<String> getRevokedCertIds() {
    return revokedCertIds;
  }


  public void setRevokedCertIds(List<String> revokedCertIds) {
    this.revokedCertIds = revokedCertIds;
  }


  public CreateAuthMethodCert token(String token) {
    
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


  public CreateAuthMethodCert uidToken(String uidToken) {
    
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


  public CreateAuthMethodCert uniqueIdentifier(String uniqueIdentifier) {
    
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

   /**
   * A unique identifier (ID) value should be configured, such as common_name or organizational_unit Whenever a user logs in with a token, these authentication types issue a \&quot;sub claim\&quot; that contains details uniquely identifying that user. This sub claim includes a key containing the ID value that you configured, and is used to distinguish between different users from within the same organization.
   * @return uniqueIdentifier
  **/
  @ApiModelProperty(required = true, value = "A unique identifier (ID) value should be configured, such as common_name or organizational_unit Whenever a user logs in with a token, these authentication types issue a \"sub claim\" that contains details uniquely identifying that user. This sub claim includes a key containing the ID value that you configured, and is used to distinguish between different users from within the same organization.")

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
    CreateAuthMethodCert createAuthMethodCert = (CreateAuthMethodCert) o;
    return Objects.equals(this.accessExpires, createAuthMethodCert.accessExpires) &&
        Objects.equals(this.boundCommonNames, createAuthMethodCert.boundCommonNames) &&
        Objects.equals(this.boundDnsSans, createAuthMethodCert.boundDnsSans) &&
        Objects.equals(this.boundEmailSans, createAuthMethodCert.boundEmailSans) &&
        Objects.equals(this.boundExtensions, createAuthMethodCert.boundExtensions) &&
        Objects.equals(this.boundIps, createAuthMethodCert.boundIps) &&
        Objects.equals(this.boundOrganizationalUnits, createAuthMethodCert.boundOrganizationalUnits) &&
        Objects.equals(this.boundUriSans, createAuthMethodCert.boundUriSans) &&
        Objects.equals(this.certificateData, createAuthMethodCert.certificateData) &&
        Objects.equals(this.forceSubClaims, createAuthMethodCert.forceSubClaims) &&
        Objects.equals(this.jwtTtl, createAuthMethodCert.jwtTtl) &&
        Objects.equals(this.name, createAuthMethodCert.name) &&
        Objects.equals(this.revokedCertIds, createAuthMethodCert.revokedCertIds) &&
        Objects.equals(this.token, createAuthMethodCert.token) &&
        Objects.equals(this.uidToken, createAuthMethodCert.uidToken) &&
        Objects.equals(this.uniqueIdentifier, createAuthMethodCert.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessExpires, boundCommonNames, boundDnsSans, boundEmailSans, boundExtensions, boundIps, boundOrganizationalUnits, boundUriSans, certificateData, forceSubClaims, jwtTtl, name, revokedCertIds, token, uidToken, uniqueIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAuthMethodCert {\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    boundCommonNames: ").append(toIndentedString(boundCommonNames)).append("\n");
    sb.append("    boundDnsSans: ").append(toIndentedString(boundDnsSans)).append("\n");
    sb.append("    boundEmailSans: ").append(toIndentedString(boundEmailSans)).append("\n");
    sb.append("    boundExtensions: ").append(toIndentedString(boundExtensions)).append("\n");
    sb.append("    boundIps: ").append(toIndentedString(boundIps)).append("\n");
    sb.append("    boundOrganizationalUnits: ").append(toIndentedString(boundOrganizationalUnits)).append("\n");
    sb.append("    boundUriSans: ").append(toIndentedString(boundUriSans)).append("\n");
    sb.append("    certificateData: ").append(toIndentedString(certificateData)).append("\n");
    sb.append("    forceSubClaims: ").append(toIndentedString(forceSubClaims)).append("\n");
    sb.append("    jwtTtl: ").append(toIndentedString(jwtTtl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    revokedCertIds: ").append(toIndentedString(revokedCertIds)).append("\n");
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

