package com.yc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 功能描述: 服务启动类
 *
 * @Author: xieyc
 * @Date: 2020-12-16
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperCustomerOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperCustomerOrder80.class);
    }

    /**
     * zookeeper 服务消费者 80
     */

}
