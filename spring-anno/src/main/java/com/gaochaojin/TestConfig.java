package com.gaochaojin;

import com.gaochaojin.config.PersonConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 16:58 2018/10/27
 */
public class TestConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersonConfig.class);

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);


        //获取bean的id
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        //说明：beanId--如果@Bean中没有定义id，默认id为对用bean的方法名
        //也可以在bean("abcPerson"),id为abcPerson
        for (String name : beanNamesForType) {
            System.out.println(name);
        }
    }


}
