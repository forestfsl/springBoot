package com.forest.core.repository;

import com.forest.core.bean.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**UserInfo 持久化类
 * Created by songlin on 18/05/2017.
 */

public interface UserInfoRepository extends CrudRepository<UserInfo,Long> {
    /*通过username查找用户信息*/
    public UserInfo findByUsername(String username);
}
