package com.dao;

import com.pojo.Student;

import java.util.List;

public interface StudentDao {

    int addStudent(Student student);

    int deleteStudentById(long id);

    int updateStudent(Student student);

    Student queryById(long id);

    List<Student> queryAllStudent();

}
