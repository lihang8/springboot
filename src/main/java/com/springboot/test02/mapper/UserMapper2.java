package com.springboot.test02.mapper;


import com.springboot.pojo.User;
import org.apache.ibatis.annotations.Insert;

public interface UserMapper2 {


    @Insert("insert into t_user values (null,#{username},#{age})")
    public  void add2(User user);
}
