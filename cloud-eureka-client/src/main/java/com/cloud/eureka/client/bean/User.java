package com.cloud.eureka.client.bean;

public class User {
    int user_id;
    String user_name;
    String user_password;
    String register_time;
    String sign;
    String last_reg_time;

    public User(String user_name, String user_password, String register_time, String sign, String last_reg_time) {
        this.user_name = user_name;
        this.user_password = user_password;
        this.register_time = register_time;
        this.sign = sign;
        this.last_reg_time = last_reg_time;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getRegister_time() {
        return register_time;
    }

    public void setRegister_time(String register_time) {
        this.register_time = register_time;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getLast_reg_time() {
        return last_reg_time;
    }

    public void setLast_reg_time(String last_reg_time) {
        this.last_reg_time = last_reg_time;
    }
}
