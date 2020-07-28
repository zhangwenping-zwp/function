package com.pro.testsource.entity;

/**
 * @author zhangwenping
 * @date 2020/7/15
 */
public class UserEntity {

    private String userName;

    private int age;

    public UserEntity(){};

    public UserEntity(String userName, int age){
        this.userName = userName;
        this.age = age;
    }

    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
