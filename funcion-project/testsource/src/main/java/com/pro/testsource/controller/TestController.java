package com.pro.testsource.controller;

import com.pro.testsource.entity.TestEntity;
import com.pro.testsource.service.SourceTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangwenping
 * @date 2020/7/28
 */
@RestController
public class TestController {

    @Autowired
    private SourceTestService sourceTestService;

    @GetMapping("/selectAll")
    public List<TestEntity> selectAll(){
        return sourceTestService.selectA();
    }

    @GetMapping("/delete")
    public int delete(Integer id){
        return sourceTestService.deleteById(id);
    }
}
