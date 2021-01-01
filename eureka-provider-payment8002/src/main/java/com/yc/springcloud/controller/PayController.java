package com.yc.springcloud.controller;

import com.yc.springcloud.entities.CommonResult;
import com.yc.springcloud.entities.Pay;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.yc.springcloud.service.PayService;

import javax.annotation.Resource;

/**
 * 功能描述:
 *
 * @Author: xieyc
 * @Date: 2020-11-21
 */
@Slf4j
@RestController
@RequestMapping("/pay")
public class PayController {


    @Resource
    private PayService payService;

    @Value("${server.port}")
    private String port;


    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody Pay payment) {
        int result = payService.create(payment);
        log.info("****插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功，端口号："+port, result);
        }
        return new CommonResult(444, "插入数据库失败，端口号："+port, null);
    }

    @GetMapping(value = "/{id}")
    public CommonResult getPaymentById(@PathVariable("id") String id) {
        Pay result = payService.getPayMentById(id);
        log.info("****查询结果：" + result);
        if (result != null) {
            return new CommonResult(200, "查询成功，端口号："+port, result);
        }
        return new CommonResult(444, "没有对应id的记录，端口号："+port, null);
    }

    @GetMapping("/get/{id}")
    public String getGateWayTest1(@PathVariable("id") Integer id) {
        return "***8001 get方法收到请求，参数id为：" + id;
    }

    @GetMapping("/lb/{id}")
    public String getGateWayTest2(@PathVariable("id") Integer id) {
        return "---8001 lb方法收到请求，参数id为：" + id;
    }


    @GetMapping("/zipkin")
    public String testzipkin() {
        return "zipkin ------";
    }
}
