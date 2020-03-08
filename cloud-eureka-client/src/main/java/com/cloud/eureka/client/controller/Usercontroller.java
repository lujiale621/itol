package com.cloud.eureka.client.controller;

import com.alibaba.fastjson.JSON;
import com.cloud.eureka.client.bean.User;
import com.cloud.eureka.client.server.Personsqlserver;
import freemarker.template.utility.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.PUT;

@Controller
@ResponseBody
public class Usercontroller {
    @Autowired
    Personsqlserver personsqlserver;

    @GetMapping(value ="/user/id/{user_id}")
    public String queryUserById(@PathVariable int user_id){
        User res = personsqlserver.getUserById(user_id);
        String user = JSON.toJSONString(res);
        return user;
    }
    @GetMapping(value = "/user/name/{user_name}")
    public String queryUserByName(@PathVariable String user_name){
        User res= personsqlserver.getUserByName(user_name);
        String user = JSON.toJSONString(res);
        return user;
    }
    @GetMapping(value = "/user")
    public String queryAllUser(){
        String users = JSON.toJSONString(personsqlserver.queryAll());
        return users;
    }
    @PostMapping(value = "/user")
    public String insertUser(String user_name,String user_password,String register_time,String sign,String last_reg_time){
        User verifica= personsqlserver.getUserByName(user_name);
        if (verifica!=null)return "用户已存在";
        User user= new User(user_name,user_password,register_time,sign,last_reg_time);
        personsqlserver.insertUser(user);
        User res= personsqlserver.getUserByName(user_name);
        return StringUtil.tryToString(res.getUser_id());
    }
    @DeleteMapping(value = "/user/name/{user_name}")
    public String deleteUserByName(@PathVariable String user_name){
        personsqlserver.deleteUserByName(user_name);
        return "delete:"+user_name;
    }
    @DeleteMapping(value = "/user/id/{user_id}")
    public String deleteUserById(@PathVariable int user_id){
        personsqlserver.deleteUserById(user_id);
        return "delete:"+user_id;
    }
    @PutMapping(value = "/user")
    public String updataUser(String user_name,String user_password,String register_time,String sign,String last_reg_time){
        User user= new User(user_name,user_password,register_time,sign,last_reg_time);
        User res = personsqlserver.getUserByName(user.getUser_name());
        if (res==null)return "用户不存在";
        personsqlserver.updataUser(user);
        return "updata:"+res.getUser_id();
    }

}
