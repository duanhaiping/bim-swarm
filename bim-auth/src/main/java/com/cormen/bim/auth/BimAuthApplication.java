package com.cormen.bim.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.cormen.bim")
public class BimAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(BimAuthApplication.class, args);
    }

}
