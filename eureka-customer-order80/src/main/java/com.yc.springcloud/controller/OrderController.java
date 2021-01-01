package com.yc.springcloud.controller;

import com.yc.springcloud.entities.CommonResult;
import com.yc.springcloud.entities.Pay;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 功能描述: 消费者下单 controller
 *
 * @Author: xieyc
 * @Date: 2020-11-21
 */
@Slf4j
@RestController
@RequestMapping("/consumer")
public class OrderController {

    // 单机版
    // private static final String PAY_URL = "http://localhost:8001";
    // 服务提供者在注册中心中的名称，而且无需写端口号
    private static final String PAY_URL = "http://CLOUD-EUREKA-PROVIDER-PAY-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment/create")
    public CommonResult create(@RequestBody Pay pay) {
        return restTemplate.postForObject(PAY_URL + "/pay/create", pay, CommonResult.class);
    }

    @GetMapping("/pay/get/{id}")
    public CommonResult get(@PathVariable("id") String id) {
        return restTemplate.getForObject(PAY_URL + "/pay/" + id, CommonResult.class);
    }

    // ======================== 对于 RestTemplate 的一些说明 =====================

    /**
     * 两种请求方式: post get
     * 两种返回类型:
     * Object: 返回对象为响应体中数据转化成的对象,基本上可以理解为JSON
     * Entity: 返回对象为ResponseEntity对象,包含了响应中的一些信息,比如响应头,响应状态码,响应体等;
     * RestTemplate 的 ForEntity 相比 ForObject特殊的地方就是
     * 如果使用 ForObject 得到的就是提供者返回的对象，
     * 而如果要使用ForEntity 得到时 ResponstEntity对象，使用getBody()才能得到提供者返回的数据
     */

    // forEnriry示例
    @GetMapping("/pay/forEntity/{id}")
    public CommonResult getPaymentById2(@PathVariable("id") Long id) {
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAY_URL + "/pay/" + id, CommonResult.class);
        if (entity.getStatusCode().is2xxSuccessful()) {
            return entity.getBody();
        } else {
            return new CommonResult<>(444, "操作失败");
        }
    }


}
