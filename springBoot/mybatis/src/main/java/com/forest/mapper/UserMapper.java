package com.forest.mapper;

import com.forest.entiy.UserEntiy;
import com.forest.enums.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by songlin on 27/05/2017.
 */
public interface UserMapper {
    @Select("SELECT * FROM USERS")
    @Results({
            @Result(property = "userSex",column = "user_sex",javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    List<UserEntiy>getAll();

    @Select("SELECT * FROM USERS WHERE id = #{id}")
    @Results({
            @Result(property = "userSex",column = "user_sex",javaType = UserSexEnum.class),
            @Result(property = "nickName",column = "nick_name")
    })
    UserEntiy getOne(Long id);

    @Insert("INSERT INTO USERS(userName,passWord,user_sex) VALUES(#{userName},#{passWord},#{userSex})")
    void insert(UserEntiy userEntiy);

    @Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(UserEntiy user);

    @Delete("DELETE FROM USERS WHERE id = #{id}")
    void delete(Long id);
}
