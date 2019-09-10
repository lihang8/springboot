package com.springboot.controller;


import com.springboot.pojo.User;
import com.springboot.test01.mapper.UserMapper1;
import com.springboot.test01.service.UserService1;
import com.springboot.test02.mapper.UserMapper2;
import com.springboot.test02.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {




    @Autowired
    private UserService1 userService1;
    @Autowired
    private UserService2 userService2;

    @RequestMapping("/add1")
    public  String add1(){
        User user =new User();
        user.setAge(10);
        user.setUsername("fox");

        userService1.add1(user);
        return  "ok1";

    }

    @RequestMapping("/add2")
    public  String add2(){
        User user =new User();
        user.setAge(10);
        user.setUsername("ftom");

        userService2.add2(user);
        return  "ok2";

    }

}
