package lk.ijse.project.bean;

import org.springframework.stereotype.Component;

@Component
public class Girl{
    public Girl() {
        System.out.println("Girl Constructor");
    }
    public void chat(){
        System.out.println("Girl is Chatting");
    }
}
