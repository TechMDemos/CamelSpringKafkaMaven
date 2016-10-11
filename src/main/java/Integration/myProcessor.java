package Integration;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by ahred on 10/11/2016.
 */

public class myProcessor implements Processor {

    public void process(Exchange e){
        System.out.println("stuff");
        e.getIn().setBody(e.getIn().getBody(String.class),String.class);

    }
}
