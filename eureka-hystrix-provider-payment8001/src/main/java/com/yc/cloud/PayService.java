package com.yc.cloud;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;


/**
 * 功能描述:
 *
 * @Author: xieyc
 * @Date: 2021-01-02
 */
@Service
public class PayService {

    /**
     * 可以正常访问的方法
     *
     * @param id
     * @return
     */
    public String paymentinfo_Ok(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "--paymentInfo_OK，id:" + id;
    }

    /**
     * 超时访问的方法
     */
    @HystrixCommand(fallbackMethod = "paymentinfo_TimeoutErrorHandle", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String paymentinfo_Timeout(Integer id) {
        // int interTime = 3;
        // int age = 10/0;
        try {
            // TimeUnit.SECONDS.sleep(interTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
        // return "线程池：" + Thread.currentThread().getName() + "--paymentInfo_Timeout，id:" + id + "耗时" + interTime + "秒钟--";
        // return "线程池：" + Thread.currentThread().getName() + "--paymentInfo_Timeout，id:" + id ;
    }

    public String paymentinfo_TimeoutErrorHandle(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "--8001服务异常或超时，id:" + id;
    }

    // ========== 服务熔断

    /**
     * 整体意思: 10S内,10次请求,有6次失败,就跳闸
     *
     * @param id id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"), // 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"), // 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"), // 失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(Integer id) {
        //模拟发生异常
        if (id < 0) {
            throw new RuntimeException("*****id，不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t" + "调用成功，流水号：" + serialNumber;
    }

    public String paymentCircuitBreaker_fallback(Integer id) {
        return "id 不能为负数，请稍后再试....";
    }


}
