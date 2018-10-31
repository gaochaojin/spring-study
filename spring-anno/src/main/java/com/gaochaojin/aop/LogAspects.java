package com.gaochaojin.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description: 日志切面类
 * @Date Created in 17:33 2018/10/30
 */
@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.gaochaojin.aop.Calculator.*(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "方法运行......参数为：" + Arrays.asList(joinPoint.getArgs()));
    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "方法结束......");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(Object result) {
        System.out.println("div方法正常返回......" + result);
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("div方法异常返回......" + exception);
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("@Around:执行目标方法之前......");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("@Around:执行目标方法之后......");
        return obj;
    }


}
