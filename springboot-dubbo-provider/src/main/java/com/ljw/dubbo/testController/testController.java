package com.ljw.dubbo.testController;

import com.ljw.dubbo.model.User;
import com.ljw.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class testController {
    @Autowired
    private UserService userService;
    @RequestMapping("/showAllUser")
    public @ResponseBody
    List<User> showAllUser(){
        return userService.showAllUser();
    }
}
