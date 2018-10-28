package com.gaochaojin.config;

import com.gaochaojin.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 9:55 2018/10/28
 */
@Configuration
public class LazyConfig {

    /**
     * 懒加载：只要是针对单实例bean：默认在容器启动的时候创建对象
     * 懒加载：容器启动时候不创建对象，仅当第一次使用（获取）bean的时候才创建被初始化
     * @return
     */
    @Lazy
    @Bean
    public Person person(){
        System.out.println("给容器中添加person。。。。。。");
        return new Person("gaochaojin",25);
    }
}
