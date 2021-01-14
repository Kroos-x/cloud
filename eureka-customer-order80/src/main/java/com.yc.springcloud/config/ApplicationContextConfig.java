package com.yc.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述: restTemplate 远程调用
 *
 * @Author: xieyc
 * @Date: 2020-11-21
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * LoadBalanced 赋予RestTemplate 负载均衡的能力
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
