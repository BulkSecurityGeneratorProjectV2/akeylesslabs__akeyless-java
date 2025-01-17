

# GatewayUpdateK8SAuthConfig

gatewayUpdateK8SAuth is a command that updates k8s auth config
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessId** | **String** | The access ID of the Kubernetes auth method | 
**clusterApiType** | **String** | Cluster access type. options: [native_k8s, rancher] |  [optional]
**configEncryptionKeyName** | **String** | Config encryption key |  [optional]
**disableIssuerValidation** | **String** | Disable issuer validation |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**k8sCaCert** | **String** | The CA Certificate (base64 encoded) to use to call into the kubernetes API server |  [optional]
**k8sHost** | **String** | The URL of the kubernetes API server | 
**k8sIssuer** | **String** | The Kubernetes JWT issuer name. If not set, kubernetes/serviceaccount will use as an issuer. |  [optional]
**name** | **String** | K8S Auth config name | 
**newName** | **String** | K8S Auth config new name | 
**rancherApiKey** | **String** | The api key used to access the TokenReview API to validate other JWTs (relevant for \&quot;rancher\&quot; only) |  [optional]
**rancherClusterId** | **String** | The cluster id as define in rancher (relevant for \&quot;rancher\&quot; only) |  [optional]
**signingKey** | **String** | The private key (base64 encoded) associated with the public key defined in the Kubernetes auth | 
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**tokenExp** | **Long** | Time in seconds of expiration of the Akeyless Kube Auth Method token |  [optional]
**tokenReviewerJwt** | **String** | A Kubernetes service account JWT used to access the TokenReview API to validate other JWTs (relevant for \&quot;native_k8s\&quot; only). If not set, the JWT submitted in the authentication process will be used to access the Kubernetes TokenReview API. |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



