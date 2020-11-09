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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.sgci.resource.client.SGCIResourceException;
import org.sgci.resource.client.models.ResourcesSchema;
import org.sgci.resource.models.SGCIResource;

import java.io.IOException;

public class JSONUtil {

    public static SGCIResource getResourceFromString(String contentStr) throws SGCIResourceException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(contentStr, SGCIResource.class);
        } catch (IOException e) {
            throw new SGCIResourceException("Failed to convert the json sting to object format. " + contentStr, e);
        }
    }

    public static String getStringFromResource(SGCIResource resource) throws SGCIResourceException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return objectMapper.writeValueAsString(resource);
        } catch (JsonProcessingException e) {
            throw new SGCIResourceException("Failed to convert resource object to a string", e);
        }
    }
}
