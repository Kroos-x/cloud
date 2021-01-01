package com.yc.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * 功能描述:
 *
 * @Author: xieyc
 * @Date: 2021-01-01
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/consul")
    public String paymentzk() {
        return "springcloud with consul :" + serverPort + "\t" + UUID.randomUUID().toString();
    }


}
