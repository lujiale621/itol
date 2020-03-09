package com.cloud.server.login.bean;

public class User {
    int user_id;
    String user_name;
    String user_email;
    String user_password;
    String user_phone;
    String user_created;
    String user_updated;
    String user_lastlogintime;

    public User(String user_name, String user_email, String user_password, String user_phone, String user_created, String user_updated, String user_lastlogintime) {
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_phone = user_phone;
        this.user_created = user_created;
        this.user_updated = user_updated;
        this.user_lastlogintime = user_lastlogintime;
    }

    public User(int user_id, String user_name, String user_email, String user_password, String user_phone, String user_created, String user_updated, String user_lastlogintime) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_phone = user_phone;
        this.user_created = user_created;
        this.user_updated = user_updated;
        this.user_lastlogintime = user_lastlogintime;
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

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_created() {
        return user_created;
    }

    public void setUser_created(String user_created) {
        this.user_created = user_created;
    }

    public String getUser_updated() {
        return user_updated;
    }

    public void setUser_updated(String user_updated) {
        this.user_updated = user_updated;
    }

    public String getUser_lastlogintime() {
        return user_lastlogintime;
    }

    public void setUser_lastlogintime(String user_lastlogintime) {
        this.user_lastlogintime = user_lastlogintime;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public User(String user_name, String user_password, String user_phone, String user_created, String user_updated, String user_lastlogintime) {
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_phone = user_phone;
        this.user_created = user_created;
        this.user_updated = user_updated;
        this.user_lastlogintime = user_lastlogintime;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_created='" + user_created + '\'' +
                ", user_updated='" + user_updated + '\'' +
                ", user_lastlogintime='" + user_lastlogintime + '\'' +
                '}';
    }
}
