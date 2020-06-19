// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The BaseImageTrigger model. */
@Fluent
public final class BaseImageTrigger {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BaseImageTrigger.class);

    /*
     * The type of the auto trigger for base image dependency updates.
     */
    @JsonProperty(value = "baseImageTriggerType", required = true)
    private BaseImageTriggerType baseImageTriggerType;

    /*
     * The current status of trigger.
     */
    @JsonProperty(value = "status")
    private TriggerStatus status;

    /*
     * The name of the trigger.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the baseImageTriggerType property: The type of the auto trigger for base image dependency updates.
     *
     * @return the baseImageTriggerType value.
     */
    public BaseImageTriggerType baseImageTriggerType() {
        return this.baseImageTriggerType;
    }

    /**
     * Set the baseImageTriggerType property: The type of the auto trigger for base image dependency updates.
     *
     * @param baseImageTriggerType the baseImageTriggerType value to set.
     * @return the BaseImageTrigger object itself.
     */
    public BaseImageTrigger withBaseImageTriggerType(BaseImageTriggerType baseImageTriggerType) {
        this.baseImageTriggerType = baseImageTriggerType;
        return this;
    }

    /**
     * Get the status property: The current status of trigger.
     *
     * @return the status value.
     */
    public TriggerStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The current status of trigger.
     *
     * @param status the status value to set.
     * @return the BaseImageTrigger object itself.
     */
    public BaseImageTrigger withStatus(TriggerStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the name property: The name of the trigger.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the trigger.
     *
     * @param name the name value to set.
     * @return the BaseImageTrigger object itself.
     */
    public BaseImageTrigger withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (baseImageTriggerType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property baseImageTriggerType in model BaseImageTrigger"));
        }
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model BaseImageTrigger"));
        }
    }
}