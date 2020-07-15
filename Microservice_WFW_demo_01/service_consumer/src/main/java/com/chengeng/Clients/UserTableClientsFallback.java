package com.chengeng.Clients;

import com.chengeng.Pojo.UserTable;
import org.springframework.stereotype.Component;

@Component
public class UserTableClientsFallback implements UserTableClients {

    @Override
    public UserTable findOneId_Controller(String id) {
        UserTable userTable = new UserTable();
        userTable.setUsername("服务器正忙，小杜开小差了");
        return userTable;
    }
}
