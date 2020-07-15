package com.chengeng.Clients;

import com.chengeng.Pojo.UserTable;
import com.chengeng.configuration.FeignLogConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

// feign集成了负载均衡 用此注解 可直接从eureka中心中的服务列表id名拉取服务
@FeignClient(value = "server-provide",
        fallback = UserTableClientsFallback.class,
        configuration = FeignLogConfiguration.class) //指定配置log类
public interface UserTableClients {

    /* 映射服务提供方的方法 自动生成代理 进行远程调用*/
    @RequestMapping(value = "user/one?id={id}")
    public UserTable findOneId_Controller(@PathVariable String id);
}
