package com.forest.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by songlin on 03/06/2017.
 */
@Getter
@Setter
@ToString
public class User {
    private long id;
    private String name;
    private Integer age;
}
