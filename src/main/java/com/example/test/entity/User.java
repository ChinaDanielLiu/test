package com.example.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 功能：
 * 作者：Daniel Liu
 * 日期：2023-10-08 10:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    public static List<User> users = new ArrayList<>();
    public static int ID = 1;
    private int id;
    private String username;
    private String password;
}
