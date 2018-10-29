import com.gaochaojin.config.AutowiredConfig;
import com.gaochaojin.dao.TestDao;
import com.gaochaojin.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 16:37 2018/10/29
 */
public class TestAutowired {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutowiredConfig.class);

        TestService testService = applicationContext.getBean(TestService.class);
        testService.println();

        //直接从容器中获取TestDao，和使用Autowired注解来取比较
        TestDao testDao = applicationContext.getBean(TestDao.class);
        System.out.println(testDao);

        applicationContext.close();

    }

}
