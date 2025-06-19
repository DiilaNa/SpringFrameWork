package lk.ijse.project;

import lk.ijse.project.DI.Test02;
import lk.ijse.project.bean.Boy;
import lk.ijse.project.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        Boy boy = context.getBean(Boy.class);
//        boy.chatWithGirl();
        Test02 test02 = context.getBean(Test02.class);
        test02.test();
        context.registerShutdownHook();
    }
}