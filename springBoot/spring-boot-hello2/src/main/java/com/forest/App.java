package com.forest;

import com.forest.servlet.MyServlet1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * Created by songlin on 17/05/2017.
 */
@SpringBootApplication
public class App {
    /**
     * 注册Servlet.不需要添加注解：@ServletComponentScan
     * @return
     */

    @Bean
    public ServletRegistrationBean MyServlet1(){
        return new ServletRegistrationBean(new MyServlet1(),"/myServlet/*");
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

//    右键Run As JavaApplication进行访问http://127.0.0.1:8080/myServlet1
}
