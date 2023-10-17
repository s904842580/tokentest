package com.sunxy.springboot.server;

import com.sunxy.springboot.entity.User;
import com.sunxy.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能：
 * 作者：夏瑾溪
 * 日期：2023/10/17 9:13
 */

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public void insertUser(User user){
        userMapper.insert(user);
    }
}