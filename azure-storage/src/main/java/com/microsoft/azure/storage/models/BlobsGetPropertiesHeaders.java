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
import com.microsoft.rest.v2.DateTimeRfc1123;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Defines headers for GetProperties operation.
 */
@JacksonXmlRootElement(localName = "Blobs-GetProperties-Headers")
public class BlobsGetPropertiesHeaders {
    /**
     * Returns the date and time the container was last modified. Any operation
     * that modifies the blob, including an update of the blob's metadata or
     * properties, changes the last-modified time of the blob.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /**
     * The metadata property.
     */
    @JsonProperty(value = "x-ms-meta")
    private Map<String, String> metadata;

    /**
     * The blob's type. Possible values include: 'BlockBlob', 'PageBlob',
     * 'AppendBlob'.
     */
    @JsonProperty(value = "x-ms-blob-type")
    private BlobType blobType;

    /**
     * Conclusion time of the last attempted Copy Blob operation where this
     * blob was the destination blob. This value can specify the time of a
     * completed, aborted, or failed copy attempt. This header does not appear
     * if a copy is pending, if this blob has never been the destination in a
     * Copy Blob operation, or if this blob has been modified after a concluded
     * Copy Blob operation using Set Blob Properties, Put Blob, or Put Block
     * List.
     */
    @JsonProperty(value = "x-ms-copy-completion-time")
    private DateTimeRfc1123 copyCompletionTime;

    /**
     * Only appears when x-ms-copy-status is failed or pending. Describes the
     * cause of the last fatal or non-fatal copy operation failure. This header
     * does not appear if this blob has never been the destination in a Copy
     * Blob operation, or if this blob has been modified after a concluded Copy
     * Blob operation using Set Blob Properties, Put Blob, or Put Block List.
     */
    @JsonProperty(value = "x-ms-copy-status-description")
    private String copyStatusDescription;

    /**
     * String identifier for this copy operation. Use with Get Blob Properties
     * to check the status of this copy operation, or pass to Abort Copy Blob
     * to abort a pending copy.
     */
    @JsonProperty(value = "x-ms-copy-id")
    private String copyId;

    /**
     * Contains the number of bytes copied and the total bytes in the source in
     * the last attempted Copy Blob operation where this blob was the
     * destination blob. Can show between 0 and Content-Length bytes copied.
     * This header does not appear if this blob has never been the destination
     * in a Copy Blob operation, or if this blob has been modified after a
     * concluded Copy Blob operation using Set Blob Properties, Put Blob, or
     * Put Block List.
     */
    @JsonProperty(value = "x-ms-copy-progress")
    private String copyProgress;

    /**
     * URL up to 2 KB in length that specifies the source blob or file used in
     * the last attempted Copy Blob operation where this blob was the
     * destination blob. This header does not appear if this blob has never
     * been the destination in a Copy Blob operation, or if this blob has been
     * modified after a concluded Copy Blob operation using Set Blob
     * Properties, Put Blob, or Put Block List.
     */
    @JsonProperty(value = "x-ms-copy-source")
    private String copySource;

    /**
     * State of the copy operation identified by x-ms-copy-id. Possible values
     * include: 'pending', 'success', 'aborted', 'failed'.
     */
    @JsonProperty(value = "x-ms-copy-status")
    private CopyStatusType copyStatus;

    /**
     * Included if the blob is incremental copy blob.
     */
    @JsonProperty(value = "x-ms-incremental-copy")
    private Boolean isIncrementalCopy;

    /**
     * Included if the blob is incremental copy blob or incremental copy
     * snapshot, if x-ms-copy-status is success. Snapshot time of the last
     * successful incremental copy snapshot for this blob.
     */
    @JsonProperty(value = "x-ms-destination-snapshot")
    private DateTimeRfc1123 destinationSnapshot;

    /**
     * When a blob is leased, specifies whether the lease is of infinite or
     * fixed duration. Possible values include: 'infinite', 'fixed'.
     */
    @JsonProperty(value = "x-ms-lease-duration")
    private LeaseDurationType leaseDuration;

    /**
     * Lease state of the blob. Possible values include: 'available', 'leased',
     * 'expired', 'breaking', 'broken'.
     */
    @JsonProperty(value = "x-ms-lease-state")
    private LeaseStateType leaseState;

    /**
     * The current lease status of the blob. Possible values include: 'locked',
     * 'unlocked'.
     */
    @JsonProperty(value = "x-ms-lease-status")
    private LeaseStatusType leaseStatus;

    /**
     * The number of bytes present in the response body.
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /**
     * The content type specified for the blob. The default content type is
     * 'application/octet-stream'.
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /**
     * The ETag contains a value that you can use to perform operations
     * conditionally. If the request version is 2011-08-18 or newer, the ETag
     * value will be in quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * If the blob has an MD5 hash and this operation is to read the full blob,
     * this response header is returned so that the client can check for
     * message content integrity.
     */
    @JsonProperty(value = "Content-MD5")
    private String contentMD5;

    /**
     * This header returns the value that was specified for the
     * Content-Encoding request header.
     */
    @JsonProperty(value = "Content-Encoding")
    private String contentEncoding;

