package com.forest.test.service;

import com.forest.test.dao.DemoDao;
import com.forest.test.dao.DemoRepository;
import com.forest.test.entity.Demo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**提供demo服务类
 * Created by songlin on 15/05/2017.
 */
@Service
public class DemoService {
    @Resource
    private DemoRepository demoRepository;

    @Resource
    private DemoDao demoDao;

    @Transactional
    public void save(Demo demo){
        demoRepository.save(demo);
    }

    public Demo getById(long id){
        //demoRepository.findOne(id);//在demoRepository可以直接使用findOne进行获取.
        return demoDao.getById(id);
    }
}
