

# CreateAuthMethodGCP

createAuthMethodGCP is a command that creates a new auth method that will be able to authenticate using GCP IAM Service Account credentials or GCE instance credentials.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessExpires** | **Long** | Access expiration date in Unix timestamp (select 0 for access without expiry date) |  [optional]
**audience** | **String** | The audience to verify in the JWT received by the client |  [optional]
**boundIps** | **List&lt;String&gt;** | A CIDR whitelist of the IPs that the access is restricted to |  [optional]
**boundLabels** | **List&lt;String&gt;** | A comma-separated list of GCP labels formatted as \&quot;key:value\&quot; strings that must be set on authorized GCE instances. TODO: Because GCP labels are not currently ACL&#39;d .... |  [optional]
**boundProjects** | **List&lt;String&gt;** | &#x3D;&#x3D;&#x3D; Human and Machine authentication section &#x3D;&#x3D;&#x3D; Array of GCP project IDs. Only entities belonging to any of the provided projects can authenticate. |  [optional]
**boundRegions** | **List&lt;String&gt;** | List of regions that a GCE instance must belong to in order to be authenticated. TODO: If bound_instance_groups is provided, it is assumed to be a regional group and the group must belong to this region. If bound_zones are provided, this attribute is ignored. |  [optional]
**boundServiceAccounts** | **List&lt;String&gt;** | &#x3D;&#x3D;&#x3D; Human authentication section &#x3D;&#x3D;&#x3D; List of service accounts the service account must be part of in order to be authenticated. |  [optional]
**boundZones** | **List&lt;String&gt;** | &#x3D;&#x3D;&#x3D; Machine authentication section &#x3D;&#x3D;&#x3D; List of zones that a GCE instance must belong to in order to be authenticated. TODO: If bound_instance_groups is provided, it is assumed to be a zonal group and the group must belong to this zone. |  [optional]
**name** | **String** | Auth Method name | 
**serviceAccountData** | **String** | ServiceAccount credentials data instead of giving a file path, base64 encoded |  [optional]
**serviceAccountFile** | **String** | ServiceAccount credentials file path to be used by Akeyless to validate IAM (Human) and GCE (Machine) logins with GCP |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**type** | **String** | Type of the GCP Access Rules |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]


