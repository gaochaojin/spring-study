package com.gaochaojin.config;

import com.gaochaojin.Person;
import com.gaochaojin.controller.OrderController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 18:49 2018/10/27
 */
@Configuration
@ComponentScan(value = "com.gaochaojin", useDefaultFilters = false,
//        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class)})//过滤类型为注解
//        includeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = OrderController.class)})//过滤类型为指定类型
        includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, classes = CustomFilterConfig.class)})//过滤类型为自定义的类型
//        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class)})
public class AnnoConfig {

    @Bean
    public Person person() {
        return new Person("gaochaojin", 26);
    }

}
