package com.pro.listener;

import com.pro.testsource.entity.UserEntity;
import com.pro.event.MyTestEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author zhangwenping
 * @date 2020/7/15
 */
@Component
public class MyListener implements ApplicationListener<MyTestEvent> {
    @Override
    public void onApplicationEvent(MyTestEvent myEvent) {
        UserEntity userEntity = myEvent.getUserEntity();
        System.out.println("姓名:"+userEntity.getUserName()+":年龄:"+userEntity.getAge());
    }
}
