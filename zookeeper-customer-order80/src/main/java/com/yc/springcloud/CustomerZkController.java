package com.yc.springcloud;

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
public class CustomerZkController {

    public static final String INVOKE_URL="http://cloud-provider-service";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/customer/zk")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk",String.class);
        return result;
    }
}
