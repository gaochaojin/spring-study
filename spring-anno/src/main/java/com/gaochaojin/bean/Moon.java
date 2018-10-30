package com.gaochaojin.bean;

import org.springframework.stereotype.Component;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description: 用来测试@Autowired可以用在的地方
 * @Date Created in 12:51 2018/10/30
 */
@Component
public class Moon {

    public Moon(){
        System.out.println("Moon Constructor..........");
    }

    public void init(){
        System.out.println("Moon init........");
    }

    public void destroy(){
        System.out.println("Moon destroy......");
    }


}
