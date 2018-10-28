package com.gaochaojin.config;

import com.gaochaojin.Person;
import com.gaochaojin.condition.LinuxCondition;
import com.gaochaojin.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description: 条件注册bean
 * @Date Created in 13:13 2018/10/28
 */
@Configuration
public class ConditionalConfig {

    @Bean("person")
    public Person person(){
        System.out.println("给容器添加了person。。。。。。");
        return new Person("person",26);
    }

    @Bean("person1")
    @Conditional(WindowsCondition.class)
    public Person person1(){
        System.out.println("给容器添加了person1。。。。。。");
        return new Person("person1",26);
    }

    @Bean("person2")
    @Conditional(LinuxCondition.class)
    public Person person2(){
        System.out.println("给容器添加了person2。。。。。。");
        return new Person("person2",26);
    }
}
