package Integration;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ahred on 10/11/2016.
 * simply create an active application context.
 */
public class TestApp {
    public static void main(String[] args){
       ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/springContext.xml");

    }
}
