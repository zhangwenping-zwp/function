package com.pro.aspect;

import com.pro.target.TargetLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @author zhangwenping
 * @date 2020/7/16
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.pro.target.TargetLog)")
    public void aspect(){}

    @Before(value = "aspect()")
    public void doBefore(JoinPoint joinPoint){
        TargetLog targetLog = ((MethodSignature) joinPoint.getSignature()).getMethod().getAnnotation(TargetLog.class);
        System.out.println(targetLog.description());
    }

    public void doAfter(){

    }
}
