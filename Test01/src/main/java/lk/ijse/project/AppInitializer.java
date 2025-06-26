package lk.ijse.project;

import lk.ijse.project.config.AppConfigOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfigOne.class);
        context.refresh();

        context.registerShutdownHook();
    }
}