package com.chengeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //启动eureka客户端 并将配置信息 注册到eureka中心中
@MapperScan("com.chengeng.dao")
public class ServiceProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvideApplication.class, args);
    }

}
