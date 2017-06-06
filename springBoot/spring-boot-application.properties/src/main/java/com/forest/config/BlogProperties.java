package com.forest.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by songlin on 03/06/2017.
 */

//没有引入spring-boot-configuration-processo的使用方式
//@Component
//@Getter
//@Setter
//public class BlogProperties {
//    @Value("${com.forest.blog.name}")
//    private String name;//作者
//    @Value("${com.forest.blog.title}")
//    private String title;//标题
//}


@Getter
@Setter
@ConfigurationProperties(prefix="com.forest.blog")
public class BlogProperties {

    private String name;//作者

    private String title;//标题

}
