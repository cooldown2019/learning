package com.service;

import com.pojo.Student;

import java.util.List;

public interface StudentService {

    int addStudent(Student paper);

    int deleteStudentById(long id);

    int updateStudent(Student paper);

    Student queryById(long id);

    List<Student> queryAllStudent();

}
