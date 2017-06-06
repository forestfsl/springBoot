package com.forest.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by songlin on 30/05/2017.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("Hi");
        System.out.println("forest");
        SpringApplication.run(Application.class,args);
    }
}
