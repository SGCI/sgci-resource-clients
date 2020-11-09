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

public class FileSystemDefinition {
    private String rootDir;
    private String homeDir;
    private String scratchDir;
    private String workDir;
    private String archiveDir;

    public String getRootDir() {
        return rootDir;
    }

    public FileSystemDefinition setRootDir(String rootDir) {
        this.rootDir = rootDir;
        return this;
    }

    public String getHomeDir() {
        return homeDir;
    }

    public FileSystemDefinition setHomeDir(String homeDir) {
        this.homeDir = homeDir;
        return this;
    }

    public String getScratchDir() {
        return scratchDir;
    }

    public FileSystemDefinition setScratchDir(String scratchDir) {
        this.scratchDir = scratchDir;
        return this;
    }

    public String getWorkDir() {
        return workDir;
    }

    public FileSystemDefinition setWorkDir(String workDir) {
        this.workDir = workDir;
        return this;
    }

    public String getArchiveDir() {
        return archiveDir;
    }

    public FileSystemDefinition setArchiveDir(String archiveDir) {
        this.archiveDir = archiveDir;
        return this;
    }
}
