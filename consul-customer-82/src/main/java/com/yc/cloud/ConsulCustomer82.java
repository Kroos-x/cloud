package com.yc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulCustomer82 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulCustomer82.class, args);
    }

}
