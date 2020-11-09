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

public class PartitionDefinition {
    private String name;
    private Integer totalNodes;
    private NodeHardwareDefinition nodeHardware;
    private ComputeQuota computeQuotas;

    public String getName() {
        return name;
    }

    public PartitionDefinition setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getTotalNodes() {
        return totalNodes;
    }

    public PartitionDefinition setTotalNodes(Integer totalNodes) {
        this.totalNodes = totalNodes;
        return this;
    }

    public NodeHardwareDefinition getNodeHardware() {
        return nodeHardware;
    }

    public PartitionDefinition setNodeHardware(NodeHardwareDefinition nodeHardware) {
        this.nodeHardware = nodeHardware;
        return this;
    }

    public ComputeQuota getComputeQuotas() {
        return computeQuotas;
    }

    public PartitionDefinition setComputeQuotas(ComputeQuota computeQuotas) {
        this.computeQuotas = computeQuotas;
        return this;
    }
}
