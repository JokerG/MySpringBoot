package com.joker.springboot.rabbitmq.service;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMq配置类 用于配置队列、交换器、路由等高级信息
 */
@Configuration
public class RabbitMqConfig
{
    /**
     * 创建队列
     * 
     * @return
     */
    @Bean
    public Queue helloQueue()
    {
        return new Queue("hello");
    }
}
