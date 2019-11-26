package com.jdbc.dao;

import com.jdbc.pojo.Student;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDao {
    public void setDataSource(DataSource ds);


    public int create(String name, Integer qq);

    public Student getStudent(Integer id);

    public List<Student> listStudents();

    public boolean delete(Integer id);

    public boolean update(Integer id, Integer qq);
}

