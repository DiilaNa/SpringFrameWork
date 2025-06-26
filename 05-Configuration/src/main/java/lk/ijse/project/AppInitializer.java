package lk.ijse.project;

import lk.ijse.project.bean.SpringBeanOne;
import lk.ijse.project.bean.SpringBeanTwo;
import lk.ijse.project.config.AppConfigOne;
import lk.ijse.project.config.AppConfigTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfigOne.class);
        context.register(AppConfigTwo.class);/*multiple configuration classes use krnn puluwn*/
        context.refresh();
        SpringBeanOne springBeanOne1 = context.getBean(SpringBeanOne.class);
        SpringBeanOne springBeanOne2 = context.getBean(SpringBeanOne.class);
        System.out.println(springBeanOne1);
        System.out.println(springBeanOne2);

        SpringBeanTwo springBeanTwo1 = context.getBean(SpringBeanTwo.class);
        System.out.println(springBeanTwo1);
        SpringBeanTwo springBeanTwo2 = context.getBean(SpringBeanTwo.class);
        System.out.println(springBeanTwo2);

        context.registerShutdownHook();
    }
}