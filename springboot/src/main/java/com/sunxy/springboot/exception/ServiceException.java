package com.sunxy.springboot.exception;

/**
 * 功能：自定义异常
 * 作者：夏瑾溪
 * 日期：2023/10/19 22:20
 */
public class ServiceException extends RuntimeException{
    public ServiceException(String msg) {
        super(msg);
    }
}