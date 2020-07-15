package com.chengeng.Pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class UserTable {

    @Getter@Setter
    private Integer id;
    @Getter@Setter
    private String username;
    @Getter@Setter
    private String password;
    @Getter@Setter
    private Integer money;
}
