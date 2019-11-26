package com.demo.dao;

import com.demo.annotation.AnnotationDao;
import com.demo.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.sql.Date;
import java.util.List;



public class UserDaoImplTest {
    public UserDao userDao;
    public SqlSession sqlSession;

    public AnnotationDao annotationDao;
    @Before
    public void setUp() throws Exception {
        // mybatis-config.xml
        String resource = "mybatis-config.xml";
        // 读取配置文件
        InputStream is = Resources.getResourceAsStream(resource);
        // 构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 获取sqlSession
        sqlSession = sqlSessionFactory.openSession();
        this.userDao = new UserDaoImpl(sqlSession);

        //********注解使用的dao
        this.annotationDao =sqlSession.getMapper(AnnotationDao.class);

    }

    //使用注解
    @Test
    public void selectAll() throws Exception {
        System.out.println(this.annotationDao.selectAll());
    }


    @Test
    public void queryUserById() throws Exception {
        System.out.println(this.userDao.queryUserById(1));
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
        user.setBirthday(new Date(2002 - 02 - 02));
        user.setName("大鹏");
        user.setPassword("123456");
        user.setSex("男");
        user.setUserName("evan");
        this.userDao.insertUser(user);
        this.sqlSession.commit();
    }

    @Test
    public void updateUser() throws Exception {
        User user = new User();
        user.setBirthday(new Date(2002 - 02 - 02));
        user.setName("静鹏");
        user.setPassword("654321");
        user.setSex("男");
        user.setUserName("evanjin");
        user.setId(1);
        this.userDao.updateUser(user);
        this.sqlSession.commit();

    }

    @Test
    public void deleteUser() throws Exception {
        this.userDao.deleteUser("4");
        this.sqlSession.commit();
    }
}