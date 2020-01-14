package com.task.dao;

import com.task.po.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    String findSaltByName(String username);

    User selectByUser(User user);
    int updatePictureByUsername(User record);

}