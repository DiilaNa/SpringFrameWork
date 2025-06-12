package lk.ijse.project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.project.bean")/*tell where thr beans are*/
public class AppConfig {
}