    /**
     * This header returns the value that was specified for the
     * 'x-ms-blob-content-disposition' header. The Content-Disposition response
     * header field conveys additional information about how to process the
     * response payload, and also can be used to attach additional metadata.
     * For example, if set to attachment, it indicates that the user-agent
     * should not display the response, but instead show a Save As dialog with
     * a filename other than the blob name specified.
     */
    @JsonProperty(value = "Content-Disposition")
    private String contentDisposition;

    /**
     * This header returns the value that was specified for the
     * Content-Language request header.
     */
    @JsonProperty(value = "Content-Language")
    private String contentLanguage;

    /**
     * This header is returned if it was previously specified for the blob.
     */
    @JsonProperty(value = "Cache-Control")
    private String cacheControl;

    /**
     * The current sequence number for a page blob. This header is not returned
     * for block blobs or append blobs.
     */
    @JsonProperty(value = "x-ms-blob-sequence-number")
    private String blobSequenceNumber;

    /**
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /**
     * Indicates the version of the Blob service used to execute the request.
     * This header is returned for requests made against version 2009-09-19 and
     * above.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /**
     * UTC date/time value generated by the service that indicates the time at
     * which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /**
     * Indicates that the service supports requests for partial blob content.
     */
    @JsonProperty(value = "Accept-Ranges")
    private String acceptRanges;

    /**
     * The number of committed blocks present in the blob. This header is
     * returned only for append blobs.
     */
    @JsonProperty(value = "x-ms-blob-committed-block-count")
    private String blobCommittedBlockCount;

