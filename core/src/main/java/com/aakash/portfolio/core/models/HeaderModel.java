package com.aakash.portfolio.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;

@Model(
    adaptables = {Resource.class, SlingHttpServletRequest.class},
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HeaderModel {

    @ValueMapValue
    private String siteName;

    @ValueMapValue
    private String homePagePath;

    @ValueMapValue
    private String aboutPagePath;

    @ValueMapValue
    private String projectsPagePath;

    @ValueMapValue
    private String contactPagePath;

    @PostConstruct
    protected void init() {
    }

    public String getSiteName() {
        return siteName != null ? siteName : "Aakash Portfolio";
    }

    public String getHomePagePath() {
        return homePagePath != null ? homePagePath : "/content/aakash-portfolio/home.html";
    }

    public String getAboutPagePath() {
        return aboutPagePath != null ? aboutPagePath : "/content/aakash-portfolio/about.html";
    }

    public String getProjectsPagePath() {
        return projectsPagePath != null ? projectsPagePath : "/content/aakash-portfolio/projects.html";
    }

    public String getContactPagePath() {
        return contactPagePath != null ? contactPagePath : "/content/aakash-portfolio/contact.html";
    }
}
