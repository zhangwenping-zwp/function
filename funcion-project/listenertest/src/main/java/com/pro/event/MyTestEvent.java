package com.pro.event;

import com.pro.testsource.entity.UserEntity;
import org.springframework.context.ApplicationEvent;

/**
 * @author zhangwenping
 * @date 2020/7/15
 */
public class MyTestEvent extends ApplicationEvent {
    private UserEntity userEntity;

    public MyTestEvent(Object source, UserEntity userEntity) {
        super(source);
        this.userEntity = userEntity;
    }

    public UserEntity getUserEntity(){
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity){
        this.userEntity = userEntity;
    }
}
