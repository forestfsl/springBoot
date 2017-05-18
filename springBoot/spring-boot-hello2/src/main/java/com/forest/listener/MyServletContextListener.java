package com.forest.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *  使用@WebListener注解，实现ServletContextListener接口
 * Created by songlin on 17/05/2017.
 */
public class MyServletContextListener implements ServletContextListener{
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContex销毁");
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContex初始化");
    }
}
