package com.demo.dao;

import com.demo.pojo.User;

import java.util.List;

public interface UserDao {
    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    public User queryUserById(int id);
    /**
     * 查询所有用户信息
     *
     * @return
     */
    public List<User> queryUserAll();
    /**
     * 新增用户
     *
     * @param user
     */
    public int insertUser(User user);
    /**
     * 更新用户信息
     *
     * @param user
     * @return
     */
    public boolean updateUser(User user);
    /**
     * 根据id删除用户信息
     *
     * @param id
     * @return
     */
    public boolean deleteUser(String id);
}

