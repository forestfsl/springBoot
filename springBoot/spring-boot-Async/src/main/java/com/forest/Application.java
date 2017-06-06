package com.forest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by songlin on 03/06/2017.
 */
@SpringBootApplication
@EnableAsync //启动异步
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
