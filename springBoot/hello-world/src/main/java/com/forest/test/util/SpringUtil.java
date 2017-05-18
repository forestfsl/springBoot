package com.forest.test.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**普通类调用Spring bean对象
 * 在Spring Boot可以扫描的包下
 * 说明:
 * 1.此类需要放到MainApplication.java同包或者子包下才能被扫描,否则失败
 * Created by songlin on 16/05/2017.
 */
@Component
public class SpringUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if(SpringUtil.applicationContext == null){
            SpringUtil.applicationContext  = applicationContext;
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("---------------com.kfit.base.util.SpringUtil------------------------------------------------------");
        System.out.println("========ApplicationContext配置成功,在普通类可以通过调用SpringUtils.getAppContext()获取applicationContext对象,applicationContext="+SpringUtil.applicationContext+"========");
        System.out.println("---------------------------------------------------------------------");
    }

    /*获取applicationContext*/
    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    /*通过class获取Bean*/
    public static <T> T getBean(Class<T>clazz){
        return getApplicationContext().getBean(clazz);
    }

    /*通过name,与及Clazz返回指定的Bean*/
    public static <T> T getBean(String name,Class<T>clazz){
        return getApplicationContext().getBean(name,clazz);
    }
}
