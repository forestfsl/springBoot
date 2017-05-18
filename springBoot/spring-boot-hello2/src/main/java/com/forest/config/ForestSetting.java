package com.forest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 使用application.properties
 * Created by songlin on 17/05/2017.
 */
@ConfigurationProperties(prefix = "forest")
public class ForestSetting {
    private String name;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
