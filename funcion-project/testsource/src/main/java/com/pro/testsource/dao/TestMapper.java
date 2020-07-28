package com.pro.testsource.dao;


import com.pro.testsource.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TestMapper {

    List<TestEntity> selectAll();

    int deleteById(@Param("id") Integer id);
}
