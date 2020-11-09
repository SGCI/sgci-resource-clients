package org.sgci.resource.models;
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
import org.sgci.resource.models.deserializer.ResourceDefinitionDeserializer;

public class SGCIResource {

    public enum ResourceType {
        STORAGE, COMPUTE
    }

    private String schemaVersion;
    private String id;
    private String name;
    private String description;
    private ResourceType resourceType;

    @JsonDeserialize(using = ResourceDefinitionDeserializer.class)
    private ResourceDefinition resource;
    private String host;
    private ConnectionDefinition connection;

    public String getSchemaVersion() {
        return schemaVersion;
    }

    public SGCIResource setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }

    public String getId() {
        return id;
    }

    public SGCIResource setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SGCIResource setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public SGCIResource setDescription(String description) {
        this.description = description;
        return this;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public SGCIResource setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public ResourceDefinition getResource() {
        return resource;
    }

    public SGCIResource setResource(ResourceDefinition resource) {
        this.resource = resource;
        return this;
    }

    public String getHost() {
        return host;
    }

    public SGCIResource setHost(String host) {
        this.host = host;
        return this;
    }

    public ConnectionDefinition getConnection() {
        return connection;
    }

    public SGCIResource setConnection(ConnectionDefinition connection) {
        this.connection = connection;
        return this;
    }
}
