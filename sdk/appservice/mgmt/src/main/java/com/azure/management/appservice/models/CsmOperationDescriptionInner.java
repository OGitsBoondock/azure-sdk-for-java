// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.appservice.CsmOperationDescriptionProperties;
import com.azure.management.appservice.CsmOperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CsmOperationDescription model. */
@Fluent
public final class CsmOperationDescriptionInner {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Meta data about operation used for display in portal.
     */
    @JsonProperty(value = "display")
    private CsmOperationDisplay display;

    /*
     * The origin property.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * Properties available for a Microsoft.Web resource provider operation.
     */
    @JsonProperty(value = "properties")
    private CsmOperationDescriptionProperties properties;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the CsmOperationDescriptionInner object itself.
     */
    public CsmOperationDescriptionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: Meta data about operation used for display in portal.
     *
     * @return the display value.
     */
    public CsmOperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Meta data about operation used for display in portal.
     *
     * @param display the display value to set.
     * @return the CsmOperationDescriptionInner object itself.
     */
    public CsmOperationDescriptionInner withDisplay(CsmOperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: The origin property.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: The origin property.
     *
     * @param origin the origin value to set.
     * @return the CsmOperationDescriptionInner object itself.
     */
    public CsmOperationDescriptionInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the properties property: Properties available for a Microsoft.Web resource provider operation.
     *
     * @return the properties value.
     */
    public CsmOperationDescriptionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties available for a Microsoft.Web resource provider operation.
     *
     * @param properties the properties value to set.
     * @return the CsmOperationDescriptionInner object itself.
     */
    public CsmOperationDescriptionInner withProperties(CsmOperationDescriptionProperties properties) {
        this.properties = properties;
        return this;
    }
}
