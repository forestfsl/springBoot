package com.forest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * Created by songlin on 05/06/2017.
 */
@Controller
public class HelloController
{
    @RequestMapping("/hello")
    public String hello() {
        return "/hello";
    }

    //该段代码只会对session有效,但是对cookies无效
//    @RequestMapping("/changeSessionLanauage")
//    public String changeSessionLanauage(HttpServletRequest request, String lang){
//        System.out.println(lang);
//        if("zh".equals(lang)){
//            //代码中即可通过以下方法进行语言设置
//            request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, new Locale("zh", "CN"));
//        }else if("en".equals(lang)){
//            //代码中即可通过以下方法进行语言设置
//            request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, new Locale("en", "US"));
//        }
//        return "redirect:/hello";
//    }


    @RequestMapping("/changeSessionLanauage")
    public String changeSessionLanauage(HttpServletRequest request, HttpServletResponse response, String lang){
        System.out.println(lang);
        LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
        if("zh".equals(lang)){
            localeResolver.setLocale(request, response, new Locale("zh", "CN"));
        }else if("en".equals(lang)){
            localeResolver.setLocale(request, response, new Locale("en", "US"));
        }
        return "redirect:/hello";
    }
}
