package com.htu.service.impl;

import com.htu.mapper.UserMapper;
import com.htu.model.User;
import com.htu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User login(User user) {
        return userMapper.login(user);
    }

    public void update(User user) { userMapper.update(user); }

}
