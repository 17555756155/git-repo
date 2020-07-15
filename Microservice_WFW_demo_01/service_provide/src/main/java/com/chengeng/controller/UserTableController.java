package com.chengeng.controller;

import com.chengeng.Pojo.UserTable;
import com.chengeng.service.UserTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserTableController {

    @Autowired
    private UserTableService userTableService;

    @RequestMapping(value = "/one")
    @ResponseBody
    public UserTable findOneId_Controller(@RequestParam String id) throws InterruptedException {
        System.out.println("我是提供方获取的id="+id);
        /* 让服务提供方睡眠 不执行方法 测试熔断降级*/
        Integer i = Integer.parseInt(id);
        UserTable userTable = userTableService.findOneId_service(i);
        System.out.println(userTable);
        return userTable;
    }
}
