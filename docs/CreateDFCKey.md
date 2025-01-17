

# CreateDFCKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alg** | **String** | DFCKey type; options: [AES128GCM, AES256GCM, AES128SIV, AES256SIV, AES128CBC, AES256CBC, RSA1024, RSA2048, RSA3072, RSA4096] | 
**customerFrgId** | **String** | The customer fragment ID that will be used to create the DFC key (if empty, the key will be created independently of a customer fragment) |  [optional]
**deleteProtection** | **String** | Protection from accidental deletion of this item |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**metadata** | **String** | Metadata about the DFC key |  [optional]
**name** | **String** | DFCKey name | 
**splitLevel** | **Long** | The number of fragments that the item will be split into (not includes customer fragment) |  [optional]
**tag** | **List&lt;String&gt;** | List of the tags attached to this DFC key |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



