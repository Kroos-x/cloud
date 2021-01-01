package com.yc.springcloud;

import com.yc.myrule.RibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 功能描述: 服务启动类
 *
 * @Author: xieyc
 * @Date: 2020-11-21
 */
@EnableEurekaClient
@SpringBootApplication
// 指定该负载均衡规则对哪个提供者服务使用    加载自定义规则的配置类
@RibbonClient(name = "CLOUD-EUREKA-PROVIDER-PAY-SERVICE", configuration = RibbonRule.class)
public class EurekaCustomerOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCustomerOrder80.class, args);
    }

    /**
     * eureka 用户端/消费者端
     */
}
