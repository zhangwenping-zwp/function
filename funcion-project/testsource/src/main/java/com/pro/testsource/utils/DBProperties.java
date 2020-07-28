package com.pro.testsource.utils;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangwenping
 * @date 2020/7/28
 */
@Component
@ConfigurationProperties(prefix = "druid")
public class DBProperties {
    //使用Druid数据源
    private DruidDataSource master;
    private DruidDataSource slave;
    private Map<Object, Object> dataSources = new HashMap<>();
    private String defaultName;

    /**
     * 初始化自定义数据源集 Initializes the custom datasource set
     */
    public void init(){
        dataSources.put("master",master);
        dataSources.put("slave",slave);
    }

    /**
     * 获得默认的数据源
     * @return
     */
    public DruidDataSource getDefaultDataSource(){
        return (DruidDataSource)this.dataSources.get(defaultName);
    }






    public DruidDataSource getMaster() {
        return master;
    }

    public void setMaster(DruidDataSource master) {
        this.master = master;
    }

    public DruidDataSource getSlave() {
        return slave;
    }

    public void setSlave(DruidDataSource slave) {
        this.slave = slave;
    }

    public Map<Object, Object> getDataSources() {
        return dataSources;
    }

    public void setDataSources(Map<Object, Object> dataSources) {
        this.dataSources = dataSources;
    }

    public String getDefaultName() {
        return defaultName;
    }

    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }
}
