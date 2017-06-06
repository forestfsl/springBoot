package com.forest.exception;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by songlin on 04/06/2017.
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest request,Exception e) throws Exception {
        //在这里面你可以处理相应的错误信息
        //1.可以抛异常
//        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null){
//            throw e;//这种又@ResponseStatus注解的异常,可以让框架自己去处理(例如OrderNotFoundException等)
//        }
        //2.跳转到一个错误的error-view
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("exception",e);
//        modelAndView.addObject("url",request.getRequestURL());
//        modelAndView.setViewName(Default_error_view);
//        return;modelAndView;
        //3.打印异常信息,在这里为了方便操作,我直接选择了第三种情况
        e.printStackTrace();
        System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");
    }
}
