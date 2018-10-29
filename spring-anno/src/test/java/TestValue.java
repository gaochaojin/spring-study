import com.gaochaojin.bean.Bird;
import com.gaochaojin.config.ValueConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 14:11 2018/10/29
 */
public class TestValue {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ValueConfig.class);

        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        Bird bird = (Bird) applicationContext.getBean("bird");
        System.out.println(bird);

        //从环境变量中获取bird.color
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        System.out.println("environment========>" + environment.getProperty("bird.color"));


    }
}
