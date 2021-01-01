package com.yc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 * @date
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulProvider8006 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProvider8006.class, args);
    }

}
