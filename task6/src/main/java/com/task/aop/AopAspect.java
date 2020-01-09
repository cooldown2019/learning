package com.task.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import org.apache.log4j.Logger;

/**
 * API接口性能分析
 */
@Aspect
public class AopAspect {
    //引入日志配置
    private static Logger logger = Logger.getLogger(String.valueOf(Aop.class));

    /**
     * 定义切点函数
     */
    @Pointcut("execution(* com.task.controller.*.*(..))   ||  execution(* com.task.service.*.*(..))")
    void timer() {
    }

    @Around("timer()")
    public Object logTimer(ProceedingJoinPoint thisJoinPoint) throws Throwable {
        //获取目标类名称
        String clazzName = thisJoinPoint.getTarget().getClass().getName();
        //获取目标类方法名称
        String methodName = thisJoinPoint.getSignature().getName();
        // 计时并调用目标函数
        long start = System.currentTimeMillis();
        Object result = thisJoinPoint.proceed();
        long time = System.currentTimeMillis() - start;
        logger.info("执行" + clazzName + "中的方法:" + methodName + ",消耗时间为：" + time + "ms");
        return result;
    }
}

