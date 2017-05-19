package com.forest.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by songlin on 18/05/2017.
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
    /**
     * 用户查询.
     * @return
     */
    @RequestMapping("/userList")
    public String userInfo(){
        return "userInfo";
    }

    /**
     * 用户添加;
     * @return
     */
    @RequestMapping("/userAdd")
    @RequiresPermissions("userInfo:add")//权限管理
    public String userInfoAdd(){
        return "userInfoAdd";
    }

//    INSERT INTO `SysPermission` VALUES ('2', '1', '用户添加', '1', '0/1', 'userInfo:add', 'button', 'userInfo/userAdd');

}
