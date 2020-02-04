/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about the current running state of the overall upgrade.
 */
public class RollingUpgradeRunningStatus {
    /**
     * Code indicating the current status of the upgrade. Possible values
     * include: 'RollingForward', 'Cancelled', 'Completed', 'Faulted'.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private RollingUpgradeStatusCode code;

    /**
     * Start time of the upgrade.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * The last action performed on the rolling upgrade. Possible values
     * include: 'Start', 'Cancel'.
     */
    @JsonProperty(value = "lastAction", access = JsonProperty.Access.WRITE_ONLY)
    private RollingUpgradeActionType lastAction;

    /**
     * Last action time of the upgrade.
     */
    @JsonProperty(value = "lastActionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastActionTime;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public RollingUpgradeStatusCode code() {
        return this.code;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the lastAction value.
     *
     * @return the lastAction value
     */
    public RollingUpgradeActionType lastAction() {
        return this.lastAction;
    }

    /**
     * Get the lastActionTime value.
     *
     * @return the lastActionTime value
     */
    public DateTime lastActionTime() {
        return this.lastActionTime;
    }

}