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

public class ComputeQuota {
    private Integer maxJobsTotal;
    private Integer maxJobsPerUser;
    private Integer maxNodesPerJob;
    private Integer maxTimePerJob;
    private Integer maxMemoryPerJob;
    private Integer maxCPUsPerJob;
    private Integer maxGPUsPerJob;

    public Integer getMaxJobsTotal() {
        return maxJobsTotal;
    }

    public ComputeQuota setMaxJobsTotal(Integer maxJobsTotal) {
        this.maxJobsTotal = maxJobsTotal;
        return this;
    }

    public Integer getMaxJobsPerUser() {
        return maxJobsPerUser;
    }

    public ComputeQuota setMaxJobsPerUser(Integer maxJobsPerUser) {
        this.maxJobsPerUser = maxJobsPerUser;
        return this;
    }

    public Integer getMaxNodesPerJob() {
        return maxNodesPerJob;
    }

    public ComputeQuota setMaxNodesPerJob(Integer maxNodesPerJob) {
        this.maxNodesPerJob = maxNodesPerJob;
        return this;
    }

    public Integer getMaxTimePerJob() {
        return maxTimePerJob;
    }

    public ComputeQuota setMaxTimePerJob(Integer maxTimePerJob) {
        this.maxTimePerJob = maxTimePerJob;
        return this;
    }

    public Integer getMaxMemoryPerJob() {
        return maxMemoryPerJob;
    }

    public ComputeQuota setMaxMemoryPerJob(Integer maxMemoryPerJob) {
        this.maxMemoryPerJob = maxMemoryPerJob;
        return this;
    }

    public Integer getMaxCPUsPerJob() {
        return maxCPUsPerJob;
    }

    public ComputeQuota setMaxCPUsPerJob(Integer maxCPUsPerJob) {
        this.maxCPUsPerJob = maxCPUsPerJob;
        return this;
    }

    public Integer getMaxGPUsPerJob() {
        return maxGPUsPerJob;
    }

    public ComputeQuota setMaxGPUsPerJob(Integer maxGPUsPerJob) {
        this.maxGPUsPerJob = maxGPUsPerJob;
        return this;
    }
}
