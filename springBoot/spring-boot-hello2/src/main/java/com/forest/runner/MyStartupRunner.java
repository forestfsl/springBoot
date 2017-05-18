package com.forest.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/** 服务启动执行
 * @Order 注解来定义执行顺序。
 * Created by songlin on 17/05/2017.
 */
@Component
@Order(value=2)
public class MyStartupRunner implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
    }
}
