package com.zw.myspringboot;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;

@MapperScan("com.zw.myspringboot.dao")
@SpringBootApplication(scanBasePackages = "com.zw.myspringboot", exclude = {DataSourceAutoConfiguration.class})
@Slf4j
public class MySpringbootApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(MySpringbootApplication.class);
        ConfigurableApplicationContext applicationContext = app.run(args);

        Environment env = applicationContext.getEnvironment();
        String protocol = "http";
        log.info("\n----------------------------------------------------------\n\t" +
                        "Application '{}' is running! Access URLs:\n\t" +
                        "Local: \t\t{}://localhost:{}\n\t" +
                        "External: \t{}://{}:{}\n\t" +
                        "Profile(s): \t{}\n----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                protocol,
                env.getProperty("server.port"),
                protocol,
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"),
                env.getActiveProfiles());
    }

}

