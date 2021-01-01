package com.yc.cloud;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述: 配置openfeign日志打印
 *
 * @Author: xieyc
 * @Date: 2021-01-02
 */
@Configuration
public class Config {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
