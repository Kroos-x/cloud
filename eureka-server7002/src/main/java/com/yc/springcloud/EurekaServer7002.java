package com.yc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 功能描述:
 *  EnableEurekaServer 表示它是服务注册中心
 * exclude ：启动时不启用 DataSource的自动配置检查
 *
 * @Author: xieyc
 * @Date: 2020-11-22
 */
@EnableEurekaServer
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class EurekaServer7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002.class, args);
    }

    /**
     * Eureka 服务端 7002
     */
}
