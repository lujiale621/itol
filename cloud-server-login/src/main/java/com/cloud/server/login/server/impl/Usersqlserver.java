package com.cloud.server.login.server.impl;

import com.cloud.server.login.bean.User;
import com.cloud.server.login.mapper.UserMapper;
import com.cloud.server.login.server.TbUserserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Usersqlserver implements TbUserserver {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void deleteUserById(int id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public void deleteUserByName(String username) {
         userMapper.deleteUserByName(username);
    }

    @Override
    public void updataUser(User user) {
        userMapper.updataUser(user);
    }

    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }
}
