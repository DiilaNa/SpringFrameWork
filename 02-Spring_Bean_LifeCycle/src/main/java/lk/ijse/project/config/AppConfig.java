package lk.ijse.project.config;

import lk.ijse.project.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.project.bean")
public class AppConfig {
    @Bean
    public MyConnection myConnection() {
        return new MyConnection();
    }

}
