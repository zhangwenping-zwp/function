package com.pro.testsource.controller;

import com.pro.testsource.entity.UserEntity;
import com.pro.event.MyTestEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangwenping
 * @date 2020/7/15
 */
@RestController
@RequestMapping(value = "/ceshi")
public class TestController {
    @Autowired
    ApplicationEventPublisher eventPublisher;


    @GetMapping(value = "/test")
    public void Test(){
        UserEntity userEntity = new UserEntity("张三",13);
        eventPublisher.publishEvent(new MyTestEvent(this,userEntity));
    }
}
