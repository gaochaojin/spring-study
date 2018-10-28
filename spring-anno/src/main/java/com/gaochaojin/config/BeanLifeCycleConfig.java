package com.gaochaojin.config;

import com.gaochaojin.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 19:04 2018/10/28
 */
@Configuration
@ComponentScan("com.gaochaojin.bean")
public class BeanLifeCycleConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Bike bike(){
        return new Bike();
    }

}
