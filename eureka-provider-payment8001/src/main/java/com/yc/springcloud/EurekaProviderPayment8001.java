package com.yc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 功能描述: 服务启动类
 *
 * @Author: xieyc
 * @Date: 2020-11-21
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class EurekaProviderPayment8001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderPayment8001.class, args);
    }

}
