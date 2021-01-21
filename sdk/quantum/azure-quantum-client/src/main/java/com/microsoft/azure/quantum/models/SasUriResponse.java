// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.microsoft.azure.quantum.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Get SAS URL operation response. */
@Fluent
public final class SasUriResponse {
    /*
     * A URL with a SAS token to upload a blob for execution in the given
     * workspace.
     */
    @JsonProperty(value = "sasUri")
    private String sasUri;

    /**
     * Get the sasUri property: A URL with a SAS token to upload a blob for execution in the given workspace.
     *
     * @return the sasUri value.
     */
    public String getSasUri() {
        return this.sasUri;
    }

    /**
     * Set the sasUri property: A URL with a SAS token to upload a blob for execution in the given workspace.
     *
     * @param sasUri the sasUri value to set.
     * @return the SasUriResponse object itself.
     */
    public SasUriResponse setSasUri(String sasUri) {
        this.sasUri = sasUri;
        return this;
    }
}
