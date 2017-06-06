package com.forest.controller;

import com.forest.javabean.JavaBean;
import com.forest.javabean.JavaBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by songlin on 01/06/2017.
 */
@RestController
public class HelloController {
    @Resource(name = "JavaBean1")
    private JavaBean javaBean1;

    @Autowired
    @Qualifier("JavaBean2")
    private JavaBean javaBean2;

    @RequestMapping("/test")
    public String test(){
        javaBean1.javaBean();
        javaBean2.javaBean();
        return "test";
    }
}
