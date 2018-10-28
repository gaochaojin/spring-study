import com.gaochaojin.config.AnnoConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 18:47 2018/10/27
 */
public class TestAnno {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnoConfig.class);

        //获取所有bean @ComponentScan(value = "com.gaochaojin")
        String[] beanNamesForType = applicationContext.getBeanDefinitionNames();
        for (String name : beanNamesForType) {
            System.out.println(name);
        }

    }

}
