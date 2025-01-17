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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Encrypt
 */

public class Encrypt {
  public static final String SERIALIZED_NAME_DISPLAY_ID = "display-id";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID)
  private String displayId;

  public static final String SERIALIZED_NAME_ENCRYPTION_CONTEXT = "encryption-context";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_CONTEXT)
  private Map<String, String> encryptionContext = null;

  public static final String SERIALIZED_NAME_INPUT_FORMAT = "input-format";
  @SerializedName(SERIALIZED_NAME_INPUT_FORMAT)
  private String inputFormat;

  public static final String SERIALIZED_NAME_ITEM_ID = "item-id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_KEY_NAME = "key-name";
  @SerializedName(SERIALIZED_NAME_KEY_NAME)
  private String keyName;

  public static final String SERIALIZED_NAME_PLAINTEXT = "plaintext";
  @SerializedName(SERIALIZED_NAME_PLAINTEXT)
  private String plaintext;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public Encrypt displayId(String displayId) {
    
    this.displayId = displayId;
    return this;
  }

   /**
   * The display id of the key to use in the encryption process
   * @return displayId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display id of the key to use in the encryption process")

  public String getDisplayId() {
    return displayId;
  }


  public void setDisplayId(String displayId) {
    this.displayId = displayId;
  }


  public Encrypt encryptionContext(Map<String, String> encryptionContext) {
    
    this.encryptionContext = encryptionContext;
    return this;
  }

  public Encrypt putEncryptionContextItem(String key, String encryptionContextItem) {
    if (this.encryptionContext == null) {
      this.encryptionContext = new HashMap<String, String>();
    }
    this.encryptionContext.put(key, encryptionContextItem);
    return this;
  }

   /**
   * name-value pair that specifies the encryption context to be used for authenticated encryption. If used here, the same value must be supplied to the decrypt command or decryption will fail
   * @return encryptionContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name-value pair that specifies the encryption context to be used for authenticated encryption. If used here, the same value must be supplied to the decrypt command or decryption will fail")

  public Map<String, String> getEncryptionContext() {
    return encryptionContext;
  }


  public void setEncryptionContext(Map<String, String> encryptionContext) {
    this.encryptionContext = encryptionContext;
  }


  public Encrypt inputFormat(String inputFormat) {
    
    this.inputFormat = inputFormat;
    return this;
  }

   /**
   * If specified, the plaintext input is assumed to be formatted accordingly. Current supported options: [base64]
   * @return inputFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the plaintext input is assumed to be formatted accordingly. Current supported options: [base64]")

  public String getInputFormat() {
    return inputFormat;
  }


  public void setInputFormat(String inputFormat) {
    this.inputFormat = inputFormat;
  }


  public Encrypt itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The item id of the key to use in the encryption process
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The item id of the key to use in the encryption process")

  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public Encrypt json(Boolean json) {
    
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


  public Encrypt keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * The name of the key to use in the encryption process
   * @return keyName
  **/
  @ApiModelProperty(required = true, value = "The name of the key to use in the encryption process")

  public String getKeyName() {
    return keyName;
  }


  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  public Encrypt plaintext(String plaintext) {
    
    this.plaintext = plaintext;
    return this;
  }

   /**
   * Data to be encrypted
   * @return plaintext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data to be encrypted")

  public String getPlaintext() {
    return plaintext;
  }


  public void setPlaintext(String plaintext) {
    this.plaintext = plaintext;
  }


  public Encrypt token(String token) {
    
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


  public Encrypt uidToken(String uidToken) {
    
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
    Encrypt encrypt = (Encrypt) o;
    return Objects.equals(this.displayId, encrypt.displayId) &&
        Objects.equals(this.encryptionContext, encrypt.encryptionContext) &&
        Objects.equals(this.inputFormat, encrypt.inputFormat) &&
        Objects.equals(this.itemId, encrypt.itemId) &&
        Objects.equals(this.json, encrypt.json) &&
        Objects.equals(this.keyName, encrypt.keyName) &&
        Objects.equals(this.plaintext, encrypt.plaintext) &&
        Objects.equals(this.token, encrypt.token) &&
        Objects.equals(this.uidToken, encrypt.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayId, encryptionContext, inputFormat, itemId, json, keyName, plaintext, token, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Encrypt {\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    encryptionContext: ").append(toIndentedString(encryptionContext)).append("\n");
    sb.append("    inputFormat: ").append(toIndentedString(inputFormat)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    plaintext: ").append(toIndentedString(plaintext)).append("\n");
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

