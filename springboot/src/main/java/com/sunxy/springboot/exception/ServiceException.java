package com.sunxy.springboot.exception;

import lombok.Getter;

/**
 * 功能：自定义异常
 * 作者：夏瑾溪
 * 日期：2023/10/19 22:20
 */
@Getter
public class ServiceException extends RuntimeException{

    private final String code;

    public ServiceException(String msg) {
        super(msg);
        this.code = "500";
    }

    public ServiceException(String code, String msg){
        super(msg);
        this.code = code;
    }
}