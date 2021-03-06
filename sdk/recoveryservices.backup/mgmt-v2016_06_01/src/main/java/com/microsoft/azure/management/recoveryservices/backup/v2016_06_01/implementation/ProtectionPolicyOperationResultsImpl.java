/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.ProtectionPolicyOperationResults;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.BackupPolicyVaultProtectionPolicyResource;

class ProtectionPolicyOperationResultsImpl extends WrapperImpl<ProtectionPolicyOperationResultsInner> implements ProtectionPolicyOperationResults {
    private final RecoveryServicesManager manager;

    ProtectionPolicyOperationResultsImpl(RecoveryServicesManager manager) {
        super(manager.inner().protectionPolicyOperationResults());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private BackupPolicyVaultProtectionPolicyResourceImpl wrapModel(ProtectionPolicyResourceInner inner) {
        return  new BackupPolicyVaultProtectionPolicyResourceImpl(inner, manager());
    }

    @Override
    public Observable<BackupPolicyVaultProtectionPolicyResource> getAsync(String vaultName, String resourceGroupName, String policyName, String operationId) {
        ProtectionPolicyOperationResultsInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName, policyName, operationId)
        .map(new Func1<ProtectionPolicyResourceInner, BackupPolicyVaultProtectionPolicyResource>() {
            @Override
            public BackupPolicyVaultProtectionPolicyResource call(ProtectionPolicyResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
