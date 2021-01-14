package com.yc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 功能描述: 服务启动类
 *
 * @Author: xieyc
 * @Date: 2020-11-21
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaProvidePayment8002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvidePayment8002.class, args);
    }

}
