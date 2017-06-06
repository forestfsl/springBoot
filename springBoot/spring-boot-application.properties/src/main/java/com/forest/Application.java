package com.forest;

import com.forest.config.BlogProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created by songlin on 03/06/2017.
 */
@SpringBootApplication
@EnableConfigurationProperties({BlogProperties.class})

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
