package com.sunxy.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 功能：
 * 作者：夏瑾溪
 * 日期：2023/10/17 9:05
 */

@Getter
@Setter
/*实现get和set方法*/
@NoArgsConstructor
@AllArgsConstructor
/*无参构造和有参构造*/
public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String avatar;
}