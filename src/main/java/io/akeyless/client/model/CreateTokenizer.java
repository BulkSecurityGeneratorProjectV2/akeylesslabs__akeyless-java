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
 * createTokenizer is a command that creates a tokenizer item
 */
@ApiModel(description = "createTokenizer is a command that creates a tokenizer item")

public class CreateTokenizer {
  public static final String SERIALIZED_NAME_ALPHABET = "alphabet";
  @SerializedName(SERIALIZED_NAME_ALPHABET)
  private String alphabet;

  public static final String SERIALIZED_NAME_DECODING_TEMPLATE = "decoding-template";
  @SerializedName(SERIALIZED_NAME_DECODING_TEMPLATE)
  private String decodingTemplate;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_ENCODING_TEMPLATE = "encoding-template";
  @SerializedName(SERIALIZED_NAME_ENCODING_TEMPLATE)
  private String encodingTemplate;

  public static final String SERIALIZED_NAME_ENCRYPTION_KEY_NAME = "encryption-key-name";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_KEY_NAME)
  private String encryptionKeyName;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PATTERN = "pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  private String pattern;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private List<String> tag = null;

  public static final String SERIALIZED_NAME_TEMPLATE_TYPE = "template-type";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TYPE)
  private String templateType;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TOKENIZER_TYPE = "tokenizer-type";
  @SerializedName(SERIALIZED_NAME_TOKENIZER_TYPE)
  private String tokenizerType;

  public static final String SERIALIZED_NAME_TWEAK_TYPE = "tweak-type";
  @SerializedName(SERIALIZED_NAME_TWEAK_TYPE)
  private String tweakType;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;


  public CreateTokenizer alphabet(String alphabet) {
    
    this.alphabet = alphabet;
    return this;
  }

   /**
   * Alphabet to use in regexp vaultless tokenization
   * @return alphabet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Alphabet to use in regexp vaultless tokenization")

  public String getAlphabet() {
    return alphabet;
  }


  public void setAlphabet(String alphabet) {
    this.alphabet = alphabet;
  }


  public CreateTokenizer decodingTemplate(String decodingTemplate) {
    
    this.decodingTemplate = decodingTemplate;
    return this;
  }

   /**
   * The Decoding output template to use in regexp vaultless tokenization
   * @return decodingTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Decoding output template to use in regexp vaultless tokenization")

  public String getDecodingTemplate() {
    return decodingTemplate;
  }


  public void setDecodingTemplate(String decodingTemplate) {
    this.decodingTemplate = decodingTemplate;
  }


  public CreateTokenizer deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this item
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this item")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public CreateTokenizer encodingTemplate(String encodingTemplate) {
    
    this.encodingTemplate = encodingTemplate;
    return this;
  }

   /**
   * The Encoding output template to use in regexp vaultless tokenization
   * @return encodingTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Encoding output template to use in regexp vaultless tokenization")

  public String getEncodingTemplate() {
    return encodingTemplate;
  }


  public void setEncodingTemplate(String encodingTemplate) {
    this.encodingTemplate = encodingTemplate;
  }


  public CreateTokenizer encryptionKeyName(String encryptionKeyName) {
    
    this.encryptionKeyName = encryptionKeyName;
    return this;
  }

   /**
   * AES key name to use in vaultless tokenization
   * @return encryptionKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AES key name to use in vaultless tokenization")

  public String getEncryptionKeyName() {
    return encryptionKeyName;
  }


  public void setEncryptionKeyName(String encryptionKeyName) {
    this.encryptionKeyName = encryptionKeyName;
  }


  public CreateTokenizer json(Boolean json) {
    
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


  public CreateTokenizer metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A metadata about the tokenizer
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A metadata about the tokenizer")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public CreateTokenizer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Tokenizer name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Tokenizer name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateTokenizer pattern(String pattern) {
    
    this.pattern = pattern;
    return this;
  }

   /**
   * Pattern to use in regexp vaultless tokenization
   * @return pattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pattern to use in regexp vaultless tokenization")

  public String getPattern() {
    return pattern;
  }


  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  public CreateTokenizer tag(List<String> tag) {
    
    this.tag = tag;
    return this;
  }

  public CreateTokenizer addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<String>();
    }
    this.tag.add(tagItem);
    return this;
  }

   /**
   * List of the tags attached to this key
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the tags attached to this key")

  public List<String> getTag() {
    return tag;
  }


  public void setTag(List<String> tag) {
    this.tag = tag;
  }


  public CreateTokenizer templateType(String templateType) {
    
    this.templateType = templateType;
    return this;
  }

   /**
   * Which template type this tokenizer is used for [SSN,CreditCard,USPhoneNumber,Email,Regexp]
   * @return templateType
  **/
  @ApiModelProperty(required = true, value = "Which template type this tokenizer is used for [SSN,CreditCard,USPhoneNumber,Email,Regexp]")

  public String getTemplateType() {
    return templateType;
  }


  public void setTemplateType(String templateType) {
    this.templateType = templateType;
  }


  public CreateTokenizer token(String token) {
    
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


  public CreateTokenizer tokenizerType(String tokenizerType) {
    
    this.tokenizerType = tokenizerType;
    return this;
  }

   /**
   * Tokenizer type
   * @return tokenizerType
  **/
  @ApiModelProperty(required = true, value = "Tokenizer type")

  public String getTokenizerType() {
    return tokenizerType;
  }


  public void setTokenizerType(String tokenizerType) {
    this.tokenizerType = tokenizerType;
  }


  public CreateTokenizer tweakType(String tweakType) {
    
    this.tweakType = tweakType;
    return this;
  }

   /**
   * The tweak type to use in vaultless tokenization [Supplied, Generated, Internal, Masking]
   * @return tweakType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tweak type to use in vaultless tokenization [Supplied, Generated, Internal, Masking]")

  public String getTweakType() {
    return tweakType;
  }


  public void setTweakType(String tweakType) {
    this.tweakType = tweakType;
  }


  public CreateTokenizer uidToken(String uidToken) {
    
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
    CreateTokenizer createTokenizer = (CreateTokenizer) o;
    return Objects.equals(this.alphabet, createTokenizer.alphabet) &&
        Objects.equals(this.decodingTemplate, createTokenizer.decodingTemplate) &&
        Objects.equals(this.deleteProtection, createTokenizer.deleteProtection) &&
        Objects.equals(this.encodingTemplate, createTokenizer.encodingTemplate) &&
        Objects.equals(this.encryptionKeyName, createTokenizer.encryptionKeyName) &&
        Objects.equals(this.json, createTokenizer.json) &&
        Objects.equals(this.metadata, createTokenizer.metadata) &&
        Objects.equals(this.name, createTokenizer.name) &&
        Objects.equals(this.pattern, createTokenizer.pattern) &&
        Objects.equals(this.tag, createTokenizer.tag) &&
        Objects.equals(this.templateType, createTokenizer.templateType) &&
        Objects.equals(this.token, createTokenizer.token) &&
        Objects.equals(this.tokenizerType, createTokenizer.tokenizerType) &&
        Objects.equals(this.tweakType, createTokenizer.tweakType) &&
        Objects.equals(this.uidToken, createTokenizer.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alphabet, decodingTemplate, deleteProtection, encodingTemplate, encryptionKeyName, json, metadata, name, pattern, tag, templateType, token, tokenizerType, tweakType, uidToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTokenizer {\n");
    sb.append("    alphabet: ").append(toIndentedString(alphabet)).append("\n");
    sb.append("    decodingTemplate: ").append(toIndentedString(decodingTemplate)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    encodingTemplate: ").append(toIndentedString(encodingTemplate)).append("\n");
    sb.append("    encryptionKeyName: ").append(toIndentedString(encryptionKeyName)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenizerType: ").append(toIndentedString(tokenizerType)).append("\n");
    sb.append("    tweakType: ").append(toIndentedString(tweakType)).append("\n");
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

