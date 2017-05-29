package com.forest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by songlin on 27/05/2017.
 */
@SpringBootApplication
@MapperScan("com.forest.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
