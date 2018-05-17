package com.joker.springboot.rabbitmq.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 */
@Component
@RabbitListener(queues = "hello")
public class AmqpReceiver
{
    @RabbitHandler
    public void process(String context)
    {
        System.out.println("Receiver : " + context);
    }
}
