package com.example.test.service.impl;

import com.example.test.entity.User;
import com.example.test.mapper.UserMapper;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 功能：
 * 作者：Daniel Liu
 * 日期：2023-10-08 20:56
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUser(User user) {
        return userMapper.selectUser(user);
    }

    @Override
    public void addUser(User user) {
        userMapper.insertUser(user);
        User.ID++;
    }
}
