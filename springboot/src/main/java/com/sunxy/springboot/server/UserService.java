package com.sunxy.springboot.server;

import com.sunxy.springboot.entity.User;
import com.sunxy.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能：
 * 作者：夏瑾溪
 * 日期：2023/10/17 9:13
 */

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    /*新增数据*/
    public void insertUser(User user){
        userMapper.insert(user);
    }
    /*修改数据*/
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
    /*单个删除数据*/
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }

    /*删除多个*/
    public void batchDeleteUser(List<Integer> ids) {
        for (Integer id : ids) {
            userMapper.deleteUser(id);  // 7  - 8
        }
    }

    /*查询所有数据*/
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    /*查询单个用户*/
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }
}