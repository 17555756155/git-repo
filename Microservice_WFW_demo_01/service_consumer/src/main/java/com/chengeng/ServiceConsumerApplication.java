package com.chengeng;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker //开启熔断器*/
@SpringCloudApplication //此注解 包含了 以上三个注解
@EnableFeignClients  //使用远程调用feign组件
public class ServiceConsumerApplication {

    /*@Bean
    @LoadBalanced //开启负载均衡
    public RestTemplate GetRestTemplate(){
        return new RestTemplate();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumerApplication.class, args);
    }
}
