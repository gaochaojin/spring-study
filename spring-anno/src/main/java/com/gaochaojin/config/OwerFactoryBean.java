package com.gaochaojin.config;

import com.gaochaojin.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 15:19 2018/10/28
 */
public class OwerFactoryBean implements FactoryBean<Monkey> {

    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    public Class<?> getObjectType() {
        return Monkey.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
