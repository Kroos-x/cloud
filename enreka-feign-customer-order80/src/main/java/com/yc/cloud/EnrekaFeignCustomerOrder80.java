package com.yc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 主启动类
 */
@SpringBootApplication
@EnableFeignClients
public class EnrekaFeignCustomerOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(EnrekaFeignCustomerOrder80.class, args);
    }

}
