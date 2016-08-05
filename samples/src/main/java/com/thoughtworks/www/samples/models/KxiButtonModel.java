package com.thoughtworks.www.samples.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.settings.SlingSettingsService;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by kxi on 8/2/16.
 */
@Model(adaptables=Resource.class)
public class KxiButtonModel {
    @Inject
    private SlingSettingsService settings;

    @Inject @Named("sling:resourceType") @Default(values="No resourceType")
    protected String resourceType;

    @Inject @Optional @Default(values="Button Text")
    private String buttonname;

    private String buttonhref;

    @PostConstruct
    protected void init() {
    }

    public String getMessage() {
        return "\tHello World!\n"
                + "\tThis is instance: " + settings.getSlingId() + "\n"
                + "\tResource type is: " + resourceType + "\n";
    }

    public String getButtonname() {
        return buttonname;
    }

    public String getButtonhref() {
        return buttonhref;
    }
}
