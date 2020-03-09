package com.cloud.server.login.server;

import com.cloud.server.login.bean.User;

import java.util.List;

public interface TbUserserver {
     User getUserById(int id);
     User getUserByName(String username);
     void insertUser(User user);
     void deleteUserById(int id);
     void deleteUserByName(String username);
     void updataUser(User user);
     List<User> queryAll();
}
