package com.cormen.bim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 应用启动入口
 * Created by cormen on 2018/4/26.
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class BimAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(BimAdminApplication.class, args);
    }
}
