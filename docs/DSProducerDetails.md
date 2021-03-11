

# DSProducerDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** |  |  [optional]
**adminName** | **String** |  |  [optional]
**adminPwd** | **String** |  |  [optional]
**adminRotationIntervalDays** | **Long** |  |  [optional]
**allowSubdomains** | **Boolean** |  |  [optional]
**allowedDomains** | **String** |  |  [optional]
**artifactoryAdminApikey** | **String** |  |  [optional]
**artifactoryAdminUsername** | **String** |  |  [optional]
**artifactoryBaseUrl** | **String** |  |  [optional]
**artifactoryTokenAudience** | **String** |  |  [optional]
**artifactoryTokenScope** | **String** |  |  [optional]
**autoGeneratedFolder** | **String** |  |  [optional]
**awsAccessKeyId** | **String** |  |  [optional]
**awsAccessMode** | **String** |  |  [optional]
**awsRegion** | **String** |  |  [optional]
**awsRoleArns** | **String** |  |  [optional]
**awsSecretAccessKey** | **String** |  |  [optional]
**awsSessionToken** | **String** |  |  [optional]
**awsUserConsoleAccess** | **Boolean** |  |  [optional]
**awsUserGroups** | **String** |  |  [optional]
**awsUserPolicies** | **String** |  |  [optional]
**awsUserProgrammaticAccess** | **Boolean** |  |  [optional]
**azureAppObjectId** | **String** |  |  [optional]
**azureClientId** | **String** |  |  [optional]
**azureClientSecret** | **String** |  |  [optional]
**azureTenantId** | **String** |  |  [optional]
**azureUserGroupsObjId** | **String** |  |  [optional]
**azureUserPortalAccess** | **Boolean** |  |  [optional]
**azureUserProgrammaticAccess** | **Boolean** |  |  [optional]
**azureUserRolesTemplateId** | **String** |  |  [optional]
**chefOrganizations** | **String** |  |  [optional]
**chefServerAccessMode** | **String** |  |  [optional]
**chefServerHostName** | **String** |  |  [optional]
**chefServerKey** | **String** |  |  [optional]
**chefServerPort** | **String** |  |  [optional]
**chefServerUrl** | **String** |  |  [optional]
**chefServerUsername** | **String** |  |  [optional]
**chefSkipSsl** | **Boolean** |  |  [optional]
**createCertUsingPki** | **Boolean** |  |  [optional]
**dbHostName** | **String** |  |  [optional]
**dbIsolationLevel** | **String** |  |  [optional]
**dbMaxIdleConns** | **String** |  |  [optional]
**dbMaxOpenConns** | **String** |  |  [optional]
**dbName** | **String** |  |  [optional]
**dbPort** | **String** |  |  [optional]
**dbPwd** | **String** |  |  [optional]
**dbServerCertificates** | **String** | (Optional) DBServerCertificates defines the set of root certificate authorities that clients use when verifying server certificates. If DBServerCertificates is empty, TLS uses the host&#39;s root CA set. |  [optional]
**dbServerName** | **String** | (Optional) ServerName is used to verify the hostname on the returned certificates unless InsecureSkipVerify is given. It is also included in the client&#39;s handshake to support virtual hosting unless it is an IP address. |  [optional]
**dbUserName** | **String** |  |  [optional]
**dynamicSecretId** | **Long** |  |  [optional]
**dynamicSecretKey** | **String** |  |  [optional]
**dynamicSecretName** | **String** |  |  [optional]
**dynamicSecretType** | **String** |  |  [optional]
**eksAccessKeyId** | **String** |  |  [optional]
**eksAssumeRole** | **String** |  |  [optional]
**eksClusterCaCertificate** | **String** |  |  [optional]
**eksClusterEndpoint** | **String** |  |  [optional]
**eksClusterName** | **String** |  |  [optional]
**eksRegion** | **String** |  |  [optional]
**eksSecretAccessKey** | **String** |  |  [optional]
**enableAdminRotation** | **Boolean** |  |  [optional]
**failureMessage** | **String** |  |  [optional]
**fixedUserOnly** | **String** |  |  [optional]
**gkeClusterCaCertificate** | **String** |  |  [optional]
**gkeClusterComputeZone** | **String** |  |  [optional]
**gkeClusterEndpoint** | **String** |  |  [optional]
**gkeClusterName** | **String** |  |  [optional]
**gkeProjectId** | **String** |  |  [optional]
**gkeServiceAccountKey** | **String** |  |  [optional]
**gkeServiceAccountName** | **String** |  |  [optional]
**groups** | **String** |  |  [optional]
**hostName** | **String** |  |  [optional]
**hostPort** | **String** |  |  [optional]
**lastAdminRotation** | **Long** |  |  [optional]
**mongodbAtlasApiPrivateKey** | **String** |  |  [optional]
**mongodbAtlasApiPublicKey** | **String** |  |  [optional]
**mongodbAtlasProjectId** | **String** | mongodb atlas fields |  [optional]
**mongodbDbName** | **String** | common fields |  [optional]
**mongodbDefaultAuthDb** | **String** |  |  [optional]
**mongodbHostPort** | **String** |  |  [optional]
**mongodbIsAtlas** | **Boolean** |  |  [optional]
**mongodbPassword** | **String** |  |  [optional]
**mongodbRoles** | **String** |  |  [optional]
**mongodbUriConnection** | **String** | mongodb fields |  [optional]
**mongodbUriOptions** | **String** |  |  [optional]
**mongodbUsername** | **String** |  |  [optional]
**mssqlCreationStatements** | **String** |  |  [optional]
**mssqlRevocationStatements** | **String** |  |  [optional]
**mysqlCreationStatements** | **String** |  |  [optional]
**postgresCreationStatements** | **String** |  |  [optional]
**rabbitmqServerPassword** | **String** |  |  [optional]
**rabbitmqServerUri** | **String** |  |  [optional]
**rabbitmqServerUser** | **String** |  |  [optional]
**rabbitmqUserConfPermission** | **String** |  |  [optional]
**rabbitmqUserReadPermission** | **String** |  |  [optional]
**rabbitmqUserTags** | **String** |  |  [optional]
**rabbitmqUserVhost** | **String** |  |  [optional]
**rabbitmqUserWritePermission** | **String** |  |  [optional]
**rootFirstInChain** | **Boolean** |  |  [optional]
**shouldStop** | **String** | TODO delete this after migration |  [optional]
**signerKeyName** | **String** |  |  [optional]
**storePrivateKey** | **Boolean** |  |  [optional]
**userPrincipalName** | **String** |  |  [optional]
**userTtl** | **String** |  |  [optional]
**venafiApiKey** | **String** |  |  [optional]
**venafiZone** | **String** |  |  [optional]


