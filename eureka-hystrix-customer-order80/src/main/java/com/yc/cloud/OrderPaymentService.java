package com.yc.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 功能描述: 消费端 80 service
 *
 * @Author: xieyc
 * @Date: 2021-03-09
 */
@Component
@FeignClient(value = "CLOUD-EUREKA-HYSTRIX-PROVIDER-PAY-SERVICE")
public interface OrderPaymentService {

    @GetMapping("/payment/hystrix/{id}")
    String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    String paymentInfo_Timeout(@PathVariable("id") Integer id);
}
