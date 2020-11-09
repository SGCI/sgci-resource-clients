package org.sgci.resource.models.storage;
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

@JsonDeserialize(as = StorageDefinition.class)
public class StorageDefinition implements ResourceDefinition {
    public enum StorageType {
        POSIX, S3, OBJECT_STORE
    }

    private StorageType storageType;
    private ConnectionDefinition connection;
    private FileSystemDefinition fileSystem;
    private Capacity capacity;
    private StorageQuota defaultQuota;

    public StorageType getStorageType() {
        return storageType;
    }

    public StorageDefinition setStorageType(StorageType storageType) {
        this.storageType = storageType;
        return this;
    }

    public ConnectionDefinition getConnection() {
        return connection;
    }

    public StorageDefinition setConnection(ConnectionDefinition connection) {
        this.connection = connection;
        return this;
    }

    public FileSystemDefinition getFileSystem() {
        return fileSystem;
    }

    public StorageDefinition setFileSystem(FileSystemDefinition fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public StorageDefinition setCapacity(Capacity capacity) {
        this.capacity = capacity;
        return this;
    }

    public StorageQuota getDefaultQuota() {
        return defaultQuota;
    }

    public StorageDefinition setDefaultQuota(StorageQuota defaultQuota) {
        this.defaultQuota = defaultQuota;
        return this;
    }
}
