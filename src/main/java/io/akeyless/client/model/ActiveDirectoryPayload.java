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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ActiveDirectoryPayload
 */

public class ActiveDirectoryPayload {
  public static final String SERIALIZED_NAME_ACTIVE_DIRECTORY_TARGET_ID = "active_directory_target_id";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DIRECTORY_TARGET_ID)
  private Long activeDirectoryTargetId;

  public static final String SERIALIZED_NAME_AUTO_ROTATE = "auto_rotate";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE)
  private Boolean autoRotate;

  public static final String SERIALIZED_NAME_AUTO_ROTATE_INTERVAL_IN_DAYS = "auto_rotate_interval_in_days";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE_INTERVAL_IN_DAYS)
  private Integer autoRotateIntervalInDays;

  public static final String SERIALIZED_NAME_AUTO_ROTATE_ROTATION_HOUR = "auto_rotate_rotation_hour";
  @SerializedName(SERIALIZED_NAME_AUTO_ROTATE_ROTATION_HOUR)
  private Integer autoRotateRotationHour;

  public static final String SERIALIZED_NAME_COMPUTER_BASE_DN = "computer_base_dn";
  @SerializedName(SERIALIZED_NAME_COMPUTER_BASE_DN)
  private String computerBaseDn;

  public static final String SERIALIZED_NAME_DISCOVER_LOCAL_USERS = "discover_local_users";
  @SerializedName(SERIALIZED_NAME_DISCOVER_LOCAL_USERS)
  private Boolean discoverLocalUsers;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "domain_name";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_DOMAIN_SERVER_TARGETS_PATH_TEMPLATE = "domain_server_targets_path_template";
  @SerializedName(SERIALIZED_NAME_DOMAIN_SERVER_TARGETS_PATH_TEMPLATE)
  private String domainServerTargetsPathTemplate;

  public static final String SERIALIZED_NAME_DOMAIN_USERS_ROTATED_SECRETS_PATH_TEMPLATE = "domain_users_rotated_secrets_path_template";
  @SerializedName(SERIALIZED_NAME_DOMAIN_USERS_ROTATED_SECRETS_PATH_TEMPLATE)
  private String domainUsersRotatedSecretsPathTemplate;

  public static final String SERIALIZED_NAME_ENABLE_RDP_SRA = "enable_rdp_sra";
  @SerializedName(SERIALIZED_NAME_ENABLE_RDP_SRA)
  private Boolean enableRdpSra;

  public static final String SERIALIZED_NAME_LOCAL_USERS_IGNORE_LIST = "local_users_ignore_list";
  @SerializedName(SERIALIZED_NAME_LOCAL_USERS_IGNORE_LIST)
  private Map<String, Boolean> localUsersIgnoreList = null;

  public static final String SERIALIZED_NAME_LOCAL_USERS_ROTATED_SECRETS_PATH_TEMPLATE = "local_users_rotated_secrets_path_template";
  @SerializedName(SERIALIZED_NAME_LOCAL_USERS_ROTATED_SECRETS_PATH_TEMPLATE)
  private String localUsersRotatedSecretsPathTemplate;

  public static final String SERIALIZED_NAME_SSH_PORT = "ssh_port";
  @SerializedName(SERIALIZED_NAME_SSH_PORT)
  private String sshPort;

  public static final String SERIALIZED_NAME_USER_BASE_DN = "user_base_dn";
  @SerializedName(SERIALIZED_NAME_USER_BASE_DN)
  private String userBaseDn;

  public static final String SERIALIZED_NAME_USER_GROUPS = "user_groups";
  @SerializedName(SERIALIZED_NAME_USER_GROUPS)
  private List<String> userGroups = null;


  public ActiveDirectoryPayload activeDirectoryTargetId(Long activeDirectoryTargetId) {
    
    this.activeDirectoryTargetId = activeDirectoryTargetId;
    return this;
  }

   /**
   * Get activeDirectoryTargetId
   * @return activeDirectoryTargetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getActiveDirectoryTargetId() {
    return activeDirectoryTargetId;
  }


  public void setActiveDirectoryTargetId(Long activeDirectoryTargetId) {
    this.activeDirectoryTargetId = activeDirectoryTargetId;
  }


  public ActiveDirectoryPayload autoRotate(Boolean autoRotate) {
    
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


  public ActiveDirectoryPayload autoRotateIntervalInDays(Integer autoRotateIntervalInDays) {
    
    this.autoRotateIntervalInDays = autoRotateIntervalInDays;
    return this;
  }

   /**
   * Get autoRotateIntervalInDays
   * @return autoRotateIntervalInDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAutoRotateIntervalInDays() {
    return autoRotateIntervalInDays;
  }


  public void setAutoRotateIntervalInDays(Integer autoRotateIntervalInDays) {
    this.autoRotateIntervalInDays = autoRotateIntervalInDays;
  }


  public ActiveDirectoryPayload autoRotateRotationHour(Integer autoRotateRotationHour) {
    
    this.autoRotateRotationHour = autoRotateRotationHour;
    return this;
  }

   /**
   * Get autoRotateRotationHour
   * @return autoRotateRotationHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAutoRotateRotationHour() {
    return autoRotateRotationHour;
  }


  public void setAutoRotateRotationHour(Integer autoRotateRotationHour) {
    this.autoRotateRotationHour = autoRotateRotationHour;
  }


  public ActiveDirectoryPayload computerBaseDn(String computerBaseDn) {
    
    this.computerBaseDn = computerBaseDn;
    return this;
  }

   /**
   * Get computerBaseDn
   * @return computerBaseDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComputerBaseDn() {
    return computerBaseDn;
  }


  public void setComputerBaseDn(String computerBaseDn) {
    this.computerBaseDn = computerBaseDn;
  }


  public ActiveDirectoryPayload discoverLocalUsers(Boolean discoverLocalUsers) {
    
    this.discoverLocalUsers = discoverLocalUsers;
    return this;
  }

   /**
   * Get discoverLocalUsers
   * @return discoverLocalUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDiscoverLocalUsers() {
    return discoverLocalUsers;
  }


  public void setDiscoverLocalUsers(Boolean discoverLocalUsers) {
    this.discoverLocalUsers = discoverLocalUsers;
  }


  public ActiveDirectoryPayload domainName(String domainName) {
    
    this.domainName = domainName;
    return this;
  }

   /**
   * Get domainName
   * @return domainName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDomainName() {
    return domainName;
  }


  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  public ActiveDirectoryPayload domainServerTargetsPathTemplate(String domainServerTargetsPathTemplate) {
    
    this.domainServerTargetsPathTemplate = domainServerTargetsPathTemplate;
    return this;
  }

   /**
   * Get domainServerTargetsPathTemplate
   * @return domainServerTargetsPathTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDomainServerTargetsPathTemplate() {
    return domainServerTargetsPathTemplate;
  }


  public void setDomainServerTargetsPathTemplate(String domainServerTargetsPathTemplate) {
    this.domainServerTargetsPathTemplate = domainServerTargetsPathTemplate;
  }


  public ActiveDirectoryPayload domainUsersRotatedSecretsPathTemplate(String domainUsersRotatedSecretsPathTemplate) {
    
    this.domainUsersRotatedSecretsPathTemplate = domainUsersRotatedSecretsPathTemplate;
    return this;
  }

   /**
   * Get domainUsersRotatedSecretsPathTemplate
   * @return domainUsersRotatedSecretsPathTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDomainUsersRotatedSecretsPathTemplate() {
    return domainUsersRotatedSecretsPathTemplate;
  }


  public void setDomainUsersRotatedSecretsPathTemplate(String domainUsersRotatedSecretsPathTemplate) {
    this.domainUsersRotatedSecretsPathTemplate = domainUsersRotatedSecretsPathTemplate;
  }


  public ActiveDirectoryPayload enableRdpSra(Boolean enableRdpSra) {
    
    this.enableRdpSra = enableRdpSra;
    return this;
  }

   /**
   * Get enableRdpSra
   * @return enableRdpSra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableRdpSra() {
    return enableRdpSra;
  }


  public void setEnableRdpSra(Boolean enableRdpSra) {
    this.enableRdpSra = enableRdpSra;
  }


  public ActiveDirectoryPayload localUsersIgnoreList(Map<String, Boolean> localUsersIgnoreList) {
    
    this.localUsersIgnoreList = localUsersIgnoreList;
    return this;
  }

  public ActiveDirectoryPayload putLocalUsersIgnoreListItem(String key, Boolean localUsersIgnoreListItem) {
    if (this.localUsersIgnoreList == null) {
      this.localUsersIgnoreList = new HashMap<String, Boolean>();
    }
    this.localUsersIgnoreList.put(key, localUsersIgnoreListItem);
    return this;
  }

   /**
   * Get localUsersIgnoreList
   * @return localUsersIgnoreList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Boolean> getLocalUsersIgnoreList() {
    return localUsersIgnoreList;
  }


  public void setLocalUsersIgnoreList(Map<String, Boolean> localUsersIgnoreList) {
    this.localUsersIgnoreList = localUsersIgnoreList;
  }


  public ActiveDirectoryPayload localUsersRotatedSecretsPathTemplate(String localUsersRotatedSecretsPathTemplate) {
    
    this.localUsersRotatedSecretsPathTemplate = localUsersRotatedSecretsPathTemplate;
    return this;
  }

   /**
   * Get localUsersRotatedSecretsPathTemplate
   * @return localUsersRotatedSecretsPathTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalUsersRotatedSecretsPathTemplate() {
    return localUsersRotatedSecretsPathTemplate;
  }


  public void setLocalUsersRotatedSecretsPathTemplate(String localUsersRotatedSecretsPathTemplate) {
    this.localUsersRotatedSecretsPathTemplate = localUsersRotatedSecretsPathTemplate;
  }


  public ActiveDirectoryPayload sshPort(String sshPort) {
    
    this.sshPort = sshPort;
    return this;
  }

   /**
   * Get sshPort
   * @return sshPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSshPort() {
    return sshPort;
  }


  public void setSshPort(String sshPort) {
    this.sshPort = sshPort;
  }


  public ActiveDirectoryPayload userBaseDn(String userBaseDn) {
    
    this.userBaseDn = userBaseDn;
    return this;
  }

   /**
   * Get userBaseDn
   * @return userBaseDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserBaseDn() {
    return userBaseDn;
  }


  public void setUserBaseDn(String userBaseDn) {
    this.userBaseDn = userBaseDn;
  }


  public ActiveDirectoryPayload userGroups(List<String> userGroups) {
    
    this.userGroups = userGroups;
    return this;
  }

  public ActiveDirectoryPayload addUserGroupsItem(String userGroupsItem) {
    if (this.userGroups == null) {
      this.userGroups = new ArrayList<String>();
    }
    this.userGroups.add(userGroupsItem);
    return this;
  }

   /**
   * Get userGroups
   * @return userGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUserGroups() {
    return userGroups;
  }


  public void setUserGroups(List<String> userGroups) {
    this.userGroups = userGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveDirectoryPayload activeDirectoryPayload = (ActiveDirectoryPayload) o;
    return Objects.equals(this.activeDirectoryTargetId, activeDirectoryPayload.activeDirectoryTargetId) &&
        Objects.equals(this.autoRotate, activeDirectoryPayload.autoRotate) &&
        Objects.equals(this.autoRotateIntervalInDays, activeDirectoryPayload.autoRotateIntervalInDays) &&
        Objects.equals(this.autoRotateRotationHour, activeDirectoryPayload.autoRotateRotationHour) &&
        Objects.equals(this.computerBaseDn, activeDirectoryPayload.computerBaseDn) &&
        Objects.equals(this.discoverLocalUsers, activeDirectoryPayload.discoverLocalUsers) &&
        Objects.equals(this.domainName, activeDirectoryPayload.domainName) &&
        Objects.equals(this.domainServerTargetsPathTemplate, activeDirectoryPayload.domainServerTargetsPathTemplate) &&
        Objects.equals(this.domainUsersRotatedSecretsPathTemplate, activeDirectoryPayload.domainUsersRotatedSecretsPathTemplate) &&
        Objects.equals(this.enableRdpSra, activeDirectoryPayload.enableRdpSra) &&
        Objects.equals(this.localUsersIgnoreList, activeDirectoryPayload.localUsersIgnoreList) &&
        Objects.equals(this.localUsersRotatedSecretsPathTemplate, activeDirectoryPayload.localUsersRotatedSecretsPathTemplate) &&
        Objects.equals(this.sshPort, activeDirectoryPayload.sshPort) &&
        Objects.equals(this.userBaseDn, activeDirectoryPayload.userBaseDn) &&
        Objects.equals(this.userGroups, activeDirectoryPayload.userGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDirectoryTargetId, autoRotate, autoRotateIntervalInDays, autoRotateRotationHour, computerBaseDn, discoverLocalUsers, domainName, domainServerTargetsPathTemplate, domainUsersRotatedSecretsPathTemplate, enableRdpSra, localUsersIgnoreList, localUsersRotatedSecretsPathTemplate, sshPort, userBaseDn, userGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveDirectoryPayload {\n");
    sb.append("    activeDirectoryTargetId: ").append(toIndentedString(activeDirectoryTargetId)).append("\n");
    sb.append("    autoRotate: ").append(toIndentedString(autoRotate)).append("\n");
    sb.append("    autoRotateIntervalInDays: ").append(toIndentedString(autoRotateIntervalInDays)).append("\n");
    sb.append("    autoRotateRotationHour: ").append(toIndentedString(autoRotateRotationHour)).append("\n");
    sb.append("    computerBaseDn: ").append(toIndentedString(computerBaseDn)).append("\n");
    sb.append("    discoverLocalUsers: ").append(toIndentedString(discoverLocalUsers)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    domainServerTargetsPathTemplate: ").append(toIndentedString(domainServerTargetsPathTemplate)).append("\n");
    sb.append("    domainUsersRotatedSecretsPathTemplate: ").append(toIndentedString(domainUsersRotatedSecretsPathTemplate)).append("\n");
    sb.append("    enableRdpSra: ").append(toIndentedString(enableRdpSra)).append("\n");
    sb.append("    localUsersIgnoreList: ").append(toIndentedString(localUsersIgnoreList)).append("\n");
    sb.append("    localUsersRotatedSecretsPathTemplate: ").append(toIndentedString(localUsersRotatedSecretsPathTemplate)).append("\n");
    sb.append("    sshPort: ").append(toIndentedString(sshPort)).append("\n");
    sb.append("    userBaseDn: ").append(toIndentedString(userBaseDn)).append("\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
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

