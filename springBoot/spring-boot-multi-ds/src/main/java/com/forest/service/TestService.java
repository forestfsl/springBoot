package com.forest.service;

import com.forest.bean.Demo;
import com.forest.config.TargetDataSource;
import com.forest.dao.TestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by songlin on 01/06/2017.
 */
@Service
public class TestService {
    @Resource
    private TestDao testDao;

    /**
     * 不指定数据源使用默认数据源
     * @return
     */
    public List<Demo> getList(){
        return testDao.getList();
    }

    /**
     * 指定数据源
     * @return
     */
    @TargetDataSource("ds1")
    public List<Demo> getListByDs1(){
        return testDao.getListByDs1();
    }
}
