package com.zw.myspringboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.google.common.collect.Maps;
import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Map;

@Configuration
@EnableConfigurationProperties(ShardingMasterSlaveConfig.class)
public class ShardingDataSourceConfig {

    @Autowired(required = false)
    private ShardingMasterSlaveConfig shardingMasterSlaveConfig;

    @Bean("dataSource")
    public DataSource masterSlaveDataSource() throws SQLException {
        shardingMasterSlaveConfig.getDataSources().forEach((k, v) -> configDataSource(v));
        Map<String, DataSource> dataSourceMap = Maps.newHashMap();
        dataSourceMap.putAll(shardingMasterSlaveConfig.getDataSources());
        DataSource dataSource = MasterSlaveDataSourceFactory.createDataSource(dataSourceMap, shardingMasterSlaveConfig.getMasterSlaveRule(), Maps.newHashMap());
        return dataSource;
    }

    private void configDataSource(DruidDataSource druidDataSource) {
        // 初始化大小，最小，最大
        druidDataSource.setInitialSize(20);
        druidDataSource.setMinIdle(20);
        druidDataSource.setMaxActive(100);
        //配置获取连接等待超时的时间
        druidDataSource.setMaxWait(60000);
        //配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
        druidDataSource.setTimeBetweenEvictionRunsMillis(60000);
        //配置一个连接在池中最小生存的时间，单位是毫秒
        druidDataSource.setMinEvictableIdleTimeMillis(300000);
        druidDataSource.setValidationQuery("select 'x'");
        druidDataSource.setTestWhileIdle(true);
        druidDataSource.setTestOnBorrow(false);
        druidDataSource.setTestOnReturn(false);
        //打开PSCache，并且指定每个连接上PSCache的大小
        druidDataSource.setPoolPreparedStatements(true);
        druidDataSource.setMaxOpenPreparedStatements(20);
        druidDataSource.setUseGlobalDataSourceStat(true);
        try {
            //配置监控统计拦截的filters，去掉后监控界面sql无法统计，'wall'用于防火墙
            druidDataSource.setFilters("stat,wall,slf4j");
        } catch (SQLException e) {
        }
    }
}
