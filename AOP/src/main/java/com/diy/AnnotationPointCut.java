package com.diy;
//方法3：使用注解方式实现AOP

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //标注这个类是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.Service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("===方法执行前===");
    }

    @After("execution(* com.Service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("===方法执行后===");
    }

    //在环绕增强中我们可以给定一个参数代表我们要获取处理切入的点
    @Around("execution(* com.Service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp){
        System.out.println("环绕前");

        //执行方法
        try {
            Object proceed = jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("环绕后");

    }
}
