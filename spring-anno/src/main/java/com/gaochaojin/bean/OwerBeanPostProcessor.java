package com.gaochaojin.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 11:10 2018/10/29
 */
@Component
public class OwerBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //返回一个对象（传过来的对象）
        //在初始化方法调用之前进行进行后置处理工作
        //什么时候调用它:init-method=init之前调用
        System.out.println("postProcessBeforeInitialization......"+beanName+"..."+bean);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization......"+beanName+"..."+bean);
        return bean;
    }
}
