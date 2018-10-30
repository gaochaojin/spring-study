package com.gaochaojin.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description: 日志切面配置类
 * @Date Created in 17:31 2018/10/30
 */

/**
 * 日志切面类的方法需要动态感知到div()方法运行：
 * 通知方法：
 * 前置通知：logStart()：在我们执行div()方法之前执行（@Before）
 * 后置通知：logEnd():在我们执行div()方法之后执行，不管有没有异常（@After）
 * 返回正常通知：logReturn():在我们的目标方法div()正常返回值后运行（@AfterReturning）
 * 返回异常通知：logException():在我们的目标方法div()出现异常后运行（@AfterThrowing）
 * 环绕通知：around():动态代理，需要手动执行proceedingJoinPoint.proceed()(其实就是执行我们的目标方法div)，执行之前div()相当于前置通知，执行之后就相当于后置通知（@Around）
 */
@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

    @Bean
    public Calculator calculator(){
        return new Calculator();
    }

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }

}
