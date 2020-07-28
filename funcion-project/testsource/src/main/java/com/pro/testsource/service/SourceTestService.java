package com.pro.testsource.service;

import com.pro.testsource.entity.TestEntity;

import java.util.List;

public interface SourceTestService {

    List<TestEntity> selectA();

    int deleteById(Integer id);
}
