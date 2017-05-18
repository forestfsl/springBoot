package com.forest.test.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by songlin on 14/05/2017.
 */
@RestController// 标记为：restful
@RequestMapping("/")
public class HelloController {

        @RequestMapping("/")
        public String hello(){
            return"Hello World!";
        }
}
