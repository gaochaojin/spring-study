package com.gaochaojin.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description: 用于测试Autowired的使用
 * @Date Created in 12:53 2018/10/30
 */
@Component
public class Sun {

    @Autowired //第一个地方
    private Moon moon;

    public Sun(/* 第三个地方 @Autowired*/ Moon moon){
        this.moon = moon;
        System.out.println("Sun Constructor....");
    }

    public Moon getMoon() {
        return moon;
    }

//    @Autowired 第二个地方
    public void setMoon(Moon moon) {
        this.moon = moon;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "moon=" + moon +
                '}';
    }
}
