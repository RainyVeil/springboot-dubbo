package com.ljw.dubbo.service.impl;




import com.alibaba.dubbo.config.annotation.Service;
import com.ljw.dubbo.mapper.UserMapper;
import com.ljw.dubbo.model.User;
import com.ljw.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;


@org.springframework.stereotype.Service
@Service(timeout = 10000,interfaceClass = UserService.class)//dubbo注解 <dubbo：service interface=... ref= version=>
public class UseServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public String sayHi(String name) {
        return "hi,my name is " + name;
    }

    @Override
    public User getuser(int id) {
        return new User();
    }

    @Override
    public List<User> showAllUser() {
        return userMapper.selectAllUser();
    }
}
