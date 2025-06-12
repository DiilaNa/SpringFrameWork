package lk.ijse.project;

import lk.ijse.project.bean.SpringBean;
import lk.ijse.project.bean.TestBean01;
import lk.ijse.project.bean.TestBean02;
import lk.ijse.project.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        SpringBean bean = context.getBean(SpringBean.class);
        bean.test();
        SpringBean bean2 = context.getBean(SpringBean.class);
        bean2.test();


        TestBean01 bean01 = context.getBean(TestBean01.class);
        System.out.println(bean01);
        TestBean02 bean02 = context.getBean(TestBean02.class);
        System.out.println(bean02);
        context.close();
    }
}