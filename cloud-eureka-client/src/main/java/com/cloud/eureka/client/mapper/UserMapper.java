package com.cloud.eureka.client.mapper;

import com.cloud.eureka.client.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    User getUserById(int id);
    User getUserByName(String username);
    void insertUser(User user);
    void deleteUserById(int id);
    void deleteUserByName(String username);
    void updataUser(User user);
    List<User> queryAll();

}
