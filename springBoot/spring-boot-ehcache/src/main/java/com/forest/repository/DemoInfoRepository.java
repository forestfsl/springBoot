package com.forest.repository;


import com.forest.bean.DemoInfo;
import org.springframework.data.repository.CrudRepository;

/**操作数据库
 * Created by songlin on 18/05/2017.
 */
public interface DemoInfoRepository  extends CrudRepository<DemoInfo,Long>{
}
