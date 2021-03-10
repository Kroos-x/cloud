package com.yc.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 功能描述:
 *
 * @Author: xieyc
 * @Date: 2021-03-09
 */
@RestController
public class OrderPaymentController {

    @Resource
    private OrderPaymentService service;

    @GetMapping("/consumer/payment/hystrix/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        return service.paymentInfo_OK(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id") Integer id) {
        return service.paymentInfo_Timeout(id);
    }
}
