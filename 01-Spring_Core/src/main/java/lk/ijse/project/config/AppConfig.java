package lk.ijse.project.config;

import lk.ijse.project.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.project.bean")/*tell where thr beans are*/
public class AppConfig {
    @Bean("getConnection")
    MyConnection myConnection(){
        return new MyConnection();
    }
}
