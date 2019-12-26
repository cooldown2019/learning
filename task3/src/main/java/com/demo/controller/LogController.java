package com.demo.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Aspect
@Component
public class LogController {

    @Autowired
    HttpServletRequest request;
    private static Logger logger = LogManager.getLogger(LogController.class);

    @Pointcut("execution(* com.demo.controller.*.*(..))")
    public void con() {
    }

    @Around("con()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("--------------------方法开始--------------------");
        //1. 访问时间 private String visitTime;
        Date date = new Date();

        //2. 函数的运行时间
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long time = System.currentTimeMillis() - start;

        //3. 访问的ip地址 private String ip;
        String ip = request.getRemoteAddr();

        //4. 访问的全限类名.方法 private String method;
        //被拦截的类的全限类名
        Object target = joinPoint.getTarget();
        String className = target.getClass().getName();
        //获取被拦截的方法名称
        Signature signature = joinPoint.getSignature();
        String methodName = signature.getName();
        String fullname = className + "." + methodName;

        logger.info("-------------------现在时间：" + date);
        logger.info("-------------------函数运行时间：" + time);
        logger.info("-------------------ip地址：" + ip);
        logger.info("-------------------接口路径：" + fullname);

        try {
            return joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}

