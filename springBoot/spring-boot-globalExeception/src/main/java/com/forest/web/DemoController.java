package com.forest.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by songlin on 04/06/2017.
 */
@RestController
public class DemoController {
    @RequestMapping("/zeroException")
    public int zeroException(){
        return 100/0;
    }
}
