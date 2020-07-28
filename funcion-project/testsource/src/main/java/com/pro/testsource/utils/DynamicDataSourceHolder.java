package com.pro.testsource.utils;

/**
 * @author zhangwenping
 * @date 2020/7/28
 */
public class DynamicDataSourceHolder {
    /**
     * 本地线程共享对象
     */
    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    public static void putDataSource(String name) {
        THREAD_LOCAL.set(name);
    }

    public static String getDataSource() {
        return THREAD_LOCAL.get();
    }

    /**
     * 清除本线程指定的数据源使用默认数据源
     */
    public static void clear() {
        THREAD_LOCAL.remove();
    }
}
