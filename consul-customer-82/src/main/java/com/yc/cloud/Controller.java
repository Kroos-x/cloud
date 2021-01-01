package com.yc.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 功能描述:
 *
 * @Author: xieyc
 * @Date: 2020-12-16
 */
@RestController
@Slf4j
public class Controller {

    private static final String INVOKE_URL = "http://consul-provider-8006";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/customer/consul")
    public String paymentInfo() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
    }
}
