package com.chengeng.controller;

import com.chengeng.Clients.UserTableClients;
import com.chengeng.Pojo.UserTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/consumer")
//设置全局服务熔断降级方法
//@DefaultProperties(defaultFallback = "FallbackMethod")
public class UserTableController {

    /* feign 中默认集成了 hystrix熔断器 需要配置中打开 */

/*    @Autowired
    private RestTemplate restTemplate;*/

        @Autowired
        private UserTableClients clients;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @ResponseBody
//    @HystrixCommand  //需要熔断的方法
    /* 默认 熔断器 超时时间为1s */
    public UserTable QueryOneId(String id){
        System.out.println("我是消费方获取的id="+id);
        UserTable user = clients.findOneId_Controller(id);
        System.out.println(user);
        /* UserTable user = restTemplate.getForObject("http://server-provide/user/one?id=" + i, UserTable.class);*/
        return user;
    }

    /* 全局服务熔断方法 不需要参数 但是返回值需要与其他需要熔断的方法保持一致*/
   /* public UserTable FallbackMethod(){
        UserTable userTable = new UserTable();
        userTable.setUsername("服务器正忙 请稍后再试\" +\n" +
                "                \"小杜开小差了");
        return userTable;
    }*/

}
