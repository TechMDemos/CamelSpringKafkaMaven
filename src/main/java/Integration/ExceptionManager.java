package Integration;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.RuntimeExchangeException;
import org.springframework.stereotype.Component;

/**
 * Created by ahred on 10/11/2016.
 * On exception, check the exchange and handle the error.
 */
@Component
public class ExceptionManager implements Processor{
    public void process(Exchange exchange){
        System.out.println("Error reached!");
        Throwable caused = exchange.getProperty(Exchange.EXCEPTION_CAUGHT,Throwable.class);
        throw new RuntimeExchangeException("Error processing exchange",exchange,caused);
    }

}
