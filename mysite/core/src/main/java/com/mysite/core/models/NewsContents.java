package com.mysite.core.models;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class NewsContents {

    @ValueMapValue
    private String newslink;
    @ValueMapValue
    private String newstext;

    public String getNewslink() {
        return newslink;
    }
    public String getNewstext() {
        return newstext;
    }
}