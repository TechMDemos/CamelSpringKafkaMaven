package Integration;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.kafka.KafkaConstants;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ahred on 10/11/2016.
 */
@Component
public class FileMover  extends RouteBuilder{
@Override
    public void configure() throws Exception{

        onException(Exception.class ).process(new Processor() {
            public void process(Exchange exchange) throws Exception {

            }
        });
        from("file:./tmp?move=./done&moveFailed=./failed").process(new myProcessor()).to("kafka:172.16.0.117:9092?topic=TutorialTopic&serializerClass=" + KafkaConstants.KAFKA_STRING_ENCODER);
    }
    }



