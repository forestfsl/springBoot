package com.forest.service;

import com.forest.bean.DemoInfo;
import javassist.NotFoundException;

/**
 * Created by songlin on 18/05/2017.
 */
public interface DemoInfoService {
    void delete(Long id);
    DemoInfo update(DemoInfo updated) throws NotFoundException;
    DemoInfo findById(Long id);
    DemoInfo save(DemoInfo demoInfo);
}
