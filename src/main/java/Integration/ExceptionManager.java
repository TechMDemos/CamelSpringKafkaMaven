package Integration;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangeTimedOutException;
import org.apache.camel.Processor;
import org.apache.camel.RuntimeExchangeException;
import org.apache.camel.component.kafka.KafkaConstants;
import org.apache.camel.management.event.ExchangeFailedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by ahred on 10/11/2016.
 */
@Component
public class ExceptionManager implements Processor{
    public void process(Exchange exchange){
        System.out.println("Error reached!");
        Throwable caused = exchange.getProperty(Exchange.EXCEPTION_CAUGHT,Throwable.class);
        throw new RuntimeExchangeException("Error processing exhange",exchange,caused);
    }

}
