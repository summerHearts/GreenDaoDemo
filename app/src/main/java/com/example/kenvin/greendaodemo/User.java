package com.example.kenvin.greendaodemo;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by Kenvin on 2017/11/2.
 */

@Entity
public class User {

    @Id(autoincrement = true)
    private Long id;
    private String name;
    private int age;
    private long savetime;//保存时间
    private String newColum;//新增字段

    @Generated(hash = 931384610)
    public User(Long id, String name, int age, long savetime, String newColum) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.savetime = savetime;
        this.newColum = newColum;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSavetime() {
        return savetime;
    }

    public void setSavetime(long savetime) {
        this.savetime = savetime;
    }

    public String getNewColum() {
        return newColum;
    }

    public void setNewColum(String newColum) {
        this.newColum = newColum;
    }
}
