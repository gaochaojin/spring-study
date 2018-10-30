package com.gaochaojin.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description: 日志切面类
 * @Date Created in 17:33 2018/10/30
 */
@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.gaochaojin.aop.Calculator.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void logStart(){
        System.out.println("div方法运行......");
    }

    @After("pointCut()")
    public void logEnd(){
        System.out.println("div方法结束......");
    }

    @AfterReturning("pointCut()")
    public void logReturn(){
        System.out.println("div方法正常返回......");
    }

    @AfterThrowing("pointCut()")
    public void logException(){
        System.out.println("div方法异常返回......");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("@Around:执行目标方法之前......");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("@Around:执行目标方法之后......");
        return obj;
    }


}
