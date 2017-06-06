package com.forest.controller;

import com.forest.entity.Demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by songlin on 05/06/2017.
 */
@Controller
public class DemoController {
    @RequestMapping("/demo")
    public String demo(Model model){
        model.addAttribute("demo",new Demo());
        return "/demo";
    }


    @RequestMapping("/demoAdd")
    public String demoAdd(@Valid Demo demo, BindingResult result, Model model){
        //有错误信息.
        model.addAttribute("demo",demo);
        if(result.hasErrors()){
            List<ObjectError> list = result.getAllErrors();
            for(ObjectError error:list){
                System.out.println(error.getCode()+"---"+error.getArguments()+"---"+error.getDefaultMessage());
            }

            return "demo";
        }
        return "/demo";
    }
}
