import com.gaochaojin.config.ConditionalConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 13:23 2018/10/28
 */
public class TestConditional {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionalConfig.class);

        System.out.println("IOC容器创建完成。。。。。。");

        //备注：测试linux时，在VM options 中直接设置变量 -Dos.name=linux
    }
}
