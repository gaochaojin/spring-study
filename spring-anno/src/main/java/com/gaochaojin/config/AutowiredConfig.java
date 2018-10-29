package com.gaochaojin.config;

import com.gaochaojin.dao.TestDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 16:06 2018/10/29
 */
@Configuration
@ComponentScan({"com.gaochaojin.controller", "com.gaochaojin.dao", "com.gaochaojin.service"})
public class AutowiredConfig {

    @Bean("testDao")
    public TestDao testDao() {
        TestDao testDao = new TestDao();
        testDao.setFlag("2");
        return testDao;
    }


}
