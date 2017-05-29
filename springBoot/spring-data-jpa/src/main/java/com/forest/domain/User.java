package com.forest.domain;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import java.io.Serializable;

/**
 * Created by songlin on 29/05/2017.
 */
@Getter
@Setter
@Entity
@NamedQuery(name = "User.findByName", query = "select name,address from User u where u.name=?1")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    long id;
    @Column(name = "name")
    String name;
    @Column(name = "address")
    String address;
    @Override
    public String toString()
    {

        return this.id + "," + this.name + "," + this.address;
    }
}
