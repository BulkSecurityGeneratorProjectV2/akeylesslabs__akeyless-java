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
import io.akeyless.client.model.CertificateIssueInfo;
import io.akeyless.client.model.ItemGeneralInfo;
import io.akeyless.client.model.ItemTargetAssociation;
import io.akeyless.client.model.ItemVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Item
 */

public class Item {
  public static final String SERIALIZED_NAME_AUTO_ROTATE = "auto_rotate";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE)
  private Boolean autoRotate;

  public static final String SERIALIZED_NAME_CERT_ISSUER_SIGNER_KEY_NAME = "cert_issuer_signer_key_name";
  @SerializedName(SERIALIZED_NAME_CERT_ISSUER_SIGNER_KEY_NAME)
  private String certIssuerSignerKeyName;

  public static final String SERIALIZED_NAME_CERTIFICATE_ISSUE_DETAILS = "certificate_issue_details";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ISSUE_DETAILS)
  private CertificateIssueInfo certificateIssueDetails;

  public static final String SERIALIZED_NAME_CERTIFICATES = "certificates";
  @SerializedName(SERIALIZED_NAME_CERTIFICATES)
  private String certificates;

  public static final String SERIALIZED_NAME_CLIENT_PERMISSIONS = "client_permissions";
  @SerializedName(SERIALIZED_NAME_CLIENT_PERMISSIONS)
  private List<String> clientPermissions = null;

  public static final String SERIALIZED_NAME_DELETION_DATE = "deletion_date";
  @SerializedName(SERIALIZED_NAME_DELETION_DATE)
  private OffsetDateTime deletionDate;

  public static final String SERIALIZED_NAME_IS_ENABLED = "is_enabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_ITEM_GENERAL_INFO = "item_general_info";
  @SerializedName(SERIALIZED_NAME_ITEM_GENERAL_INFO)
  private ItemGeneralInfo itemGeneralInfo;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId;

  public static final String SERIALIZED_NAME_ITEM_METADATA = "item_metadata";
  @SerializedName(SERIALIZED_NAME_ITEM_METADATA)
  private String itemMetadata;

  public static final String SERIALIZED_NAME_ITEM_NAME = "item_name";
  @SerializedName(SERIALIZED_NAME_ITEM_NAME)
  private String itemName;

  public static final String SERIALIZED_NAME_ITEM_SIZE = "item_size";
  @SerializedName(SERIALIZED_NAME_ITEM_SIZE)
  private Long itemSize;

  public static final String SERIALIZED_NAME_ITEM_STATE = "item_state";
  @SerializedName(SERIALIZED_NAME_ITEM_STATE)
  private String itemState;

  public static final String SERIALIZED_NAME_ITEM_TAGS = "item_tags";
  @SerializedName(SERIALIZED_NAME_ITEM_TAGS)
  private List<String> itemTags = null;

  public static final String SERIALIZED_NAME_ITEM_TARGETS_ASSOC = "item_targets_assoc";
  @SerializedName(SERIALIZED_NAME_ITEM_TARGETS_ASSOC)
  private List<ItemTargetAssociation> itemTargetsAssoc = null;

  public static final String SERIALIZED_NAME_ITEM_TYPE = "item_type";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  private String itemType;

  public static final String SERIALIZED_NAME_ITEM_VERSIONS = "item_versions";
  @SerializedName(SERIALIZED_NAME_ITEM_VERSIONS)
  private List<ItemVersion> itemVersions = null;

  public static final String SERIALIZED_NAME_LAST_VERSION = "last_version";
  @SerializedName(SERIALIZED_NAME_LAST_VERSION)
  private Integer lastVersion;

  public static final String SERIALIZED_NAME_NEXT_ROTATION_DATE = "next_rotation_date";
  @SerializedName(SERIALIZED_NAME_NEXT_ROTATION_DATE)
  private OffsetDateTime nextRotationDate;

  public static final String SERIALIZED_NAME_PROTECTION_KEY_NAME = "protection_key_name";
  @SerializedName(SERIALIZED_NAME_PROTECTION_KEY_NAME)
  private String protectionKeyName;

  public static final String SERIALIZED_NAME_PUBLIC_VALUE = "public_value";
  @SerializedName(SERIALIZED_NAME_PUBLIC_VALUE)
  private String publicValue;

  public static final String SERIALIZED_NAME_ROTATION_INTERVAL = "rotation_interval";
  @SerializedName(SERIALIZED_NAME_ROTATION_INTERVAL)
  private Long rotationInterval;

  public static final String SERIALIZED_NAME_WITH_CUSTOMER_FRAGMENT = "with_customer_fragment";
  @SerializedName(SERIALIZED_NAME_WITH_CUSTOMER_FRAGMENT)
  private Boolean withCustomerFragment;


  public Item autoRotate(Boolean autoRotate) {
    
    this.autoRotate = autoRotate;
    return this;
  }

   /**
   * Get autoRotate
   * @return autoRotate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoRotate() {
    return autoRotate;
  }


  public void setAutoRotate(Boolean autoRotate) {
    this.autoRotate = autoRotate;
  }


  public Item certIssuerSignerKeyName(String certIssuerSignerKeyName) {
    
    this.certIssuerSignerKeyName = certIssuerSignerKeyName;
    return this;
  }

   /**
   * Get certIssuerSignerKeyName
   * @return certIssuerSignerKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertIssuerSignerKeyName() {
    return certIssuerSignerKeyName;
  }


  public void setCertIssuerSignerKeyName(String certIssuerSignerKeyName) {
    this.certIssuerSignerKeyName = certIssuerSignerKeyName;
  }


  public Item certificateIssueDetails(CertificateIssueInfo certificateIssueDetails) {
    
    this.certificateIssueDetails = certificateIssueDetails;
    return this;
  }

   /**
   * Get certificateIssueDetails
   * @return certificateIssueDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CertificateIssueInfo getCertificateIssueDetails() {
    return certificateIssueDetails;
  }


  public void setCertificateIssueDetails(CertificateIssueInfo certificateIssueDetails) {
    this.certificateIssueDetails = certificateIssueDetails;
  }


  public Item certificates(String certificates) {
    
    this.certificates = certificates;
    return this;
  }

   /**
   * Get certificates
   * @return certificates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertificates() {
    return certificates;
  }


  public void setCertificates(String certificates) {
    this.certificates = certificates;
  }


  public Item clientPermissions(List<String> clientPermissions) {
    
    this.clientPermissions = clientPermissions;
    return this;
  }

  public Item addClientPermissionsItem(String clientPermissionsItem) {
    if (this.clientPermissions == null) {
      this.clientPermissions = new ArrayList<String>();
    }
    this.clientPermissions.add(clientPermissionsItem);
    return this;
  }

   /**
   * Get clientPermissions
   * @return clientPermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getClientPermissions() {
    return clientPermissions;
  }


  public void setClientPermissions(List<String> clientPermissions) {
    this.clientPermissions = clientPermissions;
  }


  public Item deletionDate(OffsetDateTime deletionDate) {
    
    this.deletionDate = deletionDate;
    return this;
  }

   /**
   * Get deletionDate
   * @return deletionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDeletionDate() {
    return deletionDate;
  }


  public void setDeletionDate(OffsetDateTime deletionDate) {
    this.deletionDate = deletionDate;
  }


  public Item isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public Item itemGeneralInfo(ItemGeneralInfo itemGeneralInfo) {
    
    this.itemGeneralInfo = itemGeneralInfo;
    return this;
  }

   /**
   * Get itemGeneralInfo
   * @return itemGeneralInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemGeneralInfo getItemGeneralInfo() {
    return itemGeneralInfo;
  }


  public void setItemGeneralInfo(ItemGeneralInfo itemGeneralInfo) {
    this.itemGeneralInfo = itemGeneralInfo;
  }


  public Item itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public Item itemMetadata(String itemMetadata) {
    
    this.itemMetadata = itemMetadata;
    return this;
  }

   /**
   * Get itemMetadata
   * @return itemMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getItemMetadata() {
    return itemMetadata;
  }


  public void setItemMetadata(String itemMetadata) {
    this.itemMetadata = itemMetadata;
  }


  public Item itemName(String itemName) {
    
    this.itemName = itemName;
    return this;
  }

   /**
   * Get itemName
   * @return itemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getItemName() {
    return itemName;
  }


  public void setItemName(String itemName) {
    this.itemName = itemName;
  }


  public Item itemSize(Long itemSize) {
    
    this.itemSize = itemSize;
    return this;
  }

   /**
   * Get itemSize
   * @return itemSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getItemSize() {
    return itemSize;
  }


  public void setItemSize(Long itemSize) {
    this.itemSize = itemSize;
  }


  public Item itemState(String itemState) {
    
    this.itemState = itemState;
    return this;
  }

   /**
   * ItemState defines the different states an Item can be in
   * @return itemState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ItemState defines the different states an Item can be in")

  public String getItemState() {
    return itemState;
  }


  public void setItemState(String itemState) {
    this.itemState = itemState;
  }


  public Item itemTags(List<String> itemTags) {
    
    this.itemTags = itemTags;
    return this;
  }

  public Item addItemTagsItem(String itemTagsItem) {
    if (this.itemTags == null) {
      this.itemTags = new ArrayList<String>();
    }
    this.itemTags.add(itemTagsItem);
    return this;
  }

   /**
   * Get itemTags
   * @return itemTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getItemTags() {
    return itemTags;
  }


  public void setItemTags(List<String> itemTags) {
    this.itemTags = itemTags;
  }


  public Item itemTargetsAssoc(List<ItemTargetAssociation> itemTargetsAssoc) {
    
    this.itemTargetsAssoc = itemTargetsAssoc;
    return this;
  }

  public Item addItemTargetsAssocItem(ItemTargetAssociation itemTargetsAssocItem) {
    if (this.itemTargetsAssoc == null) {
      this.itemTargetsAssoc = new ArrayList<ItemTargetAssociation>();
    }
    this.itemTargetsAssoc.add(itemTargetsAssocItem);
    return this;
  }

   /**
   * Get itemTargetsAssoc
   * @return itemTargetsAssoc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ItemTargetAssociation> getItemTargetsAssoc() {
    return itemTargetsAssoc;
  }


  public void setItemTargetsAssoc(List<ItemTargetAssociation> itemTargetsAssoc) {
    this.itemTargetsAssoc = itemTargetsAssoc;
  }


  public Item itemType(String itemType) {
    
    this.itemType = itemType;
    return this;
  }

   /**
   * Get itemType
   * @return itemType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getItemType() {
    return itemType;
  }


  public void setItemType(String itemType) {
    this.itemType = itemType;
  }


  public Item itemVersions(List<ItemVersion> itemVersions) {
    
    this.itemVersions = itemVersions;
    return this;
  }

  public Item addItemVersionsItem(ItemVersion itemVersionsItem) {
    if (this.itemVersions == null) {
      this.itemVersions = new ArrayList<ItemVersion>();
    }
    this.itemVersions.add(itemVersionsItem);
    return this;
  }

   /**
   * Get itemVersions
   * @return itemVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ItemVersion> getItemVersions() {
    return itemVersions;
  }


  public void setItemVersions(List<ItemVersion> itemVersions) {
    this.itemVersions = itemVersions;
  }


  public Item lastVersion(Integer lastVersion) {
    
    this.lastVersion = lastVersion;
    return this;
  }

   /**
   * Get lastVersion
   * @return lastVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastVersion() {
    return lastVersion;
  }


  public void setLastVersion(Integer lastVersion) {
    this.lastVersion = lastVersion;
  }


  public Item nextRotationDate(OffsetDateTime nextRotationDate) {
    
    this.nextRotationDate = nextRotationDate;
    return this;
  }

   /**
   * Get nextRotationDate
   * @return nextRotationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getNextRotationDate() {
    return nextRotationDate;
  }


  public void setNextRotationDate(OffsetDateTime nextRotationDate) {
    this.nextRotationDate = nextRotationDate;
  }


  public Item protectionKeyName(String protectionKeyName) {
    
    this.protectionKeyName = protectionKeyName;
    return this;
  }

   /**
   * Get protectionKeyName
   * @return protectionKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProtectionKeyName() {
    return protectionKeyName;
  }


  public void setProtectionKeyName(String protectionKeyName) {
    this.protectionKeyName = protectionKeyName;
  }


  public Item publicValue(String publicValue) {
    
    this.publicValue = publicValue;
    return this;
  }

   /**
   * Get publicValue
   * @return publicValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPublicValue() {
    return publicValue;
  }


  public void setPublicValue(String publicValue) {
    this.publicValue = publicValue;
  }


  public Item rotationInterval(Long rotationInterval) {
    
    this.rotationInterval = rotationInterval;
    return this;
  }

   /**
   * Get rotationInterval
   * @return rotationInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRotationInterval() {
    return rotationInterval;
  }


  public void setRotationInterval(Long rotationInterval) {
    this.rotationInterval = rotationInterval;
  }


  public Item withCustomerFragment(Boolean withCustomerFragment) {
    
    this.withCustomerFragment = withCustomerFragment;
    return this;
  }

   /**
   * Get withCustomerFragment
   * @return withCustomerFragment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWithCustomerFragment() {
    return withCustomerFragment;
  }


  public void setWithCustomerFragment(Boolean withCustomerFragment) {
    this.withCustomerFragment = withCustomerFragment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.autoRotate, item.autoRotate) &&
        Objects.equals(this.certIssuerSignerKeyName, item.certIssuerSignerKeyName) &&
        Objects.equals(this.certificateIssueDetails, item.certificateIssueDetails) &&
        Objects.equals(this.certificates, item.certificates) &&
        Objects.equals(this.clientPermissions, item.clientPermissions) &&
        Objects.equals(this.deletionDate, item.deletionDate) &&
        Objects.equals(this.isEnabled, item.isEnabled) &&
        Objects.equals(this.itemGeneralInfo, item.itemGeneralInfo) &&
        Objects.equals(this.itemId, item.itemId) &&
        Objects.equals(this.itemMetadata, item.itemMetadata) &&
        Objects.equals(this.itemName, item.itemName) &&
        Objects.equals(this.itemSize, item.itemSize) &&
        Objects.equals(this.itemState, item.itemState) &&
        Objects.equals(this.itemTags, item.itemTags) &&
        Objects.equals(this.itemTargetsAssoc, item.itemTargetsAssoc) &&
        Objects.equals(this.itemType, item.itemType) &&
        Objects.equals(this.itemVersions, item.itemVersions) &&
        Objects.equals(this.lastVersion, item.lastVersion) &&
        Objects.equals(this.nextRotationDate, item.nextRotationDate) &&
        Objects.equals(this.protectionKeyName, item.protectionKeyName) &&
        Objects.equals(this.publicValue, item.publicValue) &&
        Objects.equals(this.rotationInterval, item.rotationInterval) &&
        Objects.equals(this.withCustomerFragment, item.withCustomerFragment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRotate, certIssuerSignerKeyName, certificateIssueDetails, certificates, clientPermissions, deletionDate, isEnabled, itemGeneralInfo, itemId, itemMetadata, itemName, itemSize, itemState, itemTags, itemTargetsAssoc, itemType, itemVersions, lastVersion, nextRotationDate, protectionKeyName, publicValue, rotationInterval, withCustomerFragment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    autoRotate: ").append(toIndentedString(autoRotate)).append("\n");
    sb.append("    certIssuerSignerKeyName: ").append(toIndentedString(certIssuerSignerKeyName)).append("\n");
    sb.append("    certificateIssueDetails: ").append(toIndentedString(certificateIssueDetails)).append("\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    clientPermissions: ").append(toIndentedString(clientPermissions)).append("\n");
    sb.append("    deletionDate: ").append(toIndentedString(deletionDate)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    itemGeneralInfo: ").append(toIndentedString(itemGeneralInfo)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemMetadata: ").append(toIndentedString(itemMetadata)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemSize: ").append(toIndentedString(itemSize)).append("\n");
    sb.append("    itemState: ").append(toIndentedString(itemState)).append("\n");
    sb.append("    itemTags: ").append(toIndentedString(itemTags)).append("\n");
    sb.append("    itemTargetsAssoc: ").append(toIndentedString(itemTargetsAssoc)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    itemVersions: ").append(toIndentedString(itemVersions)).append("\n");
    sb.append("    lastVersion: ").append(toIndentedString(lastVersion)).append("\n");
    sb.append("    nextRotationDate: ").append(toIndentedString(nextRotationDate)).append("\n");
    sb.append("    protectionKeyName: ").append(toIndentedString(protectionKeyName)).append("\n");
    sb.append("    publicValue: ").append(toIndentedString(publicValue)).append("\n");
    sb.append("    rotationInterval: ").append(toIndentedString(rotationInterval)).append("\n");
    sb.append("    withCustomerFragment: ").append(toIndentedString(withCustomerFragment)).append("\n");
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

