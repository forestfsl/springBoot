package com.forest.controller;

import com.forest.bean.Demo;
import com.forest.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by songlin on 01/06/2017.
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/test1")
    public String test(){
//        for (Demo d:testService.getListByDs1()){
//            System.out.println(d);
//        }

     for(Demo d:testService.getList()){
         System.out.println(d);
     }

        return "ok";
    }

}
