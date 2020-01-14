package com.task.service;


import com.task.po.User;

public interface UserService {
    User selectByUser(String username, String password);
    int insertByPhone(String username, String password,String phone);
    int insertByEmail(String username,  String password,String email);

    int insertUrlByUsername( String username,String url);
}
