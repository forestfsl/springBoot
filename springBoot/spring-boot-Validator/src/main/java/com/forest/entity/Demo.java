package com.forest.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by songlin on 05/06/2017.
 */
@Getter
@Setter
@ToString
public class Demo {
    private long id;

    @NotEmpty(message = "姓名不能为空")
    private String name;

    @NotEmpty(message = "密码不能为空")
    @Length(min = 6,message = "密码长度不能小于6位")
    private String password;


}
