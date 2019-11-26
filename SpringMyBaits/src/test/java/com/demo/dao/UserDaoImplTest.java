package com.demo.dao;

import com.demo.mapper.UserDao;
import com.demo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.sql.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)//junit整合spring的测试
@ContextConfiguration("classpath:spring.xml")//加载核心配置文件，自动构建spring容器
public class UserDaoImplTest {
    @Autowired
    public UserDao userDao;
    @Test
    public void queryUserById() throws Exception {
        System.out.println(this.userDao.queryUserById("1"));
    }
    @Test
    public void queryUserAll() throws Exception {
        List<User> userList = this.userDao.queryUserAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
    @Test
    public void insertUser() throws Exception {
        User user = new User();
        user.setAge(16);
        user.setBirthday(new Date(2002-02-02));
        user.setName("大鹏");
        user.setPassword("123456");
        user.setSex("男");
        user.setUserName("evan");
        this.userDao.insertUser(user);
        System.out.println(user.getId());

    }
    @Test
    public void updateUser() throws Exception{
        User user = new User();
        user.setBirthday(new Date(2002-02-02));
        user.setName("静鹏");
        user.setPassword("654321");
        user.setSex("男");
        user.setUserName("evanjin");
        user.setId("1");
       boolean i= this.userDao.updateUser(user);
        System.out.println(i);

    }
    @Test
    public void deleteUser() throws Exception{
        boolean i= this.userDao.deleteUser("4");
        System.out.println(i);
    }
}