    package lk.ijse.project.bean;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Component;

    @Component
    public class Boy{

        @Autowired /*Runtime Dependency is injected-object creation without a new keyword*/
        Girl girl;

        public Boy() {
            System.out.println("Boy Constructor");
        }
        public void chatWithGirl(){
            girl.chat();
        }
    }
