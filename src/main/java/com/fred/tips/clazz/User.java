package com.fred.tips.clazz;

import java.io.Serializable;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/12/16
 */
@Deprecated
public class User implements Serializable, Cloneable {

    private String name;
    private int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
