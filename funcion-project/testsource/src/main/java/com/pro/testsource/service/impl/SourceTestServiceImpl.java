package com.pro.testsource.service.impl;

import com.pro.testsource.dao.TestMapper;
import com.pro.testsource.entity.TestEntity;
import com.pro.testsource.service.SourceTestService;
import com.pro.testsource.target.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangwenping
 * @date 2020/7/28
 */
@Service
public class SourceTestServiceImpl implements SourceTestService{
    @Autowired
    private TestMapper testMapper;


    @Override
    @DataSource(dataSource = "slave")
    public List<TestEntity> selectA() {
        return testMapper.selectAll();
    }

    @Override
    @DataSource(dataSource = "master")
    public int deleteById(Integer id) {
        return testMapper.deleteById(id);
    }
}
