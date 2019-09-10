package com.springboot.test01.mapper;

import com.springboot.pojo.User;
import org.apache.ibatis.annotations.Insert;


public interface UserMapper1 {

    @Insert("insert into t_user values (null,#{username},#{age})")
    public  void add1(User user);
}
