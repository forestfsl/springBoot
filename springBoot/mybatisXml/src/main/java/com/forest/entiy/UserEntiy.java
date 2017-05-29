package com.forest.entiy;

import com.forest.enums.UserSexEnum;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by songlin on 27/05/2017.
 */
@Getter
@Setter

public class UserEntiy implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String userName;
    private String passWord;
    private UserSexEnum userSex;
    private String nickName;

    public UserEntiy(String userName, String passWord, UserSexEnum userSex) {
        this.userName = userName;
        this.passWord = passWord;
        this.userSex = userSex;
    }

    public UserEntiy() {
        super();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "userName " + this.userName + ", pasword " + this.passWord + "sex " + userSex.name();
    }
}
