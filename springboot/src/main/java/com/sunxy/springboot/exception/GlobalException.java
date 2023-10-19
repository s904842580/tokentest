package com.sunxy.springboot.exception;

import com.sunxy.springboot.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 功能：
 * 作者：夏瑾溪
 * 日期：2023/10/19 22:19
 */

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(ServiceException.class)
    @ResponseBody//转成json
    public Result serviceException(ServiceException e) {
        return Result.error("500", e.getMessage());
    }
}