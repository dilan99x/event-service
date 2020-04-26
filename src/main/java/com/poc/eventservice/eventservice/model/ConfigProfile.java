package com.poc.eventservice.eventservice.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ConfigProfile {

    @Autowired
    private Environment environment;


    public String getName(){
        return environment.getProperty("service.name");
    }

    public String getVersion(){
        return environment.getProperty("service.version");
    }

    public String getUrl(){
        return environment.getProperty("service.url");
    }
}
