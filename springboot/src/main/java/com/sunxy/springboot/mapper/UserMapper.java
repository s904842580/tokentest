package com.sunxy.springboot.mapper;

import com.sunxy.springboot.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
/*注入到Spring容器中*/
public interface UserMapper {

    @Insert("insert into `user` (username, password, name, phone, email, address, avatar) " +
    "values (#{username}, #{password}, #{name}, #{phone}, #{email}, #{address}, #{avatar})")
    /*插入到数据库中*/
    void insert(User user);

}
