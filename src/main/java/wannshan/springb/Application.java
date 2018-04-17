package wannshan.springb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import wannshan.springb.config.MyApplicationConfig;
import wannshan.springb.config.SecurityConfig;

import java.time.Duration;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Import({MyApplicationConfig.class, SecurityConfig.class})
@MapperScan("wannshan.springb.service.mapper")
//@ServletComponentScan("wannshan.springb.container")
public class Application
{

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        return () -> 42;
    }
    public static void main(String[] args) {
        Duration sessionTimeout= Duration.ofSeconds(30);
        System.setProperty("spring.devtools.restart.enabled", "false");
//        SpringApplication.run(Application.class, args);
        SpringApplication app = new SpringApplication(Application.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
