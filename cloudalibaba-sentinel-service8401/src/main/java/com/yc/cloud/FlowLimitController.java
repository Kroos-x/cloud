package com.yc.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述:
 *
 * @Author: xieyc
 * @Date: 2021-04-08
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "TestA======";
    }

    @GetMapping("/testB")
    public String testB(){
        return "TestB==========";
    }

}
