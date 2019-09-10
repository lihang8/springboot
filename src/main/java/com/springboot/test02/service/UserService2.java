package com.springboot.test02.service;


import com.springboot.pojo.User;
import com.springboot.test01.mapper.UserMapper1;
import com.springboot.test02.mapper.UserMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService2 {

    @Autowired
    private UserMapper2 userMapper2;

    public  void add2(User user){
        userMapper2.add2(user);
    }

}
