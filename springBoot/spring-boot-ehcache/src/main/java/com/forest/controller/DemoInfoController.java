package com.forest.controller;

import com.forest.bean.DemoInfo;
import com.forest.service.DemoInfoService;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by songlin on 18/05/2017.
 */
@RestController
public class DemoInfoController {
    @Resource
    private DemoInfoService demoInfoService;

    @RequestMapping("/test")
    public String test(){
        //存入两条数据
        DemoInfo demoInfo = new DemoInfo();
        demoInfo.setName("张三");

        DemoInfo demoInfo2 = demoInfoService.save(demoInfo);

        //不走缓存
        System.out.println(demoInfoService.findById(demoInfo2.getId()));
        //走缓存
        System.out.println(demoInfoService.findById(demoInfo2.getId()));


        demoInfo = new DemoInfo();
        demoInfo.setName("李四");
        DemoInfo demoInfo3 = demoInfoService.save(demoInfo);

        //不走缓存
        System.out.println(demoInfoService.findById(demoInfo3.getId()));
        //走缓存
        System.out.println(demoInfoService.findById(demoInfo3.getId()));

        System.out.println("============修改数据=====================");

        //修改数据
        DemoInfo updated = new DemoInfo();
        updated.setName("李四-update");
        updated.setId(demoInfo3.getId());

        try {
            System.out.println(demoInfoService.update(updated));
        }catch (NotFoundException e){
            e.printStackTrace();
        }

        //不走缓存
        System.out.println(demoInfoService.findById(updated.getId()));

        return "ok";
    }
}
