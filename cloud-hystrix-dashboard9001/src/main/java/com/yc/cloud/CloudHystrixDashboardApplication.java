package com.yc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author xieyc
 */
@EnableHystrixDashboard
@SpringBootApplication
public class CloudHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudHystrixDashboardApplication.class, args);
    }


    /**
     * 访问路径
     * http://localhost:9001/hystrix
     */
}
