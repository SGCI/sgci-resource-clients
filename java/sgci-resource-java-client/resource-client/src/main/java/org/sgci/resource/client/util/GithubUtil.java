package org.sgci.resource.client.util;

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

import com.google.common.hash.Hashing;
import com.jcabi.github.*;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.apache.commons.io.IOUtils;
import org.sgci.resource.client.SGCIResourceException;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import java.io.IOException;

public class GithubUtil {
    public static String getFileContent(String authToken, String repoURL, String filePath) throws SGCIResourceException {
        Github github = new RtGithub(authToken);
        Repo repo = github.repos().get(new Coordinates.Simple(repoURL));

        try {
            if (repo.contents().exists(filePath, "master")) {
                Content content = repo.contents().get(filePath);
                return IOUtils.toString(content.raw());
            } else {
                throw new SGCIResourceException("Resource doesn't available in the repo " + repoURL + " and path " + filePath);
            }
        } catch (IOException e) {
            throw new SGCIResourceException("Failed to communicate with repo " + repoURL + " to fetch file in path " + filePath, e);
        }
    }

    public static void addFile(String authToken, String repoURL, String filePath, String content) throws SGCIResourceException {
        Github github = new RtGithub(authToken);
        Repo repo = github.repos().get(new Coordinates.Simple(repoURL));

        try {

            JsonObjectBuilder jsonBuilder = Json.createObjectBuilder()
                    .add("path", filePath)
                    .add("message", "Adding file " + filePath)
                    .add("branch", "master")
                    .add("content", Base64.encode(content.getBytes()));
            if (repo.contents().exists(filePath, "master")) {
                jsonBuilder.add("sha", new Content.Smart(repo.contents().get(filePath)).sha());
                repo.contents().update(filePath, jsonBuilder.build());
            } else {
                repo.contents().create(jsonBuilder.build());
            }
        } catch (IOException e) {
            throw new SGCIResourceException("Failed to create file " + filePath + " in repo " + repoURL, e);
        }
    }
}
