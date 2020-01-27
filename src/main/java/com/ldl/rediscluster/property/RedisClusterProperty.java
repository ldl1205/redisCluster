package com.ldl.rediscluster.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author LDL
 * @description
 * @date 2020/1/27/0027 18:36
 */
@Component
@ConfigurationProperties(value = "spring.redis.cluster")
//@PropertySource(value = "classpath:jedis.properties")
@Data
public class RedisClusterProperty {




    /**
     * 集群节点的主机名
     * spring.redis.cluster.nodes[0] = 127.0.0.1:7379
     * spring.redis.cluster.nodes[1] = 127.0.0.1:7380
     */
    private List<String> nodes;
    /**
     * 获取连接的超时时间
     */
    private Integer timeout;
    /**
     * 最大连接尝试次数
     */
    private Integer maxAttempts;
}
