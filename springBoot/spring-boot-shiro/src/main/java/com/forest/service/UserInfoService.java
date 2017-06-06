package com.forest.service;

        import com.forest.core.bean.UserInfo;

/**
 * Created by songlin on 18/05/2017.
 */
public interface UserInfoService {
    public UserInfo findByUsername(String username);
}
