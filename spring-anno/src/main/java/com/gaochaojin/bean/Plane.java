package com.gaochaojin.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 20:41 2018/10/28
 */
@Component
public class Plane implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Plane() {
        System.out.println("Plane constructor......");
    }

    @PostConstruct
    public void init() {
        System.out.println("Plane @PostConstruct......");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Plane @PreDestroy......");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //实现ApplicationContextAware可以获取到对用的applicationContext（应用上下文）
        this.applicationContext = applicationContext;
    }
}
