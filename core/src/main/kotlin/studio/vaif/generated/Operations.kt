// GENERATED FILE — do not edit by hand.
// Source: VAIF OpenAPI contract sha256:615e77b7a0789543; 775 operations generated, 168 excluded.
// Maintainers regenerate this file from the API contract. See CONTRIBUTING.md.
package studio.vaif.generated

import studio.vaif.*
import kotlinx.serialization.json.*
import okhttp3.Response

/** Spec-generated coroutine API. Platform staff and retired operations are excluded. */
public class Operations internal constructor(client: VaifClient) : OperationsBase(client) {
    /**
     * Executes DELETE /ai/copilot/session/{sessionId}. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteAiCopilotSessionBySessionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteAiCopilotSessionBySessionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /alert-rules/{ruleId}. API authorization applies to every request.
     * @param path Required unencoded path values: ruleId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteAlertRulesByRuleId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteAlertRulesByRuleId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /auth/me/linked-accounts/{provider}. API authorization applies to every request.
     * @param path Required unencoded path values: provider.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteAuthMeLinkedAccountsByProvider(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteAuthMeLinkedAccountsByProvider"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /auth/sessions/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: id.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteAuthSessionsById(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteAuthSessionsById"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /billing/org/{orgId}/addons/{addonId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, addonId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteBillingOrgByOrgIdAddonsByAddonId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteBillingOrgByOrgIdAddonsByAddonId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /billing/org/{orgId}/contacts/{contactId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, contactId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteBillingOrgByOrgIdContactsByContactId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteBillingOrgByOrgIdContactsByContactId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /billing/org/{orgId}/usage-alerts/{alertId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, alertId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteBillingOrgByOrgIdUsageAlertsByAlertId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteBillingOrgByOrgIdUsageAlertsByAlertId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /buckets/{bucketId}. API authorization applies to every request.
     * @param path Required unencoded path values: bucketId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteBucketsByBucketId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteBucketsByBucketId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /buckets/{bucketId}/files. API authorization applies to every request.
     * @param path Required unencoded path values: bucketId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteBucketsByBucketIdFiles(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteBucketsByBucketIdFiles"), path, query, null, headers)

    /**
     * Executes DELETE /database/extensions/project/{projectId}/{extensionId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, extensionId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteDatabaseExtensionsProjectByProjectIdByExtensionId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteDatabaseExtensionsProjectByProjectIdByExtensionId"), path, query, null, headers)

    /**
     * Executes DELETE /database/wrappers/project/{projectId}/{wrapperId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, wrapperId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteDatabaseWrappersProjectByProjectIdByWrapperId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteDatabaseWrappersProjectByProjectIdByWrapperId"), path, query, null, headers)

    /**
     * Executes DELETE /functions/{functionId}. API authorization applies to every request.
     * @param path Required unencoded path values: functionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteFunctionsByFunctionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteFunctionsByFunctionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /functions/{functionId}/schedule. API authorization applies to every request.
     * @param path Required unencoded path values: functionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteFunctionsByFunctionIdSchedule(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteFunctionsByFunctionIdSchedule"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /functions/secrets/{secretId}. API authorization applies to every request.
     * @param path Required unencoded path values: secretId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteFunctionsSecretsBySecretId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteFunctionsSecretsBySecretId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /functions/triggers/{triggerId}. API authorization applies to every request.
     * @param path Required unencoded path values: triggerId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteFunctionsTriggersByTriggerId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteFunctionsTriggersByTriggerId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /generated/{table}/bulk. API authorization applies to every request.
     * @param path Required unencoded path values: table.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteGeneratedByTableBulk(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteGeneratedByTableBulk"), path, query, null, headers)

    /**
     * Executes DELETE /generated/{table}/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: table, id.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteGeneratedByTableById(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteGeneratedByTableById"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /integrations/subscriptions/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: id.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteIntegrationsSubscriptionsById(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteIntegrationsSubscriptionsById"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /mcp/connections/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: id.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteMcpConnectionsById(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteMcpConnectionsById"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /mongodb/{collection}/indexes/{indexName}. API authorization applies to every request.
     * @param path Required unencoded path values: collection, indexName.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteMongodbByCollectionIndexesByIndexName(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteMongodbByCollectionIndexesByIndexName"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /mongodb/collections/{name}. API authorization applies to every request.
     * @param path Required unencoded path values: name.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteMongodbCollectionsByName(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteMongodbCollectionsByName"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /oauth/org/{orgId}/provider/{provider}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, provider.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteOauthOrgByOrgIdProviderByProvider(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteOauthOrgByOrgIdProviderByProvider"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /orgs/{orgId}/invites/{inviteId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, inviteId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteOrgsByOrgIdInvitesByInviteId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteOrgsByOrgIdInvitesByInviteId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /orgs/{orgId}/leave-requests/mine. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteOrgsByOrgIdLeaveRequestsMine(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteOrgsByOrgIdLeaveRequestsMine"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /orgs/{orgId}/members/{userId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, userId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteOrgsByOrgIdMembersByUserId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteOrgsByOrgIdMembersByUserId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /orgs/{orgId}/transfers/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, id.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteOrgsByOrgIdTransfersById(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteOrgsByOrgIdTransfersById"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /projects/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteProjectsByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteProjectsByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /projects/{projectId}/auth/oauth-apps/{provider}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, provider.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteProjectsByProjectIdAuthOauthAppsByProvider(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteProjectsByProjectIdAuthOauthAppsByProvider"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /projects/{projectId}/auth/sessions. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteProjectsByProjectIdAuthSessions(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteProjectsByProjectIdAuthSessions"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /projects/{projectId}/auth/sessions/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, id.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteProjectsByProjectIdAuthSessionsById(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteProjectsByProjectIdAuthSessionsById"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /projects/{projectId}/branches/{branchName}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, branchName.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteProjectsByProjectIdBranchesByBranchName(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteProjectsByProjectIdBranchesByBranchName"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /projects/{projectId}/database/dedicated. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteProjectsByProjectIdDatabaseDedicated(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteProjectsByProjectIdDatabaseDedicated"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /projects/{projectId}/env-vars/{envVarId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, envVarId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteProjectsByProjectIdEnvVarsByEnvVarId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteProjectsByProjectIdEnvVarsByEnvVarId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /projects/{projectId}/environments/{envId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, envId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteProjectsByProjectIdEnvironmentsByEnvId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteProjectsByProjectIdEnvironmentsByEnvId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /projects/{projectId}/environments/{envId}/domains/{domainId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, envId, domainId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteProjectsByProjectIdEnvironmentsByEnvIdDomainsByDomainId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteProjectsByProjectIdEnvironmentsByEnvIdDomainsByDomainId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /projects/{projectId}/github/disconnect. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteProjectsByProjectIdGithubDisconnect(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteProjectsByProjectIdGithubDisconnect"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /projects/{projectId}/infrastructure/{instanceId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, instanceId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteProjectsByProjectIdInfrastructureByInstanceId(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteProjectsByProjectIdInfrastructureByInstanceId"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes DELETE /projects/{projectId}/members/{userId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, userId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteProjectsByProjectIdMembersByUserId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteProjectsByProjectIdMembersByUserId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /projects/{projectId}/users/{userId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, userId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteProjectsByProjectIdUsersByUserId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteProjectsByProjectIdUsersByUserId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /projects/{projectId}/users/{userId}/sessions/{sessionId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, userId, sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteProjectsByProjectIdUsersByUserIdSessionsBySessionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteProjectsByProjectIdUsersByUserIdSessionsBySessionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /rls/policies/{policyId}. API authorization applies to every request.
     * @param path Required unencoded path values: policyId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteRlsPoliciesByPolicyId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteRlsPoliciesByPolicyId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /schema-engine/snippets/{projectId}/{snippetId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, snippetId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteSchemaEngineSnippetsByProjectIdBySnippetId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteSchemaEngineSnippetsByProjectIdBySnippetId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /services/{serviceId}. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteServicesByServiceId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteServicesByServiceId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /services/{serviceId}/domains/{domainId}. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId, domainId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteServicesByServiceIdDomainsByDomainId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteServicesByServiceIdDomainsByDomainId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /services/{serviceId}/git/connect. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteServicesByServiceIdGitConnect(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteServicesByServiceIdGitConnect"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /sso/org/{orgId}/connections/{connectionId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteSsoOrgByOrgIdConnectionsByConnectionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteSsoOrgByOrgIdConnectionsByConnectionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /sso/org/{orgId}/connections/{connectionId}/certificates/{certId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId, certId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteSsoOrgByOrgIdConnectionsByConnectionIdCertificatesByCertId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteSsoOrgByOrgIdConnectionsByConnectionIdCertificatesByCertId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /sso/org/{orgId}/connections/{connectionId}/identities/{userId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId, userId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteSsoOrgByOrgIdConnectionsByConnectionIdIdentitiesByUserId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteSsoOrgByOrgIdConnectionsByConnectionIdIdentitiesByUserId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /sso/org/{orgId}/connections/{connectionId}/scim/tokens/{tokenId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId, tokenId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteSsoOrgByOrgIdConnectionsByConnectionIdScimTokensByTokenId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteSsoOrgByOrgIdConnectionsByConnectionIdScimTokensByTokenId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /sso/org/{orgId}/outside-members/allow/{allowId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, allowId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteSsoOrgByOrgIdOutsideMembersAllowByAllowId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteSsoOrgByOrgIdOutsideMembersAllowByAllowId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /sso/org/{orgId}/security-contact. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteSsoOrgByOrgIdSecurityContact(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteSsoOrgByOrgIdSecurityContact"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /storage/buckets/{bucketId}/policies/{policyId}. API authorization applies to every request.
     * @param path Required unencoded path values: bucketId, policyId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteStorageBucketsByBucketIdPoliciesByPolicyId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteStorageBucketsByBucketIdPoliciesByPolicyId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /templates/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: id.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteTemplatesById(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteTemplatesById"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes DELETE /v1/data/{projectId}/{table}/bulk. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, table.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteV1DataByProjectIdByTableBulk(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteV1DataByProjectIdByTableBulk"), path, query, null, headers)

    /**
     * Executes DELETE /v1/data/{projectId}/{table}/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, table, id.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun deleteV1DataByProjectIdByTableById(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("deleteV1DataByProjectIdByTableById"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun get(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("get"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /activation/org/{orgId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getActivationOrgByOrgId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getActivationOrgByOrgId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/autocomplete. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotAutocomplete(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotAutocomplete"), emptyMap(), query, null, headers)

    /**
     * Executes GET /ai/copilot/context-summary/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotContextSummaryByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotContextSummaryByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/credit-status/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotCreditStatusByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotCreditStatusByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/deploy/{deployId}. API authorization applies to every request.
     * @param path Required unencoded path values: deployId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotDeployByDeployId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotDeployByDeployId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/deploy/history/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotDeployHistoryByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotDeployHistoryByProjectId"), path, query, null, headers)

    /**
     * Executes GET /ai/copilot/execution/{executionId}. API authorization applies to every request.
     * @param path Required unencoded path values: executionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotExecutionByExecutionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotExecutionByExecutionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/executions/{sessionId}. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotExecutionsBySessionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotExecutionsBySessionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/git/branches/{sessionId}. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotGitBranchesBySessionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotGitBranchesBySessionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/git/files/{sessionId}. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotGitFilesBySessionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotGitFilesBySessionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/git/log/{sessionId}. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotGitLogBySessionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotGitLogBySessionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/git/status/{sessionId}. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotGitStatusBySessionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotGitStatusBySessionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/job/{jobId}. API authorization applies to every request.
     * @param path Required unencoded path values: jobId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotJobByJobId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotJobByJobId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/manifest/{manifestId}. API authorization applies to every request.
     * @param path Required unencoded path values: manifestId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotManifestByManifestId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotManifestByManifestId"), path, query, null, headers)

    /**
     * Executes GET /ai/copilot/metrics/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotMetricsByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotMetricsByProjectId"), path, query, null, headers)

    /**
     * Executes GET /ai/copilot/metrics/org/{orgId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotMetricsOrgByOrgId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotMetricsOrgByOrgId"), path, query, null, headers)

    /**
     * Executes GET /ai/copilot/models/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotModelsByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotModelsByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/session/{sessionId}. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotSessionBySessionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotSessionBySessionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/session/{sessionId}/editor-files. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotSessionBySessionIdEditorFiles(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotSessionBySessionIdEditorFiles"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/session/{sessionId}/workspace/export. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotSessionBySessionIdWorkspaceExport(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotSessionBySessionIdWorkspaceExport"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/session/{sessionId}/workspace/status. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotSessionBySessionIdWorkspaceStatus(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotSessionBySessionIdWorkspaceStatus"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/session/{sessionId}/workspace/types. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotSessionBySessionIdWorkspaceTypes(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotSessionBySessionIdWorkspaceTypes"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/sessions/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotSessionsByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotSessionsByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/usage/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotUsageByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotUsageByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/usage-org/{orgId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotUsageOrgByOrgId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotUsageOrgByOrgId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/version/{versionId}. API authorization applies to every request.
     * @param path Required unencoded path values: versionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotVersionByVersionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotVersionByVersionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/version/{versionId}/diff/{compareVersionId}. API authorization applies to every request.
     * @param path Required unencoded path values: versionId, compareVersionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotVersionByVersionIdDiffByCompareVersionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotVersionByVersionIdDiffByCompareVersionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai/copilot/versions/{sessionId}. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiCopilotVersionsBySessionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiCopilotVersionsBySessionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai-usage/org/{orgId}/breakdown. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiUsageOrgByOrgIdBreakdown(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiUsageOrgByOrgIdBreakdown"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai-usage/org/{orgId}/exhaustion-events. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiUsageOrgByOrgIdExhaustionEvents(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiUsageOrgByOrgIdExhaustionEvents"), path, query, null, headers)

    /**
     * Executes GET /ai-usage/org/{orgId}/history. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiUsageOrgByOrgIdHistory(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiUsageOrgByOrgIdHistory"), path, query, null, headers)

    /**
     * Executes GET /ai-usage/org/{orgId}/recent. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiUsageOrgByOrgIdRecent(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiUsageOrgByOrgIdRecent"), path, query, null, headers)

    /**
     * Executes GET /ai-usage/org/{orgId}/rollups. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiUsageOrgByOrgIdRollups(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiUsageOrgByOrgIdRollups"), path, query, null, headers)

    /**
     * Executes GET /ai-usage/org/{orgId}/summary. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiUsageOrgByOrgIdSummary(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiUsageOrgByOrgIdSummary"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /ai-usage/org/{orgId}/verament. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAiUsageOrgByOrgIdVerament(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAiUsageOrgByOrgIdVerament"), path, query, null, headers)

    /**
     * Executes GET /alert-rules/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAlertRulesProjectByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAlertRulesProjectByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /announcements. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAnnouncements(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAnnouncements"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /audit/org/{orgId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAuditOrgByOrgId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAuditOrgByOrgId"), path, query, null, headers)

    /**
     * Executes GET /audit/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAuditProjectByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAuditProjectByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /auth/me. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAuthMe(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAuthMe"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /auth/me/admin. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAuthMeAdmin(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAuthMeAdmin"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /auth/me/context. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAuthMeContext(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAuthMeContext"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /auth/me/linked-accounts. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAuthMeLinkedAccounts(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAuthMeLinkedAccounts"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /auth/mfa/status. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAuthMfaStatus(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAuthMfaStatus"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /auth/oauth/providers. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAuthOauthProviders(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAuthOauthProviders"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /auth/session. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAuthSession(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAuthSession"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /auth/sessions. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAuthSessions(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAuthSessions"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /auth/tenant/session. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getAuthTenantSession(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getAuthTenantSession"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/addons/catalog. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingAddonsCatalog(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingAddonsCatalog"), emptyMap(), query, null, headers)

    /**
     * Executes GET /billing/checkout/verify/{sessionId}. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingCheckoutVerifyBySessionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingCheckoutVerifyBySessionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/credits/packages. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingCreditsPackages(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingCreditsPackages"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/credits/rates. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingCreditsRates(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingCreditsRates"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/founders/wall. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingFoundersWall(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingFoundersWall"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/org/{orgId}/addons. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdAddons(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdAddons"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/org/{orgId}/card-check. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdCardCheck(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdCardCheck"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/org/{orgId}/contacts. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdContacts(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdContacts"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/org/{orgId}/cost-breakdown. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdCostBreakdown(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdCostBreakdown"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/org/{orgId}/credits/auto-topup. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdCreditsAutoTopup(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdCreditsAutoTopup"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/org/{orgId}/credits/transactions. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdCreditsTransactions(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdCreditsTransactions"), path, query, null, headers)

    /**
     * Executes GET /billing/org/{orgId}/founder. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdFounder(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdFounder"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/org/{orgId}/hosting. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdHosting(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdHosting"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/org/{orgId}/infrastructure. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdInfrastructure(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdInfrastructure"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/org/{orgId}/invoices. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdInvoices(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdInvoices"), path, query, null, headers)

    /**
     * Executes GET /billing/org/{orgId}/overages. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdOverages(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdOverages"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/org/{orgId}/overages/history. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdOveragesHistory(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdOveragesHistory"), path, query, null, headers)

    /**
     * Executes GET /billing/org/{orgId}/subscription. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdSubscription(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdSubscription"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/org/{orgId}/summary. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdSummary(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdSummary"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/org/{orgId}/tax-info. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdTaxInfo(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdTaxInfo"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/org/{orgId}/usage. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdUsage(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdUsage"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/org/{orgId}/usage-alerts. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdUsageAlerts(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdUsageAlerts"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/org/{orgId}/usage-alerts/configured. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdUsageAlertsConfigured(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdUsageAlertsConfigured"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/org/{orgId}/usage-alerts/history. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdUsageAlertsHistory(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdUsageAlertsHistory"), path, query, null, headers)

    /**
     * Executes GET /billing/org/{orgId}/usage/history. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdUsageHistory(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdUsageHistory"), path, query, null, headers)

    /**
     * Executes GET /billing/org/{orgId}/usage/realtime. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingOrgByOrgIdUsageRealtime(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingOrgByOrgIdUsageRealtime"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /billing/plans. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBillingPlans(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBillingPlans"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /bootstrap. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBootstrap(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBootstrap"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /buckets/{bucketId}. API authorization applies to every request.
     * @param path Required unencoded path values: bucketId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBucketsByBucketId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBucketsByBucketId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /buckets/{bucketId}/files. API authorization applies to every request.
     * @param path Required unencoded path values: bucketId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBucketsByBucketIdFiles(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBucketsByBucketIdFiles"), path, query, null, headers)

    /**
     * Executes GET /buckets/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getBucketsProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getBucketsProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /cms/careers. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getCmsCareers(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getCmsCareers"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /cms/faqs/{pageSlug}. API authorization applies to every request.
     * @param path Required unencoded path values: pageSlug.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getCmsFaqsByPageSlug(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getCmsFaqsByPageSlug"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /cms/pages/{slug}. API authorization applies to every request.
     * @param path Required unencoded path values: slug.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getCmsPagesBySlug(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getCmsPagesBySlug"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /cms/partners. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getCmsPartners(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getCmsPartners"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /cms/team. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getCmsTeam(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getCmsTeam"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /cms/testimonials. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getCmsTestimonials(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getCmsTestimonials"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /credits/org/{orgId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getCreditsOrgByOrgId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getCreditsOrgByOrgId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /credits/org/{orgId}/balance. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getCreditsOrgByOrgIdBalance(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getCreditsOrgByOrgIdBalance"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /database/connector/{projectId}/tables. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDatabaseConnectorByProjectIdTables(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDatabaseConnectorByProjectIdTables"), path, query, null, headers)

    /**
     * Executes GET /database/extensions/available. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDatabaseExtensionsAvailable(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDatabaseExtensionsAvailable"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /database/extensions/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDatabaseExtensionsProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDatabaseExtensionsProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /database/tiers. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDatabaseTiers(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDatabaseTiers"), emptyMap(), query, null, headers)

    /**
     * Executes GET /database/wrappers/available. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDatabaseWrappersAvailable(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDatabaseWrappersAvailable"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /database/wrappers/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDatabaseWrappersProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDatabaseWrappersProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /deployments/{deploymentId}. API authorization applies to every request.
     * @param path Required unencoded path values: deploymentId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDeploymentsByDeploymentId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDeploymentsByDeploymentId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /deployments/{deploymentId}/steps. API authorization applies to every request.
     * @param path Required unencoded path values: deploymentId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDeploymentsByDeploymentIdSteps(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDeploymentsByDeploymentIdSteps"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /deployments/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDeploymentsProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDeploymentsProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /deployments/project/{projectId}/stats. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDeploymentsProjectByProjectIdStats(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDeploymentsProjectByProjectIdStats"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /deployments/tokens/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDeploymentsTokensProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDeploymentsTokensProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /docs/ai-search. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDocsAiSearch(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDocsAiSearch"), emptyMap(), query, null, headers)

    /**
     * Executes GET /docs/api-endpoints. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDocsApiEndpoints(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDocsApiEndpoints"), emptyMap(), query, null, headers)

    /**
     * Executes GET /docs/api-endpoints/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: id.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDocsApiEndpointsById(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDocsApiEndpointsById"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /docs/categories. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDocsCategories(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDocsCategories"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /docs/changelog. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDocsChangelog(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDocsChangelog"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /docs/changelog/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: id.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDocsChangelogById(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDocsChangelogById"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /docs/examples. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDocsExamples(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDocsExamples"), emptyMap(), query, null, headers)

    /**
     * Executes GET /docs/examples/{slug}. API authorization applies to every request.
     * @param path Required unencoded path values: slug.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDocsExamplesBySlug(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDocsExamplesBySlug"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /docs/project/{projectId}/quickstart. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDocsProjectByProjectIdQuickstart(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDocsProjectByProjectIdQuickstart"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /docs/sdks. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDocsSdks(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDocsSdks"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /docs/sdks/{platform}. API authorization applies to every request.
     * @param path Required unencoded path values: platform.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDocsSdksByPlatform(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDocsSdksByPlatform"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /docs/sdks/{sdkId}/examples. API authorization applies to every request.
     * @param path Required unencoded path values: sdkId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDocsSdksBySdkIdExamples(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDocsSdksBySdkIdExamples"), path, query, null, headers)

    /**
     * Executes GET /docs/search. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDocsSearch(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDocsSearch"), emptyMap(), query, null, headers)

    /**
     * Executes GET /docs/v2/pages. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDocsV2Pages(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDocsV2Pages"), emptyMap(), query, null, headers)

    /**
     * Executes GET /docs/v2/pages/{slug}. API authorization applies to every request.
     * @param path Required unencoded path values: slug.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getDocsV2PagesBySlug(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getDocsV2PagesBySlug"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /early/{number}. API authorization applies to every request.
     * @param path Required unencoded path values: number.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getEarlyByNumber(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getEarlyByNumber"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /early/wall. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getEarlyWall(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getEarlyWall"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /enterprise/org/{orgId}/contract. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getEnterpriseOrgByOrgIdContract(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getEnterpriseOrgByOrgIdContract"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /enterprise/org/{orgId}/invoices. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getEnterpriseOrgByOrgIdInvoices(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getEnterpriseOrgByOrgIdInvoices"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /enterprise/org/{orgId}/onboarding. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getEnterpriseOrgByOrgIdOnboarding(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getEnterpriseOrgByOrgIdOnboarding"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /enterprise/org/{orgId}/spend. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getEnterpriseOrgByOrgIdSpend(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getEnterpriseOrgByOrgIdSpend"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /enterprise/org/{orgId}/usage. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getEnterpriseOrgByOrgIdUsage(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getEnterpriseOrgByOrgIdUsage"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /enterprise/org/{orgId}/usage/history. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getEnterpriseOrgByOrgIdUsageHistory(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getEnterpriseOrgByOrgIdUsageHistory"), path, query, null, headers)

    /**
     * Executes GET /enterprise/org/{orgId}/usage/projects. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getEnterpriseOrgByOrgIdUsageProjects(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getEnterpriseOrgByOrgIdUsageProjects"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /enterprise/pricing. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getEnterprisePricing(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getEnterprisePricing"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /enterprise/quotes/{quoteId}. API authorization applies to every request.
     * @param path Required unencoded path values: quoteId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getEnterpriseQuotesByQuoteId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getEnterpriseQuotesByQuoteId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /entitlements/org/{orgId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getEntitlementsOrgByOrgId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getEntitlementsOrgByOrgId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /functions/{functionId}. API authorization applies to every request.
     * @param path Required unencoded path values: functionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getFunctionsByFunctionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getFunctionsByFunctionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /functions/{functionId}/deploy-status. API authorization applies to every request.
     * @param path Required unencoded path values: functionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getFunctionsByFunctionIdDeployStatus(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getFunctionsByFunctionIdDeployStatus"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /functions/{functionId}/invocations. API authorization applies to every request.
     * @param path Required unencoded path values: functionId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getFunctionsByFunctionIdInvocations(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getFunctionsByFunctionIdInvocations"), path, query, null, headers)

    /**
     * Executes GET /functions/{functionId}/logs. API authorization applies to every request.
     * @param path Required unencoded path values: functionId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getFunctionsByFunctionIdLogs(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getFunctionsByFunctionIdLogs"), path, query, null, headers)

    /**
     * Executes GET /functions/{functionId}/metrics. API authorization applies to every request.
     * @param path Required unencoded path values: functionId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getFunctionsByFunctionIdMetrics(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getFunctionsByFunctionIdMetrics"), path, query, null, headers)

    /**
     * Executes GET /functions/{functionId}/schedule. API authorization applies to every request.
     * @param path Required unencoded path values: functionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getFunctionsByFunctionIdSchedule(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getFunctionsByFunctionIdSchedule"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /functions/{functionId}/triggers. API authorization applies to every request.
     * @param path Required unencoded path values: functionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getFunctionsByFunctionIdTriggers(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getFunctionsByFunctionIdTriggers"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /functions/invocations. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getFunctionsInvocations(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getFunctionsInvocations"), emptyMap(), query, null, headers)

    /**
     * Executes GET /functions/invocations/function/{functionId}. API authorization applies to every request.
     * @param path Required unencoded path values: functionId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getFunctionsInvocationsFunctionByFunctionId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getFunctionsInvocationsFunctionByFunctionId"), path, query, null, headers)

    /**
     * Executes GET /functions/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getFunctionsProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getFunctionsProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /functions/project/{projectId}/name/{functionName}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, functionName.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getFunctionsProjectByProjectIdNameByFunctionName(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getFunctionsProjectByProjectIdNameByFunctionName"), path, query, null, headers)

    /**
     * Executes GET /functions/project/{projectId}/summary. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getFunctionsProjectByProjectIdSummary(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getFunctionsProjectByProjectIdSummary"), path, query, null, headers)

    /**
     * Executes GET /functions/schedule/preview. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getFunctionsSchedulePreview(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getFunctionsSchedulePreview"), emptyMap(), query, null, headers)

    /**
     * Executes GET /functions/secrets/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getFunctionsSecretsProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getFunctionsSecretsProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /generated/{table}. API authorization applies to every request.
     * @param path Required unencoded path values: table.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getGeneratedByTable(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getGeneratedByTable"), path, query, null, headers)

    /**
     * Executes GET /generated/{table}/aggregate. API authorization applies to every request.
     * @param path Required unencoded path values: table.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getGeneratedByTableAggregate(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getGeneratedByTableAggregate"), path, query, null, headers)

    /**
     * Executes GET /generated/{table}/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: table, id.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getGeneratedByTableById(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getGeneratedByTableById"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /generated/{table}/search. API authorization applies to every request.
     * @param path Required unencoded path values: table.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getGeneratedByTableSearch(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getGeneratedByTableSearch"), path, query, null, headers)

    /**
     * Executes GET /github/oauth/authorize. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getGithubOauthAuthorize(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getGithubOauthAuthorize"), emptyMap(), query, null, headers)

    /**
     * Executes GET /incidents/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getIncidentsProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getIncidentsProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /infrastructure/sizes. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getInfrastructureSizes(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getInfrastructureSizes"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /integrations/analytics/project/{projectId}/events. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getIntegrationsAnalyticsProjectByProjectIdEvents(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getIntegrationsAnalyticsProjectByProjectIdEvents"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /integrations/analytics/project/{projectId}/stats. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getIntegrationsAnalyticsProjectByProjectIdStats(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getIntegrationsAnalyticsProjectByProjectIdStats"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /integrations/deliveries/event/{eventId}. API authorization applies to every request.
     * @param path Required unencoded path values: eventId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getIntegrationsDeliveriesEventByEventId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getIntegrationsDeliveriesEventByEventId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /integrations/deliveries/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getIntegrationsDeliveriesProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getIntegrationsDeliveriesProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /integrations/deliveries/project/{projectId}/summary. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getIntegrationsDeliveriesProjectByProjectIdSummary(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getIntegrationsDeliveriesProjectByProjectIdSummary"), path, query, null, headers)

    /**
     * Executes GET /integrations/deliveries/subscription/{subscriptionId}. API authorization applies to every request.
     * @param path Required unencoded path values: subscriptionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getIntegrationsDeliveriesSubscriptionBySubscriptionId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getIntegrationsDeliveriesSubscriptionBySubscriptionId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /integrations/dlq/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getIntegrationsDlqProjectByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getIntegrationsDlqProjectByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /integrations/events. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getIntegrationsEvents(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getIntegrationsEvents"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /integrations/subscriptions/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getIntegrationsSubscriptionsProjectByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getIntegrationsSubscriptionsProjectByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /jobs/dlq/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getJobsDlqProjectByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getJobsDlqProjectByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /jobs/webhooks/delivery/{deliveryId}. API authorization applies to every request.
     * @param path Required unencoded path values: deliveryId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getJobsWebhooksDeliveryByDeliveryId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getJobsWebhooksDeliveryByDeliveryId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /jobs/webhooks/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getJobsWebhooksProjectByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getJobsWebhooksProjectByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /logs/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getLogsProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getLogsProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /logs/project/{projectId}/feed. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getLogsProjectByProjectIdFeed(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getLogsProjectByProjectIdFeed"), path, query, null, headers)

    /**
     * Executes GET /maintenance. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getMaintenance(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getMaintenance"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /mcp/connections. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getMcpConnections(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getMcpConnections"), emptyMap(), query, null, headers)

    /**
     * Executes GET /mcp/oauth/requests/{requestId}. API authorization applies to every request.
     * @param path Required unencoded path values: requestId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getMcpOauthRequestsByRequestId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getMcpOauthRequestsByRequestId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /mcp/session. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getMcpSession(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getMcpSession"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /me/badges. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getMeBadges(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getMeBadges"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /me/creator. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getMeCreator(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getMeCreator"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /metrics/org/{orgId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getMetricsOrgByOrgId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getMetricsOrgByOrgId"), path, query, null, headers)

    /**
     * Executes GET /metrics/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getMetricsProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getMetricsProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /metrics/project/{projectId}/overview. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getMetricsProjectByProjectIdOverview(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getMetricsProjectByProjectIdOverview"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /metrics/project/{projectId}/report. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getMetricsProjectByProjectIdReport(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getMetricsProjectByProjectIdReport"), path, query, null, headers)

    /**
     * Executes GET /mongodb/{collection}/estimatedCount. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getMongodbByCollectionEstimatedCount(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getMongodbByCollectionEstimatedCount"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /mongodb/{collection}/findById/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: collection, id.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getMongodbByCollectionFindByIdById(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getMongodbByCollectionFindByIdById"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /mongodb/{collection}/indexes. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getMongodbByCollectionIndexes(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getMongodbByCollectionIndexes"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /mongodb/collections. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getMongodbCollections(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getMongodbCollections"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /oauth/org/{orgId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOauthOrgByOrgId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOauthOrgByOrgId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /oauth/org/{orgId}/provider/{provider}/authorize. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, provider.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOauthOrgByOrgIdProviderByProviderAuthorize(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOauthOrgByOrgIdProviderByProviderAuthorize"), path, query, null, headers)

    /**
     * Executes GET /onboarding/org/{orgId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOnboardingOrgByOrgId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOnboardingOrgByOrgId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /openapi/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOpenapiProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOpenapiProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /openapi.yaml. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOpenapiYaml(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOpenapiYaml"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgs(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgs"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/access-matrix. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdAccessMatrix(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdAccessMatrix"), path, query, null, headers)

    /**
     * Executes GET /orgs/{orgId}/blueprint-defaults. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdBlueprintDefaults(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdBlueprintDefaults"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/change-requests. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdChangeRequests(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdChangeRequests"), path, query, null, headers)

    /**
     * Executes GET /orgs/{orgId}/data-region. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdDataRegion(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdDataRegion"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/identity/summary. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdIdentitySummary(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdIdentitySummary"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/invites. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdInvites(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdInvites"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/leave-requests. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdLeaveRequests(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdLeaveRequests"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/leave-requests/mine. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdLeaveRequestsMine(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdLeaveRequestsMine"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/managed-domains. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdManagedDomains(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdManagedDomains"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/managed-summary. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdManagedSummary(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdManagedSummary"), path, query, null, headers)

    /**
     * Executes GET /orgs/{orgId}/members. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdMembers(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdMembers"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/membership. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdMembership(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdMembership"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/profile. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdProfile(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdProfile"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/roles. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdRoles(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdRoles"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/security. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdSecurity(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdSecurity"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/security/posture. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdSecurityPosture(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdSecurityPosture"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/support/sla-report. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdSupportSlaReport(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdSupportSlaReport"), path, query, null, headers)

    /**
     * Executes GET /orgs/{orgId}/support/summary. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdSupportSummary(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdSupportSummary"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/support/terms. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdSupportTerms(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdSupportTerms"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/support/tickets. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdSupportTickets(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdSupportTickets"), path, query, null, headers)

    /**
     * Executes GET /orgs/{orgId}/support/tickets/{number}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, number.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdSupportTicketsByNumber(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdSupportTicketsByNumber"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/{orgId}/transfers. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsByOrgIdTransfers(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsByOrgIdTransfers"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /orgs/invites/lookup. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsInvitesLookup(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsInvitesLookup"), emptyMap(), query, null, headers)

    /**
     * Executes GET /orgs/transfers/preview. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getOrgsTransfersPreview(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getOrgsTransfersPreview"), emptyMap(), query, null, headers)

    /**
     * Executes GET /plans/{planId}. API authorization applies to every request.
     * @param path Required unencoded path values: planId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getPlansByPlanId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getPlansByPlanId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /plans/org/{orgId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getPlansOrgByOrgId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getPlansOrgByOrgId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /pricing/ai-features. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getPricingAiFeatures(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getPricingAiFeatures"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /pricing/compare. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getPricingCompare(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getPricingCompare"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /pricing/enterprise. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getPricingEnterprise(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getPricingEnterprise"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /pricing/plans. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getPricingPlans(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getPricingPlans"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /pricing/plans/{plan}. API authorization applies to every request.
     * @param path Required unencoded path values: plan.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getPricingPlansByPlan(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getPricingPlansByPlan"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjects(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjects"), emptyMap(), query, null, headers)

    /**
     * Executes GET /projects/{id}/insights. API authorization applies to every request.
     * @param path Required unencoded path values: id.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByIdInsights(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByIdInsights"), path, query, null, headers)

    /**
     * Executes GET /projects/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/api-keys. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdApiKeys(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdApiKeys"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/auth/activity. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdAuthActivity(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdAuthActivity"), path, query, null, headers)

    /**
     * Executes GET /projects/{projectId}/auth/me. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdAuthMe(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdAuthMe"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/auth/oauth-apps. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdAuthOauthApps(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdAuthOauthApps"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/auth/oauth/providers. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdAuthOauthProviders(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdAuthOauthProviders"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/auth/sessions. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdAuthSessions(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdAuthSessions"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/auth/settings. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdAuthSettings(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdAuthSettings"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/branches. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdBranches(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdBranches"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/branches/{branchName}/url. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, branchName.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdBranchesByBranchNameUrl(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdBranchesByBranchNameUrl"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/database/dedicated. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdDatabaseDedicated(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdDatabaseDedicated"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/database/dedicated/connection. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdDatabaseDedicatedConnection(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdDatabaseDedicatedConnection"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/database/dedicated/status. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdDatabaseDedicatedStatus(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdDatabaseDedicatedStatus"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/deletion-preview. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdDeletionPreview(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdDeletionPreview"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/env-vars. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdEnvVars(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdEnvVars"), path, query, null, headers)

    /**
     * Executes GET /projects/{projectId}/environments. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdEnvironments(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdEnvironments"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/environments/{envId}/domain-status. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, envId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdEnvironmentsByEnvIdDomainStatus(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdEnvironmentsByEnvIdDomainStatus"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/environments/{envId}/domain-verification. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, envId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdEnvironmentsByEnvIdDomainVerification(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdEnvironmentsByEnvIdDomainVerification"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/environments/{envId}/domains. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, envId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdEnvironmentsByEnvIdDomains(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdEnvironmentsByEnvIdDomains"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/environments/promotion-order. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdEnvironmentsPromotionOrder(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdEnvironmentsPromotionOrder"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/frontend. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdFrontend(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdFrontend"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/getting-started. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdGettingStarted(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdGettingStarted"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/github/branches. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdGithubBranches(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdGithubBranches"), path, query, null, headers)

    /**
     * Executes GET /projects/{projectId}/github/repos. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdGithubRepos(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdGithubRepos"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/github/status. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdGithubStatus(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdGithubStatus"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/github/tracked-repos. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdGithubTrackedRepos(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdGithubTrackedRepos"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/infrastructure. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdInfrastructure(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdInfrastructure"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/infrastructure/{instanceId}/metrics. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, instanceId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdInfrastructureByInstanceIdMetrics(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdInfrastructureByInstanceIdMetrics"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/infrastructure/{instanceId}/replicas. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, instanceId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdInfrastructureByInstanceIdReplicas(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdInfrastructureByInstanceIdReplicas"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/infrastructure/{instanceId}/upgrade-options. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, instanceId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdInfrastructureByInstanceIdUpgradeOptions(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdInfrastructureByInstanceIdUpgradeOptions"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/infrastructure/migration/progress. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdInfrastructureMigrationProgress(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdInfrastructureMigrationProgress"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/infrastructure/migration-status. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdInfrastructureMigrationStatus(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdInfrastructureMigrationStatus"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/infrastructure/restores. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdInfrastructureRestores(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdInfrastructureRestores"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/members. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdMembers(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdMembers"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/promotions. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdPromotions(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdPromotions"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/promotions/diff. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdPromotionsDiff(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdPromotionsDiff"), path, query, null, headers)

    /**
     * Executes GET /projects/{projectId}/region. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdRegion(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdRegion"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/security/advisor. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdSecurityAdvisor(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdSecurityAdvisor"), path, query, null, headers)

    /**
     * Executes GET /projects/{projectId}/settings. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdSettings(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdSettings"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/settings/addons. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdSettingsAddons(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdSettingsAddons"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/settings/api. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdSettingsApi(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdSettingsApi"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/settings/compute. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdSettingsCompute(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdSettingsCompute"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/settings/jwt. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdSettingsJwt(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdSettingsJwt"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/storage/settings. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdStorageSettings(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdStorageSettings"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/users. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdUsers(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdUsers"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/users/{userId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, userId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdUsersByUserId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdUsersByUserId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/users/{userId}/sessions. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, userId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdUsersByUserIdSessions(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdUsersByUserIdSessions"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/{projectId}/users/stats. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsByProjectIdUsersStats(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsByProjectIdUsersStats"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /projects/slug-available. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getProjectsSlugAvailable(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getProjectsSlugAvailable"), emptyMap(), query, null, headers)

    /**
     * Executes GET /quickstart/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getQuickstartProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getQuickstartProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /quickstart/project/{projectId}/json. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getQuickstartProjectByProjectIdJson(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getQuickstartProjectByProjectIdJson"), path, query, null, headers)

    /**
     * Executes GET /realtime/connections/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getRealtimeConnectionsProjectByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getRealtimeConnectionsProjectByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /realtime/events/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getRealtimeEventsProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getRealtimeEventsProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /realtime/stats/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getRealtimeStatsProjectByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getRealtimeStatsProjectByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /realtime/status/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getRealtimeStatusProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getRealtimeStatusProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /realtime/subscriptions/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getRealtimeSubscriptionsProjectByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getRealtimeSubscriptionsProjectByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /refunds/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: id.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getRefundsById(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getRefundsById"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /refunds/org/{orgId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getRefundsOrgByOrgId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getRefundsOrgByOrgId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /regions. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getRegions(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getRegions"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /regions/all. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getRegionsAll(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getRegionsAll"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /regions/{key}. API authorization applies to every request.
     * @param path Required unencoded path values: key.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getRegionsByKey(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getRegionsByKey"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /regions/{key}/metrics. API authorization applies to every request.
     * @param path Required unencoded path values: key.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getRegionsByKeyMetrics(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getRegionsByKeyMetrics"), path, query, null, headers)

    /**
     * Executes GET /regions/health. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getRegionsHealth(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getRegionsHealth"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /rls/policies/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getRlsPoliciesByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getRlsPoliciesByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /schema-engine/{projectId}/changes. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSchemaEngineByProjectIdChanges(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSchemaEngineByProjectIdChanges"), path, query, null, headers)

    /**
     * Executes GET /schema-engine/editor-sessions/{projectId}/capabilities. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSchemaEngineEditorSessionsByProjectIdCapabilities(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSchemaEngineEditorSessionsByProjectIdCapabilities"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /schema-engine/introspect/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSchemaEngineIntrospectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSchemaEngineIntrospectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /schema-engine/migrations/{projectId}/{migrationId}/diff. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, migrationId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSchemaEngineMigrationsByProjectIdByMigrationIdDiff(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSchemaEngineMigrationsByProjectIdByMigrationIdDiff"), path, query, null, headers)

    /**
     * Executes GET /schema-engine/migrations/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSchemaEngineMigrationsProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSchemaEngineMigrationsProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /schema-engine/snapshots/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSchemaEngineSnapshotsProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSchemaEngineSnapshotsProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /schema-engine/snippets/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSchemaEngineSnippetsByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSchemaEngineSnippetsByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /schemas/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSchemasProjectByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSchemasProjectByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /security/audit/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSecurityAuditByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSecurityAuditByProjectId"), path, query, null, headers)

    /**
     * Executes GET /security/overview/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSecurityOverviewByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSecurityOverviewByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /security/variables/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSecurityVariablesProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSecurityVariablesProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /services/{serviceId}. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getServicesByServiceId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getServicesByServiceId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /services/{serviceId}/deployments/{deploymentId}/build-logs. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId, deploymentId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getServicesByServiceIdDeploymentsByDeploymentIdBuildLogs(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getServicesByServiceIdDeploymentsByDeploymentIdBuildLogs"), path, query, null, headers)

    /**
     * Executes GET /services/{serviceId}/deployments/{deploymentId}/status. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId, deploymentId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getServicesByServiceIdDeploymentsByDeploymentIdStatus(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getServicesByServiceIdDeploymentsByDeploymentIdStatus"), path, query, null, headers)

    /**
     * Executes GET /services/{serviceId}/domains. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getServicesByServiceIdDomains(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getServicesByServiceIdDomains"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /services/{serviceId}/git/connect. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getServicesByServiceIdGitConnect(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getServicesByServiceIdGitConnect"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /services/{serviceId}/logs. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getServicesByServiceIdLogs(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getServicesByServiceIdLogs"), path, query, null, headers)

    /**
     * Executes GET /services/{serviceId}/status. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getServicesByServiceIdStatus(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getServicesByServiceIdStatus"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /services/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getServicesProjectByProjectId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getServicesProjectByProjectId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /services/project/{projectId}/summary. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getServicesProjectByProjectIdSummary(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getServicesProjectByProjectIdSummary"), path, query, null, headers)

    /**
     * Executes GET /sso/me/paused-access. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSsoMePausedAccess(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSsoMePausedAccess"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /sso/org/{orgId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSsoOrgByOrgId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSsoOrgByOrgId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /sso/org/{orgId}/connections/{connectionId}/break-glass. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSsoOrgByOrgIdConnectionsByConnectionIdBreakGlass(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSsoOrgByOrgIdConnectionsByConnectionIdBreakGlass"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /sso/org/{orgId}/connections/{connectionId}/certificates. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSsoOrgByOrgIdConnectionsByConnectionIdCertificates(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSsoOrgByOrgIdConnectionsByConnectionIdCertificates"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /sso/org/{orgId}/connections/{connectionId}/group-mappings. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSsoOrgByOrgIdConnectionsByConnectionIdGroupMappings(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSsoOrgByOrgIdConnectionsByConnectionIdGroupMappings"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /sso/org/{orgId}/connections/{connectionId}/require. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSsoOrgByOrgIdConnectionsByConnectionIdRequire(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSsoOrgByOrgIdConnectionsByConnectionIdRequire"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /sso/org/{orgId}/connections/{connectionId}/scim/reconciliation. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSsoOrgByOrgIdConnectionsByConnectionIdScimReconciliation(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSsoOrgByOrgIdConnectionsByConnectionIdScimReconciliation"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /sso/org/{orgId}/connections/{connectionId}/scim/tokens. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSsoOrgByOrgIdConnectionsByConnectionIdScimTokens(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSsoOrgByOrgIdConnectionsByConnectionIdScimTokens"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /sso/org/{orgId}/outside-members. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSsoOrgByOrgIdOutsideMembers(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSsoOrgByOrgIdOutsideMembers"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /sso/org/{orgId}/outside-members/blocked. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSsoOrgByOrgIdOutsideMembersBlocked(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSsoOrgByOrgIdOutsideMembersBlocked"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /sso/org/{orgId}/security-contact. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getSsoOrgByOrgIdSecurityContact(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getSsoOrgByOrgIdSecurityContact"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /status. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getStatus(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getStatus"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /status/atom. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getStatusAtom(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getStatusAtom"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /status/incidents. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getStatusIncidents(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getStatusIncidents"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /status/rss. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getStatusRss(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getStatusRss"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /status/subscribers/count. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getStatusSubscribersCount(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getStatusSubscribersCount"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /status/unsubscribe/{token}. API authorization applies to every request.
     * @param path Required unencoded path values: token.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getStatusUnsubscribeByToken(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getStatusUnsubscribeByToken"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /status/uptime/{componentId}. API authorization applies to every request.
     * @param path Required unencoded path values: componentId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getStatusUptimeByComponentId(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getStatusUptimeByComponentId"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /storage/buckets. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getStorageBuckets(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getStorageBuckets"), emptyMap(), query, null, headers)

    /**
     * Executes GET /storage/buckets/{bucketId}/policies. API authorization applies to every request.
     * @param path Required unencoded path values: bucketId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getStorageBucketsByBucketIdPolicies(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getStorageBucketsByBucketIdPolicies"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /storage/download. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Buffered response bytes.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getStorageDownload(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): ByteArray =
        callBinary(OperationTable.operations.getValue("getStorageDownload"), emptyMap(), query, null, headers)

    /**
     * Executes GET /storage/files/{bucketId}/metadata. API authorization applies to every request.
     * @param path Required unencoded path values: bucketId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getStorageFilesByBucketIdMetadata(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getStorageFilesByBucketIdMetadata"), path, query, null, headers)

    /**
     * Executes GET /storage/multipart/list-pending. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getStorageMultipartListPending(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getStorageMultipartListPending"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /storage/usage/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getStorageUsageProjectByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getStorageUsageProjectByProjectId"), path, query, null, headers)

    /**
     * Executes GET /templates. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getTemplates(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getTemplates"), emptyMap(), query, null, headers)

    /**
     * Executes GET /templates/{slug}. API authorization applies to every request.
     * @param path Required unencoded path values: slug.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getTemplatesBySlug(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getTemplatesBySlug"), path, query, null, headers)

    /**
     * Executes GET /templates/installs. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getTemplatesInstalls(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getTemplatesInstalls"), emptyMap(), query, null, headers)

    /**
     * Executes GET /tenant/branding. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getTenantBranding(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getTenantBranding"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /users/me. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getUsersMe(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getUsersMe"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /users/me/preferences. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getUsersMePreferences(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getUsersMePreferences"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /v1/data/{projectId}/{table}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, table.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getV1DataByProjectIdByTable(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getV1DataByProjectIdByTable"), path, query, null, headers)

    /**
     * Executes GET /v1/data/{projectId}/{table}/aggregate. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, table.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getV1DataByProjectIdByTableAggregate(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getV1DataByProjectIdByTableAggregate"), path, query, null, headers)

    /**
     * Executes GET /v1/data/{projectId}/{table}/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, table, id.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getV1DataByProjectIdByTableById(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getV1DataByProjectIdByTableById"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /v1/data/{projectId}/{table}/search. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, table.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getV1DataByProjectIdByTableSearch(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getV1DataByProjectIdByTableSearch"), path, query, null, headers)

    /**
     * Executes GET /v1/health. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getV1Health(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getV1Health"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /v1/project. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getV1Project(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getV1Project"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes GET /.well-known/oauth-authorization-server. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun getWellKnownOauthAuthorizationServer(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("getWellKnownOauthAuthorizationServer"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes PATCH /ai/copilot/session/{sessionId}. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchAiCopilotSessionBySessionId(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchAiCopilotSessionBySessionId"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /auth/me. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchAuthMe(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchAuthMe"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /billing/org/{orgId}/addons/{addonId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, addonId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchBillingOrgByOrgIdAddonsByAddonId(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchBillingOrgByOrgIdAddonsByAddonId"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /billing/org/{orgId}/contacts/{contactId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, contactId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchBillingOrgByOrgIdContactsByContactId(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchBillingOrgByOrgIdContactsByContactId"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /billing/org/{orgId}/usage-alerts/{alertId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, alertId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchBillingOrgByOrgIdUsageAlertsByAlertId(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchBillingOrgByOrgIdUsageAlertsByAlertId"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /database/wrappers/project/{projectId}/{wrapperId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, wrapperId.
     * @param body Required json request body.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchDatabaseWrappersProjectByProjectIdByWrapperId(path: Map<String, String>, body: JsonElement, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchDatabaseWrappersProjectByProjectIdByWrapperId"), path, query, body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /enterprise/org/{orgId}/onboarding. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchEnterpriseOrgByOrgIdOnboarding(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchEnterpriseOrgByOrgIdOnboarding"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /functions/{functionId}. API authorization applies to every request.
     * @param path Required unencoded path values: functionId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchFunctionsByFunctionId(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchFunctionsByFunctionId"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /functions/triggers/{triggerId}. API authorization applies to every request.
     * @param path Required unencoded path values: triggerId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchFunctionsTriggersByTriggerId(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchFunctionsTriggersByTriggerId"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /generated/{table}/bulk. API authorization applies to every request.
     * @param path Required unencoded path values: table.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchGeneratedByTableBulk(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchGeneratedByTableBulk"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /generated/{table}/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: table, id.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchGeneratedByTableById(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchGeneratedByTableById"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /integrations/subscriptions/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: id.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchIntegrationsSubscriptionsById(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchIntegrationsSubscriptionsById"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /oauth/org/{orgId}/provider/{provider}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, provider.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchOauthOrgByOrgIdProviderByProvider(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchOauthOrgByOrgIdProviderByProvider"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /orgs/{orgId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchOrgsByOrgId(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchOrgsByOrgId"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /orgs/{orgId}/blueprint-defaults. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchOrgsByOrgIdBlueprintDefaults(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchOrgsByOrgIdBlueprintDefaults"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /orgs/{orgId}/data-region. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchOrgsByOrgIdDataRegion(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchOrgsByOrgIdDataRegion"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /orgs/{orgId}/members/{userId}/role. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, userId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchOrgsByOrgIdMembersByUserIdRole(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchOrgsByOrgIdMembersByUserIdRole"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /orgs/{orgId}/members/roles. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchOrgsByOrgIdMembersRoles(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchOrgsByOrgIdMembersRoles"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /orgs/{orgId}/profile. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchOrgsByOrgIdProfile(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchOrgsByOrgIdProfile"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /orgs/{orgId}/security. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchOrgsByOrgIdSecurity(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchOrgsByOrgIdSecurity"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /projects/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchProjectsByProjectId(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchProjectsByProjectId"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /projects/{projectId}/api-keys/{keyId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, keyId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchProjectsByProjectIdApiKeysByKeyId(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchProjectsByProjectIdApiKeysByKeyId"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /projects/{projectId}/auth/settings. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchProjectsByProjectIdAuthSettings(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchProjectsByProjectIdAuthSettings"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /projects/{projectId}/env-vars/{envVarId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, envVarId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchProjectsByProjectIdEnvVarsByEnvVarId(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchProjectsByProjectIdEnvVarsByEnvVarId"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /projects/{projectId}/environments/{envId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, envId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchProjectsByProjectIdEnvironmentsByEnvId(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchProjectsByProjectIdEnvironmentsByEnvId"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /projects/{projectId}/settings/addons. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchProjectsByProjectIdSettingsAddons(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchProjectsByProjectIdSettingsAddons"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /projects/{projectId}/settings/api. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchProjectsByProjectIdSettingsApi(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchProjectsByProjectIdSettingsApi"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /projects/{projectId}/settings/compute. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchProjectsByProjectIdSettingsCompute(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchProjectsByProjectIdSettingsCompute"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /projects/{projectId}/settings/jwt. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchProjectsByProjectIdSettingsJwt(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchProjectsByProjectIdSettingsJwt"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /projects/{projectId}/storage/settings. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchProjectsByProjectIdStorageSettings(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchProjectsByProjectIdStorageSettings"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /projects/{projectId}/users/{userId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, userId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchProjectsByProjectIdUsersByUserId(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchProjectsByProjectIdUsersByUserId"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /regions/{key}. API authorization applies to every request.
     * @param path Required unencoded path values: key.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchRegionsByKey(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchRegionsByKey"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /rls/policies/{policyId}. API authorization applies to every request.
     * @param path Required unencoded path values: policyId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchRlsPoliciesByPolicyId(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchRlsPoliciesByPolicyId"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /schema-engine/snippets/{projectId}/{snippetId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, snippetId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchSchemaEngineSnippetsByProjectIdBySnippetId(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchSchemaEngineSnippetsByProjectIdBySnippetId"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /services/{serviceId}/hostname. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchServicesByServiceIdHostname(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchServicesByServiceIdHostname"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /services/{serviceId}/runtime-class. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchServicesByServiceIdRuntimeClass(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchServicesByServiceIdRuntimeClass"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /sso/org/{orgId}/connections/{connectionId}. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchSsoOrgByOrgIdConnectionsByConnectionId(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchSsoOrgByOrgIdConnectionsByConnectionId"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /storage/files/{bucketId}/metadata. API authorization applies to every request.
     * @param path Required unencoded path values: bucketId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchStorageFilesByBucketIdMetadata(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchStorageFilesByBucketIdMetadata"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /users/me. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchUsersMe(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchUsersMe"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /users/me/preferences. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchUsersMePreferences(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchUsersMePreferences"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /v1/data/{projectId}/{table}/bulk. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, table.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchV1DataByProjectIdByTableBulk(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchV1DataByProjectIdByTableBulk"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PATCH /v1/data/{projectId}/{table}/{id}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, table, id.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun patchV1DataByProjectIdByTableById(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("patchV1DataByProjectIdByTableById"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/alert-rule-suggestion. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotAlertRuleSuggestion(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotAlertRuleSuggestion"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/alert-rule-suggestion/estimate. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotAlertRuleSuggestionEstimate(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotAlertRuleSuggestionEstimate"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/chat. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotChat(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotChat"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/chat/stream. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Open response owned by the caller; close it after use.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotChatStream(headers: Map<String, String> = emptyMap()): Response =
        callStream(OperationTable.operations.getValue("postAiCopilotChatStream"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /ai/copilot/execute. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotExecute(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotExecute"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/execution/{executionId}/pause. API authorization applies to every request.
     * @param path Required unencoded path values: executionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotExecutionByExecutionIdPause(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotExecutionByExecutionIdPause"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /ai/copilot/execution/{executionId}/resume. API authorization applies to every request.
     * @param path Required unencoded path values: executionId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotExecutionByExecutionIdResume(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotExecutionByExecutionIdResume"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/execution/{executionId}/rollback. API authorization applies to every request.
     * @param path Required unencoded path values: executionId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotExecutionByExecutionIdRollback(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotExecutionByExecutionIdRollback"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/export/{versionId}. API authorization applies to every request.
     * @param path Required unencoded path values: versionId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotExportByVersionId(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotExportByVersionId"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/export/github. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotExportGithub(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotExportGithub"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/feedback. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotFeedback(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotFeedback"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/generation/{manifestId}/cancel. API authorization applies to every request.
     * @param path Required unencoded path values: manifestId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotGenerationByManifestIdCancel(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotGenerationByManifestIdCancel"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/git/branch. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotGitBranch(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotGitBranch"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/git/clone. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotGitClone(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotGitClone"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/git/commit. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotGitCommit(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotGitCommit"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/git/init. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotGitInit(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotGitInit"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/git/pull. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotGitPull(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotGitPull"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/git/push. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotGitPush(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotGitPush"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/git/write. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotGitWrite(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotGitWrite"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/job. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotJob(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotJob"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/job/{jobId}/cancel. API authorization applies to every request.
     * @param path Required unencoded path values: jobId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotJobByJobIdCancel(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotJobByJobIdCancel"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /ai/copilot/job/{jobId}/retry. API authorization applies to every request.
     * @param path Required unencoded path values: jobId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotJobByJobIdRetry(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotJobByJobIdRetry"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/manifest/{manifestId}/pause. API authorization applies to every request.
     * @param path Required unencoded path values: manifestId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotManifestByManifestIdPause(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotManifestByManifestIdPause"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/memories/{memoryId}/promote. API authorization applies to every request.
     * @param path Required unencoded path values: memoryId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotMemoriesByMemoryIdPromote(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotMemoriesByMemoryIdPromote"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /ai/copilot/rate/{messageId}. API authorization applies to every request.
     * @param path Required unencoded path values: messageId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotRateByMessageId(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotRateByMessageId"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/session/{sessionId}/artifact-body. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotSessionBySessionIdArtifactBody(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotSessionBySessionIdArtifactBody"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/session/{sessionId}/brainstorm/stop. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotSessionBySessionIdBrainstormStop(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotSessionBySessionIdBrainstormStop"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /ai/copilot/session/{sessionId}/workspace/env. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotSessionBySessionIdWorkspaceEnv(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotSessionBySessionIdWorkspaceEnv"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /ai/copilot/session/{sessionId}/workspace/fix. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotSessionBySessionIdWorkspaceFix(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotSessionBySessionIdWorkspaceFix"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/session/{sessionId}/workspace/heartbeat. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotSessionBySessionIdWorkspaceHeartbeat(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotSessionBySessionIdWorkspaceHeartbeat"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /ai/copilot/session/{sessionId}/workspace/install. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotSessionBySessionIdWorkspaceInstall(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotSessionBySessionIdWorkspaceInstall"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /ai/copilot/session/{sessionId}/workspace/prepare. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotSessionBySessionIdWorkspacePrepare(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotSessionBySessionIdWorkspacePrepare"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/session/{sessionId}/workspace/release. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotSessionBySessionIdWorkspaceRelease(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotSessionBySessionIdWorkspaceRelease"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /ai/copilot/session/{sessionId}/workspace/repairs/apply. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotSessionBySessionIdWorkspaceRepairsApply(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotSessionBySessionIdWorkspaceRepairsApply"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /ai/copilot/session/{sessionId}/workspace/restore. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotSessionBySessionIdWorkspaceRestore(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotSessionBySessionIdWorkspaceRestore"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/session/{sessionId}/workspace/run. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotSessionBySessionIdWorkspaceRun(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotSessionBySessionIdWorkspaceRun"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /ai/copilot/session/{sessionId}/workspace/stop. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotSessionBySessionIdWorkspaceStop(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotSessionBySessionIdWorkspaceStop"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /ai/copilot/sessions. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotSessions(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotSessions"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/table-filters. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotTableFilters(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotTableFilters"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/table-filters/estimate. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotTableFiltersEstimate(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotTableFiltersEstimate"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /ai/copilot/training-consent/{sessionId}. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAiCopilotTrainingConsentBySessionId(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAiCopilotTrainingConsentBySessionId"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /alert-rules/project/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAlertRulesProjectByProjectId(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAlertRulesProjectByProjectId"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/account-setup. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthAccountSetup(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthAccountSetup"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/account-setup/check. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthAccountSetupCheck(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthAccountSetupCheck"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/cli/authorize. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthCliAuthorize(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthCliAuthorize"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /auth/cli/callback. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthCliCallback(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthCliCallback"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/cli/deny. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthCliDeny(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthCliDeny"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/cli/login. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthCliLogin(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthCliLogin"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/cli/requests/check. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthCliRequestsCheck(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthCliRequestsCheck"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/cli/token. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthCliToken(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthCliToken"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/forgot-password. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthForgotPassword(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthForgotPassword"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/login. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthLogin(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthLogin"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/logout. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthLogout(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthLogout"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /auth/logout-all. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthLogoutAll(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthLogoutAll"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /auth/me/linked-accounts/{provider}/start. API authorization applies to every request.
     * @param path Required unencoded path values: provider.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthMeLinkedAccountsByProviderStart(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthMeLinkedAccountsByProviderStart"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /auth/mfa/disable. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthMfaDisable(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthMfaDisable"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/mfa/enroll-confirm. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthMfaEnrollConfirm(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthMfaEnrollConfirm"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/mfa/enroll-start. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthMfaEnrollStart(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthMfaEnrollStart"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /auth/mfa/regenerate-codes. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthMfaRegenerateCodes(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthMfaRegenerateCodes"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/mfa/verify. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthMfaVerify(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthMfaVerify"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/reauthenticate. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthReauthenticate(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthReauthenticate"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/refresh. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthRefresh(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthRefresh"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /auth/reset-password. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthResetPassword(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthResetPassword"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/reset-password/check. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthResetPasswordCheck(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthResetPasswordCheck"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/session/device. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthSessionDevice(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthSessionDevice"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/session/token. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthSessionToken(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthSessionToken"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /auth/signup. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthSignup(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthSignup"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/sso/restart. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthSsoRestart(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthSsoRestart"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /auth/tenant/handoff. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthTenantHandoff(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthTenantHandoff"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/tenant/login. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthTenantLogin(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthTenantLogin"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/tenant/logout. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthTenantLogout(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthTenantLogout"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /auth/tenant/mfa/verify. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthTenantMfaVerify(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthTenantMfaVerify"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/tenant/refresh. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthTenantRefresh(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthTenantRefresh"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /auth/tenant/sso/start. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthTenantSsoStart(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthTenantSsoStart"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/verify-email/confirm. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthVerifyEmailConfirm(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthVerifyEmailConfirm"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/verify-email/resend. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthVerifyEmailResend(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthVerifyEmailResend"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /auth/verify-email/send. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postAuthVerifyEmailSend(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postAuthVerifyEmailSend"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/checkout. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingCheckout(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingCheckout"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/enterprise/inquiry. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingEnterpriseInquiry(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingEnterpriseInquiry"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/hosting/checkout. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingHostingCheckout(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingHostingCheckout"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/org/{orgId}/addons. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingOrgByOrgIdAddons(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingOrgByOrgIdAddons"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /billing/org/{orgId}/addons/{addonId}/preview. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, addonId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingOrgByOrgIdAddonsByAddonIdPreview(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingOrgByOrgIdAddonsByAddonIdPreview"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/org/{orgId}/addons/preview. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingOrgByOrgIdAddonsPreview(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingOrgByOrgIdAddonsPreview"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/org/{orgId}/cancel. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingOrgByOrgIdCancel(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingOrgByOrgIdCancel"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/org/{orgId}/card-check/confirm. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingOrgByOrgIdCardCheckConfirm(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingOrgByOrgIdCardCheckConfirm"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/org/{orgId}/card-check/session. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingOrgByOrgIdCardCheckSession(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingOrgByOrgIdCardCheckSession"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/org/{orgId}/change-plan. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingOrgByOrgIdChangePlan(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingOrgByOrgIdChangePlan"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/org/{orgId}/change-plan/preview. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingOrgByOrgIdChangePlanPreview(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingOrgByOrgIdChangePlanPreview"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/org/{orgId}/contacts. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingOrgByOrgIdContacts(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingOrgByOrgIdContacts"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/org/{orgId}/credits/purchase. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingOrgByOrgIdCreditsPurchase(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingOrgByOrgIdCreditsPurchase"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/org/{orgId}/pause. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingOrgByOrgIdPause(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingOrgByOrgIdPause"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /billing/org/{orgId}/portal. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingOrgByOrgIdPortal(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingOrgByOrgIdPortal"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/org/{orgId}/reactivate. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingOrgByOrgIdReactivate(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingOrgByOrgIdReactivate"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /billing/org/{orgId}/resume. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingOrgByOrgIdResume(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingOrgByOrgIdResume"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /billing/org/{orgId}/usage-alerts. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingOrgByOrgIdUsageAlerts(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingOrgByOrgIdUsageAlerts"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/promo-codes/validate. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingPromoCodesValidate(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingPromoCodesValidate"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/redeem-promo. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingRedeemPromo(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingRedeemPromo"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /billing/webhook. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBillingWebhook(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBillingWebhook"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /buckets/{bucketId}/signed-url. API authorization applies to every request.
     * @param path Required unencoded path values: bucketId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBucketsByBucketIdSignedUrl(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBucketsByBucketIdSignedUrl"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /buckets/{bucketId}/upload. API authorization applies to every request.
     * @param path Required unencoded path values: bucketId.
     * @param body Required binary request body.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBucketsByBucketIdUpload(path: Map<String, String>, body: ByteArray, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBucketsByBucketIdUpload"), path, query, body, headers)

    /**
     * Executes POST /buckets/{bucketId}/upload-url. API authorization applies to every request.
     * @param path Required unencoded path values: bucketId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postBucketsByBucketIdUploadUrl(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postBucketsByBucketIdUploadUrl"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /contact. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postContact(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postContact"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /database/connector/{projectId}/query. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postDatabaseConnectorByProjectIdQuery(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postDatabaseConnectorByProjectIdQuery"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /database/connector/{projectId}/test. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postDatabaseConnectorByProjectIdTest(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postDatabaseConnectorByProjectIdTest"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /database/extensions/project/{projectId}/install. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postDatabaseExtensionsProjectByProjectIdInstall(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postDatabaseExtensionsProjectByProjectIdInstall"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /database/wrappers/project/{projectId}/install. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postDatabaseWrappersProjectByProjectIdInstall(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postDatabaseWrappersProjectByProjectIdInstall"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /deployments/{deploymentId}/rollback. API authorization applies to every request.
     * @param path Required unencoded path values: deploymentId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postDeploymentsByDeploymentIdRollback(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postDeploymentsByDeploymentIdRollback"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /deployments/promote. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postDeploymentsPromote(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postDeploymentsPromote"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /deployments/tokens. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postDeploymentsTokens(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postDeploymentsTokens"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /deployments/tokens/{tokenId}/revoke. API authorization applies to every request.
     * @param path Required unencoded path values: tokenId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postDeploymentsTokensByTokenIdRevoke(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postDeploymentsTokensByTokenIdRevoke"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /deployments/trigger. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postDeploymentsTrigger(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postDeploymentsTrigger"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /docs/feedback. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postDocsFeedback(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postDocsFeedback"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /docs/search-click. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postDocsSearchClick(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postDocsSearchClick"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /enterprise/inquire. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postEnterpriseInquire(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postEnterpriseInquire"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /enterprise/quotes/{quoteId}/accept. API authorization applies to every request.
     * @param path Required unencoded path values: quoteId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postEnterpriseQuotesByQuoteIdAccept(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postEnterpriseQuotesByQuoteIdAccept"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /entitlements/org/{orgId}/check. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postEntitlementsOrgByOrgIdCheck(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postEntitlementsOrgByOrgIdCheck"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /functions. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postFunctions(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postFunctions"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /functions/{functionIdOrName}/invoke. API authorization applies to every request.
     * @param path Required unencoded path values: functionIdOrName.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postFunctionsByFunctionIdOrNameInvoke(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postFunctionsByFunctionIdOrNameInvoke"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /functions/{functionId}/triggers. API authorization applies to every request.
     * @param path Required unencoded path values: functionId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postFunctionsByFunctionIdTriggers(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postFunctionsByFunctionIdTriggers"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /functions/secrets. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postFunctionsSecrets(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postFunctionsSecrets"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /generated/{table}. API authorization applies to every request.
     * @param path Required unencoded path values: table.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postGeneratedByTable(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postGeneratedByTable"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /generated/{table}/bulk. API authorization applies to every request.
     * @param path Required unencoded path values: table.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postGeneratedByTableBulk(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postGeneratedByTableBulk"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /generated/{table}/query. API authorization applies to every request.
     * @param path Required unencoded path values: table.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postGeneratedByTableQuery(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postGeneratedByTableQuery"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /incidents. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postIncidents(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postIncidents"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /incidents/bulk. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postIncidentsBulk(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postIncidentsBulk"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /incidents/{incidentId}/ack. API authorization applies to every request.
     * @param path Required unencoded path values: incidentId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postIncidentsByIncidentIdAck(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postIncidentsByIncidentIdAck"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /incidents/{incidentId}/resolve. API authorization applies to every request.
     * @param path Required unencoded path values: incidentId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postIncidentsByIncidentIdResolve(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postIncidentsByIncidentIdResolve"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /infrastructure/poll-status. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postInfrastructurePollStatus(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postInfrastructurePollStatus"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /integrations/deliveries/{deliveryId}/retry. API authorization applies to every request.
     * @param path Required unencoded path values: deliveryId.
     * @param body Optional json request body.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postIntegrationsDeliveriesByDeliveryIdRetry(path: Map<String, String>, body: JsonElement? = null, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postIntegrationsDeliveriesByDeliveryIdRetry"), path, query, body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /integrations/subscriptions. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postIntegrationsSubscriptions(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postIntegrationsSubscriptions"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /integrations/subscriptions/{id}/test. API authorization applies to every request.
     * @param path Required unencoded path values: id.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postIntegrationsSubscriptionsByIdTest(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postIntegrationsSubscriptionsByIdTest"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /mcp/audit. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMcpAudit(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMcpAudit"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mcp/oauth/register. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMcpOauthRegister(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMcpOauthRegister"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mcp/oauth/requests/{requestId}/approve. API authorization applies to every request.
     * @param path Required unencoded path values: requestId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMcpOauthRequestsByRequestIdApprove(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMcpOauthRequestsByRequestIdApprove"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mcp/oauth/requests/{requestId}/deny. API authorization applies to every request.
     * @param path Required unencoded path values: requestId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMcpOauthRequestsByRequestIdDeny(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMcpOauthRequestsByRequestIdDeny"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /mcp/oauth/revoke. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMcpOauthRevoke(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMcpOauthRevoke"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mcp/oauth/token. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMcpOauthToken(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMcpOauthToken"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /me/early/welcome-seen. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMeEarlyWelcomeSeen(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMeEarlyWelcomeSeen"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /mongodb/{collection}/aggregate. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionAggregate(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionAggregate"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/aggregate/cursor. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionAggregateCursor(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionAggregateCursor"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/bulkWrite. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionBulkWrite(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionBulkWrite"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/count. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionCount(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionCount"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/cursor/{cursorId}/close. API authorization applies to every request.
     * @param path Required unencoded path values: collection, cursorId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionCursorByCursorIdClose(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionCursorByCursorIdClose"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /mongodb/{collection}/cursor/{cursorId}/next. API authorization applies to every request.
     * @param path Required unencoded path values: collection, cursorId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionCursorByCursorIdNext(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionCursorByCursorIdNext"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /mongodb/{collection}/deleteMany. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionDeleteMany(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionDeleteMany"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/deleteOne. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionDeleteOne(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionDeleteOne"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/distinct. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionDistinct(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionDistinct"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/find. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionFind(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionFind"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/find/cursor. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionFindCursor(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionFindCursor"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/findOne. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionFindOne(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionFindOne"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/findOneAndDelete. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionFindOneAndDelete(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionFindOneAndDelete"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/findOneAndReplace. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionFindOneAndReplace(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionFindOneAndReplace"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/findOneAndUpdate. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionFindOneAndUpdate(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionFindOneAndUpdate"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/indexes. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionIndexes(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionIndexes"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/insertMany. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionInsertMany(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionInsertMany"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/insertOne. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionInsertOne(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionInsertOne"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/replaceOne. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionReplaceOne(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionReplaceOne"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/updateMany. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionUpdateMany(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionUpdateMany"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/{collection}/updateOne. API authorization applies to every request.
     * @param path Required unencoded path values: collection.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbByCollectionUpdateOne(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbByCollectionUpdateOne"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/collections. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbCollections(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbCollections"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/collections/{name}/rename. API authorization applies to every request.
     * @param path Required unencoded path values: name.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbCollectionsByNameRename(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbCollectionsByNameRename"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /mongodb/command. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postMongodbCommand(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postMongodbCommand"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /oauth/callback. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOauthCallback(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOauthCallback"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /oauth/org/{orgId}/configure. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOauthOrgByOrgIdConfigure(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOauthOrgByOrgIdConfigure"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /oauth/org/{orgId}/provider/{provider}/refresh. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, provider.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOauthOrgByOrgIdProviderByProviderRefresh(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOauthOrgByOrgIdProviderByProviderRefresh"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /onboarding/org/{orgId}/auto-setup. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOnboardingOrgByOrgIdAutoSetup(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOnboardingOrgByOrgIdAutoSetup"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /onboarding/org/{orgId}/complete-step. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOnboardingOrgByOrgIdCompleteStep(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOnboardingOrgByOrgIdCompleteStep"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /orgs. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgs(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgs"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /orgs/{orgId}/change-requests. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsByOrgIdChangeRequests(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsByOrgIdChangeRequests"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /orgs/{orgId}/invites/{inviteId}/resend. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, inviteId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsByOrgIdInvitesByInviteIdResend(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsByOrgIdInvitesByInviteIdResend"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /orgs/{orgId}/leave-requests. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsByOrgIdLeaveRequests(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsByOrgIdLeaveRequests"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /orgs/{orgId}/leave-requests/{requestId}/approve. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, requestId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsByOrgIdLeaveRequestsByRequestIdApprove(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsByOrgIdLeaveRequestsByRequestIdApprove"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /orgs/{orgId}/leave-requests/{requestId}/decline. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, requestId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsByOrgIdLeaveRequestsByRequestIdDecline(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsByOrgIdLeaveRequestsByRequestIdDecline"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /orgs/{orgId}/members/invite. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsByOrgIdMembersInvite(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsByOrgIdMembersInvite"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /orgs/{orgId}/support/tickets. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsByOrgIdSupportTickets(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsByOrgIdSupportTickets"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /orgs/{orgId}/support/tickets/{number}/messages. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, number.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsByOrgIdSupportTicketsByNumberMessages(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsByOrgIdSupportTicketsByNumberMessages"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /orgs/{orgId}/support/tickets/{number}/reopen. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, number.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsByOrgIdSupportTicketsByNumberReopen(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsByOrgIdSupportTicketsByNumberReopen"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /orgs/{orgId}/support/tickets/{number}/resolve. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, number.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsByOrgIdSupportTicketsByNumberResolve(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsByOrgIdSupportTicketsByNumberResolve"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /orgs/{orgId}/transfer. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsByOrgIdTransfer(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsByOrgIdTransfer"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /orgs/{orgId}/transfers/{id}/resend. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, id.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsByOrgIdTransfersByIdResend(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsByOrgIdTransfersByIdResend"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /orgs/first. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsFirst(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsFirst"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /orgs/invites/accept. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsInvitesAccept(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsInvitesAccept"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /orgs/invites/decline. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsInvitesDecline(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsInvitesDecline"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /orgs/transfers/accept. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsTransfersAccept(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsTransfersAccept"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /orgs/transfers/decline. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postOrgsTransfersDecline(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postOrgsTransfersDecline"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /plans/apply. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postPlansApply(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postPlansApply"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /plans/save. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postPlansSave(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postPlansSave"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjects(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjects"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/api-keys. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdApiKeys(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdApiKeys"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/api-keys/{keyId}/reveal. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, keyId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdApiKeysByKeyIdReveal(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdApiKeysByKeyIdReveal"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/api-keys/{keyId}/revoke. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, keyId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdApiKeysByKeyIdRevoke(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdApiKeysByKeyIdRevoke"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/api-keys/{keyId}/rotate. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, keyId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdApiKeysByKeyIdRotate(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdApiKeysByKeyIdRotate"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/api-keys/split. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdApiKeysSplit(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdApiKeysSplit"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/auth/forgot-password. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthForgotPassword(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthForgotPassword"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/auth/login. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthLogin(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthLogin"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/auth/logout. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthLogout(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthLogout"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/auth/magic/send. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthMagicSend(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthMagicSend"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/auth/mfa/disable. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthMfaDisable(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthMfaDisable"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/auth/mfa/enroll-confirm. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthMfaEnrollConfirm(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthMfaEnrollConfirm"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/auth/mfa/enroll-start. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthMfaEnrollStart(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthMfaEnrollStart"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/auth/mfa/regenerate-codes. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthMfaRegenerateCodes(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthMfaRegenerateCodes"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/auth/mfa/verify. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthMfaVerify(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthMfaVerify"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/auth/oauth/{provider}/start. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, provider.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthOauthByProviderStart(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthOauthByProviderStart"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/auth/oauth/token. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthOauthToken(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthOauthToken"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/auth/refresh. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthRefresh(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthRefresh"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/auth/reset-password. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthResetPassword(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthResetPassword"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/auth/signup. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthSignup(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthSignup"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/auth/sync-users. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthSyncUsers(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthSyncUsers"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/auth/verify-email/confirm. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthVerifyEmailConfirm(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthVerifyEmailConfirm"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/auth/verify-email/send. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdAuthVerifyEmailSend(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdAuthVerifyEmailSend"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/branches. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdBranches(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdBranches"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/database/dedicated. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdDatabaseDedicated(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdDatabaseDedicated"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/database/dedicated/restart. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdDatabaseDedicatedRestart(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdDatabaseDedicatedRestart"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/db/reset. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdDbReset(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdDbReset"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/env-vars. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdEnvVars(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdEnvVars"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/environments. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdEnvironments(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdEnvironments"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/environments/backfill-urls. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdEnvironmentsBackfillUrls(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdEnvironmentsBackfillUrls"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/environments/bootstrap. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdEnvironmentsBootstrap(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdEnvironmentsBootstrap"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/environments/{envId}/domains/{domainId}/verify. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, envId, domainId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdEnvironmentsByEnvIdDomainsByDomainIdVerify(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdEnvironmentsByEnvIdDomainsByDomainIdVerify"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/environments/{envId}/provision-ssl. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, envId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdEnvironmentsByEnvIdProvisionSsl(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdEnvironmentsByEnvIdProvisionSsl"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/environments/{envId}/verify-cname. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, envId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdEnvironmentsByEnvIdVerifyCname(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdEnvironmentsByEnvIdVerifyCname"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/environments/{envId}/verify-domain. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, envId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdEnvironmentsByEnvIdVerifyDomain(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdEnvironmentsByEnvIdVerifyDomain"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/github/branch. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdGithubBranch(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdGithubBranch"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/github/connect. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdGithubConnect(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdGithubConnect"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/github/pull. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdGithubPull(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdGithubPull"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/github/push. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdGithubPush(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdGithubPush"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/infrastructure/{instanceId}/migrate-now. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, instanceId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdInfrastructureByInstanceIdMigrateNow(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdInfrastructureByInstanceIdMigrateNow"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/infrastructure/{instanceId}/replica. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, instanceId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdInfrastructureByInstanceIdReplica(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdInfrastructureByInstanceIdReplica"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/infrastructure/{instanceId}/replica-preview. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, instanceId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdInfrastructureByInstanceIdReplicaPreview(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdInfrastructureByInstanceIdReplicaPreview"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/infrastructure/{instanceId}/resize. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, instanceId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdInfrastructureByInstanceIdResize(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdInfrastructureByInstanceIdResize"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/infrastructure/{instanceId}/resize-custom. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, instanceId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdInfrastructureByInstanceIdResizeCustom(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdInfrastructureByInstanceIdResizeCustom"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/infrastructure/{instanceId}/start. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, instanceId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdInfrastructureByInstanceIdStart(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdInfrastructureByInstanceIdStart"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/infrastructure/{instanceId}/stop. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, instanceId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdInfrastructureByInstanceIdStop(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdInfrastructureByInstanceIdStop"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/infrastructure/{instanceId}/switch. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, instanceId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdInfrastructureByInstanceIdSwitch(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdInfrastructureByInstanceIdSwitch"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/infrastructure/included/retry. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdInfrastructureIncludedRetry(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdInfrastructureIncludedRetry"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/infrastructure/migration/retry. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdInfrastructureMigrationRetry(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdInfrastructureMigrationRetry"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/infrastructure/migration/rollback. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdInfrastructureMigrationRollback(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdInfrastructureMigrationRollback"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/infrastructure/provision. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdInfrastructureProvision(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdInfrastructureProvision"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/infrastructure/provision-custom. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdInfrastructureProvisionCustom(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdInfrastructureProvisionCustom"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/infrastructure/provision-preview. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdInfrastructureProvisionPreview(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdInfrastructureProvisionPreview"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/infrastructure/restores/preview. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdInfrastructureRestoresPreview(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdInfrastructureRestoresPreview"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/members. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdMembers(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdMembers"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/promotions. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdPromotions(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdPromotions"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/region. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdRegion(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdRegion"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/settings/jwt/rotate. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdSettingsJwtRotate(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdSettingsJwtRotate"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/users. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdUsers(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdUsers"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/users/{userId}/ban. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, userId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdUsersByUserIdBan(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdUsersByUserIdBan"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/users/{userId}/send-magic-link. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, userId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdUsersByUserIdSendMagicLink(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdUsersByUserIdSendMagicLink"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /projects/{projectId}/users/{userId}/sessions/revoke-all. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, userId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdUsersByUserIdSessionsRevokeAll(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdUsersByUserIdSessionsRevokeAll"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /projects/{projectId}/users/{userId}/unban. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, userId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postProjectsByProjectIdUsersByUserIdUnban(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postProjectsByProjectIdUsersByUserIdUnban"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /realtime/console-token. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postRealtimeConsoleToken(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postRealtimeConsoleToken"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /realtime/enable-all. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postRealtimeEnableAll(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postRealtimeEnableAll"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /realtime/install. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postRealtimeInstall(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postRealtimeInstall"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /realtime/token. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postRealtimeToken(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postRealtimeToken"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /realtime/uninstall. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postRealtimeUninstall(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postRealtimeUninstall"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /regions. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postRegions(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postRegions"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /regions/health/check. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postRegionsHealthCheck(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postRegionsHealthCheck"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /rls/policies/{policyId}/toggle. API authorization applies to every request.
     * @param path Required unencoded path values: policyId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postRlsPoliciesByPolicyIdToggle(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postRlsPoliciesByPolicyIdToggle"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /rls/policies/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postRlsPoliciesByProjectId(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postRlsPoliciesByProjectId"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /schema-engine/analyze/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSchemaEngineAnalyzeByProjectId(path: Map<String, String>, body: JsonElement, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSchemaEngineAnalyzeByProjectId"), path, query, body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /schema-engine/apply. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSchemaEngineApply(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSchemaEngineApply"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /schema-engine/editor-sessions/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSchemaEngineEditorSessionsByProjectId(path: Map<String, String>, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSchemaEngineEditorSessionsByProjectId"), path, query, null, headers)

    /**
     * Executes POST /schema-engine/editor-sessions/{projectId}/close. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSchemaEngineEditorSessionsByProjectIdClose(path: Map<String, String>, body: JsonElement, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSchemaEngineEditorSessionsByProjectIdClose"), path, query, body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /schema-engine/migrations/{projectId}/{migrationId}/rollback. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, migrationId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSchemaEngineMigrationsByProjectIdByMigrationIdRollback(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSchemaEngineMigrationsByProjectIdByMigrationIdRollback"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /schema-engine/preview. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSchemaEnginePreview(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSchemaEnginePreview"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /schema-engine/push/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSchemaEnginePushByProjectId(path: Map<String, String>, body: JsonElement, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSchemaEnginePushByProjectId"), path, query, body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /schema-engine/query/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSchemaEngineQueryByProjectId(path: Map<String, String>, body: JsonElement, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSchemaEngineQueryByProjectId"), path, query, body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /schema-engine/snippets/{projectId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSchemaEngineSnippetsByProjectId(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSchemaEngineSnippetsByProjectId"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /schemas. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSchemas(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSchemas"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /services. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postServices(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postServices"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /services/{serviceId}/deploy. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postServicesByServiceIdDeploy(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postServicesByServiceIdDeploy"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /services/{serviceId}/domains. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postServicesByServiceIdDomains(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postServicesByServiceIdDomains"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /services/{serviceId}/domains/{domainId}/verify. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId, domainId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postServicesByServiceIdDomainsByDomainIdVerify(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postServicesByServiceIdDomainsByDomainIdVerify"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /services/{serviceId}/git/connect. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postServicesByServiceIdGitConnect(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postServicesByServiceIdGitConnect"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /services/{serviceId}/promote. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postServicesByServiceIdPromote(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postServicesByServiceIdPromote"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /services/{serviceId}/rollback. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postServicesByServiceIdRollback(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postServicesByServiceIdRollback"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /services/{serviceId}/stop. API authorization applies to every request.
     * @param path Required unencoded path values: serviceId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postServicesByServiceIdStop(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postServicesByServiceIdStop"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /sso/org/{orgId}/configure. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSsoOrgByOrgIdConfigure(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSsoOrgByOrgIdConfigure"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /sso/org/{orgId}/connections/{connectionId}/certificates. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSsoOrgByOrgIdConnectionsByConnectionIdCertificates(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSsoOrgByOrgIdConnectionsByConnectionIdCertificates"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /sso/org/{orgId}/connections/{connectionId}/certificates/{certId}/promote. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId, certId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSsoOrgByOrgIdConnectionsByConnectionIdCertificatesByCertIdPromote(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSsoOrgByOrgIdConnectionsByConnectionIdCertificatesByCertIdPromote"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /sso/org/{orgId}/connections/{connectionId}/disable. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSsoOrgByOrgIdConnectionsByConnectionIdDisable(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSsoOrgByOrgIdConnectionsByConnectionIdDisable"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /sso/org/{orgId}/connections/{connectionId}/enable. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSsoOrgByOrgIdConnectionsByConnectionIdEnable(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSsoOrgByOrgIdConnectionsByConnectionIdEnable"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /sso/org/{orgId}/connections/{connectionId}/metadata/import. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSsoOrgByOrgIdConnectionsByConnectionIdMetadataImport(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSsoOrgByOrgIdConnectionsByConnectionIdMetadataImport"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /sso/org/{orgId}/connections/{connectionId}/release-account. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSsoOrgByOrgIdConnectionsByConnectionIdReleaseAccount(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSsoOrgByOrgIdConnectionsByConnectionIdReleaseAccount"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /sso/org/{orgId}/connections/{connectionId}/scim/tokens. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSsoOrgByOrgIdConnectionsByConnectionIdScimTokens(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSsoOrgByOrgIdConnectionsByConnectionIdScimTokens"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /sso/org/{orgId}/connections/{connectionId}/test. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSsoOrgByOrgIdConnectionsByConnectionIdTest(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSsoOrgByOrgIdConnectionsByConnectionIdTest"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /sso/org/{orgId}/connections/{connectionId}/verify-domain. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSsoOrgByOrgIdConnectionsByConnectionIdVerifyDomain(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSsoOrgByOrgIdConnectionsByConnectionIdVerifyDomain"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /sso/org/{orgId}/outside-members/blocked/{userId}/restore. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, userId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postSsoOrgByOrgIdOutsideMembersBlockedByUserIdRestore(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postSsoOrgByOrgIdOutsideMembersBlockedByUserIdRestore"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /status/subscribe. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStatusSubscribe(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStatusSubscribe"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /storage/buckets. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageBuckets(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageBuckets"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /storage/buckets/{bucketId}/policies. API authorization applies to every request.
     * @param path Required unencoded path values: bucketId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageBucketsByBucketIdPolicies(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageBucketsByBucketIdPolicies"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /storage/buckets/{bucketId}/policies/{policyId}/toggle. API authorization applies to every request.
     * @param path Required unencoded path values: bucketId, policyId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageBucketsByBucketIdPoliciesByPolicyIdToggle(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageBucketsByBucketIdPoliciesByPolicyIdToggle"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /storage/buckets/{bucketId}/policies/simulate. API authorization applies to every request.
     * @param path Required unencoded path values: bucketId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageBucketsByBucketIdPoliciesSimulate(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageBucketsByBucketIdPoliciesSimulate"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /storage/download-url. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageDownloadUrl(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageDownloadUrl"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /storage/files/copy. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageFilesCopy(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageFilesCopy"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /storage/files/delete-batch. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageFilesDeleteBatch(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageFilesDeleteBatch"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /storage/files/move. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageFilesMove(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageFilesMove"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /storage/multipart/{uploadId}/abort. API authorization applies to every request.
     * @param path Required unencoded path values: uploadId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageMultipartByUploadIdAbort(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageMultipartByUploadIdAbort"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /storage/multipart/{uploadId}/complete. API authorization applies to every request.
     * @param path Required unencoded path values: uploadId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageMultipartByUploadIdComplete(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageMultipartByUploadIdComplete"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /storage/multipart/{uploadId}/part-url. API authorization applies to every request.
     * @param path Required unencoded path values: uploadId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageMultipartByUploadIdPartUrl(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageMultipartByUploadIdPartUrl"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /storage/multipart/create. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageMultipartCreate(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageMultipartCreate"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /storage/multipart/resume. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageMultipartResume(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageMultipartResume"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /storage/upload. API authorization applies to every request.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageUpload(query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageUpload"), emptyMap(), query, null, headers)

    /**
     * Executes POST /storage/upload-base64. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageUploadBase64(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageUploadBase64"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /storage/upload-from-url. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageUploadFromUrl(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageUploadFromUrl"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /storage/upload-url. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postStorageUploadUrl(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postStorageUploadUrl"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /templates. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postTemplates(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postTemplates"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /templates/create-project. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postTemplatesCreateProject(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postTemplatesCreateProject"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /templates/from-project. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postTemplatesFromProject(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postTemplatesFromProject"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /templates/from-project/preview. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postTemplatesFromProjectPreview(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postTemplatesFromProjectPreview"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /templates/install/apply. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postTemplatesInstallApply(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postTemplatesInstallApply"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /templates/install/{installId}/rollback. API authorization applies to every request.
     * @param path Required unencoded path values: installId.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postTemplatesInstallByInstallIdRollback(path: Map<String, String>, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postTemplatesInstallByInstallIdRollback"), path, JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /templates/install/preview. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postTemplatesInstallPreview(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postTemplatesInstallPreview"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /users/me/change-password. API authorization applies to every request.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postUsersMeChangePassword(body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postUsersMeChangePassword"), emptyMap(), JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /users/me/request-account-delete. API authorization applies to every request.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postUsersMeRequestAccountDelete(headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postUsersMeRequestAccountDelete"), emptyMap(), JsonObject(emptyMap()), null, headers)

    /**
     * Executes POST /v1/data/{projectId}/{table}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, table.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postV1DataByProjectIdByTable(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postV1DataByProjectIdByTable"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /v1/data/{projectId}/{table}/bulk. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, table.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postV1DataByProjectIdByTableBulk(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postV1DataByProjectIdByTableBulk"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /v1/data/{projectId}/{table}/query. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, table.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postV1DataByProjectIdByTableQuery(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postV1DataByProjectIdByTableQuery"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes POST /webhooks/github. API authorization applies to every request.
     * @param body Optional json request body.
     * @param query Query values; arrays repeat keys and objects use bracket notation.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun postWebhooksGithub(body: JsonElement? = null, query: JsonObject = JsonObject(emptyMap()), headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("postWebhooksGithub"), emptyMap(), query, body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /ai/copilot/session/{sessionId}/editor-files. API authorization applies to every request.
     * @param path Required unencoded path values: sessionId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putAiCopilotSessionBySessionIdEditorFiles(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putAiCopilotSessionBySessionIdEditorFiles"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /alert-rules/{ruleId}. API authorization applies to every request.
     * @param path Required unencoded path values: ruleId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putAlertRulesByRuleId(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putAlertRulesByRuleId"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /billing/org/{orgId}/credits/auto-topup. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putBillingOrgByOrgIdCreditsAutoTopup(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putBillingOrgByOrgIdCreditsAutoTopup"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /billing/org/{orgId}/founder/wall. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putBillingOrgByOrgIdFounderWall(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putBillingOrgByOrgIdFounderWall"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /billing/org/{orgId}/tax-info. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putBillingOrgByOrgIdTaxInfo(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putBillingOrgByOrgIdTaxInfo"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /buckets/{bucketId}. API authorization applies to every request.
     * @param path Required unencoded path values: bucketId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putBucketsByBucketId(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putBucketsByBucketId"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /functions/{functionId}/schedule. API authorization applies to every request.
     * @param path Required unencoded path values: functionId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putFunctionsByFunctionIdSchedule(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putFunctionsByFunctionIdSchedule"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /functions/{functionId}/source. API authorization applies to every request.
     * @param path Required unencoded path values: functionId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putFunctionsByFunctionIdSource(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putFunctionsByFunctionIdSource"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /functions/secrets/{secretId}. API authorization applies to every request.
     * @param path Required unencoded path values: secretId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putFunctionsSecretsBySecretId(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putFunctionsSecretsBySecretId"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /me/console-look. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putMeConsoleLook(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putMeConsoleLook"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /me/early/wall. API authorization applies to every request.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putMeEarlyWall(body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putMeEarlyWall"), emptyMap(), JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /projects/{projectId}/auth/oauth-apps/{provider}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, provider.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putProjectsByProjectIdAuthOauthAppsByProvider(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putProjectsByProjectIdAuthOauthAppsByProvider"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /projects/{projectId}/environments/promotion-order. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putProjectsByProjectIdEnvironmentsPromotionOrder(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putProjectsByProjectIdEnvironmentsPromotionOrder"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /projects/{projectId}/frontend. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putProjectsByProjectIdFrontend(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putProjectsByProjectIdFrontend"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /projects/{projectId}/getting-started/hidden. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putProjectsByProjectIdGettingStartedHidden(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putProjectsByProjectIdGettingStartedHidden"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /projects/{projectId}/members. API authorization applies to every request.
     * @param path Required unencoded path values: projectId.
     * @param body Required json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putProjectsByProjectIdMembers(path: Map<String, String>, body: JsonElement, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putProjectsByProjectIdMembers"), path, JsonObject(emptyMap()), body.toString().toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /projects/{projectId}/members/{userId}. API authorization applies to every request.
     * @param path Required unencoded path values: projectId, userId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putProjectsByProjectIdMembersByUserId(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putProjectsByProjectIdMembersByUserId"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /sso/org/{orgId}/connections/{connectionId}/break-glass. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putSsoOrgByOrgIdConnectionsByConnectionIdBreakGlass(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putSsoOrgByOrgIdConnectionsByConnectionIdBreakGlass"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /sso/org/{orgId}/connections/{connectionId}/group-mappings. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putSsoOrgByOrgIdConnectionsByConnectionIdGroupMappings(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putSsoOrgByOrgIdConnectionsByConnectionIdGroupMappings"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /sso/org/{orgId}/connections/{connectionId}/require. API authorization applies to every request.
     * @param path Required unencoded path values: orgId, connectionId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putSsoOrgByOrgIdConnectionsByConnectionIdRequire(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putSsoOrgByOrgIdConnectionsByConnectionIdRequire"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /sso/org/{orgId}/outside-members/allow. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putSsoOrgByOrgIdOutsideMembersAllow(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putSsoOrgByOrgIdOutsideMembersAllow"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /sso/org/{orgId}/outside-members/policy. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putSsoOrgByOrgIdOutsideMembersPolicy(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putSsoOrgByOrgIdOutsideMembersPolicy"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /sso/org/{orgId}/security-contact. API authorization applies to every request.
     * @param path Required unencoded path values: orgId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putSsoOrgByOrgIdSecurityContact(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putSsoOrgByOrgIdSecurityContact"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

    /**
     * Executes PUT /storage/buckets/{bucketId}/policies/{policyId}. API authorization applies to every request.
     * @param path Required unencoded path values: bucketId, policyId.
     * @param body Optional json request body.
     * @param headers Additional headers; these can override default credentials.
     * @return Decoded JSON, or JsonNull for an empty response.
     * @throws VaifException On invalid arguments, API errors or transport failures. Cancellation propagates unchanged.
     */
    public suspend fun putStorageBucketsByBucketIdPoliciesByPolicyId(path: Map<String, String>, body: JsonElement? = null, headers: Map<String, String> = emptyMap()): JsonElement =
        callJson(OperationTable.operations.getValue("putStorageBucketsByBucketIdPoliciesByPolicyId"), path, JsonObject(emptyMap()), body?.toString()?.toByteArray(Charsets.UTF_8), headers)

}
