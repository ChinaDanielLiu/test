package com.example.test.service;

import com.example.test.entity.User;

import java.util.List;

/**
 * 功能：
 * 作者：Daniel Liu
 * 日期：2023-10-08 20:54
 */
public interface UserService {
    public List<User> findUser(User user);

    public void addUser(User user);
}
