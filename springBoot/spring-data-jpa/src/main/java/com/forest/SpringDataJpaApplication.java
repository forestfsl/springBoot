package com.forest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Created by songlin on 29/05/2017.
 */
@SpringBootApplication
@EnableCaching
public class SpringDataJpaApplication {
    public static void main(String[ ] args){
        SpringApplication.run(SpringDataJpaApplication.class,args);
    }
}
