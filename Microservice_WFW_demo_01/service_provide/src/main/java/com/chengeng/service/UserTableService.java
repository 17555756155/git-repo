package com.chengeng.service;

import com.chengeng.Pojo.UserTable;
import com.chengeng.dao.UserTable_Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTableService {

    @Autowired
    private UserTable_Mapper mapper;

    public UserTable findOneId_service(Integer id){

        return this.mapper.findOneId(id);
    }
}
