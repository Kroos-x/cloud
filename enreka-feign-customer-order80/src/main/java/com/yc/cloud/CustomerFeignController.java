package com.yc.cloud;

import com.yc.springcloud.entities.CommonResult;
import com.yc.springcloud.entities.Pay;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 功能描述:
 *
 * @Author: xieyc
 * @Date: 2021-01-02
 */
@RestController
@RequestMapping("/customer")
public class CustomerFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/feign/pay/{id}")
    public CommonResult<Pay> getPaymentById(@PathVariable("id") Integer id){
        return paymentFeignService.getPaymentById(id);
    }

}
