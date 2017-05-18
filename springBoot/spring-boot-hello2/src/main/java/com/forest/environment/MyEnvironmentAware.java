package com.forest.environment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 *  主要是@Configuration，实现接口：EnvironmentAware就能获取到系统环境信息;
 * Created by songlin on 17/05/2017.
 */
@Configuration
public class MyEnvironmentAware implements EnvironmentAware {

    //注入application.properties的属性到指定变量中.
    @Value("${spring.datasource.url}")
    private String myUrl;
    @Override
    public void setEnvironment(Environment environment) {
        //打印注入的属性信息
        System.out.println("myUrl="+myUrl);

        //通过enviroment获取到系统属性
        System.out.println(environment.getProperty("JAVA_HOME"));
        //通过environment同样能获取到applicaton.properties配置的属性
        System.out.println(environment.getProperty("spring.datasource.url"));

        //获取到前缀是"spring.datasource."的属性值列表
        RelaxedPropertyResolver relaxedPropertyResolver = new RelaxedPropertyResolver(environment,"spring.datasource.");
        System.out.println("spring.datasource.url="+relaxedPropertyResolver.getProperty("url"));
        System.out.println("spring.datasourdce.dricerClassName="+relaxedPropertyResolver.getProperty("driverClassName"));

    }
}
