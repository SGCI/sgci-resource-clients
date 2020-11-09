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

public class ForkSystemDefinition {
    public enum SystemType {
        LINUX, WINDOWS
    }

    private SystemType systemType;
    private String version;
    private NodeHardwareDefinition nodeHardware;

    public SystemType getSystemType() {
        return systemType;
    }

    public ForkSystemDefinition setSystemType(SystemType systemType) {
        this.systemType = systemType;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public ForkSystemDefinition setVersion(String version) {
        this.version = version;
        return this;
    }

    public NodeHardwareDefinition getNodeHardware() {
        return nodeHardware;
    }

    public ForkSystemDefinition setNodeHardware(NodeHardwareDefinition nodeHardware) {
        this.nodeHardware = nodeHardware;
        return this;
    }
}
