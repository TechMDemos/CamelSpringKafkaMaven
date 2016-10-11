package Integration;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ahred on 10/11/2016.
 */
public class TestApp {
    public static void main(String[] args){
       ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/springContext.xml");
//        CamelContext ctx = new DefaultCamelContext();
//        try{
//            ctx.addRoutes(new FileMover());
//            ctx.start();
//            Thread.sleep(10000);
//            ctx.stop();
//        }catch (Exception E)
//        {
//            E.printStackTrace();
//        }

    }
}
