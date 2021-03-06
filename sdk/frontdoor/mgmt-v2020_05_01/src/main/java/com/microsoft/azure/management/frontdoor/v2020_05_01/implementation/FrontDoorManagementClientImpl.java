/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.LongRunningFinalState;
import com.microsoft.azure.LongRunningOperationOptions;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the FrontDoorManagementClientImpl class.
 */
public class FrontDoorManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID forms part of the URI for every service call. */
    private String subscriptionId;

    /**
     * Gets The subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public FrontDoorManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public FrontDoorManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public FrontDoorManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public FrontDoorManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The NetworkExperimentProfilesInner object to access its operations.
     */
    private NetworkExperimentProfilesInner networkExperimentProfiles;

    /**
     * Gets the NetworkExperimentProfilesInner object to access its operations.
     * @return the NetworkExperimentProfilesInner object.
     */
    public NetworkExperimentProfilesInner networkExperimentProfiles() {
        return this.networkExperimentProfiles;
    }

    /**
     * The PreconfiguredEndpointsInner object to access its operations.
     */
    private PreconfiguredEndpointsInner preconfiguredEndpoints;

    /**
     * Gets the PreconfiguredEndpointsInner object to access its operations.
     * @return the PreconfiguredEndpointsInner object.
     */
    public PreconfiguredEndpointsInner preconfiguredEndpoints() {
        return this.preconfiguredEndpoints;
    }

    /**
     * The ExperimentsInner object to access its operations.
     */
    private ExperimentsInner experiments;

    /**
     * Gets the ExperimentsInner object to access its operations.
     * @return the ExperimentsInner object.
     */
    public ExperimentsInner experiments() {
        return this.experiments;
    }

    /**
     * The ReportsInner object to access its operations.
     */
    private ReportsInner reports;

    /**
     * Gets the ReportsInner object to access its operations.
     * @return the ReportsInner object.
     */
    public ReportsInner reports() {
        return this.reports;
    }

    /**
     * The FrontDoorNameAvailabilitysInner object to access its operations.
     */
    private FrontDoorNameAvailabilitysInner frontDoorNameAvailabilitys;

    /**
     * Gets the FrontDoorNameAvailabilitysInner object to access its operations.
     * @return the FrontDoorNameAvailabilitysInner object.
     */
    public FrontDoorNameAvailabilitysInner frontDoorNameAvailabilitys() {
        return this.frontDoorNameAvailabilitys;
    }

    /**
     * The FrontDoorNameAvailabilityWithSubscriptionsInner object to access its operations.
     */
    private FrontDoorNameAvailabilityWithSubscriptionsInner frontDoorNameAvailabilityWithSubscriptions;

    /**
     * Gets the FrontDoorNameAvailabilityWithSubscriptionsInner object to access its operations.
     * @return the FrontDoorNameAvailabilityWithSubscriptionsInner object.
     */
    public FrontDoorNameAvailabilityWithSubscriptionsInner frontDoorNameAvailabilityWithSubscriptions() {
        return this.frontDoorNameAvailabilityWithSubscriptions;
    }

    /**
     * The FrontDoorsInner object to access its operations.
     */
    private FrontDoorsInner frontDoors;

    /**
     * Gets the FrontDoorsInner object to access its operations.
     * @return the FrontDoorsInner object.
     */
    public FrontDoorsInner frontDoors() {
        return this.frontDoors;
    }

    /**
     * The FrontendEndpointsInner object to access its operations.
     */
    private FrontendEndpointsInner frontendEndpoints;

    /**
     * Gets the FrontendEndpointsInner object to access its operations.
     * @return the FrontendEndpointsInner object.
     */
    public FrontendEndpointsInner frontendEndpoints() {
        return this.frontendEndpoints;
    }

    /**
     * The EndpointsInner object to access its operations.
     */
    private EndpointsInner endpoints;

    /**
     * Gets the EndpointsInner object to access its operations.
     * @return the EndpointsInner object.
     */
    public EndpointsInner endpoints() {
        return this.endpoints;
    }

    /**
     * The RulesEnginesInner object to access its operations.
     */
    private RulesEnginesInner rulesEngines;

    /**
     * Gets the RulesEnginesInner object to access its operations.
     * @return the RulesEnginesInner object.
     */
    public RulesEnginesInner rulesEngines() {
        return this.rulesEngines;
    }

    /**
     * The PoliciesInner object to access its operations.
     */
    private PoliciesInner policies;

    /**
     * Gets the PoliciesInner object to access its operations.
     * @return the PoliciesInner object.
     */
    public PoliciesInner policies() {
        return this.policies;
    }

    /**
     * The ManagedRuleSetsInner object to access its operations.
     */
    private ManagedRuleSetsInner managedRuleSets;

    /**
     * Gets the ManagedRuleSetsInner object to access its operations.
     * @return the ManagedRuleSetsInner object.
     */
    public ManagedRuleSetsInner managedRuleSets() {
        return this.managedRuleSets;
    }

    /**
     * Initializes an instance of FrontDoorManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public FrontDoorManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of FrontDoorManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public FrontDoorManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of FrontDoorManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public FrontDoorManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.networkExperimentProfiles = new NetworkExperimentProfilesInner(restClient().retrofit(), this);
        this.preconfiguredEndpoints = new PreconfiguredEndpointsInner(restClient().retrofit(), this);
        this.experiments = new ExperimentsInner(restClient().retrofit(), this);
        this.reports = new ReportsInner(restClient().retrofit(), this);
        this.frontDoorNameAvailabilitys = new FrontDoorNameAvailabilitysInner(restClient().retrofit(), this);
        this.frontDoorNameAvailabilityWithSubscriptions = new FrontDoorNameAvailabilityWithSubscriptionsInner(restClient().retrofit(), this);
        this.frontDoors = new FrontDoorsInner(restClient().retrofit(), this);
        this.frontendEndpoints = new FrontendEndpointsInner(restClient().retrofit(), this);
        this.endpoints = new EndpointsInner(restClient().retrofit(), this);
        this.rulesEngines = new RulesEnginesInner(restClient().retrofit(), this);
        this.policies = new PoliciesInner(restClient().retrofit(), this);
        this.managedRuleSets = new ManagedRuleSetsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "FrontDoorManagementClient", "2020-05-01");
    }
}
