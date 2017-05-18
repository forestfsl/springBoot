package com.forest.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**测试实体类
 * Created by songlin on 18/05/2017.
 */
@Entity
public class DemoInfo implements Serializable {
    private static  final long serialVersionUID = 1L;
    @Id //标注用于声明一个实体类的属性映射为数据库的主键列
    @GeneratedValue //用于标注主键的生成策略
    private long id;//主键
    private String name;//名称

    @Override
    public String toString() {
        return "DemoInfo[id=" + id + ",name=" + name + "]";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
