import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author zhangwenping
 * @date 2020/7/15
 */
@SpringBootApplication(scanBasePackages = { "com.pro.*"})
public class ListenerTestApplication {
    public static void main(String[] args) {
       SpringApplication.run(ListenerTestApplication.class, args);
    }
}
