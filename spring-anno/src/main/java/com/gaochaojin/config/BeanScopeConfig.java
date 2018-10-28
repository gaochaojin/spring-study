package com.gaochaojin.config;

import com.gaochaojin.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 9:33 2018/10/28
 */
@ComponentScan
public class BeanScopeConfig {
    //给容器中注入一个bean，类型为返回值类型，默认为单实例
    /**
     * prototype：多实例：IOC容器启动的时候并不会去调用方法创建对象，而是每次获取的时候才会调用方法创建对象
     * singleton：单实例（默认）：IOC容器启动的时候就会调用方法创建对象并放到IOC容器中，以后每次获取的就是直接从容器中拿（大Map.get）的同一个bean
     * request：只要针对web应用，递交一次请求创建一个实例
     * session：同一个session创建一个实例
     *
     * @return
     */
    @Scope("prototype")
    @Bean
    public Person person(){
        return new Person("gaochaojin",25);
    }
}
