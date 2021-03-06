package com.chengeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //开启网关功能
@EnableEurekaClient
public class ServerZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerZuulApplication.class, args);
    }

}
