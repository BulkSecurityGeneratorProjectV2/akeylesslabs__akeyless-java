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
import io.akeyless.client.model.SAMLAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SAMLAccessRules
 */

public class SAMLAccessRules {
  public static final String SERIALIZED_NAME_BOUND_ATTRIBUTES = "bound_attributes";
  @SerializedName(SERIALIZED_NAME_BOUND_ATTRIBUTES)
  private List<SAMLAttribute> boundAttributes = null;

  public static final String SERIALIZED_NAME_IDP_METADATA_URL = "idp_metadata_url";
  @SerializedName(SERIALIZED_NAME_IDP_METADATA_URL)
  private String idpMetadataUrl;

  public static final String SERIALIZED_NAME_IDP_METADATA_XML = "idp_metadata_xml";
  @SerializedName(SERIALIZED_NAME_IDP_METADATA_XML)
  private String idpMetadataXml;

  public static final String SERIALIZED_NAME_UNIQUE_IDENTIFIER = "unique_identifier";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDENTIFIER)
  private String uniqueIdentifier;


  public SAMLAccessRules boundAttributes(List<SAMLAttribute> boundAttributes) {
    
    this.boundAttributes = boundAttributes;
    return this;
  }

  public SAMLAccessRules addBoundAttributesItem(SAMLAttribute boundAttributesItem) {
    if (this.boundAttributes == null) {
      this.boundAttributes = new ArrayList<SAMLAttribute>();
    }
    this.boundAttributes.add(boundAttributesItem);
    return this;
  }

   /**
   * The attributes that login is restricted to.
   * @return boundAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The attributes that login is restricted to.")

  public List<SAMLAttribute> getBoundAttributes() {
    return boundAttributes;
  }


  public void setBoundAttributes(List<SAMLAttribute> boundAttributes) {
    this.boundAttributes = boundAttributes;
  }


  public SAMLAccessRules idpMetadataUrl(String idpMetadataUrl) {
    
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


  public SAMLAccessRules idpMetadataXml(String idpMetadataXml) {
    
    this.idpMetadataXml = idpMetadataXml;
    return this;
  }

   /**
   * IDP metadata XML
   * @return idpMetadataXml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IDP metadata XML")

  public String getIdpMetadataXml() {
    return idpMetadataXml;
  }


  public void setIdpMetadataXml(String idpMetadataXml) {
    this.idpMetadataXml = idpMetadataXml;
  }


  public SAMLAccessRules uniqueIdentifier(String uniqueIdentifier) {
    
    this.uniqueIdentifier = uniqueIdentifier;
    return this;
  }

   /**
   * A unique identifier to distinguish different users
   * @return uniqueIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier to distinguish different users")

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
    SAMLAccessRules saMLAccessRules = (SAMLAccessRules) o;
    return Objects.equals(this.boundAttributes, saMLAccessRules.boundAttributes) &&
        Objects.equals(this.idpMetadataUrl, saMLAccessRules.idpMetadataUrl) &&
        Objects.equals(this.idpMetadataXml, saMLAccessRules.idpMetadataXml) &&
        Objects.equals(this.uniqueIdentifier, saMLAccessRules.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundAttributes, idpMetadataUrl, idpMetadataXml, uniqueIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAMLAccessRules {\n");
    sb.append("    boundAttributes: ").append(toIndentedString(boundAttributes)).append("\n");
    sb.append("    idpMetadataUrl: ").append(toIndentedString(idpMetadataUrl)).append("\n");
    sb.append("    idpMetadataXml: ").append(toIndentedString(idpMetadataXml)).append("\n");
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
