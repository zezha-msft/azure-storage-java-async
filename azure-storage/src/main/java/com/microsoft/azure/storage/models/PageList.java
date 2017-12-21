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
import java.util.List;

/**
 * the list of pages.
 */
@JacksonXmlRootElement(localName = "PageList")
public class PageList {
    /**
     * The pageRange property.
     */
    @JsonProperty(value = "PageRange")
    private List<PageRange> pageRange;

    /**
     * The clearRange property.
     */
    @JsonProperty(value = "ClearRange")
    private List<ClearRange> clearRange;

    /**
     * Get the pageRange value.
     *
     * @return the pageRange value
     */
    public List<PageRange> pageRange() {
        return this.pageRange;
    }

    /**
     * Set the pageRange value.
     *
     * @param pageRange the pageRange value to set
     * @return the PageList object itself.
     */
    public PageList withPageRange(List<PageRange> pageRange) {
        this.pageRange = pageRange;
        return this;
    }

    /**
     * Get the clearRange value.
     *
     * @return the clearRange value
     */
    public List<ClearRange> clearRange() {
        return this.clearRange;
    }

    /**
     * Set the clearRange value.
     *
     * @param clearRange the clearRange value to set
     * @return the PageList object itself.
     */
    public PageList withClearRange(List<ClearRange> clearRange) {
        this.clearRange = clearRange;
        return this;
    }
}
