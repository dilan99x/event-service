package com.poc.eventservice.eventservice.controler;


import com.poc.eventservice.eventservice.model.ConfigProfile;
import com.poc.eventservice.eventservice.model.ProfileData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Autowired
    private ConfigProfile configProfile;

    @GetMapping("/profile")
    public ProfileData getProfile(){
        ProfileData profileData = new ProfileData();
        profileData.setName(configProfile.getName());
        profileData.setVersion(configProfile.getVersion());
        profileData.setUrl(configProfile.getUrl());

        return profileData;
    }
}
