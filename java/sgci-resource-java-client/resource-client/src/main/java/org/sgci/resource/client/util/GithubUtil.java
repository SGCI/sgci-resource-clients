package org.sgci.resource.client.util;

import com.jcabi.github.*;
import org.apache.commons.io.IOUtils;

import java.io.IOException;

public class GithubUtil {
    public static String getFileContent(String repoURL, String filePath) throws IOException {
        Github github = new RtGithub();
        Repo repo = github.repos().get(new Coordinates.Simple(repoURL));
        Content content = repo.contents().get(filePath);
        return IOUtils.toString(content.raw());
    }
}
