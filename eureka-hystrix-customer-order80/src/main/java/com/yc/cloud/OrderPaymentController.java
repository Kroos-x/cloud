package com.yc.cloud;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
@DefaultProperties(defaultFallback = "globalErrorHandle")
public class OrderPaymentController {

    @Resource
    private OrderPaymentService service;

    @GetMapping("/consumer/payment/hystrix/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        return service.paymentInfo_OK(id);
    }

    // @HystrixCommand(fallbackMethod = "paymentinfo_TimeoutErrorHandle", commandProperties = {
    //         @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    // })
    @HystrixCommand
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id") Integer id) {
        return service.paymentInfo_Timeout(id);
    }

    private String paymentinfo_TimeoutErrorHandle(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "--80服务异常或超时，id:" + id;
    }

    private String globalErrorHandle() {
        return "全局异常处理信息,请稍后再试~";
    }


}
