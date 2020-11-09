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

public class NodeHardwareDefinition {
    private String cpuType;
    private Integer cpuCount;
    private String gpuType;
    private Integer gpuCount;
    private String memoryType;
    private String memorySize;

    public String getCpuType() {
        return cpuType;
    }

    public NodeHardwareDefinition setCpuType(String cpuType) {
        this.cpuType = cpuType;
        return this;
    }

    public Integer getCpuCount() {
        return cpuCount;
    }

    public NodeHardwareDefinition setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public String getGpuType() {
        return gpuType;
    }

    public NodeHardwareDefinition setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }

    public Integer getGpuCount() {
        return gpuCount;
    }

    public NodeHardwareDefinition setGpuCount(Integer gpuCount) {
        this.gpuCount = gpuCount;
        return this;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public NodeHardwareDefinition setMemoryType(String memoryType) {
        this.memoryType = memoryType;
        return this;
    }

    public String getMemorySize() {
        return memorySize;
    }

    public NodeHardwareDefinition setMemorySize(String memorySize) {
        this.memorySize = memorySize;
        return this;
    }
}
