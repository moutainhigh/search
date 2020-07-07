package com.wang.search.config;

import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * zookeeper注册中心
 *
 * @author wangjunhao
 * @version 1.0
 * @date 2020/6/17 13:56
 * @since JDK 1.8
 */
@Configuration
@ConfigurationProperties(value = "elasticjob")
@Data
public class ZookeeperConfig {
    private String serverList;

    private String namespace;

    private Map<String, String> job = new HashMap<>();

    private Map<String, Integer> time = new HashMap<>();

    /**
     * zookeeper 配置
     *
     * @return
     */
    @Bean(initMethod = "init")
    public ZookeeperRegistryCenter zookeeperRegistryCenter() {
        ZookeeperConfiguration configuration = new ZookeeperConfiguration(serverList, namespace);
        configuration.setConnectionTimeoutMilliseconds(10000);
        return new ZookeeperRegistryCenter(configuration);
    }
}
