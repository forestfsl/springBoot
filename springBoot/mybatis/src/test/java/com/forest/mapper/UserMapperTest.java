package com.forest.mapper;

import com.forest.MybatisApplication;
import com.forest.entiy.UserEntiy;
import com.forest.enums.UserSexEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


import java.util.List;

/**
 * Created by songlin on 27/05/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持
@SpringApplicationConfiguration(classes = MybatisApplication.class) //// 指定我们SpringBoot工程的Application启动类
@WebAppConfiguration //// 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
public class UserMapperTest {

    @Autowired
    private UserMapper UserMapper;


    @Test
    public void testInsert() throws Exception {
        UserMapper.insert(new UserEntiy("aa", "a123456", UserSexEnum.MAN));
        UserMapper.insert(new UserEntiy("bb", "b123456", UserSexEnum.WOMAN));
        UserMapper.insert(new UserEntiy("cc", "b123456", UserSexEnum.WOMAN));

        Assert.assertEquals(3, UserMapper.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<UserEntiy> users = UserMapper.getAll();
        System.out.println("######################"+users.toString());
    }


    @Test
    public void testUpdate() throws Exception {
        UserEntiy user = UserMapper.getOne(3l);
        System.out.println(user.toString());
        user.setNickName("forest");
        UserMapper.update(user);
        Assert.assertTrue(("forest".equals(UserMapper.getOne(3l).getNickName())));
    }

}
