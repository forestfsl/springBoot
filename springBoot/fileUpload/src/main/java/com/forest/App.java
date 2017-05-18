package com.forest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;

import javax.servlet.MultipartConfigElement;

/**
 * Created by songlin on 17/05/2017.
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

    @Bean
    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        /*设置文件大小限制,超了,页面抛出异常信息,这时候就需要进行异常信息的处理了*/
        factory.setMaxFileSize("128KB");
        /*设置总上传数据总大小*/
        factory.setMaxRequestSize("256KB");
        /*设置存储路径*/
//        factory.setLocation("路径地址");
        return factory.createMultipartConfig();
    }

    //访问路径为：http://127.0.0.1:8081/file
}
