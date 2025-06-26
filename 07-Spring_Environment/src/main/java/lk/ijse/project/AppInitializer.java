package lk.ijse.project;


import lk.ijse.project.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
//
//        /*-------------System Variables---------*/
//        Map<String,String> env = System.getenv();
//        for (Map.Entry<String, String> entry : env.entrySet()) {
//            System.out.println(entry.getKey() + "=" + entry.getValue());
//        }
//        System.out.println(env.get("os"));
//        System.getProperties().list(System.out);
        context.registerShutdownHook();
    }
}