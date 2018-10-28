import com.gaochaojin.config.BeanScopeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 9:34 2018/10/28
 */
public class TestBeanScope {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanScopeConfig.class);

        //从容器中分别取两次person实例，看是否为同一个bean
        Object bean1 = applicationContext.getBean("person");
        Object bean2 = applicationContext.getBean("person");
        System.out.println(bean1 == bean2);
        //结论：bean1就是bean2，同一个对象

    }

}
