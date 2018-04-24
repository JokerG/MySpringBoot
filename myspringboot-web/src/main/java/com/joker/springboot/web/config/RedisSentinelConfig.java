package com.joker.springboot.web.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import redis.clients.jedis.JedisPoolConfig;
@Configurable
public class RedisSentinelConfig {
    @Value("${sentinel.redis.host}")
    private  String sentinelhost;
    @Value("${sentinel.redis.port}")
    private  int sentinelport;

    @Bean
    public RedisConnectionFactory jedisConnectionFactory(){
        JedisPoolConfig poolConfig=new JedisPoolConfig();
        poolConfig.setMaxIdle(5);
        poolConfig.setMinIdle(1);
        poolConfig.setTestOnBorrow(true);
        poolConfig.setTestOnReturn(true);
        poolConfig.setTestWhileIdle(true);
        poolConfig.setNumTestsPerEvictionRun(10);
        poolConfig.setTimeBetweenEvictionRunsMillis(60000);
        //哨兵节点host、port设置，可设置多个哨兵，只需要链式新增 .sentinel(sentinelhost, sentinelport)
        RedisSentinelConfiguration sentinelConfig = new RedisSentinelConfiguration() .master("mymaster")
                .sentinel(sentinelhost, sentinelport);
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(sentinelConfig,poolConfig);

        return jedisConnectionFactory;
    }
}
