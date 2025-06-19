package lk.ijse.project;

import lk.ijse.project.bean.MyConnection;
import lk.ijse.project.bean.TestBean1;
import lk.ijse.project.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

      /*  TestBean1 testBean1 = context.getBean(TestBean1.class);
        System.out.println(testBean1);
        TestBean1 testBean2 = context.getBean(TestBean1.class);
        System.out.println(testBean2);*/
        MyConnection myConnection = context.getBean(MyConnection.class);
        System.out.println(myConnection);
        context.registerShutdownHook();
    }
}