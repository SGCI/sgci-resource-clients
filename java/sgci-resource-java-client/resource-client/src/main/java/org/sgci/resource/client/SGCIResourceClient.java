package org.sgci.resource.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.sgci.resource.client.models.ResourcesSchema;
import org.sgci.resource.client.util.GithubUtil;

import java.io.IOException;

public class SGCIResourceClient {

    private String repo;
    public ResourcesSchema getResource(String resourceId) throws IOException {
        String content = GithubUtil.getFileContent(repo, "data/" + resourceId);
        System.out.println(content);
        ObjectMapper objectMapper = new ObjectMapper();
        ResourcesSchema resourcesSchema = objectMapper.readValue(content, ResourcesSchema.class);
        return resourcesSchema;
    }

    public SGCIResourceClient(String repo) {
        this.repo = repo;
    }

    public static void main(String args[]) throws IOException {
        SGCIResourceClient client = new SGCIResourceClient("SGCI/sgci-resource-inventory");
        client.getResource("stampede2.tacc.xsede.json");
    }
}

