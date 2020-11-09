package org.sgci.resource.models.compute;
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.sgci.resource.models.ConnectionDefinition;
import org.sgci.resource.models.ResourceDefinition;
import org.sgci.resource.models.storage.StorageDefinition;

import java.util.ArrayList;
import java.util.List;

@JsonDeserialize(as = ComputeDefinition.class)
public class ComputeDefinition implements ResourceDefinition {
    public enum SchedulerType {
        FORK, BATCH, ON_DEMAND
    }

    private SchedulerType schedulerType;
    private StorageDefinition storageResource;
    private ConnectionDefinition connection;
    private List<ExecutionCommandDefinition> executionCommands = new ArrayList<>();
    private BatchSystemDefinition batchSystem;
    private ForkSystemDefinition forkSystem;

    public SchedulerType getSchedulerType() {
        return schedulerType;
    }

    public ComputeDefinition setSchedulerType(SchedulerType schedulerType) {
        this.schedulerType = schedulerType;
        return this;
    }

    public StorageDefinition getStorageResource() {
        return storageResource;
    }

    public ComputeDefinition setStorageResource(StorageDefinition storageResource) {
        this.storageResource = storageResource;
        return this;
    }

    public ConnectionDefinition getConnection() {
        return connection;
    }

    public ComputeDefinition setConnection(ConnectionDefinition connection) {
        this.connection = connection;
        return this;
    }

    public List<ExecutionCommandDefinition> getExecutionCommands() {
        return executionCommands;
    }

    public ComputeDefinition setExecutionCommands(List<ExecutionCommandDefinition> executionCommands) {
        this.executionCommands = executionCommands;
        return this;
    }

    public BatchSystemDefinition getBatchSystem() {
        return batchSystem;
    }

    public ComputeDefinition setBatchSystem(BatchSystemDefinition batchSystem) {
        this.batchSystem = batchSystem;
        return this;
    }

    public ForkSystemDefinition getForkSystem() {
        return forkSystem;
    }

    public ComputeDefinition setForkSystem(ForkSystemDefinition forkSystem) {
        this.forkSystem = forkSystem;
        return this;
    }
}
