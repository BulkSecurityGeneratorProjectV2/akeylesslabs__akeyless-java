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
 * DecryptPKCS1
 */

public class DecryptPKCS1 {
  public static final String SERIALIZED_NAME_CIPHERTEXT = "ciphertext";
  @SerializedName(SERIALIZED_NAME_CIPHERTEXT)
  private String ciphertext;

  public static final String SERIALIZED_NAME_DISPLAY_ID = "display-id";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  private String displayId;

  public static final String SERIALIZED_NAME_ITEM_ID = "item-id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_KEY_NAME = "key-name";
  @SerializedName(SERIALIZED_NAME_KEY_NAME)
  private String keyName;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public DecryptPKCS1 ciphertext(String ciphertext) {
    
    this.ciphertext = ciphertext;
    return this;
  }

   /**
   * Ciphertext to be decrypted in base64 encoded format
   * @return ciphertext
  **/
  @ApiModelProperty(required = true, value = "Ciphertext to be decrypted in base64 encoded format")

  public String getCiphertext() {
    return ciphertext;
  }


  public void setCiphertext(String ciphertext) {
    this.ciphertext = ciphertext;
  }


  public DecryptPKCS1 displayId(String displayId) {
    
    this.displayId = displayId;
    return this;
  }

   /**
   * The display id of the key to use in the decryption process
   * @return displayId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display id of the key to use in the decryption process")

  public String getDisplayId() {
    return displayId;
  }


  public void setDisplayId(String displayId) {
    this.displayId = displayId;
  }


  public DecryptPKCS1 itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The item id of the key to use in the decryption process
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The item id of the key to use in the decryption process")

  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public DecryptPKCS1 json(Boolean json) {
    
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


  public DecryptPKCS1 keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * The name of the key to use in the decryption process
   * @return keyName
  **/
  @ApiModelProperty(required = true, value = "The name of the key to use in the decryption process")

  public String getKeyName() {
    return keyName;
  }


  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  public DecryptPKCS1 token(String token) {
    
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


  public DecryptPKCS1 uidToken(String uidToken) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecryptPKCS1 decryptPKCS1 = (DecryptPKCS1) o;
    return Objects.equals(this.ciphertext, decryptPKCS1.ciphertext) &&
        Objects.equals(this.displayId, decryptPKCS1.displayId) &&
        Objects.equals(this.itemId, decryptPKCS1.itemId) &&
        Objects.equals(this.json, decryptPKCS1.json) &&
        Objects.equals(this.keyName, decryptPKCS1.keyName) &&
        Objects.equals(this.token, decryptPKCS1.token) &&
        Objects.equals(this.uidToken, decryptPKCS1.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ciphertext, displayId, itemId, json, keyName, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecryptPKCS1 {\n");
    sb.append("    ciphertext: ").append(toIndentedString(ciphertext)).append("\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

