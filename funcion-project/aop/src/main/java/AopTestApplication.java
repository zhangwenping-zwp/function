import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author zhangwenping
 * @date 2020/7/15
 */
@SpringBootApplication(scanBasePackages = { "com.pro.*"})
@MapperScan("com.pro.*")
public class AopTestApplication {
    public static void main(String[] args) {
       SpringApplication.run(AopTestApplication.class, args);
    }
}
