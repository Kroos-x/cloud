package com.yc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EnrekaFeignCustomerOrder80 {

    /**
     * 接口 + 注解 (微服务调用接口 + @FeignClient)
     *
     * 1.新建cloud-consumer-feign-order80
     * 2.pom
     * 3.yml配置eureka
     * 4.主启动添加@EnableFeignClients
     * 5.业务类 接口 + 注解
     * 6.controller
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EnrekaFeignCustomerOrder80.class, args);
    }

}
