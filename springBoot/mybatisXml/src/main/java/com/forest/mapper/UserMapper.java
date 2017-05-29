package com.forest.mapper;

import com.forest.entiy.UserEntiy;

import java.util.List;

/**
 * Created by songlin on 27/05/2017.
 */
public interface UserMapper {

    List<UserEntiy> getAll();

    UserEntiy getOne(Long id);

    void insert(UserEntiy user);

    void update(UserEntiy user);

    void delete(Long id);
}
