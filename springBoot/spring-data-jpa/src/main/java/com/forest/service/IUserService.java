package com.forest.service;

import com.forest.domain.User;

import java.util.List;

/**
 * Created by songlin on 29/05/2017.
 */
public interface IUserService {
    public List<User> findAll();
    public void saveUser(User book);
    public User findOne(long id);
    public void delete(long id);
    public List<User>findByName(String name);
}
