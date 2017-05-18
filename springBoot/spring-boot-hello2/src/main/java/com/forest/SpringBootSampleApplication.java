package com.forest;

import com.forest.config.ForestSetting;
import com.forest.config.ForestSetting2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by songlin on 17/05/2017.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"cn.forest","org.forest"})
/*@note 这时候你会发现，在App.java同包下的都没有被扫描了，所以如果也希望App.java包下的也同时被扫描的话，那么在进行指定包扫描的时候一定要进行指定配置：

@ComponentScan(basePackages={"cn.kfit","org.kfit","com.kfit"})*/
@ServletComponentScan//这个就是扫描相应的Servlet包;
@EnableConfigurationProperties({ForestSetting.class,ForestSetting2.class})
public class SpringBootSampleApplication {
    public static void main(String[]args) {
        SpringApplication.run(SpringBootSampleApplication.class, args);
    }

    //访问http://127.0.0.1:8081/myServlet2


    /*至于如何使用代码的方式注册Filter和Listener，
    请参考上一篇文章关键Servlet的介绍。不同的是需要使用
    FilterRegistrationBean 和 ServletListenerRegistrationBean
    这两个类。*/
}
