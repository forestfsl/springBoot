package com.forest.test.servlet;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * druid 数据源状态监控
 * Created by songlin on 16/05/2017.
 */

@WebServlet(urlPatterns = "/druid/*",initParams = {
        @WebInitParam(name = "allow",value = "172.17.9.10,127.0.0.1"),//IP白名单,没有配置则为空,则允许所有访问
        @WebInitParam(name = "deny",value = "172.17.9.11"),//IP黑名单(存在同时,deny优先allow)
        @WebInitParam(name = "loginUsername",value = "root"),//用户名
        @WebInitParam(name = "loginPassword",value = "123456"),//密码
        @WebInitParam(name = "resetEnable",value = "false")//禁用HTML页面上的Reset All功能
})
public class DruidStatViewServlet extends StatViewServlet{
    private static final  long serialVersionUID = 1L;
}
