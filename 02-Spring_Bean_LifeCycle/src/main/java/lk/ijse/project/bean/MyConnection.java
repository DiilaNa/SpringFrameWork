package lk.ijse.project.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;

public class MyConnection implements DisposableBean, BeanNameAware {
    /*The state of instantiation*/

    public MyConnection() {
        System.out.println("MyConnection constructor");
    }

    /*There is no method to find the state of populate properties*/

    /*bean name aware*/
    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyConnection is Destroyed");
    }
}
