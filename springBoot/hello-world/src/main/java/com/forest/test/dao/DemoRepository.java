package com.forest.test.dao;

import com.forest.test.entity.Demo;
import org.springframework.data.repository.CrudRepository;

/**
 * 这是一个接口，没有具体的实现，这就是JPA
 * Created by songlin on 15/05/2017.
 */
/*
 * 在CrudRepository自带常用的crud方法.
 * 这样一个基本dao就写完了.
 */

public interface DemoRepository extends CrudRepository<Demo,Long> {

}
