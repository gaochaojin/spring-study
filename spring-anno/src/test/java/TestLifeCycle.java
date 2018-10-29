import com.gaochaojin.config.BeanLifeCycleConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description: bean的生命周期指的是bean的创建--初始化--销毁的过程
 * @Date Created in 19:08 2018/10/28
 */
public class TestLifeCycle {

    /**
     * bean生命周期 初始化和销毁
     * 1：指定初始化init-method方法、destroy-method方法---Bike
     * （对于单实例的bean，可以正常调用初始化和销毁方法；对于对多实例的bean，容器只负责初始化，但不会管理bean，容器关闭时不会调用销毁方法）
     * 2：实现InitializingBean接口的afterPropertiesSet()方法，当beanFactory创建好对象，且把bean所有属性设置好之后，会调用这个方法，相当于初始化方法
     *    实现DisposableBean的destroy()方法，当bean销毁时，会把单实例bean进行销毁---Train
     * 3：使用JSR250规则定义的两个注解实现：----Jeep
     *    @PostConstruct： 在Bean创建完成，且属于赋值完成后进行初始化，属于JDk规范的注解
     *    @preDestroy： 在bean被移除之前进行通知，在容器销毁之前进行清理工作
     * 4：BeanPostProcessor bean的后置处理器，在bean初始化之前调用进行拦截，在bean初始化前后进行一些处理工作使用BeanPostProcessor控制Bean的声明周期
     *   实现接口BeanPostProcessor的两个接口即可===》postProcessBeforeInitialzation，postprocessAfterInitialzation
     *
     *   总结：Spring底层对BeanPostProcessor的使用，包括bean的赋值，注入其他组件，生命周期注解功能等
   */

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanLifeCycleConfig.class);

        System.out.println("容器创建完成......");

        applicationContext.close();

        //结论：顺序：construction--->init----->destroy
    }
}
