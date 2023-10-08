package com.example.test.controller;

import com.example.test.common.Result;
import com.example.test.entity.User;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能：
 * 作者：Daniel Liu
 * 日期：2023-10-08 21:15
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired(required=false)
    private UserService userService;

    @RequestMapping("/add")
    public Result add(String name, String password){
        User user = new User(User.ID, name, password);
        userService.addUser(user);
        return Result.success();
    }

    @RequestMapping("/query")
    public Result query(User user){
        List list = userService.findUser(user);
        if(!list.isEmpty())
            return  Result.success(list);
        else
            return Result.error("查询失败");
    }

}
