package com.sunxy.springboot.controller;

import cn.hutool.core.util.StrUtil;
import com.sunxy.springboot.common.Result;
import com.sunxy.springboot.entity.User;
import com.sunxy.springboot.server.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;


/**
 * 功能：提供接口返回数据
 * 作者：夏瑾溪
 * 日期：2023/10/16 10:23
 */

@RestController
public class WebController {

    @Resource
    UserService userService;

    @GetMapping("/")
    public Result hello() {
        return Result.success("success");
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        if (StrUtil.isBlank(user.getUsername()) || StrUtil.isBlank(user.getPassword())) {
            return Result.error("数据输入不合法");
        }
        user = userService.login(user);
        return Result.success(user);
    }

    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        if (StrUtil.isBlank(user.getUsername()) || StrUtil.isBlank(user.getPassword())) {
            return Result.error("数据输入不合法");
        }
        if (user.getUsername().length() > 10 || user.getPassword().length() > 20) {
            return Result.error("数据输入不合法");
        }
        user = userService.register(user);
        return Result.success(user);
    }

}