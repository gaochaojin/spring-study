package com.gaochaojin.aop;

import org.springframework.stereotype.Component;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description: 业务逻辑方法
 * @Date Created in 17:32 2018/10/30
 */
public class Calculator {

    public int div(int i, int j) {
        System.out.println("调用我们的div方法......");
        return i / j;
    }
}
