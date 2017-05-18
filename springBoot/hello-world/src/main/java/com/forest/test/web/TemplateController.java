package com.forest.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**模板测试(thymeleaf freemaker)
 * Created by songlin on 16/05/2017.
 */
@Controller
public class TemplateController {

    /**
     * 返回html模板
     * @param map
     * @return
     */
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object>map){
        map.put("hello","from TemplateController.helloHtml");
        return "/helloHtml";
    }

    //Thymeleaf基本知识参考：http://blog.csdn.net/pdw2009/article/details/44700897

    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String,Object>map){
        map.put("hello","from TemplateController.helloFtl");
        return "/helloFtl";
    }

}
