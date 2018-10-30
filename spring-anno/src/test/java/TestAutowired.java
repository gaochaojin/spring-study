import com.gaochaojin.bean.Moon;
import com.gaochaojin.bean.Sun;
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

        //测试@Autowired/@Resource/@Inject--@Qualifier/@Primary
        /*TestService testService = applicationContext.getBean(TestService.class);
        testService.println();

        //直接从容器中获取TestDao，和使用Autowired注解来取比较
        TestDao testDao = applicationContext.getBean(TestDao.class);
        System.out.println(testDao);*/

        //测试@Autowired的位置
        /*Moon moon = applicationContext.getBean(Moon.class);
        System.out.println(moon);

        Sun sun = applicationContext.getBean(Sun.class);
        System.out.println(sun.getMoon());*/

        applicationContext.close();

    }

}
