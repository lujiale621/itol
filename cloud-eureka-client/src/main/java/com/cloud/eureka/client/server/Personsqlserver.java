package com.cloud.eureka.client.server;

import com.cloud.eureka.client.bean.User;
import com.cloud.eureka.client.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Personsqlserver {
    @Autowired
    UserMapper userMapper;

    public User getUserById(int id){
        return userMapper.getUserById(id);
    }
    public User getUserByName(String username){
        return userMapper.getUserByName(username);
    };
    public void insertUser(User user){
        userMapper.insertUser(user);
    }
    public void deleteUserById(int id){
        userMapper.deleteUserById(id);
    }
    public void deleteUserByName(String username){
        userMapper.deleteUserByName(username);
    }
    public void updataUser(User user){
        userMapper.updataUser(user);
    }
    public List<User> queryAll(){
        List<User> users = userMapper.queryAll();
        return users;
    }
}
