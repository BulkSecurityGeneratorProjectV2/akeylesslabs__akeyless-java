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
import org.threeten.bp.OffsetDateTime;

/**
 * KmipDescribeServerOutput
 */

public class KmipDescribeServerOutput {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_CA_CERT = "ca_cert";
  @SerializedName(SERIALIZED_NAME_CA_CERT)
  private List<Integer> caCert = null;

  public static final String SERIALIZED_NAME_CERTIFICATE_ISSUE_DATE = "certificate_issue_date";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ISSUE_DATE)
  private OffsetDateTime certificateIssueDate;

  public static final String SERIALIZED_NAME_CERTIFICATE_TTL_IN_SECONDS = "certificate_ttl_in_seconds";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_TTL_IN_SECONDS)
  private Long certificateTtlInSeconds;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_ROOT = "root";
  @SerializedName(SERIALIZED_NAME_ROOT)
  private String root;


  public KmipDescribeServerOutput active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public KmipDescribeServerOutput caCert(List<Integer> caCert) {
    
    this.caCert = caCert;
    return this;
  }

  public KmipDescribeServerOutput addCaCertItem(Integer caCertItem) {
    if (this.caCert == null) {
      this.caCert = new ArrayList<Integer>();
    }
    this.caCert.add(caCertItem);
    return this;
  }

   /**
   * Get caCert
   * @return caCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getCaCert() {
    return caCert;
  }


  public void setCaCert(List<Integer> caCert) {
    this.caCert = caCert;
  }


  public KmipDescribeServerOutput certificateIssueDate(OffsetDateTime certificateIssueDate) {
    
    this.certificateIssueDate = certificateIssueDate;
    return this;
  }

   /**
   * Get certificateIssueDate
   * @return certificateIssueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCertificateIssueDate() {
    return certificateIssueDate;
  }


  public void setCertificateIssueDate(OffsetDateTime certificateIssueDate) {
    this.certificateIssueDate = certificateIssueDate;
  }


  public KmipDescribeServerOutput certificateTtlInSeconds(Long certificateTtlInSeconds) {
    
    this.certificateTtlInSeconds = certificateTtlInSeconds;
    return this;
  }

   /**
   * Get certificateTtlInSeconds
   * @return certificateTtlInSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCertificateTtlInSeconds() {
    return certificateTtlInSeconds;
  }


  public void setCertificateTtlInSeconds(Long certificateTtlInSeconds) {
    this.certificateTtlInSeconds = certificateTtlInSeconds;
  }


  public KmipDescribeServerOutput hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public KmipDescribeServerOutput root(String root) {
    
    this.root = root;
    return this;
  }

   /**
   * Get root
   * @return root
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoot() {
    return root;
  }


  public void setRoot(String root) {
    this.root = root;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KmipDescribeServerOutput kmipDescribeServerOutput = (KmipDescribeServerOutput) o;
    return Objects.equals(this.active, kmipDescribeServerOutput.active) &&
        Objects.equals(this.caCert, kmipDescribeServerOutput.caCert) &&
        Objects.equals(this.certificateIssueDate, kmipDescribeServerOutput.certificateIssueDate) &&
        Objects.equals(this.certificateTtlInSeconds, kmipDescribeServerOutput.certificateTtlInSeconds) &&
        Objects.equals(this.hostname, kmipDescribeServerOutput.hostname) &&
        Objects.equals(this.root, kmipDescribeServerOutput.root);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, caCert, certificateIssueDate, certificateTtlInSeconds, hostname, root);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KmipDescribeServerOutput {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    caCert: ").append(toIndentedString(caCert)).append("\n");
    sb.append("    certificateIssueDate: ").append(toIndentedString(certificateIssueDate)).append("\n");
    sb.append("    certificateTtlInSeconds: ").append(toIndentedString(certificateTtlInSeconds)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
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

