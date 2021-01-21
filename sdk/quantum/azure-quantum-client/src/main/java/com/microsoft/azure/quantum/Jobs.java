// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.microsoft.azure.quantum;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.microsoft.azure.quantum.models.JobDetails;
import com.microsoft.azure.quantum.models.JobDetailsList;
import com.microsoft.azure.quantum.models.RestErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Jobs. */
public final class Jobs {
    /** The proxy service used to perform REST calls. */
    private final JobsService service;

    /** The service client containing this operation class. */
    private final QuantumClient client;

    /**
     * Initializes an instance of Jobs.
     *
     * @param client the instance of the service client containing this operation class.
     */
    Jobs(QuantumClient client) {
        this.service = RestProxy.create(JobsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for QuantumClientJobs to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "QuantumClientJobs")
    private interface JobsService {
        @Get(
                "/v1.0/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Quantum/workspaces/{workspaceName}/jobs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<JobDetailsList>> list(
                @HostParam("$host") String host,
                @PathParam("subscriptionId") String subscriptionId,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("workspaceName") String workspaceName,
                @HeaderParam("Accept") String accept);

        @Get(
                "/v1.0/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Quantum/workspaces/{workspaceName}/jobs/{jobId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(RestErrorException.class)
        Mono<Response<JobDetails>> get(
                @HostParam("$host") String host,
                @PathParam("subscriptionId") String subscriptionId,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("workspaceName") String workspaceName,
                @PathParam("jobId") String jobId,
                @HeaderParam("Accept") String accept);

        @Put(
                "/v1.0/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Quantum/workspaces/{workspaceName}/jobs/{jobId}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(RestErrorException.class)
        Mono<Response<JobDetails>> create(
                @HostParam("$host") String host,
                @PathParam("subscriptionId") String subscriptionId,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("workspaceName") String workspaceName,
                @PathParam("jobId") String jobId,
                @BodyParam("application/json") JobDetails job,
                @HeaderParam("Accept") String accept);

        @Delete(
                "/v1.0/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Quantum/workspaces/{workspaceName}/jobs/{jobId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(RestErrorException.class)
        Mono<Response<Void>> cancel(
                @HostParam("$host") String host,
                @PathParam("subscriptionId") String subscriptionId,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("workspaceName") String workspaceName,
                @PathParam("jobId") String jobId,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<JobDetailsList>> listNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                @HeaderParam("Accept") String accept);
    }

    /**
     * List jobs.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of job details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<JobDetails>> listSinglePageAsync() {
        final String accept = "application/json";
        return service.list(
                        this.client.getHost(),
                        this.client.getSubscriptionId(),
                        this.client.getResourceGroupName(),
                        this.client.getWorkspaceName(),
                        accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * List jobs.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of job details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<JobDetails> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get job by id.
     *
     * @param jobId Id of the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job by id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<JobDetails>> getWithResponseAsync(String jobId) {
        final String accept = "application/json";
        return service.get(
                this.client.getHost(),
                this.client.getSubscriptionId(),
                this.client.getResourceGroupName(),
                this.client.getWorkspaceName(),
                jobId,
                accept);
    }

    /**
     * Get job by id.
     *
     * @param jobId Id of the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job by id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobDetails> getAsync(String jobId) {
        return getWithResponseAsync(jobId)
                .flatMap(
                        (Response<JobDetails> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create a job.
     *
     * @param jobId Id of the job.
     * @param job The complete metadata of the job to submit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<JobDetails>> createWithResponseAsync(String jobId, JobDetails job) {
        final String accept = "application/json";
        return service.create(
                this.client.getHost(),
                this.client.getSubscriptionId(),
                this.client.getResourceGroupName(),
                this.client.getWorkspaceName(),
                jobId,
                job,
                accept);
    }

    /**
     * Create a job.
     *
     * @param jobId Id of the job.
     * @param job The complete metadata of the job to submit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobDetails> createAsync(String jobId, JobDetails job) {
        return createWithResponseAsync(jobId, job)
                .flatMap(
                        (Response<JobDetails> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Cancel a job.
     *
     * @param jobId Id of the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelWithResponseAsync(String jobId) {
        final String accept = "application/json";
        return service.cancel(
                this.client.getHost(),
                this.client.getSubscriptionId(),
                this.client.getResourceGroupName(),
                this.client.getWorkspaceName(),
                jobId,
                accept);
    }

    /**
     * Cancel a job.
     *
     * @param jobId Id of the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelAsync(String jobId) {
        return cancelWithResponseAsync(jobId).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of job details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<JobDetails>> listNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listNext(nextLink, this.client.getHost(), accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }
}
