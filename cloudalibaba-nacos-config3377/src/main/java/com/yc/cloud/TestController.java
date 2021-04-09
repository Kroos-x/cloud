package com.yc.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述:
 *
 *  支持Nacos的动态刷新
 *
 * @Author: xieyc
 * @Date: 2021-03-31
 */
@RestController
@RefreshScope
public class TestController {

        @Value("${config.info}")
        private String configInfo;

        @GetMapping("configclient/getconfiginfo")
        public String getConfigInfo(){
            return configInfo;
        }
}
