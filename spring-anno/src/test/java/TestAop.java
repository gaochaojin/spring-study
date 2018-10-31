import com.gaochaojin.aop.AopConfig;
import com.gaochaojin.aop.Calculator;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description: 测试面向切面编程（AOP）底层就是动态代理----指程序在运行期间动态的将某段代码切入到指定方法位置进行运行的编程方式
 * @Date Created in 17:44 2018/10/30
 */
public class TestAop {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);

        Calculator calculator = applicationContext.getBean(Calculator.class);
        int result = calculator.div(4, 2);
        System.out.println(result);

    }

}
