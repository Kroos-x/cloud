package com.yc.cloud;

import com.yc.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 功能描述:
 *
 * @Author: xieyc
 * @Date: 2021-01-02
 */
@Service
@FeignClient(value = "CLOUD-EUREKA-PROVIDER-PAY-SERVICE")  //服务名称，要和eureka上面的一致才行
public interface PaymentFeignService {

    /**
     * provider 的controller层的方法定义
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/pay/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Integer id);


}
