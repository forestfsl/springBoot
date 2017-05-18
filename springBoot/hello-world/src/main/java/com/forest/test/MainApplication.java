package com.forest.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import simple.plugin.spring.SpringUtil;

/**
 * Created by songlin on 14/05/2017.
 */
@ServletComponentScan//是的spring能够扫描到我们自己编写的servlet和filter
@SpringBootApplication
/*其中@SpringBootApplication申明让spring boot自动给程序进行必要的配置，等价于
//以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan*/
//@RestController /*返回json字符串的数据，直接可以编写RESTFul的接口；*/
public class MainApplication {
//    @RequestMapping("/")
//    public String hello(){
//        return "Hello World!";
//    }

    /**注册Spring Util
     * 这里为了和上一个冲突，所以方面名为：springUtil2
     * 实际中使用springUtil
     */
    @Bean
    public SpringUtil springUtil2(){return new SpringUtil();}

    /**
     *
     参数里VM参数设置为：
     -javaagent:.\lib\springloaded-1.2.4.RELEASE.jar-noverify
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }
}
