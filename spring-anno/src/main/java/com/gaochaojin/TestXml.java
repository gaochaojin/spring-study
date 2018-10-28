package com.gaochaojin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description: 以xml的方式获取对象
 * @Date Created in 16:41 2018/10/27
 */
public class TestXml {

    public static void main(String[] args) {
        //把beans.xml加载到容器中
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        //从容器获取bean
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);


    }

}
