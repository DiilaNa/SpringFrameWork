package lk.ijse.project.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
//    public SpringBean() {
//    }
    @Autowired(required=false)   /*wedima arguements thina method ek run wnne*/
    public SpringBean(@Value("DILAN") String name, @Value("2003") int number, @Value("true") boolean value) {
        System.out.println("SpringBean Constructor :" + name);
        System.out.println("SpringBean Constructor :" + number);
        System.out.println("SpringBean Constructor :" + value);
    }

    @Autowired(required=false)
    public SpringBean(@Value("DILAN") String name, @Value("2003") int number) {
        System.out.println("SpringBean Constructor :" + name);
        System.out.println("SpringBean Constructor :" + number);
    }


}
