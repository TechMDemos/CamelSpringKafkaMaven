package MainApp;

/**
 * Created by ahred on 10/10/2016.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        HelloWorld objB =(HelloWorld) context.getBean("helloWorld");
        objA.setMessage("Hi!");
        System.out.print(objA.getMessage());
        System.out.print(objB.getMessage());

    }
}
