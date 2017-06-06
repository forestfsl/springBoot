package com.forest.controller;

import com.forest.config.Task1;
import com.forest.config.Task2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by songlin on 03/06/2017.
 */
@RestController
public class TaskController {
    @Autowired
    Task1 task1;
    @Autowired
    Task2 task2;

    @RequestMapping("/task1")
    public String task1() throws Exception {
        task1.doTaskOne();
        task1.doTaskTwo();
        task1.doTaskThree();
        return "task1";
    }

    //测试task2.
    @RequestMapping("/task2")
    public String task2() throws Exception {
        task2.doTaskOne();
        task2.doTaskTwo();
        task2.doTaskThree();
        return "task2";
    }

}