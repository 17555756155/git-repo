package com.chengeng.dao;

import com.chengeng.Pojo.UserTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;

@Mapper
public interface UserTable_Mapper extends Serializable {

    @Select("select * from usertable where id = #{id}")
    UserTable findOneId(Integer id);
}
