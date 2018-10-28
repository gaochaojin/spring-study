package com.gaochaojin.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 13:16 2018/10/28
 */
public class WindowsCondition implements Condition {

    /**
     * @param context  判断条件可以使用的上下文（环境）
     * @param metadata 注解的信息
     * @return
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //是否为Windows系统
        //能获取到IOC容器正在使用过的beanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //获取当前环境变量（包括我们操作系统是WINDOWS还是LINUX）
        Environment environment = context.getEnvironment();
        String osName = environment.getProperty("os.name");
        if (osName.contains("Windows")) {
            return true;
        }
        return false;
    }
}
