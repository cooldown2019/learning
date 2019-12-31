package com.task.service;

import com.task.po.User;


public interface UserService {
    User selectByUser(String username, String password);
    int insertByUser(String username,String password);


    User selectById(Long id);
}
