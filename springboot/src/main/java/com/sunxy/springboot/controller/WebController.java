package com.sunxy.springboot.controller;

import com.sunxy.springboot.common.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：提供接口返回数据
 * 作者：夏瑾溪
 * 日期：2023/10/16 10:23
 */

@RestController
public class WebController {

    @RequestMapping/*默认是get请求返回数据*/
    public Result hello(){
        return Result.success("hello 夏瑾溪") ;
    }
}