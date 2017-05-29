package com.forest.service.impl;

import com.forest.domain.User;
import com.forest.repository.UserRepository;
import com.forest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by songlin on 29/05/2017.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User book) {
        userRepository.save(book);
    }

    @Override
    @Cacheable("users")
    public User findOne(long id) {
        System.out.println("#########Cached Pages#########");
        return userRepository.findOne(id);
    }

    @Override
    public void delete(long id) {
         userRepository.delete(id);
    }

    @Override
    public List<User> findByName(String name) {
        List<User>userList1 = userRepository.findByname1(name);
        List<User>userList2 = userRepository.findByName2(name);
        List<User>userList3 = userRepository.findByNameAndAddress(name,"3");
        System.out.println("userList1:" + userList1);
        System.out.println("userList2" + userList2);
        System.out.println("userList3" + userList3);
        return userRepository.findByName(name);
    }
}