    /**
     * The value of this header is set to true if the blob data and application
     * metadata are completely encrypted using the specified algorithm.
     * Otherwise, the value is set to false (when the blob is unencrypted, or
     * if only parts of the blob/application metadata are encrypted).
     */
    @JsonProperty(value = "x-ms-server-encrypted")
    private Boolean isServerEncrypted;

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.dateTime();
    }

    /**
     * Set the lastModified value.
     *
     * @param lastModified the lastModified value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withLastModified(DateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
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
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the blobType value.
     *
     * @return the blobType value
     */
    public BlobType blobType() {
        return this.blobType;
    }

    /**
     * Set the blobType value.
     *
     * @param blobType the blobType value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withBlobType(BlobType blobType) {
        this.blobType = blobType;
        return this;
    }

    /**
     * Get the copyCompletionTime value.
     *
     * @return the copyCompletionTime value
     */
    public DateTime copyCompletionTime() {
        if (this.copyCompletionTime == null) {
            return null;
        }
        return this.copyCompletionTime.dateTime();
    }

    /**
     * Set the copyCompletionTime value.
     *
     * @param copyCompletionTime the copyCompletionTime value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withCopyCompletionTime(DateTime copyCompletionTime) {
        if (copyCompletionTime == null) {
            this.copyCompletionTime = null;
        } else {
            this.copyCompletionTime = new DateTimeRfc1123(copyCompletionTime);
        }
        return this;
    }

    /**
     * Get the copyStatusDescription value.
     *
     * @return the copyStatusDescription value
     */
    public String copyStatusDescription() {
        return this.copyStatusDescription;
    }

    /**
     * Set the copyStatusDescription value.
     *
     * @param copyStatusDescription the copyStatusDescription value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withCopyStatusDescription(String copyStatusDescription) {
        this.copyStatusDescription = copyStatusDescription;
        return this;
    }

    /**
     * Get the copyId value.
     *
     * @return the copyId value
     */
    public String copyId() {
        return this.copyId;
    }

    /**
     * Set the copyId value.
     *
     * @param copyId the copyId value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withCopyId(String copyId) {
        this.copyId = copyId;
        return this;
    }

    /**
     * Get the copyProgress value.
     *
     * @return the copyProgress value
     */
    public String copyProgress() {
        return this.copyProgress;
    }

    /**
     * Set the copyProgress value.
     *
     * @param copyProgress the copyProgress value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withCopyProgress(String copyProgress) {
        this.copyProgress = copyProgress;
        return this;
    }

    /**
     * Get the copySource value.
     *
     * @return the copySource value
     */
    public String copySource() {
        return this.copySource;
    }

    /**
     * Set the copySource value.
     *
     * @param copySource the copySource value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withCopySource(String copySource) {
        this.copySource = copySource;
        return this;
    }

    /**
     * Get the copyStatus value.
     *
     * @return the copyStatus value
     */
    public CopyStatusType copyStatus() {
        return this.copyStatus;
    }

    /**
     * Set the copyStatus value.
     *
     * @param copyStatus the copyStatus value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withCopyStatus(CopyStatusType copyStatus) {
        this.copyStatus = copyStatus;
        return this;
    }

    /**
     * Get the isIncrementalCopy value.
     *
     * @return the isIncrementalCopy value
     */
    public Boolean isIncrementalCopy() {
        return this.isIncrementalCopy;
    }

    /**
     * Set the isIncrementalCopy value.
     *
     * @param isIncrementalCopy the isIncrementalCopy value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withIsIncrementalCopy(Boolean isIncrementalCopy) {
        this.isIncrementalCopy = isIncrementalCopy;
        return this;
    }

    /**
     * Get the destinationSnapshot value.
     *
     * @return the destinationSnapshot value
     */
    public DateTime destinationSnapshot() {
        if (this.destinationSnapshot == null) {
            return null;
        }
        return this.destinationSnapshot.dateTime();
    }

    /**
     * Set the destinationSnapshot value.
     *
     * @param destinationSnapshot the destinationSnapshot value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withDestinationSnapshot(DateTime destinationSnapshot) {
        if (destinationSnapshot == null) {
            this.destinationSnapshot = null;
        } else {
            this.destinationSnapshot = new DateTimeRfc1123(destinationSnapshot);
        }
        return this;
    }

    /**
     * Get the leaseDuration value.
     *
     * @return the leaseDuration value
     */
    public LeaseDurationType leaseDuration() {
        return this.leaseDuration;
    }

    /**
     * Set the leaseDuration value.
     *
     * @param leaseDuration the leaseDuration value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withLeaseDuration(LeaseDurationType leaseDuration) {
        this.leaseDuration = leaseDuration;
        return this;
    }

    /**
     * Get the leaseState value.
     *
     * @return the leaseState value
     */
    public LeaseStateType leaseState() {
        return this.leaseState;
    }

    /**
     * Set the leaseState value.
     *
     * @param leaseState the leaseState value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withLeaseState(LeaseStateType leaseState) {
        this.leaseState = leaseState;
        return this;
    }

    /**
     * Get the leaseStatus value.
     *
     * @return the leaseStatus value
     */
    public LeaseStatusType leaseStatus() {
        return this.leaseStatus;
    }

    /**
     * Set the leaseStatus value.
     *
     * @param leaseStatus the leaseStatus value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withLeaseStatus(LeaseStatusType leaseStatus) {
        this.leaseStatus = leaseStatus;
        return this;
    }

    /**
     * Get the contentLength value.
     *
     * @return the contentLength value
     */
    public Long contentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength value.
     *
     * @param contentLength the contentLength value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the contentType value.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType value.
     *
     * @param contentType the contentType value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the eTag value.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag value.
     *
     * @param eTag the eTag value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the contentMD5 value.
     *
     * @return the contentMD5 value
     */
    public String contentMD5() {
        return this.contentMD5;
    }

    /**
     * Set the contentMD5 value.
     *
     * @param contentMD5 the contentMD5 value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * Get the contentEncoding value.
     *
     * @return the contentEncoding value
     */
    public String contentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding value.
     *
     * @param contentEncoding the contentEncoding value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the contentDisposition value.
     *
     * @return the contentDisposition value
     */
    public String contentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition value.
     *
     * @param contentDisposition the contentDisposition value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the contentLanguage value.
     *
     * @return the contentLanguage value
     */
    public String contentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage value.
     *
     * @param contentLanguage the contentLanguage value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Get the cacheControl value.
     *
     * @return the cacheControl value
     */
    public String cacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl value.
     *
     * @param cacheControl the cacheControl value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Get the blobSequenceNumber value.
     *
     * @return the blobSequenceNumber value
     */
    public String blobSequenceNumber() {
        return this.blobSequenceNumber;
    }

    /**
     * Set the blobSequenceNumber value.
     *
     * @param blobSequenceNumber the blobSequenceNumber value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withBlobSequenceNumber(String blobSequenceNumber) {
        this.blobSequenceNumber = blobSequenceNumber;
        return this;
    }

    /**
     * Get the requestId value.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the dateProperty value.
     *
     * @return the dateProperty value
     */
    public DateTime dateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.dateTime();
    }

    /**
     * Set the dateProperty value.
     *
     * @param dateProperty the dateProperty value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withDateProperty(DateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the acceptRanges value.
     *
     * @return the acceptRanges value
     */
    public String acceptRanges() {
        return this.acceptRanges;
    }

    /**
     * Set the acceptRanges value.
     *
     * @param acceptRanges the acceptRanges value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withAcceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
        return this;
    }

    /**
     * Get the blobCommittedBlockCount value.
     *
     * @return the blobCommittedBlockCount value
     */
    public String blobCommittedBlockCount() {
        return this.blobCommittedBlockCount;
    }

    /**
     * Set the blobCommittedBlockCount value.
     *
     * @param blobCommittedBlockCount the blobCommittedBlockCount value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withBlobCommittedBlockCount(String blobCommittedBlockCount) {
        this.blobCommittedBlockCount = blobCommittedBlockCount;
        return this;
    }

    /**
     * Get the isServerEncrypted value.
     *
     * @return the isServerEncrypted value
     */
    public Boolean isServerEncrypted() {
        return this.isServerEncrypted;
    }

    /**
     * Set the isServerEncrypted value.
     *
     * @param isServerEncrypted the isServerEncrypted value to set
     * @return the BlobsGetPropertiesHeaders object itself.
     */
    public BlobsGetPropertiesHeaders withIsServerEncrypted(Boolean isServerEncrypted) {
        this.isServerEncrypted = isServerEncrypted;
        return this;
    }
}
