/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * An Azure Storage blob.
 */
@JacksonXmlRootElement(localName = "Blob")
public class Blob {
    /**
     * The name property.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /**
     * The snapshot property.
     */
    @JsonProperty(value = "Snapshot", required = true)
    private DateTime snapshot;

    /**
     * The properties property.
     */
    @JsonProperty(value = "Properties", required = true)
    private BlobProperties properties;

    /**
     * The metadata property.
     */
    @JsonProperty(value = "Metadata")
    private Map<String, String> metadata;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Blob object itself.
     */
    public Blob withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the snapshot value.
     *
     * @return the snapshot value
     */
    public DateTime snapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot value.
     *
     * @param snapshot the snapshot value to set
     * @return the Blob object itself.
     */
    public Blob withSnapshot(DateTime snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public BlobProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the Blob object itself.
     */
    public Blob withProperties(BlobProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the Blob object itself.
     */
    public Blob withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
