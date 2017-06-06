package com.forest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

/**
 * Created by songlin on 05/06/2017.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

//session区域解析器
//    @Bean
//    public LocaleResolver localeResolver() {
//        SessionLocaleResolver slr = new SessionLocaleResolver();
//        //设置默认区域,
//        slr.setDefaultLocale(Locale.CHINA);
//        return slr;
//    }


//    Cookie区域解析器
    @Bean
    public LocaleResolver localeResolver() {
        CookieLocaleResolver slr = new CookieLocaleResolver();
        //设置默认区域,
        slr.setDefaultLocale(Locale.CHINA);
        slr.setCookieMaxAge(3600);//设置cookie有效期.
        return slr;
    }




}
