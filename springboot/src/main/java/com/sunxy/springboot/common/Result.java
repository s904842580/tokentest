package com.sunxy.springboot.common;

import lombok.*;

/**
 * 功能：
 * 作者：夏瑾溪
 * 日期：2023/10/16 11:01
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result {
    public static final String CODE_SUCCESS = "200";
    public static final String CODE_AUTH_ERROR = "401";
    public static final String CODE_SYS_ERROR = "500";
    /**
     * 请求的返回编码 200 401 404 500
     * 编码表示这次请求是成功还是失败
     * 或者说看出失败的类型是什么
     */

    private String code;
    /**
     * msg表示错误的详细信息
     */
    private String msg;
    /**
     * user Object类型就是User
     * List Object类型就是List
     * Map  Object类型就是Map
     */
    private Object data;


    public static Result success() {
        return new Result(CODE_SUCCESS, "请求成功", null);
    }

    public static Result success(Object data) {
        return new Result(CODE_SUCCESS, "请求成功", data);
    }

    public static Result error(String msg) {
        return new Result(CODE_SYS_ERROR, msg, null);
    }

    public static Result error(String code, String msg) {
        return new Result(code, msg, null);
    }

    public static Result error() {
        return new Result(CODE_SYS_ERROR, "系统错误", null);
    }
}