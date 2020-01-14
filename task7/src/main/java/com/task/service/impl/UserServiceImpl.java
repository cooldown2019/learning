package com.task.service.impl;

import com.task.dao.UserDAO;
import com.task.po.User;
import com.task.service.UserService;
import com.task.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    /**
     * 登录
     */

    @Override
    public User selectByUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setSalt(userDAO.findSaltByName(username));
        user.setPassword(MD5Util.getMd5(password, user.getSalt()));
        return userDAO.selectByUser(user);
    }


    /**
     * 注册
     */

    @Override
    public int insertByPhone(String username, String password, String phone) {
        User user = new User();
        user.setUsername(username);
        user.setSalt(MD5Util.salt());
        user.setPassword(MD5Util.getMd5(password, user.getSalt()));
        user.setPhone(phone);
        return userDAO.insertSelective(user);

    }

    @Override
    public int insertByEmail(String username, String password, String email) {
        User user = new User();
        user.setUsername(username);
        user.setSalt(MD5Util.salt());
        user.setPassword(MD5Util.getMd5(password, user.getSalt()));
        user.setEmail(email);
        return userDAO.insertSelective(user);

    }

    @Override
    public int insertUrlByUsername(String username, String url) {
        User record =new User();
        record.setUsername(username);
        record.setPicture(url);
        return userDAO.updatePictureByUsername(record);
    }
}
