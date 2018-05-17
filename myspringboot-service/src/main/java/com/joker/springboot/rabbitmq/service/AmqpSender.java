package com.joker.springboot.rabbitmq.service;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 生产者
 */
@Component
public class AmqpSender
{
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void hello()
    {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);

        this.rabbitTemplate.convertAndSend("hello", context);
    }

}
