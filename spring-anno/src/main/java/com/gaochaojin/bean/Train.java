package com.gaochaojin.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 20:19 2018/10/28
 */
@Component
public class Train implements InitializingBean, DisposableBean {

    public Train() {
        System.out.println("Train Constructor......");
    }

    //当我们bean销毁时，调用此方法
    public void destroy() throws Exception {
        System.out.println("Train destroy......");
    }

    //当我们的bean属性赋值和初始化完成时调用
    public void afterPropertiesSet() throws Exception {
        System.out.println("Train afterPropertiesSet......");
    }
}
