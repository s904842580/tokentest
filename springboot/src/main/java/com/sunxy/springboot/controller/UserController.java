package com.sunxy.springboot.controller;

import com.sunxy.springboot.common.Result;
import com.sunxy.springboot.entity.User;
import com.sunxy.springboot.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：
 * 作者：夏瑾溪
 * 日期：2023/10/17 9:15
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 新增用户信息
     * @return
     */
    @PostMapping("/add")
    public Result add(@RequestBody User user){
        userService.insertUser(user);
        return Result.success(user);
    }

}