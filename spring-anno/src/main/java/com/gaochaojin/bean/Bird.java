package com.gaochaojin.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 14:09 2018/10/29
 */
public class Bird {

    //使用@Value进行赋值：1：基本字符；2：SpringEL表达式；3：可以读取我们的配置文件
    @Value("smallBrother")
    private String name;
    @Value("#{20-18}")
    private Integer age;
    @Value("${bird.color}")
    private String color;

    public Bird() {
        super();
    }

    public Bird(String name, Integer age,String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
