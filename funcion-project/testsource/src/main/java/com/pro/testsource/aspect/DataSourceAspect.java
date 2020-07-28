package com.pro.testsource.aspect;


import com.pro.testsource.target.DataSource;
import com.pro.testsource.utils.DynamicDataSourceHolder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author zhangwenping
 * @date 2020/7/28
 */
@Component
@Aspect
@Order(0) //保证先被执行
public class DataSourceAspect {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     *   注解拦截切面表达式
     *   @annotation 用于拦截所有被该注解标注的方法
     * */
    @Pointcut("@annotation(com.pro.testsource.target.DataSource)")
    public void pointcut() {}

    @Before("pointcut()")
    public void annotationMethodBefore(JoinPoint joinPoint){
        Class<?> clazz = joinPoint.getTarget().getClass();
        DataSource annotation = clazz.getAnnotation(DataSource.class);
        //先判断类上是否有DataSource注解，如果没有在判断方法上是否有注解
        if(annotation == null){//类上没有
            //获取方法上的注解
            Method method = ((MethodSignature)joinPoint.getSignature()).getMethod();
            annotation = method.getAnnotation(DataSource.class);
            //如果还是为null则退出，这次方法调用将使用默认的数据源
            if(annotation == null){
                return;
            }
        }
        //获取注解上得值
        String dataSourceName = annotation.dataSource();
        logger.debug("---------------------------切换到数据源:"+dataSourceName+"----------------------------------");
        //因为有默认数据源的存在，所以不用担心注解上的值无对应的数据源，当找不到指定数据源时，会使用默认的数据源
        DynamicDataSourceHolder.putDataSource(dataSourceName);
    }
    //执行完切面后，将线程共享中的数据源名称清空 让程序使用默认数据源
    @After("pointcut()")
    public void annotationMethodAfter(JoinPoint joinPoint){
        DynamicDataSourceHolder.clear();
    }


}
