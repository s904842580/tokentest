package com.sunxy.springboot.controller;

import com.sunxy.springboot.common.Obj;
import com.sunxy.springboot.common.Result;
import org.springframework.web.bind.annotation.*;

/**
 * 功能：提供接口返回数据
 * 作者：夏瑾溪
 * 日期：2023/10/16 10:23
 */

@RestController
@RequestMapping("web")
public class WebController {

    @RequestMapping("/hello")
    public Result hello(String name){/*一般都是定义对象来传递数据*/
        return Result.success("hello 夏瑾溪") ;
    }

    @PostMapping("/post")
    public Result post(@RequestBody Obj obj){
        return Result.success(obj);
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        return Result.success(id);
    }

}