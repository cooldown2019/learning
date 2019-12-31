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
     *
     *
     */

    @Override
    public User selectByUser(String username, String password) {
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setSalt(userDAO.findSaltByName(username));
        user.setPassword(MD5Util.getMd5(user.getPassword(),user.getSalt()));
        return userDAO.selectByUser(user);
    }


    /**
     * 注册
     *
     *
     *
     */

    @Override
    public int insertByUser(String username, String password) {
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setSalt(MD5Util.salt());
        user.setPassword(MD5Util.getMd5(user.getPassword(),user.getSalt()));
        return userDAO.insert(user);

    }




    @Override
    public User selectById(Long id) {
        return userDAO.selectByPrimaryKey(id);
    }


}
