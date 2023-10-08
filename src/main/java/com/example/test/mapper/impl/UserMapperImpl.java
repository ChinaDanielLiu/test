package com.example.test.mapper.impl;

import com.example.test.entity.User;
import com.example.test.mapper.UserMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能：
 * 作者：Daniel Liu
 * 日期：2023-10-08 21:36
 */
public class UserMapperImpl implements UserMapper {
    @Override
    public void insertUser(User user) {
        User.users.add(user);
    }

    @Override
    public List<User> selectUser(User user) {
        List list = new ArrayList<>();
        for(User u: User.users){
            if (u.getId() == (user.getId()))
                list.add(user);
        }
        return list;
    }
}
