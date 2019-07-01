package com.ljw.dubbo.controller;



import com.alibaba.dubbo.config.annotation.Reference;
import com.ljw.dubbo.model.User;
import com.ljw.dubbo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Reference//使用dubbo注解引用远程DUBBO服务
    private UserService userService;
    @RequestMapping("/sayhi")
    public @ResponseBody String sayHi(){
        return userService.sayHi("xiao wang");
    }

    @RequestMapping("/showAllUser")
    public @ResponseBody
    List<User> showAllUser(){
        return userService.showAllUser();
    }
}