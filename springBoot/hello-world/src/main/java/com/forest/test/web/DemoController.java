package com.forest.test.web;

import com.alibaba.fastjson.JSONObject;
import com.forest.test.entity.Demo;
import com.forest.test.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by songlin on 14/05/2017.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Resource
    private DemoService demoService;
    /**
     * 返回demo数据:
     * 请求地址：http://127.0.0.1:8080/demo/getDemo
     * @return
     */
    @RequestMapping("/getDemo")
        public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("Angel");
        return demo;
    }
//    地址：http://127.0.0.1:8080/demo/getFastJson
    @RequestMapping("/getFastJson")
    public String getFastJson(){
        Demo demo = new Demo();
        demo.setId(2);
        demo.setName("Angel2");
        return JSONObject.toJSONString(demo);
    }
    //http://127.0.0.1:8080/demo/zeroException
    @RequestMapping("/zeroException")
    public int zeroException(){
        return 100/0;
    }


//    之后就可以进行测试了，访问地址：http://127.0.0.1:8081/demo/save
//
//    查看数据库，就可以看到已经添加的数据了。

    /**
     * 测试保存数据方法
     * @return
     */
    @RequestMapping("/save")
    public String save(){
        Demo demo = new Demo();
        demo.setName("forest");
        demoService.save(demo);//保存数据
        return "ok. DemoController save";
    }

    //    之后就可以进行测试了，访问地址：http://127.0.0.1:8081/demo/getById?id=1

    /**
     * 根据id查询实体
     * @param id
     * @return
     */
    @RequestMapping("getById")
    public Demo getById(long id){
        return demoService.getById(id);
    }

//    当前前提是你的数据库中有id=1的数据了，不然会报错的：
//    org.springframework.dao.EmptyResultDataAccessException
}
