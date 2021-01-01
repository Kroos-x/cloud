package com.yc.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述: ribbon LB config 默认轮询
 *
 * @Author: xieyc
 * @Date: 2021-01-01
 */
@Configuration
public class RibbonRule {

    @Bean
    public IRule myRule(){
        // 随机算法
        return new RandomRule();
    }
}
