package com.pro.testsource.utils;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.lang.Nullable;

/**
 * @author zhangwenping
 * @date 2020/7/28
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Nullable
    @Override
    protected Object determineCurrentLookupKey() {
        String dataSource = DynamicDataSourceHolder.getDataSource();
        logger.info("------------------当前数据源:{}---------------------"+dataSource);
        return dataSource;
    }
}
