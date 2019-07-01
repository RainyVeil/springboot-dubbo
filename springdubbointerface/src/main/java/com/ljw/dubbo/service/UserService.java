package com.ljw.dubbo.service;

import com.ljw.dubbo.model.User;

import java.util.List;

public interface UserService {
    String sayHi (String name);
    User getuser(int id);
    List<User> showAllUser();
}
