package lk.ijse.project.config;

import lk.ijse.project.bean.E;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "lk.ijse.project.bean")
@Import({AppConfig1.class,AppConfig2.class})
public class AppConfigOne {
    @Bean
    public E e() {
        return new E();
    }
}
