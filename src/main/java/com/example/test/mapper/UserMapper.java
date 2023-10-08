package com.example.test.mapper;

import com.example.test.entity.User;

import java.util.List;

/**
 * 功能：
 * 作者：Daniel Liu
 * 日期：2023-10-08 21:04
 */
public interface UserMapper {
    public void insertUser(User user);
    public List<User> selectUser(User user);
}
