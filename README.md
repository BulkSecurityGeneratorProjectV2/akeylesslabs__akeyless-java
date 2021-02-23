## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.akeyless.client.ApiClient;
import io.akeyless.client.ApiException;
import io.akeyless.client.Configuration;
import io.akeyless.client.models.*;
import io.akeyless.client.api.V2Api;

public class Example {
    public static void main(String[] args) {
        ApiClient client = Configuration.getDefaultApiClient();
        // default: public API Gateway
        client.setBasePath("https://api.akeyless.io");

        // use port 8081 exposed by the deployment:
        // client.setBasePath("https://gateway.company.com:8081");

        // use port 8080 exposed by the deployment with /v2 prefix:
        // client.setBasePath("https://gateway.company.com:8080/v2");

        V2Api api = new V2Api(client);

        try {
            Configure configureBody = new Configure();
            configureBody.accessId("p-1234").accessKey("<redacted>");

            ConfigureOutput out;
            out = api.configure(configureBody);
            String token = out.getToken();
            System.out.println(token);

            ListItems listBody = new ListItems();
            listBody.setToken(token);
            ListItemsInPathOutput listOut = api.listItems(listBody);
            System.out.println(listOut.getItems().size());
        } catch (ApiException e) {
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```
## Documentation for API Endpoints

All URIs are relative to *https://api.akeyless.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*V2Api* | [**assocRoleAuthMethod**](docs/V2Api.md#assocRoleAuthMethod) | **POST** /assoc-role-am | 
*V2Api* | [**assocTargetItem**](docs/V2Api.md#assocTargetItem) | **POST** /assoc-target-item | 
*V2Api* | [**auth**](docs/V2Api.md#auth) | **POST** /auth | 
*V2Api* | [**configure**](docs/V2Api.md#configure) | **POST** /configure | 
*V2Api* | [**createAuthMethod**](docs/V2Api.md#createAuthMethod) | **POST** /create-auth-method | 
*V2Api* | [**createAuthMethodAWSIAM**](docs/V2Api.md#createAuthMethodAWSIAM) | **POST** /create-auth-method-aws-iam | 
*V2Api* | [**createAuthMethodAzureAD**](docs/V2Api.md#createAuthMethodAzureAD) | **POST** /create-auth-method-azure-ad | 
*V2Api* | [**createAuthMethodHuawei**](docs/V2Api.md#createAuthMethodHuawei) | **POST** /create-auth-method-huawei | 
*V2Api* | [**createAuthMethodOAuth2**](docs/V2Api.md#createAuthMethodOAuth2) | **POST** /create-auth-method-oauth2 | 
*V2Api* | [**createAuthMethodSAML**](docs/V2Api.md#createAuthMethodSAML) | **POST** /create-auth-method-saml | 
*V2Api* | [**createAuthMethodUniversalIdentity**](docs/V2Api.md#createAuthMethodUniversalIdentity) | **POST** /create-auth-method-universal-identity | 
*V2Api* | [**createAwsTarget**](docs/V2Api.md#createAwsTarget) | **POST** /create-aws-target | 
*V2Api* | [**createDBTarget**](docs/V2Api.md#createDBTarget) | **POST** /create-db-target | 
*V2Api* | [**createDynamicSecret**](docs/V2Api.md#createDynamicSecret) | **POST** /create-dynamic-secret | 
*V2Api* | [**createKey**](docs/V2Api.md#createKey) | **POST** /create-key | 
*V2Api* | [**createPKICertIssuer**](docs/V2Api.md#createPKICertIssuer) | **POST** /create-pki-cert-issuer | 
*V2Api* | [**createRabbitMQTarget**](docs/V2Api.md#createRabbitMQTarget) | **POST** /create-rabbitMQ-target | 
*V2Api* | [**createRdpTarget**](docs/V2Api.md#createRdpTarget) | **POST** /create-rdp-target | 
*V2Api* | [**createRole**](docs/V2Api.md#createRole) | **POST** /create-role | 
*V2Api* | [**createSSHCertIssuer**](docs/V2Api.md#createSSHCertIssuer) | **POST** /create-ssh-cert-issuer | 
*V2Api* | [**createSSHTarget**](docs/V2Api.md#createSSHTarget) | **POST** /create-ssh-target | 
*V2Api* | [**createSecret**](docs/V2Api.md#createSecret) | **POST** /create-secret | 
*V2Api* | [**createTarget**](docs/V2Api.md#createTarget) | **POST** /create-target | 
*V2Api* | [**createWebTarget**](docs/V2Api.md#createWebTarget) | **POST** /create-web-target | 
*V2Api* | [**decrypt**](docs/V2Api.md#decrypt) | **POST** /decrypt | 
*V2Api* | [**decryptPKCS1**](docs/V2Api.md#decryptPKCS1) | **POST** /decrypt-pkcs1 | 
*V2Api* | [**deleteAuthMethod**](docs/V2Api.md#deleteAuthMethod) | **POST** /delete-auth-method | 
*V2Api* | [**deleteAuthMethods**](docs/V2Api.md#deleteAuthMethods) | **POST** /delete-auth-methods | 
*V2Api* | [**deleteItem**](docs/V2Api.md#deleteItem) | **POST** /delete-item | 
*V2Api* | [**deleteItems**](docs/V2Api.md#deleteItems) | **POST** /delete-items | 
*V2Api* | [**deleteRole**](docs/V2Api.md#deleteRole) | **POST** /delete-role | 
*V2Api* | [**deleteRoleAssociation**](docs/V2Api.md#deleteRoleAssociation) | **POST** /delete-assoc | 
*V2Api* | [**deleteRoleRule**](docs/V2Api.md#deleteRoleRule) | **POST** /delete-role-rule | 
*V2Api* | [**deleteRoles**](docs/V2Api.md#deleteRoles) | **POST** /delete-roles | 
*V2Api* | [**deleteTarget**](docs/V2Api.md#deleteTarget) | **POST** /delete-target | 
*V2Api* | [**deleteTargetAssociation**](docs/V2Api.md#deleteTargetAssociation) | **POST** /delete-assoc-target-item | 
*V2Api* | [**deleteTargets**](docs/V2Api.md#deleteTargets) | **POST** /delete-targets | 
*V2Api* | [**describeItem**](docs/V2Api.md#describeItem) | **POST** /describe-item | 
*V2Api* | [**encrypt**](docs/V2Api.md#encrypt) | **POST** /encrypt | 
*V2Api* | [**encryptPKCS1**](docs/V2Api.md#encryptPKCS1) | **POST** /encrypt-pkcs1 | 
*V2Api* | [**gatewayAddSubAdmins**](docs/V2Api.md#gatewayAddSubAdmins) | **POST** /gateway-add-sub-admins | 
*V2Api* | [**gatewayCreateProducerArtifactory**](docs/V2Api.md#gatewayCreateProducerArtifactory) | **POST** /gateway-create-producer-artifactory | 
*V2Api* | [**gatewayCreateProducerAws**](docs/V2Api.md#gatewayCreateProducerAws) | **POST** /gateway-create-producer-aws | 
*V2Api* | [**gatewayCreateProducerAzure**](docs/V2Api.md#gatewayCreateProducerAzure) | **POST** /gateway-create-producer-azure | 
*V2Api* | [**gatewayCreateProducerEks**](docs/V2Api.md#gatewayCreateProducerEks) | **POST** /gateway-create-producer-eks | 
*V2Api* | [**gatewayCreateProducerGke**](docs/V2Api.md#gatewayCreateProducerGke) | **POST** /gateway-create-producer-gke | 
*V2Api* | [**gatewayCreateProducerMSSQL**](docs/V2Api.md#gatewayCreateProducerMSSQL) | **POST** /gateway-create-producer-mssql | 
*V2Api* | [**gatewayCreateProducerMongo**](docs/V2Api.md#gatewayCreateProducerMongo) | **POST** /gateway-create-producer-mongo | 
*V2Api* | [**gatewayCreateProducerMySQL**](docs/V2Api.md#gatewayCreateProducerMySQL) | **POST** /gateway-create-producer-mysql | 
*V2Api* | [**gatewayCreateProducerPostgreSQL**](docs/V2Api.md#gatewayCreateProducerPostgreSQL) | **POST** /gateway-create-producer-postgresql | 
*V2Api* | [**gatewayCreateProducerRabbitMQ**](docs/V2Api.md#gatewayCreateProducerRabbitMQ) | **POST** /gateway-create-producer-rabbitmq | 
*V2Api* | [**gatewayCreateProducerRdp**](docs/V2Api.md#gatewayCreateProducerRdp) | **POST** /gateway-create-producer-rdp | 
*V2Api* | [**gatewayCreateProducerVenafi**](docs/V2Api.md#gatewayCreateProducerVenafi) | **POST** /gateway-create-producer-venafi | 
*V2Api* | [**gatewayDeleteProducer**](docs/V2Api.md#gatewayDeleteProducer) | **POST** /gateway-delete-producer | 
*V2Api* | [**gatewayDeleteSubAdmins**](docs/V2Api.md#gatewayDeleteSubAdmins) | **POST** /gateway-delete-sub-admins | 
*V2Api* | [**gatewayGetConfig**](docs/V2Api.md#gatewayGetConfig) | **POST** /gateway-get-config | 
*V2Api* | [**gatewayGetProducer**](docs/V2Api.md#gatewayGetProducer) | **POST** /gateway-get-producer | 
*V2Api* | [**gatewayGetTmpUsers**](docs/V2Api.md#gatewayGetTmpUsers) | **POST** /gateway-get-producer-tmp-creds | 
*V2Api* | [**gatewayListProducers**](docs/V2Api.md#gatewayListProducers) | **POST** /gateway-list-producers | 
*V2Api* | [**gatewayListSubAdmins**](docs/V2Api.md#gatewayListSubAdmins) | **POST** /gateway-list-SubAdmins | 
*V2Api* | [**gatewayRevokeTmpUsers**](docs/V2Api.md#gatewayRevokeTmpUsers) | **POST** /gateway-revoke-producer-tmp-creds | 
*V2Api* | [**gatewayStartProducer**](docs/V2Api.md#gatewayStartProducer) | **POST** /gateway-start-producer | 
*V2Api* | [**gatewayStopProducer**](docs/V2Api.md#gatewayStopProducer) | **POST** /gateway-stop-producer | 
*V2Api* | [**gatewayUpdateTmpUsers**](docs/V2Api.md#gatewayUpdateTmpUsers) | **POST** /gateway-update-producer-tmp-creds | 
*V2Api* | [**getAccountLogo**](docs/V2Api.md#getAccountLogo) | **POST** /get-account-logo | 
*V2Api* | [**getAuthMethod**](docs/V2Api.md#getAuthMethod) | **POST** /get-auth-method | 
*V2Api* | [**getDynamicPkiCertificate**](docs/V2Api.md#getDynamicPkiCertificate) | **POST** /get-dynamic-pki-certificate | 
*V2Api* | [**getDynamicSecretValue**](docs/V2Api.md#getDynamicSecretValue) | **POST** /get-dynamic-secret-value | 
*V2Api* | [**getRSAPublic**](docs/V2Api.md#getRSAPublic) | **POST** /get-rsa-public | 
*V2Api* | [**getRole**](docs/V2Api.md#getRole) | **POST** /get-role | 
*V2Api* | [**getSSHCertificate**](docs/V2Api.md#getSSHCertificate) | **POST** /get-ssh-certificate | 
*V2Api* | [**getSecretValue**](docs/V2Api.md#getSecretValue) | **POST** /get-secret-value | 
*V2Api* | [**getTarget**](docs/V2Api.md#getTarget) | **POST** /get-target | 
*V2Api* | [**getTargetDetails**](docs/V2Api.md#getTargetDetails) | **POST** /get-target-details | 
*V2Api* | [**listAuthMethods**](docs/V2Api.md#listAuthMethods) | **POST** /list-auth-methods | 
*V2Api* | [**listItems**](docs/V2Api.md#listItems) | **POST** /list-items | 
*V2Api* | [**listRoles**](docs/V2Api.md#listRoles) | **POST** /list-roles | 
*V2Api* | [**listTargets**](docs/V2Api.md#listTargets) | **POST** /list-targets | 
*V2Api* | [**moveObjects**](docs/V2Api.md#moveObjects) | **POST** /move-objects | 
*V2Api* | [**rawCreds**](docs/V2Api.md#rawCreds) | **POST** /raw-creds | 
*V2Api* | [**refreshKey**](docs/V2Api.md#refreshKey) | **POST** /refresh-key | 
*V2Api* | [**reverseRBAC**](docs/V2Api.md#reverseRBAC) | **POST** /reverse-rbac | 
*V2Api* | [**rollbackSecret**](docs/V2Api.md#rollbackSecret) | **POST** /rollback-secret | 
*V2Api* | [**rotateKey**](docs/V2Api.md#rotateKey) | **POST** /rotate-key | 
*V2Api* | [**setItemState**](docs/V2Api.md#setItemState) | **POST** /set-item-state | 
*V2Api* | [**setRoleRule**](docs/V2Api.md#setRoleRule) | **POST** /set-role-rule | 
*V2Api* | [**signPKCS1**](docs/V2Api.md#signPKCS1) | **POST** /sign-pkcs1 | 
*V2Api* | [**staticCredsAuth**](docs/V2Api.md#staticCredsAuth) | **POST** /static-creds-auth | 
*V2Api* | [**uidCreateChildToken**](docs/V2Api.md#uidCreateChildToken) | **POST** /uid-create-child-token | 
*V2Api* | [**uidGenerateToken**](docs/V2Api.md#uidGenerateToken) | **POST** /uid-generate-token | 
*V2Api* | [**uidListChildren**](docs/V2Api.md#uidListChildren) | **POST** /uid-list-children | 
*V2Api* | [**uidRevokeToken**](docs/V2Api.md#uidRevokeToken) | **POST** /uid-revoke-token | 
*V2Api* | [**uidRotateToken**](docs/V2Api.md#uidRotateToken) | **POST** /uid-rotate-token | 
*V2Api* | [**updateAWSTargetDetails**](docs/V2Api.md#updateAWSTargetDetails) | **POST** /update-aws-target-details | 
*V2Api* | [**updateDBTargetDetails**](docs/V2Api.md#updateDBTargetDetails) | **POST** /update-db-target-details | 
*V2Api* | [**updateItem**](docs/V2Api.md#updateItem) | **POST** /update-item | 
*V2Api* | [**updateRDPTargetDetails**](docs/V2Api.md#updateRDPTargetDetails) | **POST** /update-rdp-target-details | 
*V2Api* | [**updateRabbitMQTargetDetails**](docs/V2Api.md#updateRabbitMQTargetDetails) | **POST** /update-rabbitmq-target-details | 
*V2Api* | [**updateRole**](docs/V2Api.md#updateRole) | **POST** /update-role | 
*V2Api* | [**updateSSHTargetDetails**](docs/V2Api.md#updateSSHTargetDetails) | **POST** /update-ssh-target-details | 
*V2Api* | [**updateSecretVal**](docs/V2Api.md#updateSecretVal) | **POST** /update-secret-val | 
*V2Api* | [**updateTarget**](docs/V2Api.md#updateTarget) | **POST** /update-target | 
*V2Api* | [**updateTargetDetails**](docs/V2Api.md#updateTargetDetails) | **POST** /update-target-details | 
*V2Api* | [**updateWebTargetDetails**](docs/V2Api.md#updateWebTargetDetails) | **POST** /update-web-target-details | 
*V2Api* | [**uploadRSA**](docs/V2Api.md#uploadRSA) | **POST** /upload-rsa | 
*V2Api* | [**verifyPKCS1**](docs/V2Api.md#verifyPKCS1) | **POST** /verify-pkcs1 | 


## Documentation for Models

 - [APIKeyAccessRules](docs/APIKeyAccessRules.md)
 - [AWSIAMAccessRules](docs/AWSIAMAccessRules.md)
 - [AWSPayload](docs/AWSPayload.md)
 - [AWSSecretsMigration](docs/AWSSecretsMigration.md)
 - [AdminsConfigPart](docs/AdminsConfigPart.md)
 - [AkeylessGatewayConfig](docs/AkeylessGatewayConfig.md)
 - [AssocRoleAuthMethod](docs/AssocRoleAuthMethod.md)
 - [AssocTargetItem](docs/AssocTargetItem.md)
 - [Auth](docs/Auth.md)
 - [AuthMethod](docs/AuthMethod.md)
 - [AuthMethodAccessInfo](docs/AuthMethodAccessInfo.md)
 - [AuthMethodRoleAssociation](docs/AuthMethodRoleAssociation.md)
 - [AuthOutput](docs/AuthOutput.md)
 - [AzureADAccessRules](docs/AzureADAccessRules.md)
 - [AzureKeyVaultMigration](docs/AzureKeyVaultMigration.md)
 - [AzurePayload](docs/AzurePayload.md)
 - [CFConfigPart](docs/CFConfigPart.md)
 - [CacheConfigPart](docs/CacheConfigPart.md)
 - [CertificateIssueInfo](docs/CertificateIssueInfo.md)
 - [ClientData](docs/ClientData.md)
 - [Configure](docs/Configure.md)
 - [ConfigureOutput](docs/ConfigureOutput.md)
 - [CreateAuthMethod](docs/CreateAuthMethod.md)
 - [CreateAuthMethodAWSIAM](docs/CreateAuthMethodAWSIAM.md)
 - [CreateAuthMethodAWSIAMOutput](docs/CreateAuthMethodAWSIAMOutput.md)
 - [CreateAuthMethodAzureAD](docs/CreateAuthMethodAzureAD.md)
 - [CreateAuthMethodAzureADOutput](docs/CreateAuthMethodAzureADOutput.md)
 - [CreateAuthMethodHuawei](docs/CreateAuthMethodHuawei.md)
 - [CreateAuthMethodHuaweiOutput](docs/CreateAuthMethodHuaweiOutput.md)
 - [CreateAuthMethodLDAP](docs/CreateAuthMethodLDAP.md)
 - [CreateAuthMethodLDAPOutput](docs/CreateAuthMethodLDAPOutput.md)
 - [CreateAuthMethodOAuth2](docs/CreateAuthMethodOAuth2.md)
 - [CreateAuthMethodOAuth2Output](docs/CreateAuthMethodOAuth2Output.md)
 - [CreateAuthMethodOutput](docs/CreateAuthMethodOutput.md)
 - [CreateAuthMethodSAML](docs/CreateAuthMethodSAML.md)
 - [CreateAuthMethodSAMLOutput](docs/CreateAuthMethodSAMLOutput.md)
 - [CreateAuthMethodUniversalIdentity](docs/CreateAuthMethodUniversalIdentity.md)
 - [CreateAuthMethodUniversalIdentityOutput](docs/CreateAuthMethodUniversalIdentityOutput.md)
 - [CreateAwsTarget](docs/CreateAwsTarget.md)
 - [CreateDBTarget](docs/CreateDBTarget.md)
 - [CreateDynamicSecret](docs/CreateDynamicSecret.md)
 - [CreateKey](docs/CreateKey.md)
 - [CreateKeyOutput](docs/CreateKeyOutput.md)
 - [CreatePKICertIssuer](docs/CreatePKICertIssuer.md)
 - [CreatePKICertIssuerOutput](docs/CreatePKICertIssuerOutput.md)
 - [CreateRabbitMQTarget](docs/CreateRabbitMQTarget.md)
 - [CreateRdpTarget](docs/CreateRdpTarget.md)
 - [CreateRole](docs/CreateRole.md)
 - [CreateRoleAuthMethodAssocOutput](docs/CreateRoleAuthMethodAssocOutput.md)
 - [CreateSSHCertIssuer](docs/CreateSSHCertIssuer.md)
 - [CreateSSHCertIssuerOutput](docs/CreateSSHCertIssuerOutput.md)
 - [CreateSSHTarget](docs/CreateSSHTarget.md)
 - [CreateSecret](docs/CreateSecret.md)
 - [CreateSecretOutput](docs/CreateSecretOutput.md)
 - [CreateTargetItemAssocOutput](docs/CreateTargetItemAssocOutput.md)
 - [CreateWebTarget](docs/CreateWebTarget.md)
 - [CustomerFragment](docs/CustomerFragment.md)
 - [CustomerFragmentsJson](docs/CustomerFragmentsJson.md)
 - [DSProducerDetails](docs/DSProducerDetails.md)
 - [Decrypt](docs/Decrypt.md)
 - [DecryptFile](docs/DecryptFile.md)
 - [DecryptFileOutput](docs/DecryptFileOutput.md)
 - [DecryptOutput](docs/DecryptOutput.md)
 - [DecryptPKCS1](docs/DecryptPKCS1.md)
 - [DecryptPKCS1Output](docs/DecryptPKCS1Output.md)
 - [DefaultConfigPart](docs/DefaultConfigPart.md)
 - [DeleteAuthMethod](docs/DeleteAuthMethod.md)
 - [DeleteAuthMethodOutput](docs/DeleteAuthMethodOutput.md)
 - [DeleteAuthMethods](docs/DeleteAuthMethods.md)
 - [DeleteAuthMethodsOutput](docs/DeleteAuthMethodsOutput.md)
 - [DeleteItem](docs/DeleteItem.md)
 - [DeleteItemOutput](docs/DeleteItemOutput.md)
 - [DeleteItems](docs/DeleteItems.md)
 - [DeleteItemsOutput](docs/DeleteItemsOutput.md)
 - [DeleteRole](docs/DeleteRole.md)
 - [DeleteRoleAssociation](docs/DeleteRoleAssociation.md)
 - [DeleteRoleRule](docs/DeleteRoleRule.md)
 - [DeleteRoleRuleOutput](docs/DeleteRoleRuleOutput.md)
 - [DeleteRoles](docs/DeleteRoles.md)
 - [DeleteTarget](docs/DeleteTarget.md)
 - [DeleteTargetAssociation](docs/DeleteTargetAssociation.md)
 - [DeleteTargets](docs/DeleteTargets.md)
 - [DescribeItem](docs/DescribeItem.md)
 - [DynamicSecretProducerInfo](docs/DynamicSecretProducerInfo.md)
 - [ElasticsearchLogForwardingConfig](docs/ElasticsearchLogForwardingConfig.md)
 - [EmailPassAccessRules](docs/EmailPassAccessRules.md)
 - [Encrypt](docs/Encrypt.md)
 - [EncryptFile](docs/EncryptFile.md)
 - [EncryptFileOutput](docs/EncryptFileOutput.md)
 - [EncryptOutput](docs/EncryptOutput.md)
 - [EncryptPKCS1](docs/EncryptPKCS1.md)
 - [EncryptPKCS1Output](docs/EncryptPKCS1Output.md)
 - [GatewayAddSubAdmins](docs/GatewayAddSubAdmins.md)
 - [GatewayAddSubAdminsOutput](docs/GatewayAddSubAdminsOutput.md)
 - [GatewayCreateProducerArtifactory](docs/GatewayCreateProducerArtifactory.md)
 - [GatewayCreateProducerArtifactoryOutput](docs/GatewayCreateProducerArtifactoryOutput.md)
 - [GatewayCreateProducerAws](docs/GatewayCreateProducerAws.md)
 - [GatewayCreateProducerAwsOutput](docs/GatewayCreateProducerAwsOutput.md)
 - [GatewayCreateProducerAzure](docs/GatewayCreateProducerAzure.md)
 - [GatewayCreateProducerAzureOutput](docs/GatewayCreateProducerAzureOutput.md)
 - [GatewayCreateProducerEks](docs/GatewayCreateProducerEks.md)
 - [GatewayCreateProducerEksOutput](docs/GatewayCreateProducerEksOutput.md)
 - [GatewayCreateProducerGke](docs/GatewayCreateProducerGke.md)
 - [GatewayCreateProducerGkeOutput](docs/GatewayCreateProducerGkeOutput.md)
 - [GatewayCreateProducerMSSQL](docs/GatewayCreateProducerMSSQL.md)
 - [GatewayCreateProducerMSSQLOutput](docs/GatewayCreateProducerMSSQLOutput.md)
 - [GatewayCreateProducerMongo](docs/GatewayCreateProducerMongo.md)
 - [GatewayCreateProducerMongoOutput](docs/GatewayCreateProducerMongoOutput.md)
 - [GatewayCreateProducerMySQL](docs/GatewayCreateProducerMySQL.md)
 - [GatewayCreateProducerMySQLOutput](docs/GatewayCreateProducerMySQLOutput.md)
 - [GatewayCreateProducerPostgreSQL](docs/GatewayCreateProducerPostgreSQL.md)
 - [GatewayCreateProducerPostgreSQLOutput](docs/GatewayCreateProducerPostgreSQLOutput.md)
 - [GatewayCreateProducerRabbitMQ](docs/GatewayCreateProducerRabbitMQ.md)
 - [GatewayCreateProducerRabbitMQOutput](docs/GatewayCreateProducerRabbitMQOutput.md)
 - [GatewayCreateProducerRdp](docs/GatewayCreateProducerRdp.md)
 - [GatewayCreateProducerRdpOutput](docs/GatewayCreateProducerRdpOutput.md)
 - [GatewayDeleteProducer](docs/GatewayDeleteProducer.md)
 - [GatewayDeleteProducerOutput](docs/GatewayDeleteProducerOutput.md)
 - [GatewayDeleteSubAdmins](docs/GatewayDeleteSubAdmins.md)
 - [GatewayDeleteSubAdminsOutput](docs/GatewayDeleteSubAdminsOutput.md)
 - [GatewayGetConfig](docs/GatewayGetConfig.md)
 - [GatewayGetProducer](docs/GatewayGetProducer.md)
 - [GatewayGetTmpUsers](docs/GatewayGetTmpUsers.md)
 - [GatewayListProducers](docs/GatewayListProducers.md)
 - [GatewayListSubAdmins](docs/GatewayListSubAdmins.md)
 - [GatewayRevokeTmpUsers](docs/GatewayRevokeTmpUsers.md)
 - [GatewayStartProducer](docs/GatewayStartProducer.md)
 - [GatewayStartProducerOutput](docs/GatewayStartProducerOutput.md)
 - [GatewayStopProducer](docs/GatewayStopProducer.md)
 - [GatewayStopProducerOutput](docs/GatewayStopProducerOutput.md)
 - [GatewayUpdateTmpUsers](docs/GatewayUpdateTmpUsers.md)
 - [GenCustomerFragment](docs/GenCustomerFragment.md)
 - [GeneralConfigPart](docs/GeneralConfigPart.md)
 - [GetAuthMethod](docs/GetAuthMethod.md)
 - [GetCloudIdentity](docs/GetCloudIdentity.md)
 - [GetCloudIdentityOutput](docs/GetCloudIdentityOutput.md)
 - [GetDynamicSecretValue](docs/GetDynamicSecretValue.md)
 - [GetKubeExecCreds](docs/GetKubeExecCreds.md)
 - [GetKubeExecCredsOutput](docs/GetKubeExecCredsOutput.md)
 - [GetPKICertificate](docs/GetPKICertificate.md)
 - [GetPKICertificateOutput](docs/GetPKICertificateOutput.md)
 - [GetProducersListReplyObj](docs/GetProducersListReplyObj.md)
 - [GetRSAPublic](docs/GetRSAPublic.md)
 - [GetRSAPublicOutput](docs/GetRSAPublicOutput.md)
 - [GetRole](docs/GetRole.md)
 - [GetSSHCertificate](docs/GetSSHCertificate.md)
 - [GetSSHCertificateOutput](docs/GetSSHCertificateOutput.md)
 - [GetSecretValue](docs/GetSecretValue.md)
 - [GetSubAdminsListReplyObj](docs/GetSubAdminsListReplyObj.md)
 - [GetTarget](docs/GetTarget.md)
 - [GetTargetDetails](docs/GetTargetDetails.md)
 - [GetTargetDetailsOutput](docs/GetTargetDetailsOutput.md)
 - [HashiMigration](docs/HashiMigration.md)
 - [HashiPayload](docs/HashiPayload.md)
 - [HuaweiAccessRules](docs/HuaweiAccessRules.md)
 - [Item](docs/Item.md)
 - [ItemGeneralInfo](docs/ItemGeneralInfo.md)
 - [ItemTargetAssociation](docs/ItemTargetAssociation.md)
 - [ItemVersion](docs/ItemVersion.md)
 - [JSONError](docs/JSONError.md)
 - [K8SMigration](docs/K8SMigration.md)
 - [K8SPayload](docs/K8SPayload.md)
 - [LDAPAccessRules](docs/LDAPAccessRules.md)
 - [LdapConfigPart](docs/LdapConfigPart.md)
 - [LeadershipConfigPart](docs/LeadershipConfigPart.md)
 - [ListAuthMethods](docs/ListAuthMethods.md)
 - [ListAuthMethodsOutput](docs/ListAuthMethodsOutput.md)
 - [ListItems](docs/ListItems.md)
 - [ListItemsInPathOutput](docs/ListItemsInPathOutput.md)
 - [ListRoles](docs/ListRoles.md)
 - [ListRolesOutput](docs/ListRolesOutput.md)
 - [ListTargets](docs/ListTargets.md)
 - [ListTargetsOutput](docs/ListTargetsOutput.md)
 - [LogForwardingConfigPart](docs/LogForwardingConfigPart.md)
 - [LogstashLogForwardingConfig](docs/LogstashLogForwardingConfig.md)
 - [LogzIoLogForwardingConfig](docs/LogzIoLogForwardingConfig.md)
 - [MigrationGeneral](docs/MigrationGeneral.md)
 - [MigrationsConfigPart](docs/MigrationsConfigPart.md)
 - [MoveObjects](docs/MoveObjects.md)
 - [OAuth2AccessRules](docs/OAuth2AccessRules.md)
 - [OAuth2CustomClaim](docs/OAuth2CustomClaim.md)
 - [PKICertificateIssueDetails](docs/PKICertificateIssueDetails.md)
 - [PathRule](docs/PathRule.md)
 - [Producer](docs/Producer.md)
 - [ProducersConfigPart](docs/ProducersConfigPart.md)
 - [RawCreds](docs/RawCreds.md)
 - [RefreshKey](docs/RefreshKey.md)
 - [RefreshKeyOutput](docs/RefreshKeyOutput.md)
 - [ReverseRBAC](docs/ReverseRBAC.md)
 - [ReverseRBACClient](docs/ReverseRBACClient.md)
 - [ReverseRBACOutput](docs/ReverseRBACOutput.md)
 - [Role](docs/Role.md)
 - [RoleAuthMethodAssociation](docs/RoleAuthMethodAssociation.md)
 - [RollbackSecret](docs/RollbackSecret.md)
 - [RollbackSecretOutput](docs/RollbackSecretOutput.md)
 - [RotateKey](docs/RotateKey.md)
 - [RotateKeyOutput](docs/RotateKeyOutput.md)
 - [Rules](docs/Rules.md)
 - [SAMLAccessRules](docs/SAMLAccessRules.md)
 - [SAMLAttribute](docs/SAMLAttribute.md)
 - [SSHCertificateIssueDetails](docs/SSHCertificateIssueDetails.md)
 - [SetItemState](docs/SetItemState.md)
 - [SetRoleRule](docs/SetRoleRule.md)
 - [SignPKCS1](docs/SignPKCS1.md)
 - [SignPKCS1Output](docs/SignPKCS1Output.md)
 - [SplunkLogForwardingConfig](docs/SplunkLogForwardingConfig.md)
 - [StaticCredsAuth](docs/StaticCredsAuth.md)
 - [StaticCredsAuthOutput](docs/StaticCredsAuthOutput.md)
 - [SyslogLogForwardingConfig](docs/SyslogLogForwardingConfig.md)
 - [SystemAccessCredentialsReplyObj](docs/SystemAccessCredentialsReplyObj.md)
 - [Target](docs/Target.md)
 - [TargetItemAssociation](docs/TargetItemAssociation.md)
 - [TargetTypeDetailesInput](docs/TargetTypeDetailesInput.md)
 - [TmpUserData](docs/TmpUserData.md)
 - [UIDTokenDetails](docs/UIDTokenDetails.md)
 - [UIdentityConfigPart](docs/UIdentityConfigPart.md)
 - [UidCreateChildToken](docs/UidCreateChildToken.md)
 - [UidCreateChildTokenOutput](docs/UidCreateChildTokenOutput.md)
 - [UidGenerateToken](docs/UidGenerateToken.md)
 - [UidGenerateTokenOutput](docs/UidGenerateTokenOutput.md)
 - [UidListChildren](docs/UidListChildren.md)
 - [UidRevokeToken](docs/UidRevokeToken.md)
 - [UidRotateToken](docs/UidRotateToken.md)
 - [UidRotateTokenOutput](docs/UidRotateTokenOutput.md)
 - [Unconfigure](docs/Unconfigure.md)
 - [UniversalIdentityAccessRules](docs/UniversalIdentityAccessRules.md)
 - [UniversalIdentityDetails](docs/UniversalIdentityDetails.md)
 - [UpdateAWSTargetDetails](docs/UpdateAWSTargetDetails.md)
 - [UpdateDBTargetDetails](docs/UpdateDBTargetDetails.md)
 - [UpdateItem](docs/UpdateItem.md)
 - [UpdateItemOutput](docs/UpdateItemOutput.md)
 - [UpdateOutput](docs/UpdateOutput.md)
 - [UpdateRDPTargetDetails](docs/UpdateRDPTargetDetails.md)
 - [UpdateRabbitMQTargetDetails](docs/UpdateRabbitMQTargetDetails.md)
 - [UpdateRole](docs/UpdateRole.md)
 - [UpdateRoleOutput](docs/UpdateRoleOutput.md)
 - [UpdateSSHTargetDetails](docs/UpdateSSHTargetDetails.md)
 - [UpdateSecretVal](docs/UpdateSecretVal.md)
 - [UpdateSecretValOutput](docs/UpdateSecretValOutput.md)
 - [UpdateTarget](docs/UpdateTarget.md)
 - [UpdateTargetDetailsOutput](docs/UpdateTargetDetailsOutput.md)
 - [UpdateTargetOutput](docs/UpdateTargetOutput.md)
 - [UpdateWebTargetDetails](docs/UpdateWebTargetDetails.md)
 - [UploadPKCS12](docs/UploadPKCS12.md)
 - [UploadRSA](docs/UploadRSA.md)
 - [VerifyPKCS1](docs/VerifyPKCS1.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@akeyless.io

