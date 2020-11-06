package org.sgci.resource.client;

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

import org.sgci.resource.client.models.ResourcesSchema;
import org.sgci.resource.client.util.GithubUtil;
import org.sgci.resource.client.util.JSONUtil;

public class SGCIResourceClient {

    private String repo;

    /**
     * Returns {@link ResourcesSchema} which is available in a Git file
     * @param resourceFile Resource file name
     * @return
     * @throws SGCIResourceException if the resource is not available or repository is not accessibly
     */
    public ResourcesSchema getResourceFromGitFile(String resourceFile) throws SGCIResourceException {
        String content = GithubUtil.getFileContent(repo, "data/" + resourceFile + ".json");
        return JSONUtil.getResourceSchemaFromString(content);
    }

    public SGCIResourceClient(String repo) {
        this.repo = repo;
    }

    public static void main(String args[]) throws SGCIResourceException {
        SGCIResourceClient client = new SGCIResourceClient("SGCI/sgci-resource-inventory");
        System.out.println(client.getResourceFromGitFile("stampede2.tacc.xsede"));
    }
}

