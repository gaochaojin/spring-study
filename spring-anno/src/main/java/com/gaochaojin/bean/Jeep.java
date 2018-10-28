package com.gaochaojin.bean;

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
public class Jeep {

    public Jeep() {
        System.out.println("Jeep constructor......");
    }

    @PostConstruct
    public void init() {
        System.out.println("Jeep @PostConstruct......");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Jeep @PreDestroy......");
    }


}
