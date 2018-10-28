package com.gaochaojin.config;

import com.gaochaojin.bean.Pig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 14:51 2018/10/28
 */
public class OwerImportDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     *
     * @param importingClassMetadata 当前类的注解信息
     * @param registry 注册类，把所需要添加到容器中的bean加入
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean bean1 = registry.containsBeanDefinition("com.gaochaojin.bean.Dog");
        boolean bean2 = registry.containsBeanDefinition("com.gaochaojin.bean.Cat");
        //如果Dog和Cat同时存在于我们IOC容器中，那么创建Pig类，加入到容器中
        //对于我们要注册的bean，给bean进行封装
        if (bean1 && bean2){
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Pig.class);
            registry.registerBeanDefinition("pig",beanDefinition);
        }
    }
}
