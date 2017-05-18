package com.forest.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/** 测试实体类
 * Created by songlin on 17/05/2017.
 */
@Entity
public class DemoInfo implements Serializable{
    private static  final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private long id;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DemoInfo [id=" + id + ",name=" + name +  "]";
    }
}
