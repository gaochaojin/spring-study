package com.gaochaojin.config;

import com.gaochaojin.Person;
import com.gaochaojin.bean.Cat;
import com.gaochaojin.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 14:00 2018/10/28
 */
@Configuration
@Import(value = {Dog.class, Cat.class, OwerImportSelector.class, OwerImportDefinitionRegistrar.class})
public class ImportConfig {

    /**
     * 给容器中注册组件的方式
     * 1：@Bean 导入第三方的类或包的组件，比如Person为第三方的类，需要在我们的IOC容器中使用
     * 2：包扫描+组件的标注注解（@ComponentScan：@Controllerr,@Service,@Repository,@Component）一般是针对我们自己写的类，使用这个
     * 3：@Import 快速给容器导入一个组件 注意：@Bean有点简单
     * a：@Import  要导入到容器中国的组件，容器会自动注册这个组件，bean的id为全类名
     * b：ImportSelector是一个接口，返回需要导入到容器的组件的全类名数组
     * c：ImportBeanDefinitionRegistrar可以手动添加组件到IOC容器，所有Bean的注册可以使用BeanFactoryRegistry
     * 写OwerImportDefinitionRegistrar实现ImportBeanDefinitionRegistrar接口即可
     * 4：使用Spring提供的FactoryBean（工厂bean）进行注册
     * @return
     */

    //容器启动时初始化person的bean实例
    @Bean("person")
    public Person person() {
        return new Person("person", 26);
    }

    @Bean
    public OwerFactoryBean owerFactoryBean(){
        return new OwerFactoryBean();
    }

}
