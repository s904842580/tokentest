package com.sunxy.springboot.mapper;

import com.sunxy.springboot.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
/*注入到Spring容器中*/
public interface UserMapper {

    @Insert("insert into `user` (username, password, name, phone, email, address, avatar) " +
    "values (#{username}, #{password}, #{name}, #{phone}, #{email}, #{address}, #{avatar})")
    /*插入到数据库中*/
    void insert(User user);

    /*根据id修改*/
    @Update("update `user` set username = #{username}, password = #{password}, name= #{name}, phone = #{phone}, " +
            "email = #{email}, address = #{address}, avatar = #{avatar} where id = #{id}")
    void updateUser(User user);

    /*单个删除*/
    @Delete("delete from `user` where id = #{id}")
    void deleteUser(Integer id);

    /*查询多个数据*/
    @Select("select * from `user` order by id desc")
    List<User> selectAll();

    /*查询单个数据*/
    @Select("select * from `user` where id = #{id} order by id desc")
    User selectById(Integer id);

    @Select("select * from `user` where username = #{username} and name = #{name} order by id desc")
    List<User> selectByMore(@Param("username") String username, @Param("name") String name);

    @Select("select * from `user` where username = #{username} order by id desc")
    User selectByUsername(String username);
}
