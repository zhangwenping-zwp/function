import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author zhangwenping
 * @date 2020/7/15
 */
@SpringBootApplication(scanBasePackages = { "com.pro.testsource"})
@MapperScan("com.pro.testsource.dao")
public class TestApplication {
    public static void main(String[] args) {
       SpringApplication.run(TestApplication.class, args);
    }
}
