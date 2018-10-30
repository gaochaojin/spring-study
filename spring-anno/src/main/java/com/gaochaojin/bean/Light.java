package com.gaochaojin.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description: Aware接口的应用
 * @Date Created in 16:07 2018/10/30
 */
@Component
public class Light implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

    private ApplicationContext applicationContext;

    public void setBeanName(String name) {
        System.out.println("当前bean的名字为：" + name);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("IOC容器上下文：" + applicationContext);
        this.applicationContext = applicationContext;
    }

    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        //用于获取数据@Value
        String result = resolver.resolveStringValue("你好${os.name}；你已经#{3*8}年了");
        System.out.println("解析数据为：" + result);
    }
}
