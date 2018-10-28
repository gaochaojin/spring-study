import com.gaochaojin.config.AnnoConfig;
import com.gaochaojin.config.ImportConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 18:47 2018/10/27
 */
public class TestImport {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportConfig.class);

        Object bean1 = applicationContext.getBean("owerFactoryBean");
        Object bean2 = applicationContext.getBean("owerFactoryBean");
        System.out.println("owerFactoryBean的类型---------->" + bean1.getClass());
        System.out.println(bean1 == bean2);

        String[] beanNamesForType = applicationContext.getBeanDefinitionNames();
        for (String name : beanNamesForType) {
            System.out.println(name);
        }

    }

}
