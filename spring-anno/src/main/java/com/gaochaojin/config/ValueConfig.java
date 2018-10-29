package com.gaochaojin.config;

import com.gaochaojin.bean.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description: 给bean的属性赋值的配置
 * @Date Created in 14:09 2018/10/29
 */
@Configuration
@PropertySource(value = "classpath:/bird.properties")
public class ValueConfig {

    @Bean
    public Bird bird(){
        return new Bird();
    }

}
