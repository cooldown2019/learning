package com.demo.dao;
import com.demo.pojo.User;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class UserDaoImpl implements  UserDao {
    public SqlSession sqlSession;
    public UserDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public User queryUserById(int id) {
        return this.sqlSession.selectOne("UserDao.queryUserById", id);
    }

    public List<User> queryUserAll() {
        return this.sqlSession.selectList("UserDao.queryUserAll");
    }

    public int insertUser(User user) {
       this.sqlSession.insert("UserDao.insertUser", user);
        System.out.println(user.getId());
        Integer id= Integer.valueOf(user.getId());
        System.out.println(id);
        return id;
    }
    public boolean updateUser(User user) {
        int i = this.sqlSession.update("UserDao.updateUser", user);
        System.out.println(i>0);
        return  i>0;
    }

    public boolean deleteUser(String id) {
        int i = this.sqlSession.delete("UserDao.deleteUser", id);
        System.out.println(i>0);
        return  i>0;
    }
}
