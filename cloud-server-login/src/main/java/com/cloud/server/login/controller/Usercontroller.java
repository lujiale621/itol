package com.cloud.server.login.controller;

import com.alibaba.fastjson.JSON;
import com.cloud.server.login.bean.User;
import com.cloud.server.login.server.impl.Usersqlserver;
import freemarker.template.utility.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class Usercontroller {
    @Autowired
    Usersqlserver usersqlserver;

    @GetMapping(value ="/user/id/{user_id}")
    public String queryUserById(@PathVariable int user_id){
        User res = usersqlserver.getUserById(user_id);
        String user = JSON.toJSONString(res);
        return user;
    }
    @GetMapping(value = "/user/name/{user_name}")
    public String queryUserByName(@PathVariable String user_name){
        User res= usersqlserver.getUserByName(user_name);
        String user = JSON.toJSONString(res);
        return user;
    }
    @GetMapping(value = "/user")
    public String queryAllUser(){
        String users = JSON.toJSONString(usersqlserver.queryAll());
        return users;
    }
    @PostMapping(value = "/user")
    public String insertUser(String user_name,String user_password,String user_phone,String user_email,String user_created,String user_lastlogintime,String user_updated){
        User verifica= usersqlserver.getUserByName(user_name);
        if (verifica!=null)return "用户已存在";
        User user= new User(user_name,user_password,user_phone,user_email,user_created,user_updated,user_lastlogintime);
        usersqlserver.insertUser(user);
        User res= usersqlserver.getUserByName(user_name);
        return StringUtil.tryToString(res.getUser_id());
    }
    @DeleteMapping(value = "/user/name/{user_name}")
    public String deleteUserByName(@PathVariable String user_name){
        usersqlserver.deleteUserByName(user_name);
        return "delete:"+user_name;
    }
    @DeleteMapping(value = "/user/id/{user_id}")
    public String deleteUserById(@PathVariable int user_id){
        usersqlserver.deleteUserById(user_id);
        return "delete:"+user_id;
    }
    @PutMapping(value = "/user")
    public String updataUser(String user_name,String user_password,String user_phone,String user_email,String user_created,String user_lastlogintime,String user_updated){
        User user= new User(user_name,user_password,user_phone,user_email,user_created,user_updated,user_lastlogintime);
        User res = usersqlserver.getUserByName(user.getUser_name());
        if (res==null)return "用户不存在";
        usersqlserver.updataUser(user);
        return "updata:"+res.getUser_id();
    }

}
