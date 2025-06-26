package lk.ijse.project;

import lk.ijse.project.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();





        context.registerShutdownHook();/*beans destroy krnne meken*/
    }
}

/*Basic Datasource kiynne bean ekk
* ProtoTYpe beans thinne context ek athule nemei heap eke/contect eken eliye enisai destroy method ek run wen natte
*
* if we invoke bean inside a bean its interbean dependeny
* Component annotaion ekt priority ek wedi bean ekt wada , api hadana class walata tma component annotati     on en danne
*
* */