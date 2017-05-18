package com.forest.controller;

import com.forest.config.ForestSetting;
import com.forest.config.ForestSetting2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by songlin on 17/05/2017.
 */
@Controller
public class TestController {
    @Autowired
    private ForestSetting forestSetting;
    @Autowired
    private ForestSetting2 forestSetting2;

    @RequestMapping("/test")
    public @ResponseBody String test(){
        System.out.println(forestSetting.getGender() + "---------------" + forestSetting.getName());
        System.out.println(forestSetting2.getGender() + "===============" + forestSetting2.getName());
        return "ok";
    }
}
