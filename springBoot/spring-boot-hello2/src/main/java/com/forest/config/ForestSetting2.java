package com.forest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**自定义一个forest.properties文件
 * Created by songlin on 17/05/2017.
 */
@ConfigurationProperties(prefix = "forest2",locations = "classpath:forest.properties")
public class ForestSetting2 {
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
