package com.forest.core.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 用户信息
 * Created by songlin on 18/05/2017.
 */
@Entity
public class UserInfo implements Serializable {
    /*在使用此@JoinTable标记时，需要注意以下几个问题。
l         该标记与@Table注释类似，用于标注用于关联的表。可以标注在方法或者属性上，属性catalog、schema和uniqueConstraint与@Table注释中的属性意义类似，请读者参阅@Table注释说明的部分。
l         name属性为连接两个表的表名称。若不指定，则使用默认的表名称如下所示。
“表名1”+“_”+“表名2”。
例如以上的代码中，如果不指定name的名称，默认的保存关系的名称如下所示。
“customer_address”。
l         joinColumns属性表示，在保存关系中的表中，所保存关联关系的外键的字段。并配合@JoinColumn标记使用。
例如以下的映射配置，表示字段customer_id为外键关联到customer表中的id字段。
joinColumns={
         @JoinColumn(name="customer_id",referencedColumnName="id")
}
l         inverseJoinColumns属性与joinColumns属性类似，它保存的是保存关系的另一个外键字段。
例如以下的映射配置，表示字段address_id为外键关联到address表中的id字段。
inverseJoinColumns={
         @JoinColumn(name="address_id",referencedColumnName="id")
}
提示：@JoinTable不仅能够定义一对多的关联，也可以定义多对多表的关联*/
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private long uid;//用户id

    @Column(unique = true)
    private String username;//账号
    private String name;//名称(昵称或者真实姓名,不同系统不同定义)
    private String password;//密码
    private String salt;//加密密码的盐
    private String state;//用户状态,0:创建未认证,比如没有激活，没有输入验证码等等）--等待验证的用户 , 1:正常状态,2：用户被锁定.
    @ManyToMany(fetch= FetchType.EAGER)//立即从数据库中进行加载数据;
    @JoinTable(name = "SysUserRole", joinColumns = { @JoinColumn(name = "uid") }, inverseJoinColumns ={@JoinColumn(name = "roleId") })
    private List<SysRole> roleList;// 一个用户具有多个角色

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }

    /**
     * 密码盐
     * 这个方法重新对盐重新进行了定义，用户名+salt，这样就更加不容易被破解了。
     */
    public String getCredentialsSalt(){
        return this.username + this.salt;
    }

    @Override
    public String toString() {
        return "UserInfo [uid=" + uid + ", username=" + username + ", name=" + name + ", password=" + password
                + ", salt=" + salt + ", state=" + state + "]";
    }
}
