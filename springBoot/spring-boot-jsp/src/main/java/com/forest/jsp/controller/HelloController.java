package com.forest.jsp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**测试控制器
 * Created by songlin on 17/05/2017.
 */
@Controller
public class HelloController {
    /*从application.properties中读取配置,如娶不到默认值为Hello Shanhy*/
    @Value("${application.properties}")
    private String hello;

    @RequestMapping("/helloJsp")
    public String helloJsp(Map<String,Object>map){
        System.out.print("HelloController.helloJsp().hello="+hello);
        map.put("hello",hello);
        return "helloJsp";
    }
}
