package com.forest.service;

import com.forest.bean.DemoInfo;

/**demoInfo 服务接口
 * Created by songlin on 17/05/2017.
 */
public interface DemoInfoService {
    public DemoInfo findById(long id);
    public  void deleteFromCache(long id);
    void test();

}
