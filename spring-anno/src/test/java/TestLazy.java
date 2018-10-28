import com.gaochaojin.config.BeanScopeConfig;
import com.gaochaojin.config.LazyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 9:34 2018/10/28
 */
public class TestLazy {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LazyConfig.class);

        System.out.println("IOC容器创建完成。。。。。。");
        applicationContext.getBean("person");//执行获取的时候才创建并初始化bean

    }

}
