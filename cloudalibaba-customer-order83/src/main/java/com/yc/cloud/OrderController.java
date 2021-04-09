package com.yc.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 功能描述:
 *
 * @Author: xieyc
 * @Date: 2021-03-30
 */
@RestController
public class OrderController {
    @Value("${service-url.nacos-user-service}")
    private String nacos_user_service;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/customer/nacos/{id}")
    public String orderId(@PathVariable("id")Integer id){
        return restTemplate.getForObject(nacos_user_service + "/payment/nacos/", String.class);
    }
}
