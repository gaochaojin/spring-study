package com.gaochaojin.config;

import com.gaochaojin.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 16:56 2018/10/27
 */
@Configuration/** 等同于beans.xml文件 */
public class PersonConfig {

    @Bean
    public Person person(){
        return new Person("gaochaojin",26);
    }
}
