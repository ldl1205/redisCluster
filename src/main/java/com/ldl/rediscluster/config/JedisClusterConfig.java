package com.ldl.rediscluster.config;

import com.ldl.rediscluster.property.RedisClusterProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

/**
 * @author LDL
 * @description
 * @date 2020/1/27/0027 18:40
 */
@Configuration
@Slf4j
public class JedisClusterConfig {


    @Autowired
    private RedisClusterProperty redisClusterProperty;

    /**
     * Spring Data Redis 1.7 支持redis集群
     * jedis集群配置
     *
     * @return
     */
    @Bean
    @Primary
    public RedisConnectionFactory connectionFactory() {
        RedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory(
                new RedisClusterConfiguration(redisClusterProperty.getNodes()));
        return redisConnectionFactory;
    }


}
