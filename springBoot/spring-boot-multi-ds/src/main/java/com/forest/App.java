package com.forest;

import com.forest.config.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by songlin on 01/06/2017.
 */
@SpringBootApplication
@Import({DynamicDataSourceRegister.class})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
