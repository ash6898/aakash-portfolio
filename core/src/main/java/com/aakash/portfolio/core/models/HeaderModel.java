package com.aakash.portfolio.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Model(
    adaptables = {Resource.class, SlingHttpServletRequest.class},
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HeaderModel {

    @ValueMapValue
    private String logoPath;

    @ValueMapValue
    private String siteName;

    @ValueMapValue
    private String homePagePath;

    @ValueMapValue
    private String ctaText;

    @ValueMapValue
    private String ctaLink;

    private List<NavigationItem> navigationItems;

    @PostConstruct
    protected void init() {
        // Initialize navigation items
        navigationItems = new ArrayList<>();
        // You can populate this from JCR or hardcode for now
        navigationItems.add(new NavigationItem("About", "/content/aakash-portfolio/about.html", false));
        navigationItems.add(new NavigationItem("Projects", "/content/aakash-portfolio/projects.html", false));
        navigationItems.add(new NavigationItem("Contact", "/content/aakash-portfolio/contact.html", false));
    }

    // Getters
    public String getLogoPath() {
        return logoPath != null ? logoPath : "/content/dam/aakash-portfolio/logo.png";
    }

    public String getSiteName() {
        return siteName != null ? siteName : "Aakash Portfolioyoyo";
    }

    public String getHomePagePath() {
        return homePagePath != null ? homePagePath : "/content/aakash-portfolio/home.html";
    }

    public String getCtaText() {
        return ctaText;
    }

    public String getCtaLink() {
        return ctaLink;
    }

    public List<NavigationItem> getNavigationItems() {
        return navigationItems;
    }

    // Inner class for navigation items
    public static class NavigationItem {
        private String title;
        private String path;
        private boolean active;

        public NavigationItem(String title, String path, boolean active) {
            this.title = title;
            this.path = path;
            this.active = active;
        }

        public String getTitle() {
            return title;
        }

        public String getPath() {
            return path;
        }

        public boolean isActive() {
            return active;
        }
    }
}
