package com.htu.mapper;

import com.htu.model.User;

import java.util.List;

public interface UserMapper {

    User login(User user);

    void update(User user);

}
