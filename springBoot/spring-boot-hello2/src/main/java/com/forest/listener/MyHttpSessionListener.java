package com.forest.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 监听Session的创建与销毁
 * Created by songlin on 17/05/2017.
 */
public class MyHttpSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("Session 被创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("Session 被销毁");
    }

//    为什么无法看到session的过程：http://zhidao.baidu.com/link?url=EP-wlLvKpo8zI5NaIZrESzCdivq3Xg8VgOWQOvfpSLl3opTgvESerpo4wsG6tOs_dm6cQQMF_kQ6THNjNzr2Nq


}
