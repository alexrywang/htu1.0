package com.htu.service;

import com.htu.model.User;

import java.util.List;

public interface UserService {

    User login(User user);

    void update(User user);

}
