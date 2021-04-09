package com.yc.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * 功能描述:
 *
 * @Author: xieyc
 * @Date: 2021-03-30
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/nacos")
    public String paymentzk() {
        return "springcloudalibaba with nacos :" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
