package com.yc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CloudalibabaProviderPayment9001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9001Application.class, args);
    }

}
