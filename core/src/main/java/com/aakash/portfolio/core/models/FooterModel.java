package com.aakash.portfolio.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = {Resource.class, SlingHttpServletRequest.class},
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class FooterModel {
    
    @ValueMapValue
    private String footerText;

    @ValueMapValue
    private String linkedinPath;

    @ValueMapValue
    private String githubPath;

    @ValueMapValue
    private String emailAddress;

    // Getter
    public String getFooterText() {
        return footerText != null ? footerText : "© 2024 Aakash Portfolio.";
    }

    public String getLinkedinPath() {
        return linkedinPath;
    }

    public String getGithubPath() {
        return githubPath;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
