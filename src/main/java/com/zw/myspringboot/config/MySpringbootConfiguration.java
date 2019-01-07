package com.zw.myspringboot.config;

import com.zw.myspringboot.utils.redis.RedissonProperties;
import org.apache.commons.lang3.StringUtils;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.Codec;
import org.redisson.client.codec.StringCodec;
import org.redisson.config.Config;
import org.redisson.config.SingleServerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import javax.annotation.Resource;

@Configuration
@Component
public class MySpringbootConfiguration {

    @Resource
    private RedissonProperties redissonProperties;

    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        config.setCodec(new StringCodec());

        if (StringUtils.isNotEmpty(this.redissonProperties.getCodec())) {
            try {
                config.setCodec((Codec) ClassUtils.forName(this.redissonProperties.getCodec(), ClassUtils.getDefaultClassLoader()).newInstance());
            } catch (Exception var3) {
                var3.printStackTrace();
            }
        }

        SingleServerConfig serverConfig = (SingleServerConfig)((SingleServerConfig)((SingleServerConfig)((SingleServerConfig)((SingleServerConfig)((SingleServerConfig)((SingleServerConfig)((SingleServerConfig)((SingleServerConfig)((SingleServerConfig)config.useSingleServer().setAddress(this.redissonProperties.getAddress()).setTimeout(this.redissonProperties.getTimeout())).setConnectionPoolSize(this.redissonProperties.getConnectionPoolSize()).setConnectionMinimumIdleSize(this.redissonProperties.getConnectionMinimumIdleSize()).setConnectionMinimumIdleSize(this.redissonProperties.getConnectionMinimumIdleSize()).setConnectionPoolSize(this.redissonProperties.getConnectionPoolSize()).setDatabase(this.redissonProperties.getDatabase()).setDnsMonitoringInterval((long)this.redissonProperties.getDnsMonitoringInterval()).setSubscriptionConnectionMinimumIdleSize(this.redissonProperties.getSubscriptionConnectionMinimumIdleSize()).setSubscriptionConnectionPoolSize(this.redissonProperties.getSubscriptionConnectionPoolSize()).setSubscriptionsPerConnection(this.redissonProperties.getSubscriptionsPerConnection())).setClientName(this.redissonProperties.getClientName())).setRetryAttempts(this.redissonProperties.getRetryAttempts())).setRetryInterval(this.redissonProperties.getRetryInterval())).setTimeout(this.redissonProperties.getTimeout())).setConnectTimeout(this.redissonProperties.getConnectTimeout())).setIdleConnectionTimeout(this.redissonProperties.getIdleConnectionTimeout())).setPingTimeout(this.redissonProperties.getPingTimeout())).setPassword(this.redissonProperties.getPassword());
        if (StringUtils.isNotBlank(this.redissonProperties.getPassword())) {
            serverConfig.setPassword(this.redissonProperties.getPassword());
        }

        return Redisson.create(config);
    }

}
