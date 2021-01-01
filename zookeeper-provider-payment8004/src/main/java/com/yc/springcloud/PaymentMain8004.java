package com.yc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 功能描述: 服务启动类
 *
 * @Author: xieyc
 * @Date: 2020-12-15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class);
    }

    /**
     * zookeeper 服务提供者8004
     *
     * 关于 zookeeper 的集群搭建，目前使用较少，
     * 而且在 yml 文件中的配置也是类似，以列表形式写入 zookeeper 的多个地址即可，
     * 只要配合zookeeper集群，以及yml文件的配置就能完成集群搭建
     */

}
