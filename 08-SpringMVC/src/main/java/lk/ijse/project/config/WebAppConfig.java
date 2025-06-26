package lk.ijse.project.config;

import lk.ijse.project.controller.HelloController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.project.bean")
@EnableWebMvc
@Import(HelloController.class)
public class WebAppConfig {
}
