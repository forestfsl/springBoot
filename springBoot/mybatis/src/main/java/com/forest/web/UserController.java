package com.forest.web;

import com.forest.entiy.UserEntiy;
import com.forest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by songlin on 27/05/2017.
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUsers")
    public List<UserEntiy> getUsers() {
        List<UserEntiy> users=userMapper.getAll();
        return users;
    }

    @RequestMapping("/getUser")
    public UserEntiy getUser(Long id) {
        UserEntiy user=userMapper.getOne(id);
        return user;
    }

    @RequestMapping("/add")
    public void save(UserEntiy user) {
        userMapper.insert(user);
    }

    @RequestMapping(value="update")
    public void update(UserEntiy user) {
        userMapper.update(user);
    }

    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
    }


}
