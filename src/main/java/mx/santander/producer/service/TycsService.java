package mx.santander.producer.service;

import lombok.RequiredArgsConstructor;
import mx.santander.producer.model.TycsServiceMessage;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TycsService {


    private final AmqpTemplate amqpTemplate;

    @Value("${spring.rabbitmq.params.exchange}")
    private String exchange;

    @Value("${spring.rabbitmq.params.routingkey}")
    private String routingkey;


    public void pushTycs(final TycsServiceMessage tycsServiceMessage) {
        amqpTemplate.convertAndSend(exchange, routingkey, tycsServiceMessage);
        System.out.println("Send msg = " + tycsServiceMessage);
    }
}
