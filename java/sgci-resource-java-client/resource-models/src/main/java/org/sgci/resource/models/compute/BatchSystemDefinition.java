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

import java.util.ArrayList;
import java.util.List;

public class BatchSystemDefinition {
    public enum JobManager {
        SLURM, SGE, PBS
    }

    private JobManager jobManager;
    private List<CommandPathDefinition> commandPaths = new ArrayList<>();
    private List<PartitionDefinition> partitions;

    public JobManager getJobManager() {
        return jobManager;
    }

    public BatchSystemDefinition setJobManager(JobManager jobManager) {
        this.jobManager = jobManager;
        return this;
    }

    public List<CommandPathDefinition> getCommandPaths() {
        return commandPaths;
    }

    public BatchSystemDefinition setCommandPaths(List<CommandPathDefinition> commandPaths) {
        this.commandPaths = commandPaths;
        return this;
    }

    public List<PartitionDefinition> getPartitions() {
        return partitions;
    }

    public BatchSystemDefinition setPartitions(List<PartitionDefinition> partitions) {
        this.partitions = partitions;
        return this;
    }
}
