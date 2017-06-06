package com.forest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by songlin on 02/06/2017.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name,int state) {
        return "name" +name+"---"+ state;
    }
}
