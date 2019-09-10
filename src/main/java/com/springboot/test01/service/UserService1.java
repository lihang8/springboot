package com.springboot.test01.service;


import com.springboot.pojo.User;
import com.springboot.test01.mapper.UserMapper1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

@Service
public class UserService1 {

    @Autowired
    private UserMapper1 userMapper1;


    @Transactional
    public  void add1(User user){
        System.out.println(1/0);

        userMapper1.add1(user);
    }

}
