package lk.ijse.project.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test02 {
    /*property injection*/
    @Autowired
    DI di;

    public Test02() {
        System.out.println("Test02 constructor called");
    }
    public  void test() {
        di.sayHello();
    }
}
