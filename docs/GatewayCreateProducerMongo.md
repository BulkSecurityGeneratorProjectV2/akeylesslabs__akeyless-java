

# GatewayCreateProducerMongo

gatewayCreateProducerMongo is a command that creates either mongodb  producer or mongodb atlas producer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleteProtection** | **String** | Protection from accidental deletion of this item |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**mongodbAtlasApiPrivateKey** | **String** | MongoDB Atlas private key |  [optional]
**mongodbAtlasApiPublicKey** | **String** | MongoDB Atlas public key |  [optional]
**mongodbAtlasProjectId** | **String** | MongoDB Atlas project ID |  [optional]
**mongodbCustomData** | **String** | MongoDB custom data |  [optional]
**mongodbDefaultAuthDb** | **String** | MongoDB server default authentication database |  [optional]
**mongodbHostPort** | **String** | MongoDB server host and port |  [optional]
**mongodbName** | **String** | MongoDB Name |  [optional]
**mongodbPassword** | **String** | MongoDB server password. You will prompted to provide a password if it will not appear in CLI parameters |  [optional]
**mongodbRoles** | **String** | MongoDB Roles |  [optional]
**mongodbServerUri** | **String** | MongoDB server URI |  [optional]
**mongodbUriOptions** | **String** | MongoDB server URI options |  [optional]
**mongodbUsername** | **String** | MongoDB server username |  [optional]
**name** | **String** | Producer name | 
**producerEncryptionKeyName** | **String** | Encrypt producer with following key |  [optional]
**secureAccessBastionIssuer** | **String** |  |  [optional]
**secureAccessEnable** | **String** |  |  [optional]
**secureAccessHost** | **List&lt;String&gt;** |  |  [optional]
**secureAccessWeb** | **Boolean** |  |  [optional]
**tags** | **List&lt;String&gt;** | List of the tags attached to this secret |  [optional]
**targetName** | **String** | Target name |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]
**userTtl** | **String** | User TTL |  [optional]



